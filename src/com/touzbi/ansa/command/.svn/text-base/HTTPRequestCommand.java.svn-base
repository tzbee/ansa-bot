package com.touzbi.ansa.command;

import com.touzbi.ansa.requesthandlerstrategy.BasicRequestStrategy;
import com.touzbi.ansa.requesthandlerstrategy.RequestStrategy;

public class HTTPRequestCommand extends AbstractCommand {
	private RequestStrategy requestStrategy;

	public HTTPRequestCommand(RequestStrategy requestHandler) {
		this.requestStrategy = requestHandler;
	}

	public HTTPRequestCommand() {
		this(new BasicRequestStrategy());
	}

	@Override
	public void execute() {
		for (String url : getParamValues("input")) {
			addParams("output", this.requestStrategy.getPage(url));
		}
	}

	@Override
	public String toString() {
		return "HTTP request command";
	}
}
