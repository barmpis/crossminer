package org.epsilonlabs.workflow.execution.impl;

import java.util.List;
import java.util.Map;

import org.epsilonlabs.workflow.execution.EventualDataProvider;
import org.epsilonlabs.workflow.execution.EventualDataset;

public class GithubExecutor implements EventualDataProvider {

	enum FILTERS {
		FILETBYFILEEXTENSION, FILTERBYNAME
	}

	enum DATATYPES {
		REPOSITORIES, FILES, AUTHORS
	}

	protected EventualDataset ds;
	protected Map<Object, Object> parameters;

	public GithubExecutor() {

		// ...

	}

	public EventualDataset getRepositoriesByFileExtension(List<String> exts) {
		// TODO dataset likely specific to return type (in this case dataset of
		// repos?)
		return ds = new GithubEventualDataset();
	}

	public EventualDataset getFilesWithFileExtension(String repo, List<String> exts) {
		// TODO dataset likely specific to return type (in this case dataset of
		// files?)
		return ds = new GithubEventualDataset();
	}

	public EventualDataset getAuthors(String file) {
		// TODO dataset likely specific to return type (in this case dataset of
		// authors?)
		return ds = new GithubEventualDataset();
	}

	//
	public void stubRetrieveRepositoriesByFileExtension(String ext) {
		System.out.println("(StubResilientGithubWrapper) providing repository containing " + ext + " files...");
		
		ds.notifyAndProvideData("repoOf:" + ext);
	}

	public void stubRetrieveAuthorFromFile(String file) {
		System.out.println("(StubResilientGithubWrapper) providing author of " + file + " files...");
		
		ds.notifyAndProvideData("authorOf:" + file);

	}

	public void stubRetrieveFilesInRepo(String repo) {
		System.out.println("(StubResilientGithubWrapper) providing actual files of " + repo + " repository...");
		
		ds.notifyAndProvideData("fileOf:" + repo);

	}
	
}
