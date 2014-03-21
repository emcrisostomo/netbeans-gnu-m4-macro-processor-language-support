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
package org.netbeans.gnu.m4.lexer;

import java.util.logging.Logger;
import org.netbeans.gnu.m4.lexer.javacc.M4ParserTokenManager;
import org.netbeans.gnu.m4.lexer.javacc.JavaCharStream;
import org.netbeans.gnu.m4.lexer.javacc.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class M4Lexer implements Lexer<M4TokenId> {

    public static final String VERBOSE_PROPERTY = M4Lexer.class.getName() + ".verbose";
    private static final boolean isVerbose = Boolean.valueOf(System.getProperty(VERBOSE_PROPERTY));
    private static final Logger logger = Logger.getLogger(M4Lexer.class.getName());

    private final LexerRestartInfo<M4TokenId> info;
    private final M4ParserTokenManager javaParserTokenManager;

    M4Lexer(LexerRestartInfo<M4TokenId> info) {
        this.info = info;
        JavaCharStream stream = new JavaCharStream(info.input());
        javaParserTokenManager = new M4ParserTokenManager(stream);
    }

    @Override
    public org.netbeans.api.lexer.Token<M4TokenId> nextToken() {
        Token token = javaParserTokenManager.getNextToken();

        if (isVerbose) {
            logger.info((token == null) ? "token: null" : token.image + ":" + token.kind);
        }

        if (info.input().readLength() < 1) {
            return null;
        }

        return info.tokenFactory().createToken(M4LanguageHierarchy.getToken(token.kind));
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
}
