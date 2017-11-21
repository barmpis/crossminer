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
package org.epsilonlabs.workflow.execution.example;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

import org.epsilonlabs.workflow.execution.WorkflowExecutor;
import org.epsilonlabs.workflow.execution.example.github.GeneratedConfigToGithubRepos;
import org.epsilonlabs.workflow.execution.example.github.GeneratedFileToAuthors;
import org.epsilonlabs.workflow.execution.example.github.GeneratedGithubRepoToFiles;
import org.epsilonlabs.workflow.execution.example.github.StubExecutionCoordinator;
import org.epsilonlabs.workflow.execution.example.github.StubGithubData;
import org.epsilonlabs.workflow.execution.github.GithubClient;
import org.ossmeter.platform.delta.bugtrackingsystem.BugTrackingSystemComment;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;

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
		// new ExampleWorkflowExecutor().executeClassificationWorkflow();
	}

	public void executeClassificationWorkflow() {

		BugTrackingSystemExampleProvider p = new BugTrackingSystemExampleProvider();
		PublishSubject<Object> btc = p.getComments();

		SentimentAnalysisTask t = new SentimentAnalysisTask();
		btc.subscribe(t);

		// stub data provision
		String text1 = // "redirection forgot option mailbox"
				"This project is immature and not suitable for use in production.";
		String text2 = "Wot about Fig. 2 and (Fig. 3)? We created a myosinII-responsive FA interactome from proteins "
				+ "in the expected FA list by color-coding proteins according to MDR magnitude (Supplemental Fig. "
				+ "S4 and Table 7, http://dir.nhlbi.nih.gov/papers/lctm/focaladhesion/Home/index.html). The "
				+ "interactome illustrates the full range of MDR values, including proteins exhibiting minor/low ";

		BugTrackingSystemComment c1 = new BugTrackingSystemComment();
		BugTrackingSystemComment c2 = new BugTrackingSystemComment();
		c1.setBugId("bug1");
		c1.setBugTrackingSystem(null);
		c1.setCommentId("comment1");
		c1.setText(text1);
		c1.setCreator("adricosta");
		c1.setCreationTime(new Date());

		p.iHasData(c1);

		c2.setBugId("bug2");
		c2.setBugTrackingSystem(null);
		c2.setCommentId("comment2");
		c2.setText(text2);
		c2.setCreator("adricosta2");
		c2.setCreationTime(new Date());

		p.iHasData(c2);

	}

	public void executeWorkflow() throws Exception {

		System.out.println("executing generated workflow...");

		// define file extensions we are interested in
		PublishSubject<String> extobs = PublishSubject.create();

		GeneratedConfigToGithubRepos ext2repo = new GeneratedConfigToGithubRepos();
		// format: source . subscribe ( consumer ) ;
		extobs.subscribe(ext2repo);

		Observable<GithubClient.Repo> repoData = ext2repo.repos();

		// from the repositories obtained in the previous step, retrieve the
		// files with the extensions we are interested in

		GeneratedGithubRepoToFiles repo2files = new GeneratedGithubRepoToFiles();
		repoData.subscribe(repo2files);

		Observable<?> fileData = repo2files.files();

		// from the files obtained in the previous step, retrieve the authors
		// (using no filters)
		GeneratedFileToAuthors file2authors = new GeneratedFileToAuthors();
		fileData.subscribe(file2authors);

		Observable<?> authorData = file2authors.authors();

		// print these files
		ConsoleOutput out = new ConsoleOutput();
		authorData.subscribe(out);

		//
		// STUB EXECUTION OF DATA RETRIEVAL
		extobs.onNext("xmi");
		extobs.onNext("uml");
		//
		StubGithubData.getSingle().addStubGithubData(2);
		for (GithubClient c : StubExecutionCoordinator.getActiveRepoClients()) {
			c.stubRetrieveRepositoriesByFileExtension();
			System.out.println("r: RATE LIMIT REACHED! waiting 1 second(s)...");
			//
			Thread.sleep(1);
		}
		for (GithubClient c : StubExecutionCoordinator.getActiveFileClients()) {
			c.stubRetrieveFilesInRepo();
			System.out.println("f: RATE LIMIT REACHED! waiting 1 second(s)...");
			//
			Thread.sleep(1);
		}
		for (GithubClient c : StubExecutionCoordinator.getActiveAuthorClients()) {
			c.stubRetrieveAuthorFromFile();
			System.out.println("a: RATE LIMIT REACHED! waiting 1 second(s)...");
			//
			Thread.sleep(1);
		}
		// on complete triggers
		extobs.onComplete();
		//
		for (GithubClient c : StubExecutionCoordinator.getClients()) {
			c.stubDenoteCompletion();
		}
		//

		System.out.println("workflow executed.");

	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
