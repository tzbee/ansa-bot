package com.touzbi.ansa.grammarlistener;

import com.touzbi.ansa.antlrgrammar.AnsaGrammarBaseListener;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.CommandIdContext;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.ParamPairContext;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.ParamRefContext;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.ParamStringContext;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.commandloader.CommandLoader;
import com.touzbi.ansa.param.paramfactory.BasicParamFactory;
import com.touzbi.ansa.param.paramfactory.ParamFactory;
import com.touzbi.ansa.param.paramfactory.ReferencedParamFactory;
import com.touzbi.ansa.util.stringformatter.EdgeCutterStringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatter;

public class BasicAnsaGrammarListener extends AnsaGrammarBaseListener {
	private CommandLoader commandLoader;

	// Cuts the first and last character of a string
	private StringFormatter removeQuotesformatter = new EdgeCutterStringFormatter();

	// Command Builder
	private CommandBuilder mainCommandBuilder;

	// Temporary references
	private CommandBuilder currentCommandBuilder;
	private ParamFactory currentParamFactory;

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

		this.mainCommandBuilder.addChildrenCommands(this.currentCommandBuilder);
	}

	/**
	 * Params
	 */

	@Override
	public void exitParamString(ParamStringContext ctx) {
		this.currentParamFactory = new BasicParamFactory(
				this.removeQuotesformatter.format(ctx.getText()));
	}

	@Override
	public void exitParamRef(ParamRefContext ctx) {
		this.currentParamFactory = new ReferencedParamFactory(ctx.getText(),
				this.mainCommandBuilder);
	}

	@Override
	public void exitParamPair(ParamPairContext ctx) {
		String paramName = ctx.paramName().getText();

		this.currentCommandBuilder
				.addParam(paramName, this.currentParamFactory);
	}
}