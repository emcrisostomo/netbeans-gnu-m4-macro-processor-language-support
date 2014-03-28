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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.gnu.m4.lexer.M4TokenId;
import org.netbeans.gnu.m4.semantic.M4ColoringAttributes.Coloring;
import org.netbeans.spi.editor.highlighting.HighlightsSequence;
import org.netbeans.spi.editor.highlighting.support.AbstractHighlightsContainer;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class M4LexerBasedHighlightLayer extends AbstractHighlightsContainer {

    private Map<Token<? extends TokenId>, Coloring> colorings;
    private final Map<Coloring, AttributeSet> CACHE = new HashMap<>();
    private final Document doc;

    private M4LexerBasedHighlightLayer(Document doc) {
        this.doc = doc;
        this.colorings = Collections.emptyMap();
    }

    public static M4LexerBasedHighlightLayer getLayer(Class<?> id, Document doc) {
        M4LexerBasedHighlightLayer layer = (M4LexerBasedHighlightLayer) doc.getProperty(id);

        if (layer == null) {
            doc.putProperty(id, layer = new M4LexerBasedHighlightLayer(doc));
        }

        return layer;
    }

    @Override
    public synchronized HighlightsSequence getHighlights(int startOffset, int endOffset) {
        if (colorings.isEmpty()) {
            return HighlightsSequence.EMPTY;
        }

        TokenHierarchy<Document> th = TokenHierarchy.get(doc);
        TokenSequence<? extends TokenId> seq = th.tokenSequence();

        if (seq == null) { // Null when token hierarchy is inactive
            return HighlightsSequence.EMPTY;
        }

        if (seq.language() == M4TokenId.getLanguage()) {
            return new M4LexerBasedHighlightSequence(this, seq.subSequence(startOffset, endOffset), colorings);
        } else {
            return new HighlightsSequence() {

                @Override
                public boolean moveNext() {
                    return false;
                }

                @Override
                public int getStartOffset() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public int getEndOffset() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public AttributeSet getAttributes() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
        }
    }

    public void setColorings(final Map<Token<? extends TokenId>, Coloring> colorings, final Set<Token<? extends TokenId>> addedTokens) {
        doc.render(new Runnable() {
            @Override
            public void run() {
                synchronized (M4LexerBasedHighlightLayer.this) {
                    M4LexerBasedHighlightLayer.this.colorings = colorings;

                    if (addedTokens.isEmpty()) {
                        return;
                    }
                    
                    if (addedTokens.size() < 30) {
                        int startOffset = Integer.MAX_VALUE;
                        int endOffset = -1;
                        for (Token<? extends TokenId> t : addedTokens) {
                            int tOffset = t.offset(null);
                            startOffset = Math.min(tOffset, startOffset);
                            endOffset = Math.max(endOffset, tOffset + t.length());
                        }
                        fireHighlightsChange(startOffset, endOffset);
                    } else { // Too many tokens => repaint all
                        fireHighlightsChange(0, doc.getLength());
                    }
                }
            }
        });
    }

    public synchronized Map<Token<? extends TokenId>, Coloring> getColorings() {
        return colorings;
    }

    public synchronized void clearColoringCache() {
        CACHE.clear();
    }

    synchronized AttributeSet getColoring(Coloring c) {
        AttributeSet a = CACHE.get(c);

        if (a == null) {
            CACHE.put(c, a = M4ColoringManager.getColoringImpl(c));
        }

        return a;
    }
}
