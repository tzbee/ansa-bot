package com.touzbi.ansa.htmlelement.elementpropertygrabber;

import com.touzbi.ansa.htmlelement.HTMLElement;

public class AttributePropertyGrabber implements ElementPropertyGrabber {
	private String attributeName;

	public AttributePropertyGrabber(String attributeName) {
		this.attributeName = attributeName;
	}

	@Override
	public String getProperty(HTMLElement htmlElement) {
		return htmlElement.getAttributeValue(this.attributeName);
	}
}
