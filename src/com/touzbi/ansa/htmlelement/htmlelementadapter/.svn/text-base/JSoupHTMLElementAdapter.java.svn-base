package com.touzbi.ansa.htmlelement.htmlelementadapter;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

import com.touzbi.ansa.htmlelement.HTMLElement;
import com.touzbi.ansa.htmlelement.MapHTMLElement;

public class JSoupHTMLElementAdapter {
	public static HTMLElement getHTMLElement(Element jSoupElement) {
		HTMLElement htmlElement = new MapHTMLElement();

		for (Attribute attribute : jSoupElement.attributes()) {
			htmlElement.addAttributePair(attribute.getKey(),
					attribute.getValue());
		}

		htmlElement.setText(jSoupElement.text());
		htmlElement.setInnerHTML(jSoupElement.html());

		return htmlElement;
	}
}
