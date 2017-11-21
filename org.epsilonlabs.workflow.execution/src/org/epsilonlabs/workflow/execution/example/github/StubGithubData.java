package org.epsilonlabs.workflow.execution.example.github;

import java.util.HashSet;
import java.util.LinkedList;

import org.epsilonlabs.workflow.execution.github.GithubClient;
import org.epsilonlabs.workflow.execution.github.GithubClient.Repo;

public class StubGithubData {

	private static StubGithubData ret;

	protected LinkedList<Repo> data = new LinkedList<>();

	private int repoId = 0;
	private int fileId = 0;
	private int authorId = 0;

	private GithubClient ref;

	public StubGithubData() {
		ref = new GithubClient();
	}

	/**
	 * Adds 'repos' amount of repositories to the dataset
	 * 
	 * @param repos
	 */
	public void addStubGithubData(int repos) {

		repoId = 0;
		fileId = 0;
		authorId = 0;

		data.clear();

		for (int i = 0; i < repos; i++) {
			createRepo();
		}

	}

	private void createRepo() {

		if (repoId % 4 == 0) {
			if (repoId % 2 == 0) {
				data.add(ref.new Repo("repo~" + repoId, "uml", "file~" + fileId + ".uml:author~" + authorId + ";file~"
						+ (fileId + 1) + ".uml:author~" + (authorId + 1)));
			} else {
				data.add(ref.new Repo("repo~" + repoId, "xmi", "file~" + fileId + ".xmi:author~" + authorId + ";file~"
						+ (fileId + 1) + ".xmi:author~" + (authorId + 1)));
			}
			fileId = fileId + 2;
			authorId = authorId + 2;
		} else {
			if (repoId % 2 == 0) {
				data.add(ref.new Repo("repo~" + repoId, "uml", "file~" + fileId + ".uml:author~" + authorId));
			} else {
				data.add(ref.new Repo("repo~" + repoId, "xmi", "file~" + fileId + ".xmi:author~" + authorId));
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

				d.add(file + "#" + r.getName());

		}

		return d;

	}

	public HashSet<String> getAuthorData() {

		HashSet<String> d = new HashSet<>();

		for (Repo r : data) {
			for (String file : r.getFiles())
				d.add(r.getAuthor(file) + "#" + file + "#" + r.getName());
		}

		return d;

	}

	public static StubGithubData getSingle() {
		if (ret == null)
			ret = new StubGithubData();

		return ret;
	}

}
