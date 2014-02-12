package com.touzbi.ansa.htmlelement.elementpropertygrabber;

import com.touzbi.ansa.htmlelement.HTMLElement;

public class TextPropertyGrabber implements ElementPropertyGrabber {
	@Override
	public String getProperty(HTMLElement htmlElement) {
		return htmlElement.getText();
	}
}
