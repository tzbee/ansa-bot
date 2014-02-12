package com.touzbi.ansa.command;

import java.util.ArrayList;
import java.util.Collection;

import com.touzbi.ansa.input.inputfactory.FileInputFactory;

public class InputCommand extends AbstractCommand {
	@Override
	public void execute() {
		Collection<String> filePaths = getParamValues("file");
		Collection<String> results = new ArrayList<String>();

		for (String filePath : filePaths) {
			results.addAll(new FileInputFactory(filePath, true).getInput());
		}

		results.addAll(getParamValues("text"));

		addParams("output", results);
	}
}
