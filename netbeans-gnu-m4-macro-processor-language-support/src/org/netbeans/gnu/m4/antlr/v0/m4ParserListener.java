// Generated from m4Parser.g4 by ANTLR 4.2.1

package org.netbeans.gnu.m4.antlr.v0;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link m4Parser}.
 */
public interface m4ParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link m4Parser#macroInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMacroInvocation(@NotNull m4Parser.MacroInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#macroInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMacroInvocation(@NotNull m4Parser.MacroInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#pText}.
	 * @param ctx the parse tree
	 */
	void enterPText(@NotNull m4Parser.PTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#pText}.
	 * @param ctx the parse tree
	 */
	void exitPText(@NotNull m4Parser.PTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#qtext}.
	 * @param ctx the parse tree
	 */
	void enterQtext(@NotNull m4Parser.QtextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#qtext}.
	 * @param ctx the parse tree
	 */
	void exitQtext(@NotNull m4Parser.QtextContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#macroName}.
	 * @param ctx the parse tree
	 */
	void enterMacroName(@NotNull m4Parser.MacroNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#macroName}.
	 * @param ctx the parse tree
	 */
	void exitMacroName(@NotNull m4Parser.MacroNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#builtinMacro}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinMacro(@NotNull m4Parser.BuiltinMacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#builtinMacro}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinMacro(@NotNull m4Parser.BuiltinMacroContext ctx);

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
	 * Enter a parse tree produced by {@link m4Parser#parameterText}.
	 * @param ctx the parse tree
	 */
	void enterParameterText(@NotNull m4Parser.ParameterTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#parameterText}.
	 * @param ctx the parse tree
	 */
	void exitParameterText(@NotNull m4Parser.ParameterTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull m4Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull m4Parser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#verbatimParameterText}.
	 * @param ctx the parse tree
	 */
	void enterVerbatimParameterText(@NotNull m4Parser.VerbatimParameterTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#verbatimParameterText}.
	 * @param ctx the parse tree
	 */
	void exitVerbatimParameterText(@NotNull m4Parser.VerbatimParameterTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#ctext}.
	 * @param ctx the parse tree
	 */
	void enterCtext(@NotNull m4Parser.CtextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#ctext}.
	 * @param ctx the parse tree
	 */
	void exitCtext(@NotNull m4Parser.CtextContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull m4Parser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull m4Parser.TextContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#quotedText}.
	 * @param ctx the parse tree
	 */
	void enterQuotedText(@NotNull m4Parser.QuotedTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#quotedText}.
	 * @param ctx the parse tree
	 */
	void exitQuotedText(@NotNull m4Parser.QuotedTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link m4Parser#verbatimQuotedText}.
	 * @param ctx the parse tree
	 */
	void enterVerbatimQuotedText(@NotNull m4Parser.VerbatimQuotedTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#verbatimQuotedText}.
	 * @param ctx the parse tree
	 */
	void exitVerbatimQuotedText(@NotNull m4Parser.VerbatimQuotedTextContext ctx);

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