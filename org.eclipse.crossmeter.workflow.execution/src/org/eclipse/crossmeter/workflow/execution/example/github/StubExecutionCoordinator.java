package org.eclipse.crossmeter.workflow.execution.example.github;

import java.util.LinkedList;
import java.util.List;

public class StubExecutionCoordinator {

	private static List<GithubClient> activeRepoClients = new LinkedList<>();

	public static List<GithubClient> getActiveRepoClients() {
		return activeRepoClients;
	}

	private static List<GithubClient> activeFileClients = new LinkedList<>();

	public static List<GithubClient> getActiveFileClients() {
		return activeFileClients;
	}

	private static List<GithubClient> activeAuthorClients = new LinkedList<>();

	public static List<GithubClient> getActiveAuthorClients() {
		return activeAuthorClients;
	}

	public static List<GithubClient> getClients() {
		List<GithubClient> c = new LinkedList<>();
		c.addAll(activeAuthorClients);
		c.addAll(activeFileClients);
		c.addAll(activeRepoClients);
		return c;
	}

}
