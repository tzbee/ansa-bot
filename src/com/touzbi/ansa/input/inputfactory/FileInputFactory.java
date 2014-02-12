package com.touzbi.ansa.input.inputfactory;

import java.util.Collection;

import com.touzbi.ansa.util.separator.ScannerSeparator;
import com.touzbi.ansa.util.separator.Separator;

public class FileInputFactory extends AbstractFileInputFactory {
	private Separator separator = new ScannerSeparator("\n");

	public FileInputFactory(String inputFilePath, boolean relativeToJar) {
		super(inputFilePath, relativeToJar);
	}

	@Override
	public Collection<String> getInput() {
		return this.separator.separate(this.fileContentWrapper
				.getFileContent(this.inputFilePath));
	}
}
