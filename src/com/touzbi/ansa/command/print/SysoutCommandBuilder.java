package com.touzbi.ansa.command.print;

import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.command.AbstractCommandBuilder;

public class SysoutCommandBuilder extends AbstractCommandBuilder {

	@Override
	public Collection<String> execute(String input) {
		System.out.println(input);
		return Arrays.asList(input);
	}

	@Override
	public String toString() {
		return "Sysout";
	}
}
