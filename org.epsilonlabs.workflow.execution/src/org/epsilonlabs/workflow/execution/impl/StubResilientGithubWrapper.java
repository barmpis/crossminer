package org.epsilonlabs.workflow.execution.impl;

public class StubResilientGithubWrapper {

	public String provideRepoDataStubs(String s) {
		System.out.println(
				"(StubResilientGithubWrapper) providing repository info for repos containing 1+ " + s + " files...");
		return "repositoryOf:" + s;

	}

	public String provideAuthorDataStubs(String s) {
		System.out.println("(StubResilientGithubWrapper) providing author of " + s + " files...");
		return "authorOf:" + s;

	}

	public String provideFileDataStubs(String s) {
		System.out.println("(StubResilientGithubWrapper) providing files of " + s + " files...");
		return "fileOf:" + s;

	}

}
