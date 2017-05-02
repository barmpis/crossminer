package org.epsilonlabs.workflow.execution.impl;

import java.util.Map;

import org.epsilonlabs.workflow.execution.DataSourceExecutor;
import org.epsilonlabs.workflow.execution.EventualDataset;

public class GithubExecutor implements DataSourceExecutor {

	public GithubExecutor() {

		// ...

	}

	@Override
	public EventualDataset execute() {
		// TODO Initialises the resilient github client and returns a pointer to
		// an eventual dataset responsible for updating clients on its progress
		// in obtaining the data
		return new GithubEventualDataset();
	}

	@Override
	public void setExecutionParameters(Map<String, String> params) {
	}

	@Override
	public Map<String, String> getExecutionParameters() {
		return null;
	}

}
