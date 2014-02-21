package com.touzbi.ansa.htmlelement.htmlelement;

import java.util.Collection;

import com.touzbi.ansa.htmlelement.htmlpropertygrabber.HTMLPropertyGrabber;

public interface HTMLElementWrapper {
	/**
	 * @param attributeKey
	 *            name of the attribute to get the value of
	 * 
	 * @return the value of the specified attribute
	 */
	String getAttributeValue(String attributeKey);

	/**
	 * @return All the content of the element, including child elements
	 */
	String getInnerHTML();

	/**
	 * @return the name of the element's tag
	 */
	String getTag();

	/**
	 * Select elements given a css style query
	 * 
	 * @param cssQuery
	 * @return The elements selected
	 */
	Collection<HTMLElementWrapper> select(String cssQuery);

	/**
	 * @return
	 */

	// TODO Javadoc
	Collection<String> getAttributeValues(String cssQuery, String attributeName);

	Collection<String> getInnerHTML(String cssQuery);

	Collection<String> getElementProperties(String cssQuery,
			HTMLPropertyGrabber htmlPropertyGrabber);
}
