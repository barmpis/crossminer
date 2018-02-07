package org.eclipse.crossmeter.workflow.execution.tests.util;

import java.util.LinkedList;
import java.util.List;

public class StubExecutionCoordinator2 {

	private static List<GithubClient2> activeRepoClients = new LinkedList<>();

	public static List<GithubClient2> getActiveRepoClients() {
		return activeRepoClients;
	}

	private static List<GithubClient2> activeFileClients = new LinkedList<>();

	public static List<GithubClient2> getActiveFileClients() {
		return activeFileClients;
	}

	private static List<GithubClient2> activeAuthorClients = new LinkedList<>();

	public static List<GithubClient2> getActiveAuthorClients() {
		return activeAuthorClients;
	}

	public static List<GithubClient2> getClients() {
		List<GithubClient2> c = new LinkedList<>();
		c.addAll(activeAuthorClients);
		c.addAll(activeFileClients);
		c.addAll(activeRepoClients);
		return c;
	}

}
