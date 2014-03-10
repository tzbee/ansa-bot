package com.touzbi.ansa.util.stringfilter;

import java.util.regex.Pattern;

public class RegexStringFilter extends AbstractStringFilter {
	private String regex;

	public RegexStringFilter(String regex) {
		this.regex = regex;
	}

	@Override
	public boolean isValidString(String str) {
		return Pattern.matches(this.regex, str);
	}
}
