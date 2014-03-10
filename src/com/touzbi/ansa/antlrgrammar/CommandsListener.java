// Generated from Commands.g4 by ANTLR 4.1
package com.touzbi.ansa.antlrgrammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandsParser}.
 */
public interface CommandsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandsParser#commandId}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCommandId(@NotNull CommandsParser.CommandIdContext ctx);

	/**
	 * Exit a parse tree produced by {@link CommandsParser#commandId}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCommandId(@NotNull CommandsParser.CommandIdContext ctx);
}