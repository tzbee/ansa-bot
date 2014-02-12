package com.touzbi.ansa.contentgrabber;

import com.touzbi.ansa.htmlelement.elementpropertygrabber.AttributePropertyGrabber;

public class AttributeGrabber extends AbstractCSSQueryContentGrabber {
	public AttributeGrabber(String query, String attributeName) {
		super(new AttributePropertyGrabber(attributeName), query);
	}
}
