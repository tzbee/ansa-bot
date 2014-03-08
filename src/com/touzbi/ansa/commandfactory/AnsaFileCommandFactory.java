package com.touzbi.ansa.commandfactory;

import com.touzbi.ansa.antlr.AnsaANTLRWrapper;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.main.MainCommandBuilder;
import com.touzbi.ansa.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.filecontentwrapper.FileContentWrapper;

public class AnsaFileCommandFactory implements CommandFactory {
	private FileContentWrapper fileContentWrapper;
	private String rootPath;

	public AnsaFileCommandFactory(String rootPath, boolean isFileRelativeToJar) {
		this.rootPath = rootPath;
		this.fileContentWrapper = new BasicFileContentWrapper(
				isFileRelativeToJar);
	}

	public AnsaFileCommandFactory(boolean isFileRelativeToJar) {
		this("", isFileRelativeToJar);
	}

	@Override
	public CommandBuilder getCommand(String commandName) {
		CommandBuilder commandBuilder = new MainCommandBuilder();

		new AnsaANTLRWrapper(
				this.fileContentWrapper.getFileContent(this.rootPath
						+ commandName + ".ansa"), commandBuilder);

		return commandBuilder;
	}
}
