package org.epsilonlabs.workflow.execution.impl;

public class StubGithubExecutor extends GithubExecutor {

	public void addDataStub1() {
		ds.notifyAndProvideData("data stub 1");
	}
	
	public void addDataStub2() {
		ds.notifyAndProvideData("data stub 2");
	}

}
