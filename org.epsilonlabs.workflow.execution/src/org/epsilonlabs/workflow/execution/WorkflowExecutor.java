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

/**
 * Responsible for coordinating the execution of a workflow
 * 
 * @author kb
 *
 */
public interface WorkflowExecutor {

	public void executeWorkflow() throws Exception;

	/**
	 * graphical editors subscribe here for visual updates
	 * 
	 * @param o
	 */
	public void subscribe(Object o);

	public void unSubscribe(Object o);

}
