package com.touzbi.ansa.htmlelement.htmlelementgrabber;

import java.util.ArrayList;
import java.util.Collection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;
import com.touzbi.ansa.htmlelement.htmlelementwrapper.JSoupHTMLElementWrapper;

public class JSoupHTMLElementGrabber implements HTMLElementGrabber {

	@Override
	public Collection<HTMLElementWrapper> getElementsFromQuery(String document,
			String query) {
		Collection<HTMLElementWrapper> results = new ArrayList<HTMLElementWrapper>();
		Collection<Element> elements = Selector.select(query,
				Jsoup.parse(document).body());

		for (Element element : elements) {
			results.add(new JSoupHTMLElementWrapper(element));
		}

		return results;
	}
}
