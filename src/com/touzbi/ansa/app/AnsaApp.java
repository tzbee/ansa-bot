package com.touzbi.ansa.app;

import com.touzbi.ansa.antlr.AnsaANTLRWrapper;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.main.MainCommandBuilder;
import com.touzbi.ansa.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.filecontentwrapper.FileContentWrapper;
import com.touzbi.ansa.inputfactory.BasicFileInputFactory;

public class AnsaApp implements App {
	private static final String PACKAGE_HOME = "com/touzbi/ansatest/";

	private static final String MAIN_FILE = PACKAGE_HOME + "app.ansa";
	private static final String DEFAULT_FILE_PATH = PACKAGE_HOME + "input.cfg";

	private static final boolean IS_RELATIVE_TO_JAR = false;

	private FileContentWrapper fileContentWrapper = new BasicFileContentWrapper(
			IS_RELATIVE_TO_JAR);
	private CommandBuilder commandBuilder = new MainCommandBuilder();

	@Override
	public void start() {
		new AnsaANTLRWrapper(this.fileContentWrapper.getFileContent(MAIN_FILE),
				this.commandBuilder);

		this.commandBuilder.execute(new BasicFileInputFactory(
				DEFAULT_FILE_PATH, IS_RELATIVE_TO_JAR));
	}
}
