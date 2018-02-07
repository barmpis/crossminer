package org.eclipse.crossmeter.workflow.execution.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.eclipse.crossmeter.workflow.execution.examples.github.GithubClient;
import org.eclipse.crossmeter.workflow.execution.examples.github.GithubClient.Author;
import org.eclipse.crossmeter.workflow.execution.examples.github.GithubClient.File;
import org.eclipse.crossmeter.workflow.execution.examples.github.GithubClient.Repo;
import org.eclipse.crossmeter.workflow.execution.stubs.execution.example.github.GeneratedConfigToGithubRepos;
import org.eclipse.crossmeter.workflow.execution.stubs.execution.example.github.GeneratedFileToAuthors;
import org.eclipse.crossmeter.workflow.execution.stubs.execution.example.github.GeneratedGithubRepoToFiles;
import org.eclipse.crossmeter.workflow.execution.stubs.execution.example.github.StubExecutionCoordinator;
import org.eclipse.crossmeter.workflow.execution.stubs.execution.example.github.StubGithubData;
import org.eclipse.crossmeter.workflow.execution.tests.util.GeneratedConfigToGithubRepos2;
import org.eclipse.crossmeter.workflow.execution.tests.util.GithubClient2;
import org.eclipse.crossmeter.workflow.execution.tests.util.StubExecutionCoordinator2;
import org.eclipse.crossmeter.workflow.execution.tests.util.StubGithubData2;
import org.junit.Test;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public class DataflowTests {

	public DataflowTests() {

		// initialise test data with 4 repos
		StubGithubData.getSingle().addStubGithubData(4);
		StubGithubData2.getSingle().addStubGithubData(4);

	}

	@Test
	public void simpleOutputTest() throws Exception {

		System.out.println("simpleOutputTest");
		HashSet<String> data = new HashSet<>();

		//
		PublishSubject<String> extensions = PublishSubject.create();

		GeneratedConfigToGithubRepos rep = new GeneratedConfigToGithubRepos();
		extensions.subscribe(rep);

		Observable<Repo> repos = rep.repos();

		repos.subscribe(t -> data.add(t.toString()));

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

		assertEquals(StubGithubData.getSingle().getRepoData(), data);
	}

	@Test
	public void mappedOutputTest() throws Exception {

		System.out.println("mappedOutputTest");
		HashSet<String> data = new HashSet<>();

		//
		PublishSubject<String> extensions = PublishSubject.create();

		GeneratedConfigToGithubRepos rep = new GeneratedConfigToGithubRepos();
		extensions.subscribe(rep);

		Observable<Repo> repos = rep.repos();

		GeneratedGithubRepoToFiles fi = new GeneratedGithubRepoToFiles();
		repos.subscribe(fi);

		Observable<File> files = fi.files();

		files.subscribe(t -> data.add(t.toString()));

		//
		extensions.onNext("xmi");
		extensions.onNext("uml");
		//
		for (GithubClient cl : StubExecutionCoordinator.getActiveRepoClients())
			cl.stubRetrieveRepositoriesByFileExtension();
		for (GithubClient cl : StubExecutionCoordinator.getActiveFileClients())
			cl.stubRetrieveFilesInRepo();

		//
		for (GithubClient cl : StubExecutionCoordinator.getClients())
			cl.stubDenoteCompletion();
		extensions.onComplete();

		assertEquals(StubGithubData.getSingle().getFileData(), data);
	}

	@Test
	public void forkedOutputTest() throws Exception {

		System.out.println("forkedOutputTest");
		HashSet<String> data1 = new HashSet<>();
		HashSet<String> data2 = new HashSet<>();

		//

		PublishSubject<String> extensions = PublishSubject.create();

		GeneratedConfigToGithubRepos rep = new GeneratedConfigToGithubRepos();
		extensions.subscribe(rep);

		Observable<Repo> repos = rep.repos();

		GeneratedGithubRepoToFiles fi1 = new GeneratedGithubRepoToFiles();
		repos.subscribe(fi1);

		Observable<File> files1 = fi1.files();

		files1.subscribe(t -> data1.add(t.toString()));

		GeneratedGithubRepoToFiles fi2 = new GeneratedGithubRepoToFiles();
		repos.subscribe(fi2);

		Observable<File> files2 = fi2.files();

		GeneratedFileToAuthors auth = new GeneratedFileToAuthors();
		files2.subscribe(auth);

		Observable<Author> authors = auth.authors();

		authors.subscribe(t -> data2.add(t.toString()));

		//
		extensions.onNext("xmi");
		extensions.onNext("uml");
		//
		for (GithubClient cl : StubExecutionCoordinator.getActiveRepoClients())
			cl.stubRetrieveRepositoriesByFileExtension();
		for (GithubClient cl : StubExecutionCoordinator.getActiveFileClients())
			cl.stubRetrieveFilesInRepo();
		for (GithubClient cl : StubExecutionCoordinator.getActiveAuthorClients())
			cl.stubRetrieveAuthorFromFile();

		for (GithubClient cl : StubExecutionCoordinator.getClients())
			cl.stubDenoteCompletion();
		extensions.onComplete();

		assertEquals(StubGithubData.getSingle().getFileData(), data1);
		assertEquals(StubGithubData.getSingle().getAuthorData(), data2);

	}

	@Test
	public void muiltiInputTest() throws Exception {

		System.out.println("multiInputTest");
		HashSet<String> data = new HashSet<>();

		//
		PublishSubject<String> extensions = PublishSubject.create();

		GeneratedConfigToGithubRepos rep1 = new GeneratedConfigToGithubRepos();
		extensions.subscribe(rep1);

		GeneratedConfigToGithubRepos2 rep2 = new GeneratedConfigToGithubRepos2();
		extensions.subscribe(rep2);

		Observable<Repo> repos1 = rep1.repos();
		Observable<Repo> repos2 = rep2.repos();

		repos1.subscribe(t -> data.add(t.toString()));
		repos2.subscribe(t -> data.add(t.toString()));

		//
		extensions.onNext("xmi");
		extensions.onNext("uml");
		//
		for (GithubClient cl : StubExecutionCoordinator.getActiveRepoClients())
			cl.stubRetrieveRepositoriesByFileExtension();
		for (GithubClient2 cl : StubExecutionCoordinator2.getActiveRepoClients())
			cl.stubRetrieveRepositoriesByFileExtension();
		//
		for (GithubClient cl : StubExecutionCoordinator.getClients())
			cl.stubDenoteCompletion();
		for (GithubClient2 cl : StubExecutionCoordinator2.getClients())
			cl.stubDenoteCompletion();
		extensions.onComplete();

		// System.out.println(data);

		HashSet<String> d = new HashSet<>();
		d.addAll(StubGithubData.getSingle().getRepoData());
		d.addAll(StubGithubData2.getSingle().getRepoData());

		// System.out.println(d);

		assertEquals(d, data);

	}

}
