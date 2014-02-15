package com.touzbi.ansa.contentgrabber;

import java.util.Collection;

/**
 * Interface for getting content from a text document
 */
public interface ContentGrabber {
	Collection<String> getContent(String document);
}
