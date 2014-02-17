package com.touzbi.ansa.command;

import java.util.ArrayList;
import java.util.Collection;

import com.touzbi.ansa.input.inputfactory.FileInputFactory;

public class SetInputCommand extends AbstractCommand {
	private static final String FILE_INPUT_PARAM = "file";
	private static final String TEXT_INPUT_PARAM = "text";

	@Override
	public void execute() {
		Collection<String> filePaths = getParamValues(FILE_INPUT_PARAM);
		Collection<String> results = new ArrayList<String>();

		for (String filePath : filePaths) {
			results.addAll(new FileInputFactory(filePath, false).getInput());
		}

		results.addAll(getParamValues(TEXT_INPUT_PARAM));

		addOutput(results);
	}
}
