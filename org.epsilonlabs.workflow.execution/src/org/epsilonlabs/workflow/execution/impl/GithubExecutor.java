package org.epsilonlabs.workflow.execution.impl;

import java.util.Map;

import org.epsilonlabs.workflow.execution.DataSourceExecutor;
import org.epsilonlabs.workflow.execution.EventualDataset;

public class GithubExecutor implements DataSourceExecutor {

	protected EventualDataset ds = new GithubEventualDataset();
	protected Map<Object, Object> parameters;

	public GithubExecutor() {

		// ...

	}

	@Override
	public EventualDataset execute() {
		// TODO Initialises the resilient github client and returns a pointer to
		// an eventual dataset responsible for updating clients on its progress
		// in obtaining the data
		return ds;
	}

	@Override
	public void setExecutionParameters(Map<Object, Object> params) {
		parameters = params;
	}

	@Override
	public Map<Object, Object> getExecutionParameters() {
		return parameters;
	}

}
