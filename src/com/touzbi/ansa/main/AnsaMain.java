package com.touzbi.ansa.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;

import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.commandloader.AnsaCommandLoader;
import com.touzbi.ansa.commandloader.CommandLoader;
import com.touzbi.ansa.inputfactory.BasicFileInputFactory;
import com.touzbi.ansa.inputfactory.InputFactory;

public class AnsaMain {
	private static final String REGEX = ".*[.]input";

	public static void main(String[] args) {
		CommandLoader commandLoader = AnsaCommandLoader.getInstance();
		String commandName = "";

		Collection<InputFactory> inputFactories = new ArrayList<InputFactory>();
		Collection<String> inputs = new ArrayList<String>();

		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				commandName = args[i];
			} else {
				// XXX To refactor
				if (Pattern.matches(REGEX, args[i])) {
					inputFactories
							.add(new BasicFileInputFactory(args[i], true));
				} else {
					inputs.add(args[i]);
				}
			}
		}

		// Get the main command
		CommandBuilder commandBuilder = commandLoader
				.getCommandByName(commandName);

		// Execute commands with file content
		commandBuilder.execute(inputFactories
				.toArray(new InputFactory[inputFactories.size()]));

		// Execute commands with direct inputs
		commandBuilder.execute(inputs);
	}
}
