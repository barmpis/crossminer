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

import org.eclipse.crossmeter.workflow.execution.WorkflowProviderNode;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;

public class GeneratedProviderTask implements WorkflowProviderNode {

	protected Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	// FIXME GENERATION RESPONSABILITY TO CAST OBJECT TO TYPE
	PublishSubject<Object> results = PublishSubject.create();

	// FIXME GENERATION RESPONSABILITY TO CAST OBJECT TO TYPE
	public Observable<Object> getResults() {
		return results;
	}

	public GeneratedProviderTask() {

		// TODO stub: provide results, one at a time, using the .onNext(result)
		// method of the results field

		// TODO for example:
		// Object result = ...
		// results.onNext(result);
		// Object result2 = ...
		// results.onNext(result2);

	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
