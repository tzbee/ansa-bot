package com.touzbi.ansa.command;

import java.util.Collection;

import com.touzbi.ansa.contentgrabber.HTMLElementContentGrabber;

public class GetContentCommand extends AbstractCommand {
	private static final String HTML_ELEMENT_PARAM = "html-element";

	@Override
	public void execute() {
		Collection<String> htmlElementQueries = getParamValues(HTML_ELEMENT_PARAM);

		for (String htmlElementQuery : htmlElementQueries) {
			for (String input : getInput()) {
				addOutput(new HTMLElementContentGrabber().getContent(
						htmlElementQuery, input));
			}
		}
	}

	@Override
	public String toString() {
		return "Get content command - " + super.toString();
	}
}
