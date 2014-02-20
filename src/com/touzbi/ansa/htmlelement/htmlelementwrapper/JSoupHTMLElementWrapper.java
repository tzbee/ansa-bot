package com.touzbi.ansa.htmlelement.htmlelementwrapper;

import org.jsoup.nodes.Element;

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

	@Override
	public String getInnerHTML() {
		return this.element.html();
	}
}
