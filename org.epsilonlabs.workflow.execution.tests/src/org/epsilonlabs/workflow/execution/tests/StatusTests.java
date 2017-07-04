package org.epsilonlabs.workflow.execution.tests;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.epsilonlabs.workflow.execution.impl.CachedConsumer;
import org.epsilonlabs.workflow.execution.impl.ConsoleOutput;
import org.epsilonlabs.workflow.execution.impl.GithubClient;
import org.epsilonlabs.workflow.execution.impl.GithubClient.File;
import org.epsilonlabs.workflow.execution.impl.GithubClient.Repo;
import org.epsilonlabs.workflow.execution.impl.GithubMapper;
import org.epsilonlabs.workflow.execution.impl.StubGithubData;
import org.junit.Test;

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

		List<String> exts = new LinkedList<String>();
		exts.add("xmi");
		exts.add("uml");
		GithubClient source = new GithubClient();

		CachedConsumer c = new CachedConsumer();
		source.subscribe(c);

		PublishSubject<Repo> repos = source.getRepositoriesByFileExtension(exts);

		repos.subscribe(new ConsoleOutput());

		//
		for (String ext : exts)
			source.stubRetrieveRepositoriesByFileExtension(ext);
		source.stubDenoteCompletion();

		LinkedList<Object> actual = new LinkedList<>();
		actual.add("providing data: getRepositoriesByFileExtension");
		actual.add("task complete");

		// System.err.println(c.getAndClearContents());
		assertEquals(c.getAndClearContents(), actual);

	}

	@Test
	public void mappedLifeCycleTest() throws Exception {

		System.out.println("simpleLifeCycleTest");

		//

		List<String> exts = new LinkedList<String>();
		exts.add("xmi");
		exts.add("uml");
		GithubClient source = new GithubClient();

		PublishSubject<Repo> repos = source.getRepositoriesByFileExtension(exts);

		GithubMapper m = new GithubMapper();
		repos.subscribe(m);

		CachedConsumer c = new CachedConsumer();
		m.subscribe(c);

		PublishSubject<File> d = m.getFilesWithFileExtension(exts);

		d.subscribe(new ConsoleOutput());

		//
		for (String ext : exts)
			source.stubRetrieveRepositoriesByFileExtension(ext);
		source.stubDenoteCompletion();

		LinkedList<Object> actual = new LinkedList<>();
		actual.add("providing data: getFilesWithFileExtension");
		actual.add("task complete");

		// System.err.println(c.getAndClearContents());
		assertEquals(c.getAndClearContents(), actual);

	}

}
