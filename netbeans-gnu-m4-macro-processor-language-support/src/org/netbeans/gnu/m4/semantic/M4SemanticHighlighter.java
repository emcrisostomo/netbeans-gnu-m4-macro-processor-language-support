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
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import static org.netbeans.gnu.m4.Constants.isVerbose;
import org.netbeans.gnu.m4.lexer.javacc.M4TokenId;
import org.netbeans.gnu.m4.lexer.javacc.M4Lexer;
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

    private static final Logger logger = Logger.getLogger(M4Lexer.class.getName());

    M4SemanticHighlighter() {
        super(TaskIndexingMode.ALLOWED_DURING_SCAN);
    }

    @Override
    public void run(Result result, SchedulerEvent event) {
        if (isVerbose()) {
            logger.info("Running.");
        }

        final Document doc = result.getSnapshot().getSource().getDocument(false);

        process(doc);
    }

    static Coloring collection2Coloring(Collection<M4ColoringAttributes> attr) {
        Coloring c = M4ColoringAttributes.empty();

        for (M4ColoringAttributes a : attr) {
            c = M4ColoringAttributes.add(c, a);
        }

        return c;
    }

    private void process(final Document document) {
        Map<Token<? extends TokenId>, Coloring> newColoring = new IdentityHashMap<>();
        Map<Token<? extends TokenId>, Coloring> oldColors = M4LexerBasedHighlightLayer.getLayer(M4SemanticHighlighter.class, document).getColorings();
        Map<Token<? extends TokenId>, Coloring> removedTokens = new IdentityHashMap<>(oldColors);
        Set<Token<? extends TokenId>> addedTokens = new HashSet<>();

        AbstractDocument doc = (AbstractDocument) document;

        doc.readLock();

        try {
            TokenHierarchy<AbstractDocument> ti = TokenHierarchy.get(doc);
            TokenSequence<? extends TokenId> ts = ti.tokenSequence();

            while (ts.moveNext()) {
                Token<? extends TokenId> t = ts.token();

                // Ignore tokens which are not our instances
                // (used only as a cast safeguard).
                if (!(t.id() instanceof M4TokenId)) {
                    continue;
                }

                List<M4ColoringAttributes> spec = new ArrayList<>();
                spec.add(M4ColoringAttributes.M4_MACRO);
                spec.add(M4ColoringAttributes.DECLARATION);
                
                Coloring c = collection2Coloring(spec);

                newColoring.put(t, c);

                Coloring oldColoring = removedTokens.remove(t);

                if (oldColoring == null || !oldColoring.equals(c)) {
                    addedTokens.add(t);
                }
            }
        } finally {
            doc.readUnlock();
        }

        ERROR_DESCRIPTION_SETTER.setColorings(doc, newColoring, addedTokens);
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

        public void setColorings(Document doc, Map<Token<? extends TokenId>, Coloring> colorings, Set<Token<? extends TokenId>> addedTokens);
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
        public void setColorings(final Document doc, final Map<Token<? extends TokenId>, Coloring> colorings, final Set<Token<? extends TokenId>> addedTokens) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    M4LexerBasedHighlightLayer.getLayer(M4SemanticHighlighter.class, doc).setColorings(colorings, addedTokens);
                }
            });
        }
    };
}
