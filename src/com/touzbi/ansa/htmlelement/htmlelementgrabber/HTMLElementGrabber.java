package com.touzbi.ansa.htmlelement.htmlelementgrabber;

import java.util.Collection;

import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;

public interface HTMLElementGrabber {
	Collection<HTMLElementWrapper> getElementsFromQuery(String document,
			String query);
}
