package com.touzbi.ansa.command.getcontent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.touzbi.ansa.command.QueryCommandBuilder;

public class GetContentByRegexQuery extends QueryCommandBuilder {

	@Override
	public Collection<String> execute(String input) {
		Collection<String> results = new ArrayList<String>();

		Matcher matcher = Pattern.compile(getQueryParam()).matcher(input);

		while (matcher.find()) {
			results.add(matcher.group());
		}

		return results;
	}
}
