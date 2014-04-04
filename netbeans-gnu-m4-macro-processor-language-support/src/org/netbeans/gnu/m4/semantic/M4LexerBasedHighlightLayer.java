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

import java.lang.ref.WeakReference;
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
import org.netbeans.gnu.m4.semantic.M4ColoringAttributes.Coloring;
import org.netbeans.spi.editor.highlighting.HighlightsSequence;
import org.netbeans.spi.editor.highlighting.support.AbstractHighlightsContainer;
import org.netbeans.spi.editor.highlighting.support.OffsetsBag;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class M4LexerBasedHighlightLayer extends AbstractHighlightsContainer {

    private Map<Token<? extends TokenId>, Coloring> colorings;
    private final Map<Coloring, AttributeSet> CACHE = new HashMap<>();
    private final WeakReference<Document> doc;
    private final OffsetsBag bag;

    private M4LexerBasedHighlightLayer(Document doc) {
        this.doc = new WeakReference<>(doc);
        this.colorings = Collections.emptyMap();
        this.bag = new OffsetsBag(doc);
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

        TokenHierarchy<Document> th = TokenHierarchy.get(doc.get());
        TokenSequence<? extends TokenId> seq = th.tokenSequence();

        if (seq == null) { // Null when token hierarchy is inactive
            return HighlightsSequence.EMPTY;
        }

        return bag.getHighlights(startOffset, endOffset);
    }

    public void setColorings(final Map<Token<? extends TokenId>, Coloring> colorings, final Set<Token<? extends TokenId>> addedTokens) {
        bag.clear();

        M4LexerBasedHighlightLayer.this.colorings = colorings;

        if (addedTokens.isEmpty()) {
            return;
        }

        for (Token<? extends TokenId> token : addedTokens) {
            if (!colorings.containsKey(token)) {
                continue;
            }

            final Coloring coloring = colorings.get(token);
            final int startOffset = token.offset(null);

            bag.addHighlight(startOffset, startOffset + token.length(), this.getColoring(coloring));
        }
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
