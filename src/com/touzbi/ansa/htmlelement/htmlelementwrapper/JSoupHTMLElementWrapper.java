package com.touzbi.ansa.htmlelement.htmlelementwrapper;

import java.util.ArrayList;
import java.util.Collection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

public class JSoupHTMLElementWrapper implements HTMLElementWrapper {
	private Element element;

	public JSoupHTMLElementWrapper(Element element) {
		this.element = element;
	}

	@Override
	public String getAttributeValue(String attributeKey) {
		return this.element.attr(attributeKey);
	}

	@Override
	public String toString() {
		return this.element.toString();
	}
}
