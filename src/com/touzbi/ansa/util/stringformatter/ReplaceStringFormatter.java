package com.touzbi.ansa.util.stringformatter;

public class ReplaceStringFormatter implements StringFormatter {
	private String newStr;
	private String oldStr;

	public ReplaceStringFormatter(String oldStr, String newStr) {
		this.oldStr = oldStr;
		this.newStr = newStr;
	}

	@Override
	public String format(String str) {
		return str.replace(this.oldStr, this.newStr);
	}
}
