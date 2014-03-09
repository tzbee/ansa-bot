package com.touzbi.ansa.util.fileutils.filecomparator;

public class MyFileComparator extends FileComparatorComposite {
	public MyFileComparator() {
		super(new SizeFileComparator(), new ChecksumFileComparator());
	}
}
