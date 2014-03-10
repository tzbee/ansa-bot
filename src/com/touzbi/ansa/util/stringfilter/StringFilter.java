package com.touzbi.ansa.util.stringfilter;

import java.util.Collection;

public interface StringFilter {
	boolean isValidString(String str);

	Collection<String> filter(Collection<String> str);
}
