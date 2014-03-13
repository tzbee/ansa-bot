package com.touzbi.ansa.util.separator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ScannerDelimiterSeparator extends AbstractDelimiterSeparator {
	public ScannerDelimiterSeparator(String delimiter) {
		super(delimiter);
	}

	@Override
	public Collection<String> separate(String str) {
		Collection<String> resultList = new ArrayList<String>();

		Scanner scanner = new Scanner(str);
		scanner.useDelimiter(this.delimiter);

		for (Iterator<String> iterator = scanner; iterator.hasNext();) {
			resultList.add(iterator.next());
		}

		scanner.close();

		return resultList;
	}
}
