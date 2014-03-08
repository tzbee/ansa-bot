package com.touzbi.ansa.command;


public abstract class QueryCommandBuilder extends AbstractCommandBuilder {
	private static final String CSS_QUERY_PARAM = "query";

	protected String getQueryParam() {
		return getParamValue(CSS_QUERY_PARAM);
	}
}
