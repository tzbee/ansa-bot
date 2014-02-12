package com.touzbi.ansa.util.separator.test;

import com.touzbi.ansa.util.separator.ScannerSeparator;
import com.touzbi.ansa.util.separator.Separator;

public class SeparatorTest {
	private static final String TEST_STR = "hola\nque\ntal";

	public static void main(String[] args) {
		Separator separator = new ScannerSeparator("\n");

		System.out.println(separator.separate(TEST_STR));
	}
}
