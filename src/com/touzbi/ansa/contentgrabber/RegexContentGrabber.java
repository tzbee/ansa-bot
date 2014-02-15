package com.touzbi.ansa.contentgrabber;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexContentGrabber implements ContentGrabber {
	private String regex;

	public RegexContentGrabber(String regex) {
		this.regex = regex;
	}

	@Override
	public List<String> getContent(String document) {
		List<String> result = new ArrayList<String>();

		Pattern pattern = Pattern.compile(this.regex);
		Matcher matcher = pattern.matcher(document);

		if (matcher.find()) {
			result.add(matcher.group());
		}

		return result;
	}

	@Override
	public String toString() {
		return "Regex " + this.regex;
	}
}
