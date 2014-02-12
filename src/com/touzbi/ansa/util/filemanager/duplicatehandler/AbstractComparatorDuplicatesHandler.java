package com.touzbi.ansa.util.filemanager.duplicatehandler;

import java.util.Comparator;

/**
 * @author touzbi Partial implementation using a comparator to define equal
 *         elements
 * 
 * @param <E>
 */
public abstract class AbstractComparatorDuplicatesHandler<E> implements
		DuplicateHandler<E> {
	protected Comparator<E> comparator;

	public AbstractComparatorDuplicatesHandler(Comparator<E> comparator) {
		this.comparator = comparator;
	}
}
