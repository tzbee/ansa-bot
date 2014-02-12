package com.touzbi.ansa.util.stringformatter;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class BasicStringFormatter implements StringFormatter {
	private Collection<Character> forbiddenCharacters = new HashSet<Character>();

	public BasicStringFormatter() {
		Character[] chars = { '(', ')' };

		this.forbiddenCharacters.addAll(Arrays.asList(chars));
	}

	@Override
	public String format(String str) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);

			if (isValidCharacter(c)) {
				result.append(c);
			}
		}

		return result.toString();
	}

	private boolean isValidCharacter(Character c) {
		return !this.forbiddenCharacters.contains(c) && !Character.isDigit(c);
	}
}
