package com.touzbi.ansa.contentgrabber;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.htmlelement.elementpropertygrabber.TextPropertyGrabber;

public class TextContentGrabber extends AbstractCSSQueryContentGrabber {
	private static final Logger LOGGER = LogManager.getLogger();

	public TextContentGrabber(String query) {
		super(new TextPropertyGrabber(), query);
	}

	@Override
	public List<String> getContent(String htmlPage) {
		LOGGER.info("Getting text content..");
		return super.getContent(htmlPage);
	}
}
