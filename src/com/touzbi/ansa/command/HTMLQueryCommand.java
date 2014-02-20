package com.touzbi.ansa.command;

import java.util.Collection;

import com.touzbi.ansa.contentgrabber.HTMLElementContentGrabber;

public class HTMLQueryCommand extends AbstractCommand {
	private static final String QUERY_PARAM = "query";

	@Override
	public void execute() {
		Collection<String> htmlElementQueries = getParamValues(QUERY_PARAM);

		for (String htmlElementQuery : htmlElementQueries) {
			for (String input : getInput()) {
				addOutput(new HTMLElementContentGrabber().getContent(
						htmlElementQuery, input));
			}
		}
	}

	@Override
	public String toString() {
		return "Get command - " + super.toString();
	}
}
