package com.touzbi.ansa.htmlelement.htmlpropertygrabber;

import com.touzbi.ansa.htmlelement.htmlelement.HTMLElement;

public class InnerHTMLPropertyGrabber implements HTMLPropertyGrabber {
	@Override
	public String getProperty(HTMLElement htmlElement) {
		return htmlElement.getInnerHTML();
	}
}
