// Generated from Commands.g4 by ANTLR 4.1
package com.touzbi.ansa.ansagrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandsParser}.
 */
public interface CommandsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandsParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull CommandsParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull CommandsParser.InputContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(@NotNull CommandsParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(@NotNull CommandsParser.FormatContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#commandId}.
	 * @param ctx the parse tree
	 */
	void enterCommandId(@NotNull CommandsParser.CommandIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#commandId}.
	 * @param ctx the parse tree
	 */
	void exitCommandId(@NotNull CommandsParser.CommandIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#httprequest}.
	 * @param ctx the parse tree
	 */
	void enterHttprequest(@NotNull CommandsParser.HttprequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#httprequest}.
	 * @param ctx the parse tree
	 */
	void exitHttprequest(@NotNull CommandsParser.HttprequestContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#sysout}.
	 * @param ctx the parse tree
	 */
	void enterSysout(@NotNull CommandsParser.SysoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#sysout}.
	 * @param ctx the parse tree
	 */
	void exitSysout(@NotNull CommandsParser.SysoutContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#getcontent}.
	 * @param ctx the parse tree
	 */
	void enterGetcontent(@NotNull CommandsParser.GetcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#getcontent}.
	 * @param ctx the parse tree
	 */
	void exitGetcontent(@NotNull CommandsParser.GetcontentContext ctx);
}