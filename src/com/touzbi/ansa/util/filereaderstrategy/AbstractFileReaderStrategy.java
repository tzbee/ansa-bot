package com.touzbi.ansa.util.filereaderstrategy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractFileReaderStrategy implements FileReaderStrategy {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public String readToString(String filePath) {
		InputStream inputStream;
		try {
			inputStream = readToInputStream(filePath);
		} catch (IOException | NullPointerException e) {
			LOGGER.error("Could not read file: " + filePath);
			return "";
		}

		return convertStreamToString(inputStream);
	}

	@SuppressWarnings("resource")
	private static String convertStreamToString(InputStream is) {
		Scanner s = new Scanner(is).useDelimiter("\\A");
		return s.hasNext() ? s.next() : "";
	}
}
