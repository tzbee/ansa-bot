package com.touzbi.ansa.util.fileutils.duplicatehandler;

import com.touzbi.ansa.util.fileutils.filecomparator.SizeFileComparator;

public class FileSizeDuplicatesHandler extends FileDuplicatesHandler {
	public FileSizeDuplicatesHandler() {
		super(new SizeFileComparator());
	}
}
