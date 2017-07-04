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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

import org.epsilonlabs.workflow.execution.WorkflowProviderNode;

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

	private Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	protected PublishSubject<Repo> dsr = null;
	protected PublishSubject<Author> dsa = null;
	protected PublishSubject<File> dsf = null;

	public GithubClient() {

		// ...

	}

	public class Repo {

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

		public boolean equals(Object o) {
			if (!(o instanceof Repo))
				return false;
			return (this.getName() + "#" + this.getType()).equals(((Repo) o).getName() + "#" + ((Repo) o).getType());
		}

	}

	public class File {

		public File(String f, String repo) {
			// TODO Auto-generated constructor stub
		}
	}

	public class Author {

		public Author(String author, String file) {
			// TODO Auto-generated constructor stub
		}
	}

	public PublishSubject<Repo> getRepositoriesByFileExtension(Iterable<String> exts) throws Exception {
		// TODO dataset likely specific to return type (in this case dataset of
		// repos?)
		try {
			if (dsr == null) {

				return dsr = PublishSubject.create();

			} else
				throw new Exception("Tried to get repos but this executor has already been initialised");
		} finally {
			notifyObserversOfStatusChange("providing data: getRepositoriesByFileExtension");
		}
	}

	public PublishSubject<File> getFilesWithFileExtension(String repo, Iterable<String> exts) throws Exception {
		// TODO dataset likely specific to return type (in this case dataset of
		// files?)
		try {
			if (dsf == null) {

				return dsf = PublishSubject.create();

			} else
				throw new Exception("Tried to get files but this executor has already been initialised");
		} finally {
			notifyObserversOfStatusChange("providing data: getFilesWithFileExtension");
		}
	}

	public PublishSubject<Author> getAuthors(String file) throws Exception {
		// TODO dataset likely specific to return type (in this case dataset of
		// authors?)
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
	public void stubRetrieveRepositoriesByFileExtension(String ext) {
		System.out.println("(StubResilientGithubWrapper) providing repository containing " + ext + " files...");

		LinkedList<Repo> data = StubGithubData.getSingle().getData();

		for (Repo repo : data)
			if (repo.getType().equals(ext))
				dsr.onNext(repo);
	}

	//
	public void stubRetrieveAuthorFromFile(String file) {
		System.out.println("(StubResilientGithubWrapper) providing author of " + file + " files...");

		LinkedList<Repo> data = StubGithubData.getSingle().getData();

		for (Repo repo : data)
			for (String f : repo.getFiles())
				if (f.equals(file.substring(0, file.indexOf("#"))))
					dsa.onNext(new Author(repo.getAuthor(f), file));

	}

	//
	public void stubRetrieveFilesInRepo(String repo) {
		System.out.println("(StubResilientGithubWrapper) providing actual files of " + repo + " repository...");

		LinkedList<Repo> data = StubGithubData.getSingle().getData();

		for (Repo r : data)
			if (r.getName().equals(repo.substring(0, repo.indexOf("#"))))
				for (String f : r.getFiles())
					dsf.onNext(new File(f, repo));

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
