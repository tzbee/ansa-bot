package com.touzbi.ansa.command.commandfactory;

import java.util.Collection;

import com.touzbi.ansa.antlr.AnsaANTLRWrapper;
import com.touzbi.ansa.command.Command;
import com.touzbi.ansa.command.commandbuilder.BasicCommandBuilder;
import com.touzbi.ansa.command.commandbuilder.CommandBuilder;

public class AnsaCommandFactory extends AbstractFileCommandFactory {
	private CommandBuilder commandBuilder = new BasicCommandBuilder();

	public AnsaCommandFactory(String filePath, boolean isRelativeToJar) {
		super(filePath, isRelativeToJar);
		new AnsaANTLRWrapper(
				this.fileContentWrapper.getFileContent(this.filePath),
				this.commandBuilder);
	}

	@Override
	public Collection<Command> getCommands() {
		return this.commandBuilder.getCommands();
	}
}
