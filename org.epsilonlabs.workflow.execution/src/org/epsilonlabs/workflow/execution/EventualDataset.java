package org.epsilonlabs.workflow.execution;

import java.util.Collection;

/**
 * A dataset representing data which will be collected at some point, and notify
 * relevant parties when this is done.
 * 
 * @author kb
 *
 */
public interface EventualDataset extends Collection<Object> {

	public void subscribe(EventualDataConsumer c);

	/**
	 * When this collection is fully populated, its coordinator calls this
	 * method to notify subscribers and provide them with this data
	 */
	public void notifyAndProvideData();

	public void notifyFailure();

}
