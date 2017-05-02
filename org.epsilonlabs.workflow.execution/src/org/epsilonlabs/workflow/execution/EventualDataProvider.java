package org.epsilonlabs.workflow.execution;

public interface EventualDataProvider {

	enum Filters {
		filterByExt, filterByName
	}

	/**
	 * 
	 * @return the EventualDataSet which will eventually provide the requested
	 *         data
	 */
	public EventualDataset execute();

}
