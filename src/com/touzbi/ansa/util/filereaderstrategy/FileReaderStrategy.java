package com.touzbi.ansa.util.filereaderstrategy;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author touzbi
 * 
 *         Provides methods for reading a file given its location
 * 
 */
public interface FileReaderStrategy {
	/**
	 * @author touzbi
	 * 
	 *         Reads a file and return its content as a String
	 * 
	 * @param filePath
	 *            location of the file to read
	 * 
	 * @return the content of the file as a String
	 */
	String readToString(String filePath);

	/**
	 * @author touzbi Reads a file and return its content as an InputStream
	 * 
	 * @param filePath
	 *            location of the file to read
	 * 
	 * @return the content of the file as an InputStream
	 * @throws IOException
	 */
	InputStream readToInputStream(String filePath) throws IOException;
}
