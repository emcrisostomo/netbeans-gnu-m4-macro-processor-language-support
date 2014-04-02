/* 
 * Copyright (C) 2014, Enrico M. Crisostomo
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.netbeans.gnu.m4.completion;

import java.util.HashSet;
import java.util.Set;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.gnu.m4.lexer.M4TokenId;
import org.netbeans.gnu.m4.lexer.javacc.M4Character;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.openide.util.Exceptions;

/**
 *
 * @author Enrico M. Crisostomo
 */
@MimeRegistration(mimeType = "text/x-m4", service = CompletionProvider.class)
public class M4CompletionProvider implements CompletionProvider {

    private static final M4BuiltinMacro macroNames[] = M4BuiltinMacro.values();

    @Override
    public CompletionTask createTask(int queryType, JTextComponent jtc) {
        if (queryType != CompletionProvider.COMPLETION_QUERY_TYPE) {
            return null;
        }

        return new AsyncCompletionTask(new AsyncCompletionQuery() {
            @Override
            protected void query(
                    CompletionResultSet completionResultSet,
                    Document document,
                    int caretOffset) {

                try {
                    final StyledDocument bDoc = (StyledDocument) document;

                    // Extract the text in the caret line.
                    final int lineStartOffset = getRowFirstNonWhite(bDoc, caretOffset);
                    final char[] line = bDoc.getText(lineStartOffset, caretOffset - lineStartOffset).toCharArray();

                    // Find the beginning of the token being written.
                    // Beware that this token is not the same token as seen by
                    // the lexer, but just the string after the last separator
                    // character.
                    final int tokenBeginning = findTokenBeginning(line);
                    final String filter = new String(line, tokenBeginning + 1, line.length - tokenBeginning - 1);

                    int startOffset;
                    if (tokenBeginning > 0) {
                        startOffset = lineStartOffset + tokenBeginning + 1;
                    } else {
                        startOffset = lineStartOffset;
                    }

                    // Find macro definitions
                    Set<String> macroDefs = extractMacroDefs((AbstractDocument) document, caretOffset, filter);

                    // Add macro names defined in the same compilation unit
                    for (String macroName : macroDefs) {
                        completionResultSet.addItem(new M4CompletionItem(macroName, startOffset, caretOffset));
                    }

                    // Add builtin M4 macros
                    for (M4BuiltinMacro macro : macroNames) {
                        final String text = macro.getText();

                        // Filter out names which do not start with the
                        // current token text.
                        if (!text.equals("") && text.startsWith(filter)) {
                            completionResultSet.addItem(new M4CompletionItem(macro, startOffset, caretOffset));
                        }
                    }
                } catch (BadLocationException ex) {
                    Exceptions.printStackTrace(ex);
                } finally {
                    completionResultSet.finish();
                }
            }

            private Set<String> extractMacroDefs(AbstractDocument doc, int caretOffset, String filter) {
                Set<String> macroDefs = new HashSet<>();

                doc.readLock();

                try {
                    TokenHierarchy<AbstractDocument> ti = TokenHierarchy.get(doc);
                    TokenSequence<? extends TokenId> ts = ti.tokenSequence();

                    while (ts.moveNext()) {
                        Token<? extends TokenId> t = ts.token();
                        System.out.println(t);

                        // Only add macros defined before the current
                        // caret position.
                        if (t.offset(ti) >= caretOffset - t.length()) {
                            continue;
                        }

                        final String currentTokenText = t.text().toString();

                        // Filter out names which do not start with the
                        // current token text.
                        if (currentTokenText.equals("") || !currentTokenText.startsWith(filter)) {
                            continue;
                        }

                        // Ignore tokens which are not our instances
                        // (used only as a cast safeguard).
                        if (!(t.id() instanceof M4TokenId)) {
                            continue;
                        }

                        M4TokenId m4Token = (M4TokenId) t.id();

                        if (m4Token.isMacroName()) {
                            macroDefs.add(currentTokenText);
                        }
                    }
                } finally {
                    doc.readUnlock();
                }

                return macroDefs;
            }
        }, jtc);
    }

    @Override
    public int getAutoQueryTypes(JTextComponent component, String typedText) {
        return 0;
    }

    private static int getRowFirstNonWhite(StyledDocument doc, int offset)
            throws BadLocationException {
        Element lineElement = doc.getParagraphElement(offset);
        int start = lineElement.getStartOffset();

        while (start + 1 < lineElement.getEndOffset()) {
            try {
                if (doc.getText(start, 1).charAt(0) != ' ') {
                    break;
                }
            } catch (BadLocationException ex) {
                throw (BadLocationException) new BadLocationException(
                        "calling getText(" + start + ", " + (start + 1)
                        + ") on doc of length: " + doc.getLength(), start
                ).initCause(ex);
            }
            start++;
        }

        return start;
    }

    private static int findTokenBeginning(char[] line) {
        int i = line.length;

        while (--i > -1) {
            final char c = line[i];
            if (Character.isWhitespace(c) || M4Character.isSeparator(c)) {
                return i;
            }
        }

        return -1;
    }
}
