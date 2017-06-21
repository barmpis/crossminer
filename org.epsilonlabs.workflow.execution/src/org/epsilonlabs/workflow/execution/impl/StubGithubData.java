package org.epsilonlabs.workflow.execution.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class StubGithubData {

	protected static LinkedList<Repo> data = new LinkedList<>();

	private static int repoId = 0;
	private static int fileId = 0;
	private static int authorId = 0;

	/**
	 * Adds 'repos' amount of repositories to the dataset
	 * 
	 * @param repos
	 */
	public static void addStubGithubData(int repos) {

		repoId = 0;
		fileId = 0;
		authorId = 0;

		data.clear();

		for (int i = 0; i < repos; i++) {
			createRepo();
		}

	}

	private static void createRepo() {

		if (repoId % 4 == 0) {
			if (repoId % 2 == 0) {
				data.add(new Repo("repo~" + repoId, "uml", "file~" + fileId + ".uml:author~" + authorId + ";file~"
						+ (fileId + 1) + ".uml:author~" + (authorId + 1)));
			} else {
				data.add(new Repo("repo~" + repoId, "xmi", "file~" + fileId + ".xmi:author~" + authorId + ";file~"
						+ (fileId + 1) + ".xmi:author~" + (authorId + 1)));
			}
			fileId = fileId + 2;
			authorId = authorId + 2;
		} else {
			if (repoId % 2 == 0) {
				data.add(new Repo("repo~" + repoId, "uml", "file~" + fileId + ".uml:author~" + authorId));
			} else {
				data.add(new Repo("repo~" + repoId, "xmi", "file~" + fileId + ".xmi:author~" + authorId));
			}
			fileId++;
			authorId++;
		}

		repoId++;

	}

	public static LinkedList<Repo> getData() {
		return data;
	}

	public static HashSet<String> getRepoData() {

		HashSet<String> d = new HashSet<>();

		for (Repo r : data) {
			d.add(r.getName() + "#" + r.getType());
		}

		return d;

	}

	public static HashSet<String> getFileData() {

		HashSet<String> d = new HashSet<>();

		for (Repo r : data) {
			for (String file : r.getFiles())

				d.add(file + "#" + r.getName() + "#" + r.getType());

		}

		return d;

	}

	public static HashSet<String> getAuthorData() {

		HashSet<String> d = new HashSet<>();

		for (Repo r : data) {
			for (String file : r.getFiles())
				d.add(r.getAuthor(file) + "#" + file + "#" + r.getName() + "#" + r.getType());
		}

		return d;

	}

	//

	public static class Repo {

		private String name;
		private String type;
		private HashMap<String, String> files = new HashMap<>();

		public Repo(String name, String type, String contents) {

			this.name = name;
			this.type = type;

			String[] contentSplit = contents.split(";");

			for (String s : contentSplit) {

				String[] fileSplit = s.split(":");

				files.put(fileSplit[0], fileSplit[1]);

			}
		}

		public String getName() {
			return name;
		}

		public String getType() {
			return type;
		}

		public Set<String> getFiles() {
			return files.keySet();
		}

		public String getAuthor(String filename) {
			return files.get(filename);
		}

	}

}
