// Generated from m4.g4 by ANTLR 4.2.1

package org.netbeans.gnu.m4.antlr.v1;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link m4Parser}.
 */
public interface m4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link m4Parser#parenthesizedText}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedText(@NotNull m4Parser.ParenthesizedTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#parenthesizedText}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedText(@NotNull m4Parser.ParenthesizedTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#m4}.
	 * @param ctx the parse tree
	 */
	void enterM4(@NotNull m4Parser.M4Context ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#m4}.
	 * @param ctx the parse tree
	 */
	void exitM4(@NotNull m4Parser.M4Context ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull m4Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull m4Parser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull m4Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull m4Parser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#exprParameters}.
	 * @param ctx the parse tree
	 */
	void enterExprParameters(@NotNull m4Parser.ExprParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#exprParameters}.
	 * @param ctx the parse tree
	 */
	void exitExprParameters(@NotNull m4Parser.ExprParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#exprParameter}.
	 * @param ctx the parse tree
	 */
	void enterExprParameter(@NotNull m4Parser.ExprParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#exprParameter}.
	 * @param ctx the parse tree
	 */
	void exitExprParameter(@NotNull m4Parser.ExprParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#verbatimText}.
	 * @param ctx the parse tree
	 */
	void enterVerbatimText(@NotNull m4Parser.VerbatimTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#verbatimText}.
	 * @param ctx the parse tree
	 */
	void exitVerbatimText(@NotNull m4Parser.VerbatimTextContext ctx);
}