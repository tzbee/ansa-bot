// Generated from AnsaGrammar.g4 by ANTLR 4.1
package com.touzbi.ansa.ansagrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnsaGrammarParser}.
 */
public interface AnsaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(@NotNull AnsaGrammarParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(@NotNull AnsaGrammarParser.ParamListContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull AnsaGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull AnsaGrammarParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#commandId}.
	 * @param ctx the parse tree
	 */
	void enterCommandId(@NotNull AnsaGrammarParser.CommandIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#commandId}.
	 * @param ctx the parse tree
	 */
	void exitCommandId(@NotNull AnsaGrammarParser.CommandIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(@NotNull AnsaGrammarParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(@NotNull AnsaGrammarParser.FormatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#paramValue}.
	 * @param ctx the parse tree
	 */
	void enterParamValue(@NotNull AnsaGrammarParser.ParamValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#paramValue}.
	 * @param ctx the parse tree
	 */
	void exitParamValue(@NotNull AnsaGrammarParser.ParamValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#paramValues}.
	 * @param ctx the parse tree
	 */
	void enterParamValues(@NotNull AnsaGrammarParser.ParamValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#paramValues}.
	 * @param ctx the parse tree
	 */
	void exitParamValues(@NotNull AnsaGrammarParser.ParamValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#getcontent}.
	 * @param ctx the parse tree
	 */
	void enterGetcontent(@NotNull AnsaGrammarParser.GetcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#getcontent}.
	 * @param ctx the parse tree
	 */
	void exitGetcontent(@NotNull AnsaGrammarParser.GetcontentContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#sysout}.
	 * @param ctx the parse tree
	 */
	void enterSysout(@NotNull AnsaGrammarParser.SysoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#sysout}.
	 * @param ctx the parse tree
	 */
	void exitSysout(@NotNull AnsaGrammarParser.SysoutContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#paramBlock}.
	 * @param ctx the parse tree
	 */
	void enterParamBlock(@NotNull AnsaGrammarParser.ParamBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#paramBlock}.
	 * @param ctx the parse tree
	 */
	void exitParamBlock(@NotNull AnsaGrammarParser.ParamBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull AnsaGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull AnsaGrammarParser.InputContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#commandBlock}.
	 * @param ctx the parse tree
	 */
	void enterCommandBlock(@NotNull AnsaGrammarParser.CommandBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#commandBlock}.
	 * @param ctx the parse tree
	 */
	void exitCommandBlock(@NotNull AnsaGrammarParser.CommandBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#paramPair}.
	 * @param ctx the parse tree
	 */
	void enterParamPair(@NotNull AnsaGrammarParser.ParamPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#paramPair}.
	 * @param ctx the parse tree
	 */
	void exitParamPair(@NotNull AnsaGrammarParser.ParamPairContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(@NotNull AnsaGrammarParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(@NotNull AnsaGrammarParser.ParamNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsaGrammarParser#httprequest}.
	 * @param ctx the parse tree
	 */
	void enterHttprequest(@NotNull AnsaGrammarParser.HttprequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsaGrammarParser#httprequest}.
	 * @param ctx the parse tree
	 */
	void exitHttprequest(@NotNull AnsaGrammarParser.HttprequestContext ctx);
}