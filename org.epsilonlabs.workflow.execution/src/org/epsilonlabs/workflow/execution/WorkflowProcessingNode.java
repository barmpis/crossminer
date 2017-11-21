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

import io.reactivex.Observer;

/**
 * Represents a node that consumes data (extends WorkflowConsumerNode) and
 * manipulates it in order to provide data (extends WorkflowProviderNode). This
 * node can provide status change notifications to interested parties to inform
 * them of its progress (as part of extending WorkflowProviderNode).
 * 
 * @author kb
 *
 */
public interface WorkflowProcessingNode extends WorkflowProviderNode, WorkflowConsumerNode {

	/**
	 * when notifying interested parties about its progress, a mapper acts as a
	 * provider not a consumer (as both notify)
	 */
	@Override
	default void notifyObserversOfStatusChange(String status) {
		WorkflowProviderNode.super.notifyObserversOfStatusChange(status);
	}

	@Override
	default void subscribe(Observer<? super Object> observer) {
		WorkflowProviderNode.super.subscribe(observer);
	}

	// TODO no currently identified methods available to all mappers -- is this
	// interface useful?

}
