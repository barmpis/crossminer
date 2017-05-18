package org.epsilonlabs.workflow.execution.impl;

import java.util.LinkedList;
import java.util.List;

import org.epsilonlabs.workflow.execution.EventualDataset;

import io.reactivex.Observer;

/**
 * A dataset representing data which will be collected at some point, and notify
 * relevant parties when this is done.
 * 
 * @author kb
 *
 */
public class GithubEventualDataset extends EventualDataset {

	List<Observer<? super Object>> subscribers = new LinkedList<Observer<? super Object>>();

	@Override
	protected void subscribeActual(Observer<? super Object> observer) {

		// initialise subscription -- maybe provide initial metadata?
		subscribers.add(observer);

	}

	@Override
	public void notifyAndProvideData(Object o) {
		for (Observer<? super Object> c : subscribers)
			c.onNext(o);
	}

	@Override
	public void notifyFailure() {
	}

	@Override
	public void notifySuccess() {
		for (Observer<? super Object> c : subscribers)
			c.onComplete();
	}

	//

}
