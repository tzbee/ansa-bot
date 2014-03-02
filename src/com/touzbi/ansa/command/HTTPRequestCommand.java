package com.touzbi.ansa.command;

import com.touzbi.ansa.command.commandstrategy.BasicRequestCommandStrategy;

public class HTTPRequestCommand extends AbstractCommand {

	public HTTPRequestCommand() {
		super(new BasicRequestCommandStrategy());
	}

	@Override
	public String toString() {
		return "HTTP request command";
	}
}
