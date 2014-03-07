package com.touzbi.ansa.ansagrammar;

import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.CommandBlockContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.DownloadContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.GetcontentbyregexContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.GethtmlattributeContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.GethtmltextContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.HttprequestContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.ParamPairContext;
import com.touzbi.ansa.ansagrammar.AnsaGrammarParser.SysoutContext;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.download.DownloadCommandBuilder;
import com.touzbi.ansa.command.getcontent.GetContentByRegexQuery;
import com.touzbi.ansa.command.gethtmlelement.GetHTMLAttributeCommandBuilder;
import com.touzbi.ansa.command.gethtmlelement.GetHTMLElementTextContent;
import com.touzbi.ansa.command.httprequest.HTTPRequestCommandBuilder;
import com.touzbi.ansa.command.print.SysoutCommandBuilder;
import com.touzbi.ansa.util.stringformatter.EdgeCutterStringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatter;

public class MyAnsaGrammarListener extends AnsaGrammarBaseListener {

	// Cuts the first and last character of a string
	private StringFormatter edgeCutter = new EdgeCutterStringFormatter();

	// Command Builder
	private CommandBuilder mainCommandBuilder;

	// tmp
	private CommandBuilder currentCommandBuilder;

	public MyAnsaGrammarListener(CommandBuilder mainCommandBuilder) {
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
	public void exitSysout(SysoutContext ctx) {
		this.currentCommandBuilder = new SysoutCommandBuilder();
	}

	@Override
	public void exitGethtmlattribute(GethtmlattributeContext ctx) {
		this.currentCommandBuilder = new GetHTMLAttributeCommandBuilder();
	}

	@Override
	public void exitGethtmltext(GethtmltextContext ctx) {
		this.currentCommandBuilder = new GetHTMLElementTextContent();
	}

	@Override
	public void exitHttprequest(HttprequestContext ctx) {
		this.currentCommandBuilder = new HTTPRequestCommandBuilder();
	}

	@Override
	public void exitDownload(DownloadContext ctx) {
		this.currentCommandBuilder = new DownloadCommandBuilder();
	}

	@Override
	public void exitGetcontentbyregex(GetcontentbyregexContext ctx) {
		this.currentCommandBuilder = new GetContentByRegexQuery();
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
