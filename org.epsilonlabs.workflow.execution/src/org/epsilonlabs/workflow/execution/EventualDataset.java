package org.epsilonlabs.workflow.execution;

import io.reactivex.Observable;

/**
 * A dataset representing data which will be collected at some point, and notify
 * relevant parties when this is done.
 * 
 * @author kb
 *
 */
public abstract class EventualDataset extends Observable<Object> {

	public abstract void notifyAndProvideData(Object data);

	public abstract void notifySuccess();

	public abstract void notifyFailure();

}
