package org.epsilonlabs.workflow.execution.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.epsilonlabs.workflow.execution.EventualDataset;
import org.epsilonlabs.workflow.execution.StreamedDataset;
import org.epsilonlabs.workflow.execution.StreamedEventualDataMapper;

public class GithubMapper extends GithubExecutor implements StreamedEventualDataMapper {

	Map<Object, Object> ep;

	@Override
	public void consumeData(Object o) {

		if (o instanceof Iterable<?>) {
			for (Object oo : (Iterable<?>) o)
				consumeData(oo);
		}

		else {

			// map data from incoming dataset to the new dataset
			System.out.println("(GithubMapper) consuming data: " + o);

			ep = getExecutionParameters();

			DATATYPES mapFrom = (DATATYPES) ep.get(MAPFROM);

			for (DATATYPES s : DATATYPES.values()) {
				if (mapFrom.equals(s)) {

					switch (s) {
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
		}

	}

	private void mapFromRepositories(Object o) {

		DATATYPES mapTo = (DATATYPES) ep.get(MAPTO);

		for (DATATYPES s : DATATYPES.values()) {
			if (mapTo.equals(s)) {

				switch (s) {

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
		}

	}

	private void mapFromFiles(Object o) {

		DATATYPES mapTo = (DATATYPES) ep.get(MAPTO);

		for (DATATYPES s : DATATYPES.values()) {
			if (mapTo.equals(s)) {

				switch (s) {

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
		}

	}

	private void mapToFiles(DATATYPES source, Object o) {

		// find if any relevant filters for the target datatype (in this case
		// files) are defined
		Collection<String> ext = (Collection<String>) ep.get(FILTERS.FILETBYFILEEXTENSION);
		Collection<String> names = (Collection<String>) ep.get(FILTERS.FILTERBYNAME);

		List<String> newData = new LinkedList<String>();

		// STUB (would use info on name or extension here to guide the search)

		newData.add(new StubResilientGithubWrapper().provideFileDataStubs(o.toString()));
		newData.add(new StubResilientGithubWrapper().provideFileDataStubs(o.toString()));

		//
		ds.notifyAndProvideData(newData);

	}

	private void mapToAuthors(DATATYPES source, Object o) {

		// find if any relevant filters for the target datatype (in this case
		// files) are defined
		Collection<String> names = (Collection<String>) ep.get(FILTERS.FILTERBYNAME);

		List<String> newData = new LinkedList<String>();

		// STUB (would use info on name or extension here to guide the search)

		newData.add(new StubResilientGithubWrapper().provideAuthorDataStubs(o.toString()));
		newData.add(new StubResilientGithubWrapper().provideAuthorDataStubs(o.toString()));

		//
		ds.notifyAndProvideData(newData);

	}

	@Override
	public void addDataset(EventualDataset e) {
		e.subscribe(this);
	}

	@Override
	public void endOfStream() {
		if (ds instanceof StreamedDataset)
			((StreamedDataset) ds).notifySuccess();
	}

}
