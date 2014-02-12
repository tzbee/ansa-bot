package com.touzbi.ansa.requesthandlerstrategy;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractRequestHandlerStrategy implements RequestStrategy {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public List<String> getPages(List<String> urls) {
		LOGGER.info("Requesting multiple pages..");

		List<String> result = new ArrayList<String>();

		for (String url : urls) {
			result.add(getPage(url));
		}

		return result;
	}
}
