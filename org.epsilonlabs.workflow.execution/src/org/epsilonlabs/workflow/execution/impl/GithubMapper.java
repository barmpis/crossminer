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

import org.epsilonlabs.workflow.execution.WorkflowMapperNode;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

/**
 * A node responsible for producing output of a specific type (defined in
 * {@link GithubExecutor.DATATYPES}) using heterogeneous input
 * 
 * @author kb
 *
 */
public class GithubMapper extends GithubExecutor implements WorkflowMapperNode {

	private Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	private DATATYPES to = null;

	private HashMap<FILTERS, Object> config = new HashMap<>();

	public PublishSubject<Object> getRepositoriesByFileExtension() throws Exception {

		if (to == null) {
			to = DATATYPES.REPOSITORIES;
			super.getRepositoriesByFileExtension(null);
			return ds;
		} else
			throw new Exception("Tried to get repos but this executor has already been set to return: " + to);

	}

	public PublishSubject<Object> getFilesWithFileExtension(Iterable<String> exts) throws Exception {

		if (to == null) {
			to = DATATYPES.FILES;
			config.put(FILTERS.FILETBYFILEEXTENSION, exts);
			// TODO dataset likely specific to return type (in this case dataset
			// of
			// files?)
			super.getFilesWithFileExtension(null, exts);
			return ds;
		} else
			throw new Exception("Tried to get files but this executor has already been set to return: " + to);
	}

	public PublishSubject<Object> getAuthors() throws Exception {
		// TODO dataset likely specific to return type (in this case dataset of
		// authors?)
		if (to == null) {
			to = DATATYPES.AUTHORS;
			super.getAuthors(null);
			return ds;
		} else
			throw new Exception("Tried to get authors but this executor has already been set to return: " + to);
	}

	@Override
	public PublishSubject<Object> getRepositoriesByFileExtension(Iterable<String> exts) throws Exception {
		return getRepositoriesByFileExtension();
	}

	@Override
	public PublishSubject<Object> getFilesWithFileExtension(String repo, Iterable<String> exts) throws Exception {
		return getFilesWithFileExtension(exts);
	}

	@Override
	public PublishSubject<Object> getAuthors(String file) throws Exception {
		return getAuthors();
	}

	private int current = 0;

	private int period = 10;

	@Override
	public void onNext(Object o) {

		if (o instanceof Iterable<?>) {
			for (Object oo : (Iterable<?>) o)
				onNext(oo);
		}

		else {

			try {

				// map data from incoming dataset to the new dataset
				System.out.println("(GithubMapper) consuming data: " + o);

				// TODO based on the type of incoming data we chose what to map
				// from
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

			} catch (Exception e) {
				System.err.println("Error in onNext() of GithubMapper:");
				e.printStackTrace();
			}

		}

		current++;
		if (current % period == 0)
			notifyObserversOfStatusChange("processed " + current + " elements");

	}

	private void mapFromRepositories(Object o) throws Exception {

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

	private void mapFromFiles(Object o) throws Exception {

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

	private void mapToFiles(DATATYPES source, Object o) throws Exception {

		// find if any relevant filters for the target datatype (in this case
		// files) are defined
		Iterable<String> ext = (Iterable<String>) config.get(FILTERS.FILETBYFILEEXTENSION);
		Iterable<String> names = (Iterable<String>) config.get(FILTERS.FILTERBYNAME);

		//
		GithubExecutor ex = new GithubExecutor();
		Observable<Object> files = ex.getFilesWithFileExtension(o.toString(), ext);

		files.subscribe(ds);

		// STUB (would use info on name or extension here to guide the search)
		ex.stubRetrieveFilesInRepo(o.toString());

	}

	private void mapToAuthors(DATATYPES source, Object o) throws Exception {

		// find if any relevant filters for the target datatype (in this case
		// authors) are defined
		Iterable<String> names = (Iterable<String>) config.get(FILTERS.FILTERBYNAME);

		//
		GithubExecutor ex = new GithubExecutor();
		Observable<Object> authors = ex.getAuthors(o.toString());

		authors.subscribe(ds);

		// STUB (would use info on name or extension here to guide the search)
		ex.stubRetrieveAuthorFromFile(o.toString());

	}

	@Override
	public void onSubscribe(Disposable d) {
		//
	}

	@Override
	public void onError(Throwable e) {
		e.printStackTrace();
		notifyObserversOfStatusChange("task error:\n" + e.getStackTrace());
	}

	@Override
	public void onComplete() {
		ds.onComplete();
		notifyObserversOfStatusChange("task complete");
	}

	// TODO to be replaced by typing the objects to appropriate java types
	// (repo/file/author etc.)
	private DATATYPES getDatatypeFromObject(Object o) {

		String object = o.toString();

		String type = object.substring(0, object.indexOf("#")).substring(0, object.indexOf("~"));

		switch (type) {
		case "repo":
			return DATATYPES.REPOSITORIES;
		case "file":
			return DATATYPES.FILES;

		case "author":
			return DATATYPES.AUTHORS;

		default:
			return null;
		}

	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
