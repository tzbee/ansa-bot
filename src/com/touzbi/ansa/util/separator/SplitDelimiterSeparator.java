package com.touzbi.ansa.util.separator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

import com.touzbi.ansa.util.stringfilter.RegexStringFilter;
import com.touzbi.ansa.util.stringfilter.StringFilter;

public class SplitDelimiterSeparator extends AbstractDelimiterSeparator {
	private StringFilter stringFilter = new RegexStringFilter("[ ]+", false);

	public SplitDelimiterSeparator(String delimiter) {
		super(delimiter);
	}

	@Override
	public Collection<String> separate(String str) {
		Collection<String> result = new ArrayList<String>(Arrays.asList(Pattern
				.compile(this.delimiter).split(str)));

		return this.stringFilter.filter(result);
	}
}
