package com.touzbi.ansa.util.fileutils.filereaderstrategy;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

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
