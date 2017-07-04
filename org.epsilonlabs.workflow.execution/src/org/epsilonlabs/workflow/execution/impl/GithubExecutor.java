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
import java.util.LinkedList;

import org.epsilonlabs.workflow.execution.WorkflowProviderNode;
import org.epsilonlabs.workflow.execution.impl.GithubClient.Repo;

import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;

/**
 * Coordinator of a {@link PublishSubject} observable, providing the appropriate
 * one on request and emiting relevant data when it receives it from Github. A
 * new {@link GithubExecutor} should be created for each call as it only manages
 * one {@link PublishSubject} at a time.
 * 
 * @author kb
 *
 */
public class GithubExecutor implements WorkflowProviderNode {

	enum FILTERS {
		FILETBYFILEEXTENSION, FILTERBYNAME
	}

	enum DATATYPES {
		REPOSITORIES, FILES, AUTHORS
	}

	private Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	protected PublishSubject<Object> ds = null;

	public GithubExecutor() {

		// ...

	}

	public PublishSubject<Object> getRepositoriesByFileExtension(Iterable<String> exts) throws Exception {
		// TODO dataset likely specific to return type (in this case dataset of
		// repos?)
		try {
			if (ds == null) {

				return ds = PublishSubject.create();

			} else
				throw new Exception("Tried to get repos but this executor has already been initialised");
		} finally {
			notifyObserversOfStatusChange("providing data: getRepositoriesByFileExtension");
		}
	}

	public PublishSubject<Object> getFilesWithFileExtension(String repo, Iterable<String> exts) throws Exception {
		// TODO dataset likely specific to return type (in this case dataset of
		// files?)
		try {
			if (ds == null) {

				return ds = PublishSubject.create();

			} else
				throw new Exception("Tried to get files but this executor has already been initialised");
		} finally {
			notifyObserversOfStatusChange("providing data: getFilesWithFileExtension");
		}
	}

	public PublishSubject<Object> getAuthors(String file) throws Exception {
		// TODO dataset likely specific to return type (in this case dataset of
		// authors?)
		try {
			if (ds == null) {

				return ds = PublishSubject.create();

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
				ds.onNext(repo.getName() + "#" + repo.getType());
	}

	//
	public void stubRetrieveAuthorFromFile(String file) {
		System.out.println("(StubResilientGithubWrapper) providing author of " + file + " files...");

		LinkedList<Repo> data = StubGithubData.getSingle().getData();

		for (Repo repo : data)
			for (String f : repo.getFiles())
				if (f.equals(file.substring(0, file.indexOf("#"))))
					ds.onNext(repo.getAuthor(f) + "#" + file);

	}

	//
	public void stubRetrieveFilesInRepo(String repo) {
		System.out.println("(StubResilientGithubWrapper) providing actual files of " + repo + " repository...");

		LinkedList<Repo> data = StubGithubData.getSingle().getData();

		for (Repo r : data)
			if (r.getName().equals(repo.substring(0, repo.indexOf("#"))))
				for (String f : r.getFiles())
					ds.onNext(f + "#" + repo);

	}

	/**
	 * inform the dataset that there is no more data to provide
	 */
	public void stubDenoteCompletion() {
		ds.onComplete();
		notifyObserversOfStatusChange("task complete");
	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
