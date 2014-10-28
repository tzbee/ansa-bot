package com.touzbi.ansa.htmlelement.htmlelementwrapper;

import java.util.ArrayList;
import java.util.Collection;

public class JSoupHTMLElementWrapper implements HTMLElementWrapper {
	private Element element;

	public JSoupHTMLElementWrapper(Element element) {
		this.element = element;
	}

	@Override
	public String getAttributeValue(String attributeName) {
		return this.element.attr(attributeName);
	}

	@Override
	public Collection<HTMLElementWrapper> select(String cssQuery) {
		Collection<HTMLElementWrapper> results = new ArrayList<HTMLElementWrapper>();

		for (Element element : this.element.select(cssQuery)) {
			results.add(new JSoupHTMLElementWrapper(element));
		}

		return results;
	}

	@Override
	public String toString() {
		return this.element.toString();
	}

	@Override
	public String getInnerHTML() {
		return this.element.html();
	}
}
