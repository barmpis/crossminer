package org.epsilonlabs.workflow.execution.impl;

import org.epsilonlabs.workflow.execution.EventualDataset;
import org.epsilonlabs.workflow.execution.StreamedEventualDataConsumer;

/**
 * Consumer of EventualData
 * 
 * @author kb
 *
 */
public class ConsoleOutput implements StreamedEventualDataConsumer {

	public void addDataset(EventualDataset e) {
		e.subscribe(this);
	}

	public void consumeData(Object o) {

		if (o instanceof Iterable<?>)
			for (Object oo : (Iterable<?>) o) {
				System.out.println(">>> " + oo);
			}
		else
			System.out.println(">>> " + o);
	}

	@Override
	public void endOfStream() {
		System.out.println("DATA STREAM ENDED");
	}

}
