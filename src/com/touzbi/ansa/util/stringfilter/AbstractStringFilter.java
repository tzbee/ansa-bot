package com.touzbi.ansa.util.stringfilter;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractStringFilter implements StringFilter {
	@Override
	public Collection<String> filter(Collection<String> strCollection) {
		Collection<String> results = new ArrayList<String>();

		for (String str : strCollection) {
			if (isValidString(str)) {
				results.add(str);
			}
		}

		return results;
	}
}
