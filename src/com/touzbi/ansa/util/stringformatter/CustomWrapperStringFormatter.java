package com.touzbi.ansa.util.stringformatter;

import java.util.logging.LogManager;

public class CustomWrapperStringFormatter implements StringFormatter {
	private static final Logger LOGGER = LogManager.getLogger();

	private String prefix;
	private String suffix;

	public CustomWrapperStringFormatter(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}

	@Override
	public String format(String str) {
		LOGGER.info("Formatting string {} using prefix {} and suffix {}", str,
				this.prefix, this.suffix);

		return this.prefix + str + this.suffix;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}
}
