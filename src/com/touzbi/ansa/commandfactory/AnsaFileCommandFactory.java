package com.touzbi.ansa.commandfactory;

import com.touzbi.ansa.antlrwrapper.AnsaANTLRWrapper;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.main.MainCommandBuilder;
import com.touzbi.ansa.util.fileutils.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.util.fileutils.filecontentwrapper.FileContentWrapper;

public class AnsaFileCommandFactory implements CommandFactory {
	private static final String SUFFIX = ".ansa";

	private FileContentWrapper fileContentWrapper;

	public AnsaFileCommandFactory(boolean isFileRelativeToJar) {
		this.fileContentWrapper = new BasicFileContentWrapper(
				isFileRelativeToJar);
	}

	@Override
	public CommandBuilder getCommandByName(String commandName) {
		CommandBuilder commandBuilder = new MainCommandBuilder();

		new AnsaANTLRWrapper(this.fileContentWrapper.getFileContent(commandName
				+ SUFFIX), commandBuilder);

		return commandBuilder;
	}
}
