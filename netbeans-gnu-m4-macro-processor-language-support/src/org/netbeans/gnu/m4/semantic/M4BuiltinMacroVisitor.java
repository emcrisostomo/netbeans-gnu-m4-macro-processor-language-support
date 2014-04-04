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
import org.antlr.v4.runtime.tree.TerminalNode;
import org.netbeans.gnu.m4.antlr.v1.m4BaseVisitor;
import org.netbeans.gnu.m4.antlr.v1.m4Parser;
import org.netbeans.gnu.m4.lexer.M4Keyword;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class M4BuiltinMacroVisitor extends m4BaseVisitor<Void> {

    private static final Logger logger = Logger.getLogger(M4BuiltinMacroVisitor.class.getName());

    private final Set<Token> identifiers = new HashSet<>();
    private final Set<Token> builtinIdentifiers = new HashSet<>();
    private final Set<Token> macroInvocations = new HashSet<>();

    @Override
    public Void visitExpression_with_params(m4Parser.Expression_with_paramsContext ctx) {
        final TerminalNode identifier = ctx.ID();

        logger.fine(String.format("M4 Identifier found in expression with params: %s", identifier.getText()));

        final Token symbol = identifier.getSymbol();
        identifiers.add(symbol);
        macroInvocations.add(symbol);

        if (M4Keyword.isBuiltin(identifier.getText())) {
            builtinIdentifiers.add(symbol);
        }

        return visitChildren(ctx);
    }

    @Override
    public Void visitExpression(m4Parser.ExpressionContext ctx) {
        final TerminalNode identifier = ctx.ID();

        logger.fine(String.format("M4 Identifier found: %s", identifier.getText()));

        final Token symbol = identifier.getSymbol();
        identifiers.add(symbol);

        if (M4Keyword.isBuiltin(identifier.getText())) {
            builtinIdentifiers.add(symbol);
        }

        return visitChildren(ctx);
    }

    public Set<Token> getBuiltinIdentifiers() {
        return builtinIdentifiers;
    }

    public Set<Token> getMacroInvocations() {
        return macroInvocations;
    }

    public Set<Token> getIdentifiers() {
        return identifiers;
    }
}
