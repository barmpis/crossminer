/*******************************************************************************
 * Copyright (c) 2017 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Konstantinos Barmpis - initial API and implementation
 ******************************************************************************/
package org.epsilonlabs.workflow.execution;

import java.util.LinkedList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * A dataset representing data which will be collected asynchronously, and will
 * notify relevant parties when new data is available/finished/erroneous. This
 * can be either a hot or cold observable, depending on the use of its notify*
 * methods.
 * 
 * @author kb
 *
 */
public abstract class EventualDataset<T> extends Observable<T> {

	//
	List<Observer<? super T>> subscribers = new LinkedList<Observer<? super T>>();
	//

	@Override
	protected void subscribeActual(Observer<? super T> observer) {
		// Adds the observer to the subscribers of this dataset. All
		// notifications to subscribers are delegated to method calls made by
		// the coordinator of this observable (notify* methods)
		subscribers.add(observer);
	}

	/**
	 * To be used by the coordinator of this dataset for providing new data to
	 * all downstream consumers
	 * 
	 * @param o
	 */
	public void notifyAndProvideData(T o) {
		for (Observer<? super T> c : subscribers)
			c.onNext(o);
	}

	/**
	 * To be used by the coordinator of this dataset for informing all
	 * downstream consumers about failure
	 */
	public void notifyFailure() {
		for (Observer<? super T> c : subscribers)
			c.onError(new Exception("Unknown exception (see earlier errors for more details)"));
	}

	/**
	 * To be used by the coordinator of this dataset for informing all
	 * downstream consumers that it is finished emiting data
	 */
	public void notifySuccess() {
		for (Observer<? super T> c : subscribers)
			c.onComplete();
	}

	/**
	 * Exposes the current observers of this observable, to be used for stateful
	 * merging
	 * 
	 */
	protected List<Observer<? super T>> getObservers() {
		return subscribers;
	}

	/**
	 * Removes the current observers of this observable, to be used for stateful
	 * merging
	 * 
	 */
	protected void clearObservers() {
		subscribers.clear();
	}

	/**
	 * Merges "other" into this dataset, adding its subscribers to this one,
	 * removing them from "other" and propagating all notify* events to this
	 * dataset.
	 * 
	 * @param other
	 */
	public void mergeStateful(EventualDataset<T> other) {

		subscribers.addAll(other.getObservers());
		other.clearObservers();

		// TODO propagate notify* events (not needed so far as "other" never
		// emits any items in current uses [*mapper.java])

	}

}
