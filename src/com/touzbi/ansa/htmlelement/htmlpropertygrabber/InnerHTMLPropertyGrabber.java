package com.touzbi.ansa.htmlelement.htmlpropertygrabber;

import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;

public class InnerHTMLPropertyGrabber implements HTMLPropertyGrabber {
	@Override
	public String getProperty(HTMLElementWrapper htmlElement) {
		return htmlElement.getInnerHTML();
	}
}
