package com.touzbi.ansa.htmlelement.htmlelement;

import java.util.ArrayList;
import java.util.Collection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import com.touzbi.ansa.htmlelement.htmlpropertygrabber.AttributePropertyGrabber;
import com.touzbi.ansa.htmlelement.htmlpropertygrabber.HTMLPropertyGrabber;
import com.touzbi.ansa.htmlelement.htmlpropertygrabber.InnerHTMLPropertyGrabber;

public class JSoupHTMLElementWrapper implements HTMLElementWrapper {
	private Element element;

	private JSoupHTMLElementWrapper(Element element) {
		this.element = element;
	}

	public static JSoupHTMLElementWrapper createHTMLElement(String document) {
		return new JSoupHTMLElementWrapper(Jsoup.parse(document));
	}

	@Override
	public String getAttributeValue(String attributeKey) {
		return this.element.attr(attributeKey);
	}

	@Override
	public String getInnerHTML() {
		return this.element.html();
	}

	@Override
	public String getTag() {
		return this.element.tagName();
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
	public Collection<String> getAttributeValues(String cssQuery,
			String attributeName) {
		return getElementProperties(cssQuery, new AttributePropertyGrabber(
				attributeName));
	}

	@Override
	public Collection<String> getInnerHTML(String cssQuery) {
		return getElementProperties(cssQuery, new InnerHTMLPropertyGrabber());
	}

	@Override
	public Collection<String> getElementProperties(String cssQuery,
			HTMLPropertyGrabber htmlPropertyGrabber) {
		Collection<String> properties = new ArrayList<String>();
		Collection<HTMLElementWrapper> htmlElements = select(cssQuery);

		for (HTMLElementWrapper htmlElement : htmlElements) {
			properties.add(htmlPropertyGrabber.getProperty(htmlElement));
		}

		return properties;
	}

	@Override
	public String toString() {
		return this.element.toString();
	}
}
