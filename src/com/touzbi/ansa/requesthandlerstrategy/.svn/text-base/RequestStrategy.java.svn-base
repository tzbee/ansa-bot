package com.touzbi.ansa.requesthandlerstrategy;

import java.util.List;

/**
 * @author touzbi Interface for handling document retrieving through URL
 */
public interface RequestStrategy {
	/**
	 * Request a single page given the URL
	 * 
	 * @param url
	 *            URL specifying document's location
	 * @return the content at this URL
	 */
	String getPage(String url);

	/**
	 * Request multiple pages given multiple URLs
	 * 
	 * @param urls
	 * @return
	 */
	List<String> getPages(List<String> urls);
}
