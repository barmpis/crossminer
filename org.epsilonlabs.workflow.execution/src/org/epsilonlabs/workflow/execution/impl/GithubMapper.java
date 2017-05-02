package org.epsilonlabs.workflow.execution.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.epsilonlabs.workflow.execution.EventualDataset;
import org.epsilonlabs.workflow.execution.StreamedDataset;
import org.epsilonlabs.workflow.execution.StreamedEventualDataMapper;

public class GithubMapper extends GithubExecutor implements StreamedEventualDataMapper {

	@Override
	public void consumeData(Object o) {

		// map data from incoming dataset to the new dataset
		System.out.println("(GithubMapper) consuming data: " + o);

		Map<Object, Object> ep = getExecutionParameters();
		String mapFrom = (String) ep.get("mapFrom");
		String mapTo = (String) ep.get("mapTo");

		// find any filtering parameters for mapping to
		for (Filters s : Filters.values()) {
			if (ep.containsKey(s)) {

				switch (s) {
				case filterByExt:
					performMappingUsingExtfilter(o, ep.get(Filters.filterByExt));
					break;
				case filterByName:
					// ...
					break;

				default:
					break;
				}

			}
		}

	}

	private void performMappingUsingExtfilter(Object o, Object object) {

		// STUB 

		Collection<String> ext = (Collection<String>) object;
		// ...

		List<String> newData = new LinkedList<String>();

		newData.add("file1 from repository: " + o + ", with extension " + ext);
		newData.add("file2 from repository: " + o + ", with extension " + ext);

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
