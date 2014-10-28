package com.touzbi.ansa.command.query.gethtmlelement;

import java.util.ArrayList;
import java.util.Collection;

import com.touzbi.ansa.htmlelement.htmlelementselector.HTMLElementSelector;
import com.touzbi.ansa.htmlelement.htmlelementselector.JSoupHTMLElementSelector;
import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;

public abstract class AbstractGetElementPropertyCommandBuilder extends
		QueryCommandBuilder {
	protected HTMLElementSelector htmlElementSelector = new JSoupHTMLElementSelector();

	@Override
	public Collection<String> execute(String input) {
		Collection<String> results = new ArrayList<String>();

		for (HTMLElementWrapper htmlElementWrapper : this.htmlElementSelector
				.selectHTMLElements(input, getQueryParam())) {
			results.add(getHTMLProperty(htmlElementWrapper));
		}

		return results;
	}

	abstract protected String getHTMLProperty(
			HTMLElementWrapper htmlElementWrapper);
}
