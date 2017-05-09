package org.epsilonlabs.workflow.execution.impl;

import org.epsilonlabs.workflow.execution.StreamedDataset;

public class StubMDEGithubExecutor extends GithubExecutor {

	public void addDataStubs() throws Exception {
		for (Object o : ((Iterable<?>) getExecutionParameters().get("fileExtensions"))) {
			System.out.println("(MDEStubGithubExecutor) providing repository info for: " + o);
			ds.notifyAndProvideData("repositoryOf:" + o);
		}
		if (ds instanceof StreamedDataset)
			((StreamedDataset) ds).notifySuccess();

	}

}
