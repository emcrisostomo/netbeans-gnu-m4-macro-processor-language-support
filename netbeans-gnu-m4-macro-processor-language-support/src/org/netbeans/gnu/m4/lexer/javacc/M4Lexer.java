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
package org.netbeans.gnu.m4.lexer.javacc;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.netbeans.gnu.m4.Constants.isVerbose;
import org.netbeans.gnu.m4.lexer.M4LanguageHierarchy;
import org.netbeans.gnu.m4.lexer.M4TokenId;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class M4Lexer implements Lexer<M4TokenId> {

    private static final Logger logger = Logger.getLogger(M4Lexer.class.getName());

    private final LexerRestartInfo<M4TokenId> info;
    private final M4ParserTokenManager javaParserTokenManager;

    public M4Lexer(LexerRestartInfo<M4TokenId> info) {
        this.info = info;
        JavaCharStream stream = new JavaCharStream(info.input());

        M4LexerState lexState = (M4LexerState) info.state();
        
        if (lexState == null) {
            javaParserTokenManager = new M4ParserTokenManager(stream);
        } else {
            javaParserTokenManager = new M4ParserTokenManager(stream, lexState.state);
            javaParserTokenManager.m4NestingDepth = lexState.m4NestingDepth;
        }
    }

    @Override
    public org.netbeans.api.lexer.Token<M4TokenId> nextToken() {
        Token token = javaParserTokenManager.getNextToken();

        if (true) {
            logger.info((token == null) ? "token: null" : token.image + ":" + token.kind);
        }

        if (info.input().readLength() < 1) {
            return null;
        }

        return info.tokenFactory().createToken(M4LanguageHierarchy.getToken(token.kind));
    }

    @Override
    public Object state() {
        if (isVerbose()) {
            logger.log(Level.INFO, "Lexer state: {0}", javaParserTokenManager.curLexState);
            logger.log(Level.INFO, "Lexer nesting depth: {0}", javaParserTokenManager.m4NestingDepth);
        }

        return new M4LexerState(javaParserTokenManager.m4NestingDepth, javaParserTokenManager.curLexState);
    }

    @Override
    public void release() {
    }

    private class M4LexerState {

        private int m4NestingDepth;
        private int state;

        private M4LexerState(int m4NestingDepth, int state) {
            this.m4NestingDepth = m4NestingDepth;
            this.state = state;
        }
    }
}
