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
	 * Enter a parse tree produced by {@link m4Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull m4Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull m4Parser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(@NotNull m4Parser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(@NotNull m4Parser.QuoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull m4Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull m4Parser.ExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link m4Parser#expression_with_params}.
	 * @param ctx the parse tree
	 */
	void enterExpression_with_params(@NotNull m4Parser.Expression_with_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#expression_with_params}.
	 * @param ctx the parse tree
	 */
	void exitExpression_with_params(@NotNull m4Parser.Expression_with_paramsContext ctx);

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
	 * Enter a parse tree produced by {@link m4Parser#punctuation}.
	 * @param ctx the parse tree
	 */
	void enterPunctuation(@NotNull m4Parser.PunctuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#punctuation}.
	 * @param ctx the parse tree
	 */
	void exitPunctuation(@NotNull m4Parser.PunctuationContext ctx);

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