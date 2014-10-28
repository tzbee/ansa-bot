package com.touzbi.ansa.command.query.getcontent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.LogManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetContentByRegexQuery extends QueryCommandBuilder {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public Collection<String> execute(String input) {
		LOGGER.info("Getting content using regex: {}", getQueryParam());

		Collection<String> queryResults = new ArrayList<String>();

		Matcher matcher = Pattern.compile(getQueryParam()).matcher(input);

		while (matcher.find()) {
			queryResults.add(matcher.group());
		}

		LOGGER.info(!queryResults.isEmpty() ? "Content found"
				: "No content found");

		return queryResults;
	}

	@Override
	public String toString() {
		return "Get content by regex query";
	}
}
