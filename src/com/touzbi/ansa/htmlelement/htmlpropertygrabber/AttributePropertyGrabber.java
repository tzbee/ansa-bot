package com.touzbi.ansa.htmlelement.htmlpropertygrabber;

import com.touzbi.ansa.htmlelement.htmlelement.HTMLElementWrapper;

public class AttributePropertyGrabber implements HTMLPropertyGrabber {
	private String attributeName;

	public AttributePropertyGrabber(String attributeName) {
		this.attributeName = attributeName;
	}

	@Override
	public String getProperty(HTMLElementWrapper htmlElement) {
		return htmlElement.getAttributeValue(this.attributeName);
	}
}
