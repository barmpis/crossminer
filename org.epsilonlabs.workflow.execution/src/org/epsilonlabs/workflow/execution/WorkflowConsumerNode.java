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

import java.util.Collection;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

/**
 * Represents a node that consumes data (extends Observer). This node can
 * provide status change notifications to interested parties to inform them of
 * its progress (extends ObservableSource).
 * 
 * @author kb
 *
 */
public interface WorkflowConsumerNode extends Observer<Object>, ObservableSource<Object> {

	/**
	 * subscription of editors or other interested parties for progress updates
	 */
	default public void subscribe(Observer<? super Object> observer) {
		getSubscribers().add(observer);
	}

	default public void notifyObserversOfStatusChange(String status) {
		for (Observer<Object> o : getSubscribers())
			o.onNext(status);
	}

	public Collection<Observer<? super Object>> getSubscribers();

}
