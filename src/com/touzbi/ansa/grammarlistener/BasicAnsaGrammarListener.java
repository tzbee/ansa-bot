package com.touzbi.ansa.grammarlistener;

import com.touzbi.ansa.antlrgrammar.AnsaGrammarBaseListener;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.CommandBlockContext;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.CommandIdContext;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.ParamPairContext;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.commandstorage.AnsaCommandStorage;
import com.touzbi.ansa.util.stringformatter.EdgeCutterStringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatter;

public class BasicAnsaGrammarListener extends AnsaGrammarBaseListener {

	// Cuts the first and last character of a string
	private StringFormatter edgeCutter = new EdgeCutterStringFormatter();

	// Command Builder
	private CommandBuilder mainCommandBuilder;

	// Temporary reference
	private CommandBuilder currentCommandBuilder;

	public BasicAnsaGrammarListener(CommandBuilder mainCommandBuilder) {
		this.mainCommandBuilder = mainCommandBuilder;
	}

	// Utility method to removes quotes
	private String removeQuotes(String str) {
		return this.edgeCutter.format(str);
	}

	/**
	 * Commands
	 */

	@Override
	public void exitCommandId(CommandIdContext ctx) {
		this.currentCommandBuilder = AnsaCommandStorage.getInstance()
				.getCommandByName(ctx.getText());
	}

	/**
	 * Params
	 */

	@Override
	public void exitParamPair(ParamPairContext ctx) {
		String paramName = ctx.paramName().getText();
		String paramValue = removeQuotes(ctx.paramValue().getText());

		this.currentCommandBuilder.addParam(paramName, paramValue);
	}

	@Override
	public void exitCommandBlock(CommandBlockContext ctx) {
		this.mainCommandBuilder.addCommandBuilder(this.currentCommandBuilder);
	}
}
