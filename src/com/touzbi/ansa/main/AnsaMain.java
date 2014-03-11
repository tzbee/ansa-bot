package com.touzbi.ansa.main;

import java.util.ArrayList;
import java.util.Collection;

import com.touzbi.ansa.commandloader.AnsaCommandLoader;
import com.touzbi.ansa.commandloader.CommandLoader;
import com.touzbi.ansa.inputfactory.BasicFileInputFactory;
import com.touzbi.ansa.inputfactory.InputFactory;

public class AnsaMain {
	public static void main(String[] args) {
		CommandLoader commandLoader = AnsaCommandLoader.getInstance();
		String commandName = "main";
		Collection<InputFactory> inputFactories = new ArrayList<InputFactory>();

		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				commandName = args[i];
			} else {
				inputFactories.add(new BasicFileInputFactory(args[i], true));
			}

		}

		commandLoader.getCommandByName(commandName)
				.execute(
						inputFactories.toArray(new InputFactory[inputFactories
								.size()]));
	}
}
