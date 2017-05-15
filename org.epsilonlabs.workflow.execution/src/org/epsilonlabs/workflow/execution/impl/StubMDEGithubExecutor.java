package org.epsilonlabs.workflow.execution.impl;

import org.epsilonlabs.workflow.execution.StreamedDataset;

public class StubMDEGithubExecutor extends GithubExecutor {

	public void addRepoDataStubs() throws Exception {
		for (Object o : ((Iterable<?>) getExecutionParameters().get(FILTERS.FILETBYFILEEXTENSION))) {
			ds.notifyAndProvideData(new StubResilientGithubWrapper().provideRepoDataStubs(o.toString()));
		}
		if (ds instanceof StreamedDataset)
			((StreamedDataset) ds).notifySuccess();

	}

	public void addAuthorDataStubs() throws Exception {
		for (Object o : ((Iterable<?>) getExecutionParameters().get(FILTERS.FILTERBYNAME))) {
			ds.notifyAndProvideData(new StubResilientGithubWrapper().provideRepoDataStubs(o.toString()));
		}
		if (ds instanceof StreamedDataset)
			((StreamedDataset) ds).notifySuccess();

	}
	
	public void addFileDataStubs() throws Exception {
		for (Object o : ((Iterable<?>) getExecutionParameters().get(FILTERS.FILETBYFILEEXTENSION))) {
			ds.notifyAndProvideData(new StubResilientGithubWrapper().provideRepoDataStubs(o.toString()));
		}
		if (ds instanceof StreamedDataset)
			((StreamedDataset) ds).notifySuccess();

	}
	
}

