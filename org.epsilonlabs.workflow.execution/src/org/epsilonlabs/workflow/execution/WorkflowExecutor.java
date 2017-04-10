package org.epsilonlabs.workflow.execution;

/**
 * Responsible for coordinating the execution of a workflow
 * 
 * @author kb
 *
 */
public interface WorkflowExecutor {

	public void executeWorkflow();

	public void subscribe(Object o);

	public void unSubscribe(Object o);

}
