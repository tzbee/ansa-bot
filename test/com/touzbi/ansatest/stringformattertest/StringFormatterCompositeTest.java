package com.touzbi.ansatest.stringformattertest;

import com.touzbi.ansa.util.stringformatter.CustomWrapperStringFormatter;
import com.touzbi.ansa.util.stringformatter.ReplaceStringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatterComposite;

public class StringFormatterCompositeTest {
	private static final StringFormatter[] FORMATTERS = {
			new ReplaceStringFormatter(" ", "+"),
			new CustomWrapperStringFormatter("HAHA", "LOL") };

	private static final String INPUT = "Hello World !!";

	@Test
	public void test() {
		StringFormatter stringFormatter = new StringFormatterComposite(
				FORMATTERS);

		System.out.println(stringFormatter.format(INPUT));
	}
}
