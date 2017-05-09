package org.epsilonlabs.workflow.execution.impl;

import org.epsilonlabs.workflow.execution.StreamedDataset;

public class StubMDEGithubExecutor extends GithubExecutor {

	public void addDataStubs() throws Exception {
		for (Object o : ((Iterable<?>) getExecutionParameters().get(FILTERS.FILETBYFILEEXTENSION))) {
			System.out.println(
					"(MDEStubGithubExecutor) providing repository info for repos containing 1+ " + o + " files...");
			ds.notifyAndProvideData("repositoryOf:" + o);
		}
		if (ds instanceof StreamedDataset)
			((StreamedDataset) ds).notifySuccess();

	}

}
