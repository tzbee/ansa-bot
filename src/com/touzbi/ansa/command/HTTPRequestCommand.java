package com.touzbi.ansa.command;

import com.touzbi.ansa.command.commandstrategy.BasicRequestCommand;

public class HTTPRequestCommand extends AbstractCommand {

	public HTTPRequestCommand() {
		super(new BasicRequestCommand());
	}

	@Override
	public String toString() {
		return "HTTP request command";
	}
}
