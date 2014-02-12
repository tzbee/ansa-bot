package com.touzbi.ansatest.antlrwrappertest;

import org.junit.Test;

import com.touzbi.ansa.antlr.AbstractANTLRWrapper;
import com.touzbi.ansa.antlr.AnsaANTLRWrapper;
import com.touzbi.ansa.command.commandbuilder.BasicCommandBuilder;
import com.touzbi.ansa.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.filecontentwrapper.FileContentWrapper;

public class AnsaAntlrWrapperTest {
	private static final String FILE_PATH = "com/touzbi/ansatest/app.ansa";

	@Test
	public void test() {
		FileContentWrapper fileContentWrapper = new BasicFileContentWrapper(
				false);
		AbstractANTLRWrapper antlrWrapper = new AnsaANTLRWrapper(
				fileContentWrapper.getFileContent(FILE_PATH),
				new BasicCommandBuilder());

		System.out.println(antlrWrapper);
	}
}
