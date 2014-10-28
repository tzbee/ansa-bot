package com.touzbi.ansatest.commandtest;

import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.query.gethtmlelement.GetHTMLElementTextContent;

public class GetHTMLElementTextContentTest {

	@Test
	public void test() {
		CommandBuilder commandBuilder = new GetHTMLElementTextContent();

		commandBuilder.addParam("query", "a[div=ap]");

		System.out.println(commandBuilder
				.execute("<a>azdzadza</a><a div=\"ap\">jjj</a>"));
	}
}
