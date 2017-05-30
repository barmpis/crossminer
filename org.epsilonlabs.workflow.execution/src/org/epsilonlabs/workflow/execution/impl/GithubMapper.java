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

import org.epsilonlabs.workflow.execution.EventualDataMapper;
import org.epsilonlabs.workflow.execution.EventualDataset;

import io.reactivex.disposables.Disposable;

public class GithubMapper extends GithubExecutor implements EventualDataMapper {

	// this observable will never emit any items, it is merged lazily with the
	// observables created by the mapping operations
	private EventualDataset<Object> out = null;

	private DATATYPES to;

	private HashMap<FILTERS, Object> config = new HashMap<>();

	public EventualDataset<Object> getRepositoriesByFileExtension() {

		to = DATATYPES.REPOSITORIES;
		out = super.getRepositoriesByFileExtension(null);
		return out;
	}

	public EventualDataset<Object> getFilesWithFileExtension(Collection<String> exts) {

		to = DATATYPES.FILES;
		config.put(FILTERS.FILETBYFILEEXTENSION, exts);
		// TODO dataset likely specific to return type (in this case dataset of
		// files?)
		out = super.getFilesWithFileExtension(null, exts);
		return out;
	}

	public EventualDataset<Object> getAuthors() {
		// TODO dataset likely specific to return type (in this case dataset of
		// authors?)
		to = DATATYPES.AUTHORS;
		out = super.getAuthors(null);
		return out;
	}

	@Override
	public EventualDataset<Object> getRepositoriesByFileExtension(Collection<String> exts) {
		return getRepositoriesByFileExtension();
	}

	@Override
	public EventualDataset<Object> getFilesWithFileExtension(String repo, Collection<String> exts) {
		return getFilesWithFileExtension(exts);
	}

	@Override
	public EventualDataset<Object> getAuthors(String file) {
		return getAuthors();
	}

	@Override
	public void onNext(Object o) {

		if (o instanceof Iterable<?>) {
			for (Object oo : (Iterable<?>) o)
				onNext(oo);
		}

		else {

			// map data from incoming dataset to the new dataset
			System.out.println("(GithubMapper) consuming data: " + o);

			// TODO based on the type of incoming data we chose what to map from
			// -- this will use the java type of the object eventually
			DATATYPES from = getDatatypeFromObject(o);

			switch (from) {
			case REPOSITORIES:
				mapFromRepositories(o);
				break;
			case FILES:
				mapFromFiles(o);
				break;
			case AUTHORS:
				// mapFromAuthors(o);
				break;

			}
		}

	}

	private void mapFromRepositories(Object o) {

		switch (to) {

		case FILES:
			mapToFiles(DATATYPES.REPOSITORIES, o);
			break;
		case AUTHORS:
			// mapToAuthors(DATATYPES.REPOSITORIES, o);
			break;
		case REPOSITORIES:
			// mapToRepositories(DATATYPES.REPOSITORIES, o);
			break;

		}

	}

	private void mapFromFiles(Object o) {

		switch (to) {

		case FILES:
			mapToFiles(DATATYPES.REPOSITORIES, o);
			break;
		case AUTHORS:
			mapToAuthors(DATATYPES.REPOSITORIES, o);
			break;
		case REPOSITORIES:
			// mapToRepositories(DATATYPES.REPOSITORIES, o);
			break;

		}

	}

	private void mapToFiles(DATATYPES source, Object o) {

		// find if any relevant filters for the target datatype (in this case
		// files) are defined
		Collection<String> ext = (Collection<String>) config.get(FILTERS.FILETBYFILEEXTENSION);
		Collection<String> names = (Collection<String>) config.get(FILTERS.FILTERBYNAME);

		//
		GithubExecutor ex = new GithubExecutor();
		EventualDataset<Object> files = ex.getFilesWithFileExtension(o.toString(), ext);

		files.mergeStateful(out);
		out = files;

		// STUB (would use info on name or extension here to guide the search)
		ex.stubRetrieveFilesInRepo(o.toString());

	}

	private void mapToAuthors(DATATYPES source, Object o) {

		// find if any relevant filters for the target datatype (in this case
		// authors) are defined
		Collection<String> names = (Collection<String>) config.get(FILTERS.FILTERBYNAME);

		//
		GithubExecutor ex = new GithubExecutor();
		EventualDataset<Object> authors = ex.getAuthors(o.toString());

		authors.mergeStateful(out);
		out = authors;

		// STUB (would use info on name or extension here to guide the search)
		ex.stubRetrieveAuthorFromFile(o.toString());

	}

	@Override
	public void onSubscribe(Disposable d) {
		System.out.println("disposing of:" + d + " as it is unsubscribing.");
		d.dispose();
	}

	@Override
	public void onError(Throwable e) {
		e.printStackTrace();
	}

	@Override
	public void onComplete() {
		ds.notifySuccess();
	}

	// TODO to be replaced by typing the objects to appropriate java types
	// (repo/file/author etc.)
	private DATATYPES getDatatypeFromObject(Object o) {

		String object = o.toString();

		String type = object.substring(0, object.indexOf(":"));

		switch (type) {
		case "repoOf":
			return DATATYPES.REPOSITORIES;
		case "fileOf":
			return DATATYPES.FILES;

		case "authorOf":
			return DATATYPES.AUTHORS;

		default:
			return null;
		}

	}

}
