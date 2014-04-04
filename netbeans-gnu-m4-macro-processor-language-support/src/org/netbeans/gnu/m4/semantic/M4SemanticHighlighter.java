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
package org.netbeans.gnu.m4.semantic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenId;
import static org.netbeans.gnu.m4.Constants.isVerbose;
import org.netbeans.gnu.m4.antlr.support.ANTLRTokenToNetBeansTokenMapper;
import org.netbeans.gnu.m4.antlr.v1.m4Parser.CompilationUnitContext;
import org.netbeans.gnu.m4.parser.M4Parser;
import org.netbeans.gnu.m4.semantic.M4ColoringAttributes.Coloring;
import org.netbeans.modules.parsing.spi.IndexingAwareParserResultTask;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.modules.parsing.spi.TaskIndexingMode;
import org.netbeans.spi.editor.highlighting.support.OffsetsBag;
import org.netbeans.spi.editor.hints.ErrorDescription;

/**
 *
 * @author Enrico M. Crisostomo
 */
class M4SemanticHighlighter extends IndexingAwareParserResultTask<Result> {

    private static final Logger logger = Logger.getLogger(M4SemanticHighlighter.class.getName());

    M4SemanticHighlighter() {
        super(TaskIndexingMode.ALLOWED_DURING_SCAN);
    }

    @Override
    public void run(Result result, SchedulerEvent event) {
        if (isVerbose()) {
            logger.info("Running.");
        }

        if (result == null) {
            logger.severe("Parser result is null.");
            return;
        }

        if (!(result instanceof M4Parser.M4ParserResult)) {
            logger.severe(String.format("Invalid result class: %s", result.getClass().getName()));
            return;
        }

        final Document doc = result.getSnapshot().getSource().getDocument(false);

        if (!(doc instanceof StyledDocument)) {
            throw new IllegalStateException(
                    String.format(
                            "Unexpected document class [%s] is not instance of [%s].",
                            doc.getClass().getName(),
                            StyledDocument.class.getName()));
        }

        M4Parser.M4ParserResult res = (M4Parser.M4ParserResult) result;
        CompilationUnitContext compilationUnit = res.getCompilationUnit();
        M4BuiltinMacroVisitor visitor = new M4BuiltinMacroVisitor();
        visitor.visit(compilationUnit);

        final Set<org.antlr.v4.runtime.Token> builtinIdentifiers = visitor.getBuiltinIdentifiers();

        final List<M4ColoringAttributes> builtinSpec = new ArrayList<>();
        builtinSpec.add(M4ColoringAttributes.M4_BUILTIN);
        final Coloring builtinColoring = collection2Coloring(builtinSpec);
        final ANTLRTokenToNetBeansTokenMapper mapper = new ANTLRTokenToNetBeansTokenMapper(doc);

        final Map<Token<? extends TokenId>, Coloring> newColoring = new IdentityHashMap<>();
        final Set<Token<? extends TokenId>> addedTokens = new HashSet<>();
        final Map<Token<? extends TokenId>, Coloring> removedTokens = new IdentityHashMap<>(M4LexerBasedHighlightLayer.getLayer(M4SemanticHighlighter.class, doc).getColorings());

        for (org.antlr.v4.runtime.Token antlrToken : builtinIdentifiers) {
            logger.info(String.format(
                    "M4 Builtin Token Position: %d %d %d.",
                    antlrToken.getLine(),
                    antlrToken.getCharPositionInLine(),
                    antlrToken.getText().length()));

            final Token<? extends TokenId> token = mapper.findToken(antlrToken);

            if (token == null) {
                continue;
            }

            newColoring.put(token, builtinColoring);

            Coloring oldColoring = removedTokens.remove(token);

            if (oldColoring == null || !oldColoring.equals(builtinColoring)) {
                addedTokens.add(token);
            }
        }

        ERROR_DESCRIPTION_SETTER.setColorings(doc, newColoring, addedTokens);
    }

    static Coloring collection2Coloring(Collection<M4ColoringAttributes> attr) {
        Coloring c = M4ColoringAttributes.empty();

        for (M4ColoringAttributes a : attr) {
            c = M4ColoringAttributes.add(c, a);
        }

        return c;
    }

    @Override
    public int getPriority() {
        return 100;
    }

    @Override
    public Class<? extends Scheduler> getSchedulerClass() {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

    @Override
    public void cancel() {
        // no op
    }

    public static interface ErrorDescriptionSetter {

        public void setErrors(Document doc, List<ErrorDescription> errors);

        public void setHighlights(Document doc, OffsetsBag highlights);

        public void setColorings(
                Document doc,
                Map<Token<? extends TokenId>, Coloring> colorings,
                Set<Token<? extends TokenId>> addedTokens);
    }

    private static final ErrorDescriptionSetter ERROR_DESCRIPTION_SETTER = new ErrorDescriptionSetter() {
        @Override
        public void setErrors(Document doc, List<ErrorDescription> errors) {
        }

        @Override
        public void setHighlights(final Document doc, final OffsetsBag highlights) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                }
            });
        }

        @Override
        public void setColorings(
                final Document doc,
                final Map<Token<? extends TokenId>, Coloring> colorings,
                final Set<Token<? extends TokenId>> addedTokens) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    M4LexerBasedHighlightLayer.getLayer(M4SemanticHighlighter.class, doc).setColorings(colorings, addedTokens);
                }
            });
        }
    };
}
