package com.touzbi.ansatest.jsouptest;

import org.jsoup.Jsoup;


public class JSoupTest {
	@Test
	public void test() {
		Document document = Jsoup.parse("");
		System.out.println(document);
		document.html("");
		System.out.println(document);
	}
}
