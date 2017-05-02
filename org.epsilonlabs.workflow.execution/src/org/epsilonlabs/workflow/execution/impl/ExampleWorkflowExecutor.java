package org.epsilonlabs.workflow.execution.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.epsilonlabs.workflow.execution.EventualDataConsumer;
import org.epsilonlabs.workflow.execution.EventualDataProvider;
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
		//new ExampleWorkflowExecutor().executeWorkflow();
		new ExampleWorkflowExecutor().executeMDEPopularitySearchStub();
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

	private void executeMDEPopularitySearchStub() throws Exception {

		List<String> exts = new LinkedList<String>();
		exts.add("ecore");
		exts.add("uml");

		MDEStubGithubExecutor source = new MDEStubGithubExecutor();
		Map<Object, Object> params = new HashMap<Object, Object>();
		params.put("fileExtensions", exts);
		source.setExecutionParameters(params);

		EventualDataset repoData = source.execute();

		GithubMapper mapper = new GithubMapper();
		params = new HashMap<Object, Object>();
		params.put("mapFrom", "repositories");
		params.put(EventualDataProvider.Filters.filterByExt,exts);
		params.put("mapTo", "files");
		mapper.setExecutionParameters(params);
		mapper.addDataset(repoData);

		EventualDataset fileData = mapper.execute();

		ConsoleOutput out = new ConsoleOutput();
		out.addDataset(fileData);

		//

		source.addDataStubs();

		//

	}
}
