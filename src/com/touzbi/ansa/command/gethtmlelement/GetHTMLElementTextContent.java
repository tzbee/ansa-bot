package com.touzbi.ansa.command.gethtmlelement;

import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;

public class GetHTMLElementTextContent extends
		AbstractGetElementPropertyCommandBuilder {

	@Override
	protected String getHTMLProperty(HTMLElementWrapper htmlElementWrapper) {
		return htmlElementWrapper.getInnerHTML();
	}

	@Override
	public String toString() {
		return "Get HTML Element text content";
	}
}
