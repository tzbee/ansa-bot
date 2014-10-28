package com.touzbi.ansatest.stringformattertest;

import com.touzbi.ansa.util.stringformatter.CustomWrapperStringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatter;

public class CustomWrapperStringFormatterTest {
	private static final String PREFIX = "http://www.";
	private static final String SUFFIX = ".com";

	@Test
	public void test() {
		StringFormatter stringFormatter = new CustomWrapperStringFormatter(
				PREFIX, SUFFIX);

		stringFormatter.format("prout");
	}
}
