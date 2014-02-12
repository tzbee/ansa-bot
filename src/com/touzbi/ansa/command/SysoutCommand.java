package com.touzbi.ansa.command;

public class SysoutCommand extends PrintCommand {
	public SysoutCommand() {
		super(System.out);
	}

	@Override
	public String toString() {
		return "Sysout command - inputs: " + getParamValues("input");
	}
}
