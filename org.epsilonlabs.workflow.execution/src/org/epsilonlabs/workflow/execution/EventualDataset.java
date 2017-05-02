package org.epsilonlabs.workflow.execution;

/**
 * A dataset representing data which will be collected at some point, and notify
 * relevant parties when this is done.
 * 
 * @author kb
 *
 */
public interface EventualDataset {

	public void subscribe(EventualDataConsumer c);

	/**
	 * When this collection is fully populated, its coordinator calls this
	 * method to notify subscribers and provide them with this data
	 * @param newData 
	 */
	public void notifyAndProvideData(Object newData);

	public void notifyFailure();

}
