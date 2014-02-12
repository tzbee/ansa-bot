package com.touzbi.ansa.command;

import java.util.Collection;

import com.touzbi.ansa.contentgrabber.ContentGrabberComposite;
import com.touzbi.ansa.contentgrabber.CustomLinkGrabber;

public class GetContentCommand extends AbstractCommand {
	private static final String LINK_PARAM = "link";

	private ContentGrabberComposite contentGrabberComposite = new ContentGrabberComposite();

	@Override
	public void execute() {
		Collection<String> linkQueries = getParamValues(LINK_PARAM);

		for (String linkQuery : linkQueries) {
			this.contentGrabberComposite
					.addContentGrabber(new CustomLinkGrabber(linkQuery));
		}

		addOutput(this.contentGrabberComposite.getContent(getInput()));
	}

	@Override
	public String toString() {
		return "Content grabber command: " + this.contentGrabberComposite;
	}
}
