package com.touzbi.ansa.requesthandlerstrategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.util.filereaderstrategy.FileReaderStrategy;
import com.touzbi.ansa.util.filereaderstrategy.URLFileReaderStrategy;

/**
 * @author touzbi Request Handler using the standard API
 */

public class BasicRequestStrategy extends AbstractRequestHandlerStrategy {
	private static final Logger LOGGER = LogManager.getLogger();

	// Use a file reader for distant files, by URL
	private FileReaderStrategy fileReader = new URLFileReaderStrategy();

	@Override
	public String getPage(String url) {
		LOGGER.info("Requesting {}..", url);

		String result = this.fileReader.readToString(url);

		LOGGER.info("Page retrieved");

		return result;
	}
}
