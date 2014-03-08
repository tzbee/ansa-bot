package com.touzbi.ansa.htmlelement.htmlelementwrapper;

import java.util.Collection;

public interface HTMLElementWrapper {
	/**
	 * @param attributeKey
	 *            name of the attribute to get the value of
	 * 
	 * @return the value of the specified attribute
	 */
	String getAttributeValue(String attributeKey);

	/**
	 * Select elements given a css style query
	 * 
	 * @param cssQuery
	 * @return The elements selected
	 */
	Collection<HTMLElementWrapper> select(String cssQuery);

	String getInnerHTML();
}
