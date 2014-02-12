package com.touzbi.ansa.command.commandfactory;

import com.touzbi.ansa.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.filecontentwrapper.FileContentWrapper;

public abstract class AbstractFileCommandFactory implements CommandFactory {
	protected FileContentWrapper fileContentWrapper;
	protected String filePath;

	public AbstractFileCommandFactory(String filePath, boolean isRelativeToJar) {
		this.filePath = filePath;
		this.fileContentWrapper = new BasicFileContentWrapper(isRelativeToJar);
	}
}
