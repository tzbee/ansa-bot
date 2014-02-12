package com.touzbi.ansa.htmlelement.htmlelementgrabber;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;

import com.touzbi.ansa.htmlelement.HTMLElement;
import com.touzbi.ansa.htmlelement.htmlelementadapter.JSoupHTMLElementAdapter;

public class JSoupHTMLElementGrabber implements HTMLElementGrabber {
	@Override
	public List<HTMLElement> getElements(String htmlPage, String query) {
		List<HTMLElement> resultList = new ArrayList<HTMLElement>();

		List<Element> jSoupElements = new ArrayList<Element>(
				getElementsFromQuery(htmlPage, query));

		for (Element jSoupElement : jSoupElements) {
			resultList
					.add(JSoupHTMLElementAdapter.getHTMLElement(jSoupElement));
		}

		return resultList;
	}

	private Elements getElementsFromQuery(String htmlPage, String query) {
		Document document = Jsoup.parse(htmlPage);
		return Selector.select(query, document.body());
	}
}
