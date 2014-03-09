package com.touzbi.ansa.util.fileutils.filecomparator;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

public class FileComparatorComposite implements FileComparator {
	private Collection<FileComparator> fileComparators;

	public FileComparatorComposite(FileComparator... fileComparators) {
		this.fileComparators = Arrays.asList(fileComparators);
	}

	@Override
	public int compare(File file1, File file2) {
		int result = 0;

		for (FileComparator fileComparator : this.fileComparators) {
			result += fileComparator.compare(file1, file2);
		}

		return result;
	}
}
