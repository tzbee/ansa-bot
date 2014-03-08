package com.touzbi.ansa.command.gethtmlelement;

import com.touzbi.ansa.htmlelement.htmlelementwrapper.HTMLElementWrapper;

public class GetHTMLAttributeCommandBuilder extends
		AbstractGetElementPropertyCommandBuilder {
	private static final String ATTRIBUTE_PARAM = "attribute";

	@Override
	protected String getHTMLProperty(HTMLElementWrapper htmlElementWrapper) {
		return htmlElementWrapper
				.getAttributeValue(getParamValue(ATTRIBUTE_PARAM));
	}
}
