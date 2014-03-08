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
	 * Enter a parse tree produced by {@link CommandsParser#gethtmlattribute}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterGethtmlattribute(
			@NotNull CommandsParser.GethtmlattributeContext ctx);

	/**
	 * Exit a parse tree produced by {@link CommandsParser#gethtmlattribute}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitGethtmlattribute(
			@NotNull CommandsParser.GethtmlattributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#download}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterDownload(@NotNull CommandsParser.DownloadContext ctx);

	/**
	 * Exit a parse tree produced by {@link CommandsParser#download}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitDownload(@NotNull CommandsParser.DownloadContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#gethtmltext}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterGethtmltext(@NotNull CommandsParser.GethtmltextContext ctx);

	/**
	 * Exit a parse tree produced by {@link CommandsParser#gethtmltext}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitGethtmltext(@NotNull CommandsParser.GethtmltextContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#format}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFormat(@NotNull CommandsParser.FormatContext ctx);

	/**
	 * Exit a parse tree produced by {@link CommandsParser#format}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFormat(@NotNull CommandsParser.FormatContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link CommandsParser#getcontentbyregex}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterGetcontentbyregex(
			@NotNull CommandsParser.GetcontentbyregexContext ctx);

	/**
	 * Exit a parse tree produced by {@link CommandsParser#getcontentbyregex}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitGetcontentbyregex(
			@NotNull CommandsParser.GetcontentbyregexContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#httprequest}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterHttprequest(@NotNull CommandsParser.HttprequestContext ctx);

	/**
	 * Exit a parse tree produced by {@link CommandsParser#httprequest}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitHttprequest(@NotNull CommandsParser.HttprequestContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommandsParser#sysout}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSysout(@NotNull CommandsParser.SysoutContext ctx);

	/**
	 * Exit a parse tree produced by {@link CommandsParser#sysout}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSysout(@NotNull CommandsParser.SysoutContext ctx);
}