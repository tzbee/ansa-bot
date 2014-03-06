package com.touzbi.ansa.inputfactory;

import com.touzbi.ansa.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.filecontentwrapper.FileContentWrapper;

public abstract class AbstractFileInputFactory implements InputFactory {
	protected FileContentWrapper fileContentWrapper;
	protected String inputFilePath;

	public AbstractFileInputFactory(String inputFilePath, boolean relativeToJar) {
		this.fileContentWrapper = new BasicFileContentWrapper(relativeToJar);
		this.inputFilePath = inputFilePath;
	}
}
