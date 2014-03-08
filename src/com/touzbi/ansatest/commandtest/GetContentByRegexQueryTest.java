package com.touzbi.ansatest.commandtest;

import org.junit.Test;

import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.getcontent.GetContentByRegexQuery;

public class GetContentByRegexQueryTest {

	@Test
	public void test() {
		CommandBuilder commandBuilder = new GetContentByRegexQuery();
		commandBuilder.addParam("query", "ae.*k");
		System.out.println(commandBuilder
				.execute("zfzefzefzefeazfaefezfzkzdazdzd"));
	}
}
