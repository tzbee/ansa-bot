package com.touzbi.ansa.util.separator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScannerDelimiterSeparator extends AbstractDelimiterSeparator {
	public ScannerDelimiterSeparator(String delimiter) {
		super(delimiter);
	}

	@Override
	public List<String> separate(String str) {
		List<String> resultList = new ArrayList<String>();

		Scanner scanner = new Scanner(str);
		scanner.useDelimiter(this.delimiter);

		for (Iterator<String> iterator = scanner; iterator.hasNext();) {
			resultList.add(iterator.next());
		}

		scanner.close();

		return resultList;
	}
}
