package com.touzbi.ansa.util.fileutils.duplicatehandler;

import java.util.Comparator;

public class CustomDuplicateHandler<E> extends
		AbstractTreeMapDuplicateHandler<E> {
	public CustomDuplicateHandler(Comparator<E> comparator) {
		super(comparator);
	}
}