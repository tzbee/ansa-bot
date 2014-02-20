package com.touzbi.ansa.htmlelement.elementpropertygrabber;

import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;

public class InnerHTMLPropertyGrabber implements ElementPropertyGrabber {
	@Override
	public String getProperty(HTMLElementWrapper htmlElement) {
		return htmlElement.getInnerHTML();
	}
}
