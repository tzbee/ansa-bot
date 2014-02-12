package com.touzbi.ansa.contentgrabber;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.htmlelement.HTMLElement;
import com.touzbi.ansa.htmlelement.elementpropertygrabber.ElementPropertyGrabber;
import com.touzbi.ansa.htmlelement.htmlelementgrabber.HTMLElementGrabber;
import com.touzbi.ansa.htmlelement.htmlelementgrabber.JSoupHTMLElementGrabber;

/**
 * Skeletal implementation of a ContentGrabber using CSS-style queries to get
 * xml content
 */
public abstract class AbstractCSSQueryContentGrabber extends
		AbstractContentGrabber {
	private static final Logger LOGGER = LogManager.getLogger();

	protected HTMLElementGrabber htmlElementGrabber = new JSoupHTMLElementGrabber();
	protected ElementPropertyGrabber elementPropertyGrabber;

	protected String query;

	public AbstractCSSQueryContentGrabber(
			ElementPropertyGrabber elementPropertyGrabber, String query) {
		this.elementPropertyGrabber = elementPropertyGrabber;
		this.query = query;
	}

	@Override
	public List<String> getContent(String htmlPage) {
		LOGGER.info("Getting content using selector: {}..", this.query);

		List<String> resultList = new ArrayList<String>();

		for (HTMLElement htmlElement : this.htmlElementGrabber.getElements(
				htmlPage, this.query)) {
			resultList
					.add(this.elementPropertyGrabber.getProperty(htmlElement));
		}

		LOGGER.info(!resultList.isEmpty() ? "Content found"
				: "No content found");

		LOGGER.debug(resultList.isEmpty() ? "Original document: " + htmlPage
				: "");

		return resultList;
	}

	@Override
	public String toString() {
		return "query: " + this.query;
	}
}
