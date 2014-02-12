package com.touzbi.ansa.contentgrabber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractContentGrabber implements ContentGrabber {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public List<String> getContent(Collection<String> documents) {
		LOGGER.info("Getting content from multiple documents..");

		List<String> resultList = new ArrayList<String>();

		for (String document : documents) {
			resultList.addAll(getContent(document));
		}

		return resultList;
	}
}
