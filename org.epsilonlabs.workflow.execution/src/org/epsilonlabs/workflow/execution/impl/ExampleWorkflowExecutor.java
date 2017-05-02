package org.epsilonlabs.workflow.execution.impl;

import org.epsilonlabs.workflow.execution.EventualDataConsumer;
import org.epsilonlabs.workflow.execution.EventualDataset;
import org.epsilonlabs.workflow.execution.WorkflowExecutor;

/**
 * Responsible for coordinating the execution of a workflow
 * 
 * @author kb
 *
 */
public class ExampleWorkflowExecutor implements WorkflowExecutor {

	public static void main(String... args) throws Exception {
		new ExampleWorkflowExecutor().executeWorkflow();
	}

	public void executeWorkflow() throws Exception {

		StubGithubExecutor source = new StubGithubExecutor();
		EventualDataset data = source.execute();
		EventualDataConsumer output = new ConsoleOutput();
		output.addDataset(data);

		// execution stub, without this there are no blocking calls in this
		// method...

		Thread.sleep(2000);

		source.addDataStub1();

		Thread.sleep(2000);

		source.addDataStub2();

	}

	public void subscribe(Object o) {
	}

	public void unSubscribe(Object o) {
	}

}
