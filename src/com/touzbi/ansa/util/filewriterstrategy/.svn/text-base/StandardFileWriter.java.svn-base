package com.touzbi.ansa.util.filewriterstrategy;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * Basic File Writer using the standard library 
 */
public class StandardFileWriter implements MyFileWriter {
	@Override
	public void write(String str, String filePath) {
		// java io Filewriter
		Writer writer = null;
		try {
			writer = new FileWriter(filePath);
			writer.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException ignore) {
			}
		}
	}
}
