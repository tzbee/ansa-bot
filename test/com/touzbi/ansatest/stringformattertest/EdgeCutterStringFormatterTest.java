package com.touzbi.ansatest.stringformattertest;

import com.touzbi.ansa.util.stringformatter.EdgeCutterStringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatter;

public class EdgeCutterStringFormatterTest {
	private static final String INPUT = "yesgfefaefaeah";

	@Test
	public void test() {
		StringFormatter stringFormatter = new EdgeCutterStringFormatter(3);

		System.out.println(stringFormatter.format(INPUT));
	}
}
