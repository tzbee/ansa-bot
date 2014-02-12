package com.touzbi.ansa.htmlelement;

import java.util.HashMap;
import java.util.Map;

public class MapHTMLElement implements HTMLElement {
	private Map<String, String> attributeMap = new HashMap<String, String>();

	// Only the Text content of the element
	private String text = "";

	// Contains the full content of the element, including tags
	private String innerHTML;

	@Override
	public void addAttributePair(String attributeName, String attributeValue) {
		this.attributeMap.put(attributeName, attributeValue);
	}

	@Override
	public String getAttributeValue(String attributeName) {
		String attributeValue = this.attributeMap.get(attributeName);
		return attributeValue != null ? attributeValue : "";
	}

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String getInnerHTML() {
		return this.innerHTML;
	}

	@Override
	public void setInnerHTML(String innerHTML) {
		this.innerHTML = innerHTML;
	}
}
