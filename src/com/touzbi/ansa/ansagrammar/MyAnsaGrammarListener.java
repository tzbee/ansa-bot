package com.touzbi.ansa.ansagrammar;

import java.util.ArrayList;
import java.util.Collection;

import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.CommandBlockContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.GetcontentContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.HttprequestContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.InputContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.ParamPairContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.ParamValueContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.SysoutContext;
import com.touzbi.ansa.command.Command;
import com.touzbi.ansa.command.GetContentCommand;
import com.touzbi.ansa.command.HTTPRequestCommand;
import com.touzbi.ansa.command.InputCommand;
import com.touzbi.ansa.command.SysoutCommand;
import com.touzbi.ansa.command.commandbuilder.CommandBuilder;
import com.touzbi.ansa.util.stringformatter.EdgeCutterStringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatter;

@SuppressWarnings("unused")
public class MyAnsaGrammarListener extends AnsaGrammarBaseListener {
	private StringFormatter edgeCutter = new EdgeCutterStringFormatter();

	// Builders
	private CommandBuilder commandBuilder;

	// Tmp references
	private Command currentCommand;

	public MyAnsaGrammarListener(CommandBuilder commandBuilder) {
		this.commandBuilder = commandBuilder;
	}

	private String removeQuotes(String str) {
		return this.edgeCutter.format(str);
	}

	@Override
	public void exitSysout(SysoutContext ctx) {
		this.currentCommand = new SysoutCommand();
	}

	@Override
	public void exitInput(InputContext ctx) {
		this.currentCommand = new InputCommand();
	}

	@Override
	public void exitHttprequest(HttprequestContext ctx) {
		this.currentCommand = new HTTPRequestCommand();
	}

	@Override
	public void exitGetcontent(GetcontentContext ctx) {
		this.currentCommand = new GetContentCommand();
	}

	@Override
	public void exitParamPair(ParamPairContext ctx) {
		String paramName = ctx.paramName().getText();
		Collection<String> paramValues = new ArrayList<String>();

		for (ParamValueContext paramValueContext : ctx.paramValues()
				.paramValue()) {
			String paramValue = this.edgeCutter.format(paramValueContext
					.getText());
			paramValues.add(paramValue);
		}

		this.currentCommand.addParams(paramName, paramValues);
	}

	@Override
	public void exitCommandBlock(CommandBlockContext ctx) {
		this.commandBuilder.addCommand(this.currentCommand);
	}
}
