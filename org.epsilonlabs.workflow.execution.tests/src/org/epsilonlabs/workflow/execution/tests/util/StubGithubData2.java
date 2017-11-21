package org.epsilonlabs.workflow.execution.tests.util;

import java.util.HashSet;
import java.util.LinkedList;

import org.epsilonlabs.workflow.execution.github.GithubClient;
import org.epsilonlabs.workflow.execution.github.GithubClient.Repo;

public class StubGithubData2 {

	private static StubGithubData2 ret;

	protected LinkedList<Repo> data = new LinkedList<>();

	private int repoId = 100;
	private int fileId = 100;
	private int authorId = 100;

	public StubGithubData2() {

	}

	/**
	 * Adds 'repos' amount of repositories to the dataset
	 * 
	 * @param repos
	 */
	public void addStubGithubData(int repos) {

		repoId = 100;
		fileId = 100;
		authorId = 100;

		data.clear();

		for (int i = 0; i < repos; i++) {
			createRepo();
		}

	}

	private void createRepo() {

		if (repoId % 4 == 0) {
			if (repoId % 2 == 0) {
				data.add((new GithubClient()).new Repo("repo~" + repoId, "uml", "file~" + fileId + ".uml:author~"
						+ authorId + ";file~" + (fileId + 1) + ".uml:author~" + (authorId + 1)));
			} else {
				data.add((new GithubClient()).new Repo("repo~" + repoId, "xmi", "file~" + fileId + ".xmi:author~"
						+ authorId + ";file~" + (fileId + 1) + ".xmi:author~" + (authorId + 1)));
			}
			fileId = fileId + 2;
			authorId = authorId + 2;
		} else {
			if (repoId % 2 == 0) {
				data.add((new GithubClient()).new Repo("repo~" + repoId, "uml",
						"file~" + fileId + ".uml:author~" + authorId));
			} else {
				data.add((new GithubClient()).new Repo("repo~" + repoId, "xmi",
						"file~" + fileId + ".xmi:author~" + authorId));
			}
			fileId++;
			authorId++;
		}

		repoId++;

	}

	public LinkedList<Repo> getData() {
		return data;
	}

	public HashSet<String> getRepoData() {

		HashSet<String> d = new HashSet<>();

		for (Repo r : data) {
			d.add(r.getName() + "#" + r.getType());
		}

		return d;

	}

	public HashSet<String> getFileData() {

		HashSet<String> d = new HashSet<>();

		for (Repo r : data) {
			for (String file : r.getFiles())

				d.add(file + "#" + r.getName() + "#" + r.getType());

		}

		return d;

	}

	public HashSet<String> getAuthorData() {

		HashSet<String> d = new HashSet<>();

		for (Repo r : data) {
			for (String file : r.getFiles())
				d.add(r.getAuthor(file) + "#" + file + "#" + r.getName() + "#" + r.getType());
		}

		return d;

	}

	public static StubGithubData2 getSingle() {
		if (ret == null)
			ret = new StubGithubData2();

		return ret;
	}

}
