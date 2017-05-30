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

import org.epsilonlabs.workflow.execution.EventualDataProvider;
import org.epsilonlabs.workflow.execution.EventualDataset;

/**
 * Coordinator of a @GithubEventualDataset observable, providing the appropriate
 * one on request and emiting relevant data when it receives it from Github. A
 * new @GithubExecutor should be created for each call as it only manages
 * one @GithubEventualDataset at a time.
 * 
 * @author kb
 *
 */
public class GithubExecutor implements EventualDataProvider {

	enum FILTERS {
		FILETBYFILEEXTENSION, FILTERBYNAME
	}

	enum DATATYPES {
		REPOSITORIES, FILES, AUTHORS
	}

	protected EventualDataset<Object> ds;

	public GithubExecutor() {

		// ...

	}

	public EventualDataset<Object> getRepositoriesByFileExtension(Collection<String> exts) {
		// TODO dataset likely specific to return type (in this case dataset of
		// repos?)
		return ds = new GithubEventualDataset<Object>();
	}

	public EventualDataset<Object> getFilesWithFileExtension(String repo, Collection<String> exts) {
		// TODO dataset likely specific to return type (in this case dataset of
		// files?)
		return ds = new GithubEventualDataset<Object>();
	}

	public EventualDataset<Object> getAuthors(String file) {
		// TODO dataset likely specific to return type (in this case dataset of
		// authors?)
		return ds = new GithubEventualDataset<Object>();
	}

	//
	public void stubRetrieveRepositoriesByFileExtension(String ext) {
		System.out.println("(StubResilientGithubWrapper) providing repository containing " + ext + " files...");

		ds.notifyAndProvideData(((Object) ("repoOf:" + ext)));
	}

	//
	public void stubRetrieveAuthorFromFile(String file) {
		System.out.println("(StubResilientGithubWrapper) providing author of " + file + " files...");

		ds.notifyAndProvideData("authorOf:" + file);

	}

	//
	public void stubRetrieveFilesInRepo(String repo) {
		System.out.println("(StubResilientGithubWrapper) providing actual files of " + repo + " repository...");

		ds.notifyAndProvideData("fileOf:" + repo);

	}

	//
	public void stubDenoteCompletion() {
		ds.notifySuccess();
	}

}
