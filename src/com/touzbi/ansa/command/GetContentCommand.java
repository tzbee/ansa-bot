package com.touzbi.ansa.command;

import java.util.Collection;

import com.touzbi.ansa.contentgrabber.CustomLinkGrabber;

public class GetContentCommand extends AbstractCommand {
	private static final String LINK_PARAM = "link";

	@Override
	public void execute() {
		Collection<String> linkQueries = getParamValues(LINK_PARAM);

		for (String linkQuery : linkQueries) {
			for (String input : getInput()) {
				addOutput(new CustomLinkGrabber(linkQuery).getContent(input));
			}
		}
	}

	@Override
	public String toString() {
		return "Content grabber command";
	}
}
