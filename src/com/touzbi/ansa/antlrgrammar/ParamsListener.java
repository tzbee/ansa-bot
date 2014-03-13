// Generated from Params.g4 by ANTLR 4.1
package com.touzbi.ansa.antlrgrammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParamsParser}.
 */
public interface ParamsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParamsParser#paramRef}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterParamRef(@NotNull ParamsParser.ParamRefContext ctx);

	/**
	 * Exit a parse tree produced by {@link ParamsParser#paramRef}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitParamRef(@NotNull ParamsParser.ParamRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ParamsParser#paramList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterParamList(@NotNull ParamsParser.ParamListContext ctx);

	/**
	 * Exit a parse tree produced by {@link ParamsParser#paramList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitParamList(@NotNull ParamsParser.ParamListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ParamsParser#paramValue}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterParamValue(@NotNull ParamsParser.ParamValueContext ctx);

	/**
	 * Exit a parse tree produced by {@link ParamsParser#paramValue}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitParamValue(@NotNull ParamsParser.ParamValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ParamsParser#paramPair}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterParamPair(@NotNull ParamsParser.ParamPairContext ctx);

	/**
	 * Exit a parse tree produced by {@link ParamsParser#paramPair}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitParamPair(@NotNull ParamsParser.ParamPairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ParamsParser#paramName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterParamName(@NotNull ParamsParser.ParamNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link ParamsParser#paramName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitParamName(@NotNull ParamsParser.ParamNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ParamsParser#paramBlock}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterParamBlock(@NotNull ParamsParser.ParamBlockContext ctx);

	/**
	 * Exit a parse tree produced by {@link ParamsParser#paramBlock}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitParamBlock(@NotNull ParamsParser.ParamBlockContext ctx);
}