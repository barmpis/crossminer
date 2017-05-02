package org.epsilonlabs.workflow.execution.impl;

import org.epsilonlabs.workflow.execution.EventualDataset;

public class StubGithubExecutor extends GithubExecutor {

	private EventualDataset ds = new GithubEventualDataset();
	
	public StubGithubExecutor() {

		// ...

	}

	public EventualDataset execute() {
		return ds;
	}

	public void addDataStub1() {
		ds.notifyAndProvideData("data stub 1");
	}
	
	public void addDataStub2() {
		ds.notifyAndProvideData("data stub 2");
	}

}
