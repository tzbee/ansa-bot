package com.touzbi.ansa.util.fileutils.duplicatehandler;

import java.io.File;
import java.util.Comparator;

public class FileDuplicatesHandler extends
		AbstractTreeMapDuplicateHandler<File> {
	public FileDuplicatesHandler(Comparator<File> comparator) {
		super(comparator);
	}
}
