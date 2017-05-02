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
