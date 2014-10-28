package com.touzbi.ansatest.commandtest;

import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.query.getcontent.GetContentByRegexQuery;

public class GetContentByRegexQueryTest {

	@Test
	public void test() {
		CommandBuilder commandBuilder = new GetContentByRegexQuery();
		commandBuilder.addParam("query", "ae.*k");
		System.out.println(commandBuilder
				.execute("zfzefzefzefeazfaefezfzkzdazdzd"));
	}
}
