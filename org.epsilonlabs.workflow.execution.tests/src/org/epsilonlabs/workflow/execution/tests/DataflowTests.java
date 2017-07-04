package org.epsilonlabs.workflow.execution.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.epsilonlabs.workflow.execution.impl.GithubClient;
import org.epsilonlabs.workflow.execution.impl.GithubClient.Author;
import org.epsilonlabs.workflow.execution.impl.GithubClient.File;
import org.epsilonlabs.workflow.execution.impl.GithubClient.Repo;
import org.epsilonlabs.workflow.execution.impl.GithubMapper;
import org.epsilonlabs.workflow.execution.impl.StubGithubData;
import org.epsilonlabs.workflow.execution.tests.util.GithubClient2;
import org.epsilonlabs.workflow.execution.tests.util.StubGithubData2;
import org.junit.Test;

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

		List<String> exts = new LinkedList<String>();
		exts.add("xmi");
		exts.add("uml");
		GithubClient source = new GithubClient();
		PublishSubject<Repo> repos = source.getRepositoriesByFileExtension(exts);

		repos.subscribe(t -> data.add(t.toString()));

		//
		for (String ext : exts)
			source.stubRetrieveRepositoriesByFileExtension(ext);
		source.stubDenoteCompletion();

		// System.out.println(data);

		assertEquals(StubGithubData.getSingle().getRepoData(), data);
	}

	@Test
	public void mappedOutputTest() throws Exception {

		System.out.println("mappedOutputTest");
		HashSet<String> data = new HashSet<>();

		//

		List<String> exts = new LinkedList<String>();
		exts.add("xmi");
		exts.add("uml");
		GithubClient source = new GithubClient();
		PublishSubject<Repo> repos = source.getRepositoriesByFileExtension(exts);

		GithubMapper m1 = new GithubMapper();
		repos.subscribe(m1);
		PublishSubject<File> files = m1.getFilesWithFileExtension(exts);

		files.subscribe(t -> data.add(t.toString()));

		//
		for (String ext : exts)
			source.stubRetrieveRepositoriesByFileExtension(ext);
		source.stubDenoteCompletion();

		// System.out.println(data);

		assertEquals(StubGithubData.getSingle().getFileData(), data);
	}

	@Test
	public void forkedOutputTest() throws Exception {

		System.out.println("forkedOutputTest");
		HashSet<String> data1 = new HashSet<>();
		HashSet<String> data2 = new HashSet<>();

		//

		List<String> exts = new LinkedList<String>();
		exts.add("xmi");
		exts.add("uml");
		GithubClient source = new GithubClient();
		PublishSubject<Repo> repos = source.getRepositoriesByFileExtension(exts);

		GithubMapper m1 = new GithubMapper();
		repos.subscribe(m1);
		PublishSubject<File> files1 = m1.getFilesWithFileExtension(exts);

		files1.subscribe(t -> data1.add(t.toString()));

		GithubMapper m2 = new GithubMapper();
		repos.subscribe(m2);
		PublishSubject<File> files2 = m2.getFilesWithFileExtension(exts);

		GithubMapper m3 = new GithubMapper();
		files2.subscribe(m3);
		PublishSubject<Author> authors = m3.getAuthors();

		authors.subscribe(t -> data2.add(t.toString()));

		//
		for (String ext : exts)
			source.stubRetrieveRepositoriesByFileExtension(ext);
		source.stubDenoteCompletion();

		// System.out.println("1: " + data1);
		// System.out.println("2: " + data2);

		assertEquals(StubGithubData.getSingle().getFileData(), data1);
		assertEquals(StubGithubData.getSingle().getAuthorData(), data2);

	}

	@Test
	public void muiltiInputTest() throws Exception {

		System.out.println("multiInputTest");
		HashSet<String> data = new HashSet<>();

		//

		List<String> exts = new LinkedList<String>();
		exts.add("xmi");
		exts.add("uml");

		GithubClient source1 = new GithubClient();
		PublishSubject<Repo> repos1 = source1.getRepositoriesByFileExtension(exts);
		GithubClient2 source2 = new GithubClient2();
		PublishSubject<org.epsilonlabs.workflow.execution.tests.util.GithubClient2.Repo> repos2 = source2
				.getRepositoriesByFileExtension(exts);

		repos1.subscribe(t -> data.add(t.toString()));
		repos2.subscribe(t -> data.add(t.toString()));

		//
		for (String ext : exts) {
			source1.stubRetrieveRepositoriesByFileExtension(ext);
			source2.stubRetrieveRepositoriesByFileExtension(ext);
		}
		source1.stubDenoteCompletion();
		source2.stubDenoteCompletion();

		//System.out.println(data);

		HashSet<String> d = new HashSet<>();
		d.addAll(StubGithubData.getSingle().getRepoData());
		d.addAll(StubGithubData2.getSingle().getRepoData());

		//System.out.println(d);

		assertEquals(d, data);

	}

}
