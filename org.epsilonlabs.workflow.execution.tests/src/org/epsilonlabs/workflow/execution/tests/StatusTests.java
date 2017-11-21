package org.epsilonlabs.workflow.execution.tests;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Generated;

import org.epsilonlabs.workflow.execution.example.CachedConsumer;
import org.epsilonlabs.workflow.execution.example.ConsoleOutput;
import org.epsilonlabs.workflow.execution.example.github.GeneratedConfigToGithubRepos;
import org.epsilonlabs.workflow.execution.example.github.GeneratedGithubRepoToFiles;
import org.epsilonlabs.workflow.execution.example.github.StubExecutionCoordinator;
import org.epsilonlabs.workflow.execution.example.github.StubGithubData;
import org.epsilonlabs.workflow.execution.generation.*;
import org.epsilonlabs.workflow.execution.github.GithubClient;
import org.epsilonlabs.workflow.execution.github.GithubClient.*;
import org.junit.Test;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public class StatusTests {

	public StatusTests() {

		// initialise test data with 4 repos
		StubGithubData.getSingle().addStubGithubData(4);

	}

	@Test
	public void simpleLifeCycleTest() throws Exception {

		System.out.println("simpleLifeCycleTest");

		//
		PublishSubject<String> extensions = PublishSubject.create();

		GeneratedConfigToGithubRepos rep = new GeneratedConfigToGithubRepos();
		extensions.subscribe(rep);

		CachedConsumer c = new CachedConsumer();
		rep.subscribe(c);

		Observable<Repo> repos = rep.repos();

		repos.subscribe(new ConsoleOutput());

		//
		extensions.onNext("xmi");
		extensions.onNext("uml");
		//
		for (GithubClient cl : StubExecutionCoordinator.getActiveRepoClients())
			cl.stubRetrieveRepositoriesByFileExtension();
		//
		for (GithubClient cl : StubExecutionCoordinator.getClients())
			cl.stubDenoteCompletion();
		extensions.onComplete();

		LinkedList<Object> actual = new LinkedList<>();
		actual.add("processed 1 config elements");
		actual.add("task complete");

		// System.err.println(c.getAndClearContents());
		assertEquals(c.getAndClearContents(), actual);

	}

	@Test
	public void mappedLifeCycleTest() throws Exception {

		System.out.println("mappedLifeCycleTest");

		//
		PublishSubject<String> extensions = PublishSubject.create();

		GeneratedConfigToGithubRepos rep = new GeneratedConfigToGithubRepos();
		extensions.subscribe(rep);

		CachedConsumer c = new CachedConsumer();
		rep.subscribe(c);

		Observable<Repo> repos = rep.repos();

		GeneratedGithubRepoToFiles fi = new GeneratedGithubRepoToFiles();
		repos.subscribe(fi);

		fi.subscribe(c);

		Observable<File> files = fi.files();

		files.subscribe(new ConsoleOutput());

		//
		extensions.onNext("xmi");
		extensions.onNext("uml");
		//
		for (GithubClient cl : StubExecutionCoordinator.getActiveRepoClients())
			cl.stubRetrieveRepositoriesByFileExtension();
		for (GithubClient cl : StubExecutionCoordinator.getActiveFileClients())
			cl.stubRetrieveFilesInRepo();

		for (GithubClient cl : StubExecutionCoordinator.getClients())
			cl.stubDenoteCompletion();
		extensions.onComplete();

		LinkedList<Object> actual = new LinkedList<>();
		actual.add("processed 1 config elements");
		actual.add("processed 1 repo elements");
		actual.add("task complete");
		actual.add("task complete");

		// System.err.println(c.getAndClearContents());
		assertEquals(c.getAndClearContents(), actual);

	}

}
