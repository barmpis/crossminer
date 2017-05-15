package org.epsilonlabs.workflow.execution.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.epsilonlabs.workflow.execution.EventualDataConsumer;
import org.epsilonlabs.workflow.execution.EventualDataMapper;
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
		// new ExampleWorkflowExecutor().executeWorkflow();
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
		// TODO graphical editor subscriptions
	}

	public void unSubscribe(Object o) {
	}

	private void executeMDEPopularitySearchStub() throws Exception {

		// define file extensions we are interested in
		List<String> exts = new LinkedList<String>();
		exts.add("ecore");
		exts.add("uml");

		// find repositories in github by file extension
		StubMDEGithubExecutor source = new StubMDEGithubExecutor();
		Map<Object, Object> params = new HashMap<Object, Object>();
		params.put(EventualDataProvider.FILTERS.FILETBYFILEEXTENSION, exts);
		source.setExecutionParameters(params);

		EventualDataset repoData = source.execute();

		// from the repositories obtained in the previous step, retrieve the
		// files with the extensions we are interested in
		GithubMapper mapper = new GithubMapper();
		params = new HashMap<Object, Object>();
		params.put(EventualDataMapper.MAPFROM, EventualDataProvider.DATATYPES.REPOSITORIES);
		params.put(EventualDataProvider.FILTERS.FILETBYFILEEXTENSION, exts);
		params.put(EventualDataMapper.MAPTO, EventualDataProvider.DATATYPES.FILES);
		mapper.setExecutionParameters(params);
		//
		mapper.addDataset(repoData);

		EventualDataset fileData = mapper.execute();

		// from the files obtained in the previous step, retrieve the authors
		// (using no filters)
		GithubMapper mapper2 = new GithubMapper();
		params = new HashMap<Object, Object>();
		params.put(EventualDataMapper.MAPFROM, EventualDataProvider.DATATYPES.FILES);
		params.put(EventualDataMapper.MAPTO, EventualDataProvider.DATATYPES.AUTHORS);
		mapper2.setExecutionParameters(params);
		//
		mapper2.addDataset(fileData);

		EventualDataset authorData = mapper2.execute();

		// print these files
		ConsoleOutput out = new ConsoleOutput();
		out.addDataset(authorData);

		//

		source.addRepoDataStubs();

		//

	}
}
