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
package org.netbeans.gnu.m4.lexer.antlr;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
public final class M4LanguageHierarchy extends LanguageHierarchy<M4TokenId> {

    private static final List<M4TokenId> tokens;
    private static final Map<Integer, M4TokenId> idToToken;

    static {
        int regExCounter = 1;
        tokens = Arrays.asList(new M4TokenId[]{
            new M4TokenId("DNL_COMMENT", "comment", regExCounter++),
            new M4TokenId("ID", "keyword", regExCounter++),
            new M4TokenId("LPAREN", "separator", regExCounter++),
            new M4TokenId("RPAREN", "separator", regExCounter++),
            new M4TokenId("LBRACKET", "separator", regExCounter++),
            new M4TokenId("RBRACKET", "separator", regExCounter++),
            new M4TokenId("COMMA", "separator", regExCounter++),
            new M4TokenId("LQUOTE", "separator", regExCounter++),
            new M4TokenId("RQUOTE", "separator", regExCounter++),
            new M4TokenId("WS", "whitespace", regExCounter++),
            new M4TokenId("NL", "whitespace", regExCounter++),
            new M4TokenId("HORIZONTAL_WHITESPACE", "whitespace", regExCounter++),
            new M4TokenId("ANY", "text", regExCounter++)
        });

        idToToken = new HashMap<>();

        for (M4TokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    public static M4TokenId getToken(int id) {

        return idToToken.get(id);
    }

    @Override
    protected Collection<M4TokenId> createTokenIds() {

        return tokens;
    }

    @Override
    protected Lexer<M4TokenId> createLexer(LexerRestartInfo<M4TokenId> info) {
        return new M4Lexer(info);
    }

    @Override
    protected String mimeType() {
        return "text/x-m4";
    }
}
