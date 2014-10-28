package com.touzbi.ansa.util.fileutils.filereaderstrategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.logging.LogManager;

public class JarDirectoryRelativeFileReaderStrategy extends
		AbstractFileReaderStrategy {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public InputStream readToInputStream(String filePath) throws IOException {
		LOGGER.info("Reading file in jar directory.. {}", filePath);

		File resultFile = null;

		try {
			File base = new File(JarDirectoryRelativeFileReaderStrategy.class
					.getProtectionDomain().getCodeSource().getLocation()
					.toURI()).getParentFile();
			resultFile = new File(base, filePath);

			LOGGER.info("Reading file {}", resultFile);

		} catch (URISyntaxException e) {
			LOGGER.error(e.getMessage());
		}

		return new FileInputStream(resultFile);
	}
}
