package com.touzbi.ansatest.antlrwrappertest;

import org.junit.Test;

import com.touzbi.ansa.antlr.AbstractANTLRWrapper;
import com.touzbi.ansa.antlr.AnsaANTLRWrapper;
import com.touzbi.ansa.command.main.MainCommandBuilder;
import com.touzbi.ansa.util.fileutils.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.util.fileutils.filecontentwrapper.FileContentWrapper;

public class AnsaAntlrWrapperTest {
	private static final String FILE_PATH = "com/touzbi/ansatest/app.ansa";

	@Test
	public void test() {
		FileContentWrapper fileContentWrapper = new BasicFileContentWrapper(
				false);
		AbstractANTLRWrapper antlrWrapper = new AnsaANTLRWrapper(
				fileContentWrapper.getFileContent(FILE_PATH),
				new MainCommandBuilder());

		System.out.println(antlrWrapper);
	}
}
