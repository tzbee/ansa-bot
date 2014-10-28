package com.touzbi.ansatest.stringfiltertest;

import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.util.stringfilter.RegexStringFilter;
import com.touzbi.ansa.util.stringfilter.StringFilter;

public class RegexStringFilterTest {
	private static final Collection<String> TEST_COLLECTION = Arrays.asList(
			"prout", "yes", "h8aha", "hahaprout", "yesyse", "proutyes",
			"holapr", "hahaproutyes");

	private static final String REGEX = ".*h.*aha.*";

	@Test
	public void test() {
		StringFilter urlFilter = new RegexStringFilter(REGEX);

		System.out.println("Collection: " + TEST_COLLECTION);
		System.out.println("Regex: " + REGEX);
		System.out.println("Filtered Collection: "
				+ urlFilter.filter(TEST_COLLECTION));
	}
}
