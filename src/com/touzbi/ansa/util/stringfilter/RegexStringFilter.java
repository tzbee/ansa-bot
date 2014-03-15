package com.touzbi.ansa.util.stringfilter;

import java.util.regex.Pattern;

public class RegexStringFilter extends AbstractStringFilter {
	private String regex;

	public RegexStringFilter(String regex, boolean keepValid) {
		super(keepValid);
		this.regex = regex;
	}

	public RegexStringFilter(String regex) {
		this(regex, true);
	}

	@Override
	public boolean isValidString(String str) {
		return Pattern.matches(this.regex, str);
	}
}
