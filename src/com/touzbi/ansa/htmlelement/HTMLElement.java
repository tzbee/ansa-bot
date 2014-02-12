package com.touzbi.ansa.htmlelement;

public interface HTMLElement {
	void addAttributePair(String attributeName, String attributeValue);

	String getAttributeValue(String attributeName);

	String getText();

	void setText(String text);

	String getInnerHTML();

	void setInnerHTML(String innerHTML);
}
