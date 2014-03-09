package com.touzbi.ansa.util.fileutils.duplicatehandler;

import java.util.Collection;

/**
 * @author touzbi Parametrized Interface for checking duplicates in a Collection
 * 
 * @param <E>
 *            the type of the elements in the Collection
 */
public interface DuplicateHandler<E> {
	Collection<Collection<E>> getDuplicates(Collection<E> files);
}
