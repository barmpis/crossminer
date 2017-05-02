package org.epsilonlabs.workflow.execution.impl;

import org.epsilonlabs.workflow.execution.EventualDataConsumer;
import org.epsilonlabs.workflow.execution.EventualDataset;

/**
 * Consumer of EventualData
 * 
 * @author kb
 *
 */
public class ConsoleOutput implements EventualDataConsumer {

	public void addDataset(EventualDataset e) {
		e.subscribe(this);
	}

	public void consumeData(Object o) {
		System.out.println(o);
	}

}
