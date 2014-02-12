package com.touzbi.ansa.util.stringformatter;

public class EdgeCutterStringFormatter implements StringFormatter {
	private int edgeLength;

	public EdgeCutterStringFormatter(int edgeLength) {
		this.edgeLength = edgeLength;
	}

	public EdgeCutterStringFormatter() {
		this(1);
	}

	@Override
	public String format(String str) {
		if (str.length() < this.edgeLength * 2) {
			return "";
		}

		return str.subSequence(this.edgeLength, str.length() - this.edgeLength)
				.toString();
	}
}
