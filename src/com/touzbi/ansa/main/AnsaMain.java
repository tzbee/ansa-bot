package com.touzbi.ansa.main;

import com.touzbi.ansa.commandfactory.AnsaFileCommandFactory;
import com.touzbi.ansa.commandfactory.CommandFactory;
import com.touzbi.ansa.inputfactory.BasicFileInputFactory;

public class AnsaMain {
	public static void main(String[] args) {
		CommandFactory commandFactory = new AnsaFileCommandFactory(true);

		commandFactory.getCommandByName("app")
				.execute(
						new BasicFileInputFactory(
								"com/touzbi/ansatest/input.cfg", true));
	}
}
