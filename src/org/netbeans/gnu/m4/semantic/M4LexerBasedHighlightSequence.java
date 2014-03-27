/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.gnu.m4.semantic;

import java.util.Map;
import javax.swing.text.AttributeSet;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.gnu.m4.semantic.M4ColoringAttributes.Coloring;
import org.netbeans.spi.editor.highlighting.HighlightsSequence;

/**
 *
 * @author Enrico M. Crisostomo
 */
class M4LexerBasedHighlightSequence implements HighlightsSequence {

    private final M4LexerBasedHighlightLayer layer;
    private final Map<Token, Coloring> colorings;
    private final TokenSequence ts;

    public M4LexerBasedHighlightSequence(M4LexerBasedHighlightLayer layer, TokenSequence ts, Map<Token, Coloring> colorings) {
        this.layer = layer;
        this.ts = ts;
        this.colorings = colorings;
    }

    @Override
    public boolean moveNext() {
        while (ts.moveNext()) {
            Token t = ts.token();
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
