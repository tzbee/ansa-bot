package com.touzbi.ansa.htmlelement.htmlelementgrabber;

import java.util.List;

import com.touzbi.ansa.htmlelement.HTMLElement;

public interface HTMLElementGrabber {
	List<HTMLElement> getElements(String htmlPage, String query);
}
