package com.touzbi.ansa.util.filemanager.duplicatehandler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.Multimap;
import com.google.common.collect.Ordering;
import com.google.common.collect.TreeMultimap;

/**
 * @author touzbi Duplicate Handler using Google Guava Tree Map class for
 *         implementation
 * 
 * @param <E>
 */

public abstract class AbstractTreeMapDuplicateHandler<E> extends
		AbstractComparatorDuplicatesHandler<E> {
	private static final Logger LOGGER = LogManager.getLogger();

	public AbstractTreeMapDuplicateHandler(Comparator<E> comparator) {
		super(comparator);
	}

	@Override
	public Collection<Collection<E>> getDuplicates(Collection<E> elements) {
		LOGGER.info("Getting duplicates...");

		Multimap<E, E> multiMap = TreeMultimap.create(this.comparator,
				Ordering.arbitrary());

		for (E element : elements) {
			multiMap.put(element, element);
		}

		Collection<Collection<E>> results = new ArrayList<Collection<E>>();

		for (E keyElement : multiMap.asMap().keySet()) {
			Collection<E> values = multiMap.get(keyElement);

			if (values.size() > 1)
				results.add(values);
		}

		LOGGER.info("Duplicates retrieved: {}", results);

		return results;
	}
}
