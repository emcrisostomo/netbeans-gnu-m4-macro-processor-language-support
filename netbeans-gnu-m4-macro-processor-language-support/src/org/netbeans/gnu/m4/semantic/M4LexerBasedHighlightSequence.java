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

import java.util.Map;
import javax.swing.text.AttributeSet;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.gnu.m4.semantic.M4ColoringAttributes.Coloring;
import org.netbeans.spi.editor.highlighting.HighlightsSequence;

/**
 *
 * @author Enrico M. Crisostomo
 */
class M4LexerBasedHighlightSequence implements HighlightsSequence {

    private final M4LexerBasedHighlightLayer layer;
    private final Map<Token<? extends TokenId>, Coloring> colorings;
    private final TokenSequence<? extends TokenId> ts;

    public M4LexerBasedHighlightSequence(M4LexerBasedHighlightLayer layer, TokenSequence<? extends TokenId> ts, Map<Token<? extends TokenId>, Coloring> colorings) {
        this.layer = layer;
        this.ts = ts;
        this.colorings = colorings;
    }

    @Override
    public boolean moveNext() {
        while (ts.moveNext()) {
            Token<? extends TokenId> t = ts.token();
            if (/* t.id() == M4 identifier && */colorings.containsKey(ts.token())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int getStartOffset() {
        return ts.offset();
    }

    @Override
    public int getEndOffset() {
        return ts.offset() + ts.token().length();
    }

    @Override
    public AttributeSet getAttributes() {
        return layer.getColoring(colorings.get(ts.token()));
    }
}
