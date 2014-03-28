// Generated from m4.g4 by ANTLR 4.2.1

package org.netbeans.gnu.m4.antlr;

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
}