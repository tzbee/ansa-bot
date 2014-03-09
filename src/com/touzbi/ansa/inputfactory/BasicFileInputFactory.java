package com.touzbi.ansa.inputfactory;

import java.util.Collection;

import com.touzbi.ansa.util.separator.ScannerDelimiterSeparator;
import com.touzbi.ansa.util.separator.Separator;

/**
 * Reads inputs from a file, separated by a new line
 * 
 * @author touzbi
 */
public class BasicFileInputFactory extends AbstractFileInputFactory {
	private Separator separator = new ScannerDelimiterSeparator("\n");

	public BasicFileInputFactory(String inputFilePath, boolean relativeToJar) {
		super(inputFilePath, relativeToJar);
	}

	@Override
	public Collection<String> getInputs() {
		return this.separator.separate(this.fileContentWrapper
				.getFileContent(this.inputFilePath));
	}
}
