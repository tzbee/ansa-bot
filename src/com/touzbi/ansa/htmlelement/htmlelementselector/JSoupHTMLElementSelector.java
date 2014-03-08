package com.touzbi.ansa.htmlelement.htmlelementselector;

import java.util.ArrayList;
import java.util.Collection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;
import com.touzbi.ansa.htmlelement.htmlelementwrapper.JSoupHTMLElementWrapper;

public class JSoupHTMLElementSelector implements HTMLElementSelector {

	@Override
	public Collection<HTMLElementWrapper> selectHTMLElements(String document,
			String query) {
		Collection<HTMLElementWrapper> results = new ArrayList<HTMLElementWrapper>();

		for (Element element : getJSoupDocument(document).select(query)) {
			results.add(new JSoupHTMLElementWrapper(element));
		}

		return results;
	}

	private Document getJSoupDocument(String document) {
		return Jsoup.parse(document);
	}
}
