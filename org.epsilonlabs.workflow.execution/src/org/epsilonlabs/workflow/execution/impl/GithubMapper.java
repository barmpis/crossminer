package org.epsilonlabs.workflow.execution.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.epsilonlabs.workflow.execution.EventualDataMapper;
import org.epsilonlabs.workflow.execution.EventualDataset;

import io.reactivex.disposables.Disposable;

public class GithubMapper extends GithubExecutor implements EventualDataMapper {

	private DATATYPES to;

	private HashMap<FILTERS, Object> ep = new HashMap<>();

	public EventualDataset getRepositoriesByFileExtension() {

		to = DATATYPES.REPOSITORIES;
		return super.getRepositoriesByFileExtension(null);
	}

	public EventualDataset getFilesWithFileExtension(List<String> exts) {

		to = DATATYPES.FILES;
		ep.put(FILTERS.FILETBYFILEEXTENSION, exts);
		// TODO dataset likely specific to return type (in this case dataset of
		// files?)
		return super.getFilesWithFileExtension(null, exts);
	}

	public EventualDataset getAuthors() {
		// TODO dataset likely specific to return type (in this case dataset of
		// authors?)
		to = DATATYPES.AUTHORS;
		return super.getAuthors(null);
	}

	@Override
	public EventualDataset getRepositoriesByFileExtension(List<String> exts) {
		return getRepositoriesByFileExtension();
	}

	@Override
	public EventualDataset getFilesWithFileExtension(String repo, List<String> exts) {
		return getFilesWithFileExtension(exts);
	}

	@Override
	public EventualDataset getAuthors(String file) {
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
		Collection<String> ext = (Collection<String>) ep.get(FILTERS.FILETBYFILEEXTENSION);
		Collection<String> names = (Collection<String>) ep.get(FILTERS.FILTERBYNAME);

		// STUB (would use info on name or extension here to guide the search)
		stubRetrieveFilesInRepo(o.toString());
		// TODO find a way to pass the new object to the github wrapper

	}

	private void mapToAuthors(DATATYPES source, Object o) {

		// find if any relevant filters for the target datatype (in this case
		// authors) are defined
		Collection<String> names = (Collection<String>) ep.get(FILTERS.FILTERBYNAME);

		// STUB (would use info on name or extension here to guide the search)
		stubRetrieveAuthorFromFile(o.toString());
		// TODO find a way to pass the new object to the github wrapper

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
