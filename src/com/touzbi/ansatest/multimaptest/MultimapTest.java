package com.touzbi.ansatest.multimaptest;

import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class MultimapTest {
	@Test
	public void test() {
		Multimap<String, String> multimap = ArrayListMultimap.create();
		multimap.put("test", "haha");
		multimap.put("test", "haha2");

		System.out.println(multimap.asMap());
	}
}
