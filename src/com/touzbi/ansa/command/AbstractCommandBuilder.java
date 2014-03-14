package com.touzbi.ansa.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.inputfactory.InputFactory;
import com.touzbi.ansa.param.parambuilder.BasicParamBuilder;
import com.touzbi.ansa.param.parambuilder.ParamBuilder;
import com.touzbi.ansa.param.paramfactory.ParamFactory;

public abstract class AbstractCommandBuilder implements CommandBuilder {

	// Command Parameters
	private ParamBuilder paramBuilder = new BasicParamBuilder();

	// Children Commands
	protected Collection<CommandBuilder> childrenCommands = new ArrayList<CommandBuilder>();

	// Parent Command
	private CommandBuilder parentCommand = null;

	public AbstractCommandBuilder(CommandBuilder parentCommand) {
		this.parentCommand = parentCommand;
	}

	public AbstractCommandBuilder() {
	}

	/**
	 * Parameters
	 */

	@Override
	public CommandBuilder addParam(String paramName, String paramValue) {
		this.paramBuilder.addParam(paramName, paramValue);
		return this;
	}

	@Override
	public CommandBuilder addParam(String paramName, ParamFactory paramFactory) {
		this.paramBuilder.addParam(paramName, paramFactory);
		return this;
	}

	@Override
	public String getParamValue(String paramName) {
		String paramValue = this.paramBuilder.getParamValue(paramName);

		return paramValue != null ? paramValue : "";
	}

	/**
	 * Execute command
	 */

	@Override
	public Collection<String> execute(InputFactory... inputFactories) {
		Collection<String> inputs = new ArrayList<String>();

		for (InputFactory inputFactory : inputFactories) {
			inputs.addAll(inputFactory.getInputs());
		}

		return execute(inputs);
	}

	@Override
	public Collection<String> execute(Collection<String> inputs) {
		Collection<String> outputs = new ArrayList<String>();

		for (String input : inputs) {
			outputs.addAll(execute(input));
		}

		return outputs;
	}

	/**
	 * Children / Parent structure
	 */
	@Override
	public CommandBuilder addChildrenCommands(
			Collection<CommandBuilder> commands) {

		for (CommandBuilder command : commands) {
			command.setParentCommand(this);
			this.childrenCommands.add(command);
		}

		return this;
	}

	@Override
	public CommandBuilder addChildrenCommands(CommandBuilder... commands) {
		return addChildrenCommands(Arrays.asList(commands));
	}

	@Override
	public Collection<CommandBuilder> getChildrenCommands() {
		return new ArrayList<CommandBuilder>(this.childrenCommands);
	}

	@Override
	public void setParentCommand(CommandBuilder parentCommand) {
		this.parentCommand = parentCommand;
	}

	@Override
	public CommandBuilder getParentCommand() {
		return this.parentCommand;
	}

	@Override
	public String toString() {
		return "Params: " + this.paramBuilder + "\n" + "Children: "
				+ this.childrenCommands;
	}
}
