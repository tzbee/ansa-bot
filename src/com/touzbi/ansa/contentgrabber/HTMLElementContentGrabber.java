package com.touzbi.ansa.contentgrabber;

import java.util.ArrayList;
import java.util.Collection;

import com.touzbi.ansa.htmlelement.htmlelementgrabber.HTMLElementGrabber;
import com.touzbi.ansa.htmlelement.htmlelementgrabber.JSoupHTMLElementGrabber;
import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;

public class HTMLElementContentGrabber implements ContentGrabber {
	private HTMLElementGrabber htmlElementGrabber = new JSoupHTMLElementGrabber();

	@Override
	public Collection<String> getContent(String query, String document) {
		Collection<String> results = new ArrayList<String>();

		for (HTMLElementWrapper htmlElementWrapper : this.htmlElementGrabber
				.getHTMLElements(query, document)) {
			results.add(htmlElementWrapper.toString());
		}

		return results;
	}
}
