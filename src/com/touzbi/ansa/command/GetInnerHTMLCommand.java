package com.touzbi.ansa.command;

import java.util.Collection;

import com.touzbi.ansa.htmlelement.htmlelement.JSoupHTMLElementWrapper;

public class GetInnerHTMLCommand extends AbstractCommand {
	private static final String QUERY_PARAM = "query";

	@Override
	public void execute() {
		Collection<String> cssQueries = getParamValues(QUERY_PARAM);

		for (String cssQuery : cssQueries) {
			for (String input : getInput()) {
				addOutput(JSoupHTMLElementWrapper.createHTMLElement(input)
						.getInnerHTML(cssQuery));
			}
		}
	}

	@Override
	public String toString() {
		return "Get command - " + super.toString();
	}
}
