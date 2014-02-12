package com.touzbi.ansa.util.filemanager.filecomparator;

import java.io.File;

/**
 * @author touzbi File comparator using the size of the files to determine
 *         whether they are equal or not
 * 
 */
public class SizeFileComparator implements FileComparator {
	@Override
	public int compare(File file1, File file2) {
		return (int) (file1.length() - file2.length());
	}
}
