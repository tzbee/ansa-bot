package com.touzbi.ansa.util.stringfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class AbstractStringFilter implements StringFilter {
	protected boolean keepValidEntries;

	public AbstractStringFilter(boolean keepValidEntries) {
		this.keepValidEntries = keepValidEntries;
	}

	public AbstractStringFilter() {
		this(true);
	}

	@Override
	public Collection<String> filter(Collection<String> strings) {
		Collection<String> filteredStrings = new ArrayList<String>();

		for (String str : strings) {
			if (this.keepValidEntries ? isValidString(str)
					: !isValidString(str)) {
				filteredStrings.add(str);
			}
		}

		return filteredStrings;
	}

	@Override
	public Collection<String> filter(String... strings) {
		return filter(Arrays.asList(strings));
	}
}
