package com.touzbi.ansa.contentgrabber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ContentGrabberComposite extends AbstractContentGrabber {
	private Collection<ContentGrabber> contentGrabbers = new ArrayList<ContentGrabber>();

	public ContentGrabberComposite(ContentGrabber... contentGrabbers) {
		for (ContentGrabber contentGrabber : contentGrabbers) {
			this.contentGrabbers.add(contentGrabber);
		}
	}

	@Override
	public List<String> getContent(String document) {
		List<String> content = Arrays.asList(document);

		for (ContentGrabber contentGrabber : this.contentGrabbers) {
			content = contentGrabber.getContent(content);
		}

		return content;
	}

	public void addContentGrabber(ContentGrabber contentGrabber) {
		this.contentGrabbers.add(contentGrabber);
	}

	@Override
	public String toString() {
		return "Content grabber composite: " + this.contentGrabbers;
	}
}
