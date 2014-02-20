package com.touzbi.ansatest.commandtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import com.touzbi.ansa.command.Command;
import com.touzbi.ansa.command.HTMLQueryCommand;
import com.touzbi.ansa.command.SequentialCommandComposite;

public class SequentialCommandCompositeTest {
	private static final Collection<String> INPUTS = Arrays
			.asList("<body><a href=\"prout\"></a></body>");

	@Test
	public void test() {
		SequentialCommandComposite sequentialCommandComposite = new SequentialCommandComposite();

		Command command1 = new HTMLQueryCommand();
		command1.addParams("link", "a");

		sequentialCommandComposite.addCommand(command1);
		sequentialCommandComposite.addInput(INPUTS);

		sequentialCommandComposite.execute();

		System.out.println(sequentialCommandComposite.getOutput());
	}
}
