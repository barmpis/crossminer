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
package org.eclipse.crossmeter.workflow.execution.example.github;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.crossmeter.workflow.execution.WorkflowProviderNode;
import org.eclipse.crossmeter.workflow.execution.example.github.StubGithubData;

import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;

/**
 * Coordinator of a {@link PublishSubject} observable, providing the appropriate
 * one on request and emiting relevant data when it receives it from Github. A
 * new {@link GithubClient} should be created for each call as it only manages
 * one {@link PublishSubject} at a time (stub to real client which should manage
 * as many calls as necessary).
 * 
 * @author kb
 *
 */
public class GithubClient implements WorkflowProviderNode {

	enum FILTERS {
		FILETBYFILEEXTENSION, FILTERBYNAME
	}

	enum DATATYPES {
		REPOSITORIES, FILES, AUTHORS
	}

	protected Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	protected PublishSubject<Repo> dsr = null;
	protected PublishSubject<Author> dsa = null;
	protected PublishSubject<File> dsf = null;

	public GithubClient() {

	}

	public class Repo {

		private String name;
		private String type;
		private HashMap<String, String> files = new HashMap<>();

		public Repo(String name, String type, String contents) {

			this.name = name;
			this.type = type;

			if (contents != null && contents.length() > 0) {

				String[] contentSplit = contents.split(";");

				for (String s : contentSplit) {

					String[] fileSplit = s.split(":");

					files.put(fileSplit[0], fileSplit[1]);

				}
			}
		}

		public void addFile(String key, String value) {
			files.put(key, value);
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

		public boolean equals(Object o) {
			if (!(o instanceof Repo))
				return false;
			return (getName() + "#" + getType()).equals(((Repo) o).getName() + "#" + ((Repo) o).getType());
		}

		public String toString() {
			return getName() + "#" + getType();
		}

	}

	public class File {

		String name;
		String repo;

		public File(String name, String repo) {
			this.name = name;
			this.repo = repo;
		}

		public String toString() {
			return name + "#" + repo.toString();
		}

		public String getName() {
			return name;
		}

		public String getRepo() {
			return repo;
		}

	}

	public class Author {

		String author;
		String file;

		public Author(String author, String file) {
			this.author = author;
			this.file = file;
		}

		public String toString() {
			return author + "#" + file.toString();
		}

	}

	public String repoExt = null;

	public PublishSubject<Repo> getRepositoriesByFileExtension(String ext) throws Exception {

		repoExt = ext;
		try {
			if (dsr == null) {

				return dsr = PublishSubject.create();

			} else
				throw new Exception("Tried to get repos but this executor has already been initialised");
		} finally {
			notifyObserversOfStatusChange("providing data: getRepositoriesByFileExtension");
		}
	}

	public String repo = null;
	public String fileExt = null;

	public PublishSubject<File> getFilesWithFileExtension(String repo, String ext) throws Exception {

		this.repo = repo;
		fileExt = ext;
		try {
			if (dsf == null) {

				return dsf = PublishSubject.create();

			} else
				throw new Exception("Tried to get files but this executor has already been initialised");
		} finally {
			notifyObserversOfStatusChange("providing data: getFilesWithFileExtension");
		}
	}

	public String file = null;

	public PublishSubject<Author> getAuthors(String file) throws Exception {

		this.file = file;
		try {
			if (dsa == null) {

				return dsa = PublishSubject.create();

			} else
				throw new Exception("Tried to get authors but this executor has already been initialised");
		} finally {
			notifyObserversOfStatusChange("providing data: getAuthors");
		}
	}

	//
	public void stubRetrieveRepositoriesByFileExtension() {
		System.out.println("(StubResilientGithubWrapper) providing repository containing " + repoExt + " files...");

		LinkedList<Repo> data = StubGithubData.getSingle().getData();

		for (Repo repo : data)
			if (repo.getType().equals(repoExt)) {
				// System.err.println(repo);
				dsr.onNext(repo);
			}
	}

	//
	public void stubRetrieveFilesInRepo() {
		System.out.println("(StubResilientGithubWrapper) providing actual files of " + repo + " repository...");

		LinkedList<Repo> data = StubGithubData.getSingle().getData();

		for (Repo r : data)
			if (r.getName().equals(repo))
				for (String f : r.getFiles())
					if (f.endsWith(fileExt))
						dsf.onNext(new File(f, repo));

	}

	//
	public void stubRetrieveAuthorFromFile() {
		System.out.println("(StubResilientGithubWrapper) providing author of " + file + " files...");

		LinkedList<Repo> data = StubGithubData.getSingle().getData();

		String[] split = file.split("#");
		String repoName = split[1];
		String fileName = split[0];

		for (Repo repo : data) {
			if (repo.getName().equals(repoName)) {
				for (String f : repo.getFiles()) {
					if (f.equals(fileName))
						dsa.onNext(new Author(repo.getAuthor(f), file));
				}
			}
		}
	}

	/**
	 * inform the dataset that there is no more data to provide
	 */
	public void stubDenoteCompletion() {
		if (dsr != null)
			dsr.onComplete();
		if (dsf != null)
			dsf.onComplete();
		if (dsa != null)
			dsa.onComplete();
		notifyObserversOfStatusChange("task complete");
	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
