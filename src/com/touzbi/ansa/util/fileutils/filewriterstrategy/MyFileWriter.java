package com.touzbi.ansa.util.fileutils.filewriterstrategy;

public interface MyFileWriter {
	/**
	 * Write a String into a file located at filePath
	 * 
	 * @param str
	 * @param filePath
	 */
	void write(String str, String filePath);
}
