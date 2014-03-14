package com.touzbi.ansa.commandfactory;

import com.touzbi.ansa.antlrwrapper.AnsaANTLRWrapper;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.composite.CompositeCommandBuilder;
import com.touzbi.ansa.commandloader.CommandLoader;
import com.touzbi.ansa.util.fileutils.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.util.fileutils.filecontentwrapper.FileContentWrapper;

public class AnsaFileCommandFactory implements CommandFactory {
	private static final String FILE_EXTENSION = ".ansa";

	private FileContentWrapper fileContentWrapper;
	private CommandLoader commandLoader;
	private String commandName;

	public AnsaFileCommandFactory(CommandLoader commandLoader,
			boolean isFileRelativeToJar, String commandName) {
		this.commandLoader = commandLoader;
		this.commandName = commandName;
		this.fileContentWrapper = new BasicFileContentWrapper(
				isFileRelativeToJar);
	}

	@Override
	public CommandBuilder getCommand() {
		CommandBuilder commandBuilder = new CompositeCommandBuilder();

		// Build the command from the file
		new AnsaANTLRWrapper(this.commandLoader,
				this.fileContentWrapper.getFileContent(this.commandName
						+ FILE_EXTENSION), commandBuilder);

		return commandBuilder;
	}
}
