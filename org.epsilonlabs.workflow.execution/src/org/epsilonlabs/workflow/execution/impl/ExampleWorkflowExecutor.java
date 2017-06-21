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
package org.epsilonlabs.workflow.execution.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.epsilonlabs.workflow.execution.WorkflowExecutor;

import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * Responsible for coordinating the execution of a workflow
 * 
 * @author kb
 *
 */
public class ExampleWorkflowExecutor implements WorkflowExecutor {

	private Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	public static void main(String... args) throws Exception {
		new ExampleWorkflowExecutor().executeWorkflow();
	}

	public void executeWorkflow() throws Exception {

		System.out.println("executing workflow...");

		// define file extensions we are interested in
		List<String> exts = new LinkedList<String>();
		exts.add("xmi");
		exts.add("uml");

		// find repositories in github by file extension
		GithubExecutor source = new GithubExecutor();

		Observable<?> repoData = source.getRepositoriesByFileExtension(exts);

		// from the repositories obtained in the previous step, retrieve the
		// files with the extensions we are interested in
		GithubMapper mapper = new GithubMapper();
		repoData.subscribe(mapper);
		Observable<?> fileData = mapper.getFilesWithFileExtension(exts);

		// from the files obtained in the previous step, retrieve the authors
		// (using no filters)
		GithubMapper mapper2 = new GithubMapper();
		fileData.subscribe(mapper2);

		Observable<?> authorData = mapper2.getAuthors();

		// print these files
		ConsoleOutput out = new ConsoleOutput();
		authorData.subscribe(out);

		//
		// STUB EXECUTION OF DATA RETRIEVAL
		StubGithubData.addStubGithubData(2);
		for (String ext : exts) {
			source.stubRetrieveRepositoriesByFileExtension(ext);
			System.out.println("RATE LIMIT REACHED! waiting 59minutes...");

			Thread.sleep(2000);
		}
		//
		source.stubDenoteCompletion();
		//

		System.out.println("workflow executed.");

	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
