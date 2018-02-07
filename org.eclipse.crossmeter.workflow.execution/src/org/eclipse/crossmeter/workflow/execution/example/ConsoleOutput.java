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
package org.eclipse.crossmeter.workflow.execution.example;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.crossmeter.workflow.execution.WorkflowConsumerNode;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Trivial data consumer, printing to console
 * 
 * @author kb
 *
 */
public class ConsoleOutput implements WorkflowConsumerNode {

	private Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	private int current = 0;

	private int period = 10;

	@Override
	public void onNext(Object o) {

		if (o instanceof Iterable<?>)
			for (Object oo : (Iterable<?>) o) {
				System.out.println(">>> " + oo);

			}
		else {
			System.out.println(">>> " + o);

		}

		current++;
		if (current % period == 0)
			notifyObserversOfStatusChange("processed " + current + " elements");
	}

	@Override
	public void onError(Throwable e) {
		e.printStackTrace();
		notifyObserversOfStatusChange("task error:\n" + e.getStackTrace());
	}

	@Override
	public void onComplete() {
		System.out.println("DATA STREAM ENDED");
		notifyObserversOfStatusChange("task complete");
	}

	@Override
	public void onSubscribe(Disposable d) {
		//
	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
