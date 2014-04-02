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

import java.util.logging.Logger;
import org.antlr.v4.runtime.Token;
import org.netbeans.gnu.m4.antlr.support.ANTLRCharStream;
import org.netbeans.gnu.m4.antlr.v1.m4Lexer;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class M4Lexer implements Lexer<M4TokenId> {

    private static final Logger logger = Logger.getLogger(M4Lexer.class.getName());

    private final LexerRestartInfo<M4TokenId> info;
    private final m4Lexer lexer;

    public M4Lexer(LexerRestartInfo<M4TokenId> info) {
        this.info = info;
        ANTLRCharStream stream = new ANTLRCharStream(info.input(), "M4");

        lexer = new m4Lexer(stream);
    }

    @Override
    public org.netbeans.api.lexer.Token<M4TokenId> nextToken() {
        Token token = lexer.nextToken();

        if (true) {
            logger.info((token == null) ? "token: null" : token.getText() + ":" + token.getType());
        }

        if (token == null) {
            throw new IllegalStateException("Token unexpectedly null.");
        }

        if (token.getType() == m4Lexer.EOF) {
            return null;
        }

        return info.tokenFactory().createToken(M4LanguageHierarchy.getToken(token.getType()));
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
}
