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
package org.eclipse.crossmeter.workflow.execution.example.generation;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.crossmeter.workflow.execution.WorkflowConsumerNode;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class GeneratedConsumerTask implements WorkflowConsumerNode {

	protected Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	@Override
	public void onNext(Object element) {

		// TODO stub: add consumption logic that happens per incoming element
		// (method parameter: element)

	}

	@Override
	public void onSubscribe(Disposable subscriber) {
		// TODO stub: add logic for removing subscribers (method parameter:
		// subscriber). leaving this empty simply means that subscribers will
		// keep listening to this task until it is complete
	}

	@Override
	public void onError(Throwable e) {
		// TODO stub:
		// add error logic, per incoming element

		// TODO stub: for example:
		// e.printStackTrace();
		// notifyObserversOfStatusChange("task error:\n" + e.getStackTrace());
	}

	@Override
	public void onComplete() {
		// TODO stub:
		// add other task completion logic

		// TODO stub: for example:
		// notifyObserversOfStatusChange("task complete");
	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
