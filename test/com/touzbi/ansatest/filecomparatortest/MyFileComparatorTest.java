package com.touzbi.ansatest.filecomparatortest;

import java.io.File;

import com.touzbi.ansa.util.fileutils.filecomparator.FileComparator;
import com.touzbi.ansa.util.fileutils.filecomparator.MyFileComparator;

public class MyFileComparatorTest {
	private static final String HOME = "/home/touzbi/Downloads/test";

	private static final File FILE1 = new File(HOME + "test1.txt");
	private static final File FILE2 = new File(HOME + "test2.txt");

	@Test
	public void test() {
		FileComparator fileComparator = new MyFileComparator();

		System.out.println(fileComparator.compare(FILE1, FILE2));
	}
}
