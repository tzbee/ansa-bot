package com.touzbi.ansa.util.filereaderstrategy;

import java.io.IOException;
import java.io.InputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * File reader implementation using class loader
 */
public class ClassPathRelativeFileReaderStrategy extends
		AbstractFileReaderStrategy {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public InputStream readToInputStream(String filePath) throws IOException {
		LOGGER.info("Reading file relative to class path: " + filePath);

		return Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(filePath);
	}
}
