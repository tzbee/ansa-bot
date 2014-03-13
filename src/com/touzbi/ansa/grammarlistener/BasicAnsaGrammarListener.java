package com.touzbi.ansa.grammarlistener;

import com.touzbi.ansa.antlrgrammar.AnsaGrammarBaseListener;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.CommandBlockContext;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.CommandIdContext;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.ParamPairContext;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.commandloader.CommandLoader;
import com.touzbi.ansa.util.stringformatter.EdgeCutterStringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatter;

public class BasicAnsaGrammarListener extends AnsaGrammarBaseListener {
	private CommandLoader commandLoader;

	// Cuts the first and last character of a string
	private StringFormatter removeQuotesformatter = new EdgeCutterStringFormatter();

	// Command Builder
	private CommandBuilder mainCommandBuilder;

	// Temporary reference
	private CommandBuilder currentCommandBuilder;

	public BasicAnsaGrammarListener(CommandLoader commandLoader,
			CommandBuilder mainCommandBuilder) {
		this.commandLoader = commandLoader;
		this.mainCommandBuilder = mainCommandBuilder;
	}

	/**
	 * Commands
	 */

	@Override
	public void exitCommandId(CommandIdContext ctx) {
		this.currentCommandBuilder = this.commandLoader.getCommandByName(ctx
				.getText());
	}

	/**
	 * Params
	 */

	@Override
	public void exitParamPair(ParamPairContext ctx) {
		String paramName = ctx.paramName().getText();
		String paramValue = this.removeQuotesformatter.format(ctx.paramValue()
				.getText());

		this.currentCommandBuilder.addParam(paramName, paramValue);
	}

	@Override
	public void exitCommandBlock(CommandBlockContext ctx) {
		this.mainCommandBuilder.addCommandBuilders(this.currentCommandBuilder);
	}
}
