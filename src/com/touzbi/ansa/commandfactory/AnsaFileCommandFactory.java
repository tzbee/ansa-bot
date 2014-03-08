package com.touzbi.ansa.commandfactory;

import com.touzbi.ansa.antlr.AnsaANTLRWrapper;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.main.MainCommandBuilder;
import com.touzbi.ansa.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.filecontentwrapper.FileContentWrapper;

public class AnsaFileCommandFactory implements CommandFactory {
	private static final String PACKAGE_PATH = "com/touzbi/ansatest/";

	private FileContentWrapper fileContentWrapper;
	private String rootPath;

	public AnsaFileCommandFactory(String rootPath, boolean isFileRelativeToJar) {
		this.rootPath = rootPath;
		this.fileContentWrapper = new BasicFileContentWrapper(
				isFileRelativeToJar);
	}

	public AnsaFileCommandFactory(boolean isFileRelativeToJar) {
		this(PACKAGE_PATH, isFileRelativeToJar);
	}

	@Override
	public CommandBuilder getCommandByName(String commandName) {
		CommandBuilder commandBuilder = new MainCommandBuilder();

		new AnsaANTLRWrapper(
				this.fileContentWrapper.getFileContent(this.rootPath
						+ commandName + ".ansa"), commandBuilder);

		return commandBuilder;
	}
}
