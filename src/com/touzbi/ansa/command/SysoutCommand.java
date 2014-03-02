package com.touzbi.ansa.command;

import com.touzbi.ansa.command.commandstrategy.SysoutCommandStrategy;

public class SysoutCommand extends AbstractCommand {
	public SysoutCommand() {
		super(new SysoutCommandStrategy());
	}
}
