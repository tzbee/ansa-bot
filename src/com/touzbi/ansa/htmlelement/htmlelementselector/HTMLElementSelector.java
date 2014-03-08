package com.touzbi.ansa.htmlelement.htmlelementselector;

import java.util.Collection;

import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;

public interface HTMLElementSelector {
	Collection<HTMLElementWrapper> selectHTMLElements(String document,
			String query);
}
