package com.touzbi.ansa.command.commandstrategy;

public class SysoutCommandStrategy extends PrintCommandStrategy {
	public SysoutCommandStrategy() {
		super(System.out);
	}

	@Override
	public String toString() {
		return "Sysout command - " + super.toString();
	}
}
