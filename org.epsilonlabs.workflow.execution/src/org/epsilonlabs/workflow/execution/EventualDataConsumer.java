package org.epsilonlabs.workflow.execution;

/**
 * Consumer of EventualData
 * 
 * @author kb
 *
 */
public interface EventualDataConsumer {

	/**
	 * Adds the Dataset to the datasets this consumer is interested in 
	 * @param e
	 */
	public void addDataset(EventualDataset e);

	/**
	 * Called by the EventualData instance, when its data is available
	 * @param o 
	 */
	public void consumeData(Object o);

}
