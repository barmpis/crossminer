package org.epsilonlabs.workflow.execution;

public interface EventualDataProvider {

	/**
	 * 
	 * @return the EventualDataSet which will eventually provide the requested
	 *         data
	 */
	public EventualDataset execute();

}
