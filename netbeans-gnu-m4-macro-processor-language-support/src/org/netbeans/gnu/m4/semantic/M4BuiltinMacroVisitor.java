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

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import org.antlr.v4.runtime.Token;
import org.netbeans.gnu.m4.antlr.v1.m4BaseVisitor;
import org.netbeans.gnu.m4.antlr.v1.m4Parser;
import org.netbeans.gnu.m4.lexer.M4Keyword;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class M4BuiltinMacroVisitor extends m4BaseVisitor<Void> {

    private static final Logger logger = Logger.getLogger(M4BuiltinMacroVisitor.class.getName());

    private final Set<Token> builtinIdentifiers = new HashSet<>();

    @Override
    public Void visitExpr(m4Parser.ExprContext ctx) {
        logger.info(String.format("M4 Identifier found: %s", ctx.ID().getText()));

        if (M4Keyword.isBuiltin(ctx.ID().getText())) {
            final Token symbol = ctx.ID().getSymbol();

            builtinIdentifiers.add(symbol);
        }

        return visitChildren(ctx);
    }

    public Set<Token> getBuiltinIdentifiers() {
        return builtinIdentifiers;
    }
}
