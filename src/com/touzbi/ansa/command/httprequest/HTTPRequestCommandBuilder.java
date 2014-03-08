package com.touzbi.ansa.command.httprequest;

import java.util.Arrays;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.command.AbstractCommandBuilder;
import com.touzbi.ansa.util.filereaderstrategy.FileReaderStrategy;
import com.touzbi.ansa.util.filereaderstrategy.URLFileReaderStrategy;

public class HTTPRequestCommandBuilder extends AbstractCommandBuilder {
	private static final Logger LOGGER = LogManager.getLogger();

	private FileReaderStrategy fileReader = new URLFileReaderStrategy();

	@Override
	public Collection<String> execute(String input) {
		LOGGER.info("Requesting {}..", input);

		String result = this.fileReader.readToString(input);

		LOGGER.info("Page retrieved");

		return Arrays.asList(result);
	}
}
