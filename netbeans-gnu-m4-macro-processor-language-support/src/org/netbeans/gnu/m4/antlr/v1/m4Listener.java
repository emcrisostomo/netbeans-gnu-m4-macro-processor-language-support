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
	 * Enter a parse tree produced by {@link m4Parser#m4}.
	 * @param ctx the parse tree
	 */
	void enterM4(@NotNull m4Parser.M4Context ctx);
	/**
	 * Exit a parse tree produced by {@link m4Parser#m4}.
	 * @param ctx the parse tree
	 */
	void exitM4(@NotNull m4Parser.M4Context ctx);
}