// Generated from m4.g4 by ANTLR 4.2.2

package org.netbeans.gnu.m4.antlr.v1;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link m4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface m4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link m4Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull m4Parser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link m4Parser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(@NotNull m4Parser.QuoteContext ctx);

	/**
	 * Visit a parse tree produced by {@link m4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull m4Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link m4Parser#parenthesizedText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedText(@NotNull m4Parser.ParenthesizedTextContext ctx);

	/**
	 * Visit a parse tree produced by {@link m4Parser#expression_with_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_with_params(@NotNull m4Parser.Expression_with_paramsContext ctx);

	/**
	 * Visit a parse tree produced by {@link m4Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull m4Parser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link m4Parser#punctuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunctuation(@NotNull m4Parser.PunctuationContext ctx);

	/**
	 * Visit a parse tree produced by {@link m4Parser#exprParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParameters(@NotNull m4Parser.ExprParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link m4Parser#exprParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParameter(@NotNull m4Parser.ExprParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link m4Parser#verbatimText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbatimText(@NotNull m4Parser.VerbatimTextContext ctx);
}