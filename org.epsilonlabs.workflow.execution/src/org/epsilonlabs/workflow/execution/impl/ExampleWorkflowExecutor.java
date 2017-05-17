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
		new ExampleWorkflowExecutor().executeWorkflow();
	}

	public void executeWorkflow() throws Exception {

		System.out.println("executing workflow...");

		// define file extensions we are interested in
		List<String> exts = new LinkedList<String>();
		exts.add("ecore");
		exts.add("uml");

		// find repositories in github by file extension
		GithubExecutor source = new GithubExecutor();

		EventualDataset repoData = source.getRepositoriesByFileExtension(exts);

		// from the repositories obtained in the previous step, retrieve the
		// files with the extensions we are interested in
		GithubMapper mapper = new GithubMapper();
		repoData.subscribe(mapper);
		EventualDataset fileData = mapper.getFilesWithFileExtension(null, exts);

		// from the files obtained in the previous step, retrieve the authors
		// (using no filters)
		GithubMapper mapper2 = new GithubMapper();
		fileData.subscribe(mapper2);

		EventualDataset authorData = mapper2.getAuthors(null);

		// print these files
		ConsoleOutput out = new ConsoleOutput();
		authorData.subscribe(out);

		//
		// STUB EXECUTION OF DATA RETRIEVAL
		for (String ext : exts) {
			source.stubRetrieveRepositoriesByFileExtension(ext);
			System.out.println("RATE LIMIT REACHED! waiting 59minutes...");

			Thread.sleep(2000);
		}
		//

		System.out.println("workflow executed.");

	}

	public void subscribe(Object o) {
		// TODO graphical editor subscriptions
	}

	public void unSubscribe(Object o) {
	}
}
