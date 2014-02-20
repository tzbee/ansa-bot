package com.touzbi.ansa.htmlelement.htmlelementgrabber;

import java.util.Collection;

import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;

public interface HTMLElementGrabber {
	Collection<HTMLElementWrapper> getHTMLElements(String query, String document);
}
