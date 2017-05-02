package org.epsilonlabs.workflow.execution.impl;

import java.util.LinkedList;
import java.util.List;

import org.epsilonlabs.workflow.execution.EventualDataConsumer;
import org.epsilonlabs.workflow.execution.StreamedDataset;
import org.epsilonlabs.workflow.execution.StreamedEventualDataConsumer;

/**
 * A dataset representing data which will be collected at some point, and notify
 * relevant parties when this is done.
 * 
 * @author kb
 *
 */
public class GithubEventualDataset implements StreamedDataset {

	private List<EventualDataConsumer> subscribers = new LinkedList<EventualDataConsumer>();

	public void subscribe(EventualDataConsumer c) {
		subscribers.add(c);
	}

	public void notifyAndProvideData(Object o) {
		for (EventualDataConsumer c : subscribers)
			c.consumeData(o);
	}

	public void notifyFailure() {
	}

	public void notifySuccess() {
		for (EventualDataConsumer c : subscribers)
			if (c instanceof StreamedEventualDataConsumer)
				((StreamedEventualDataConsumer) c).endOfStream();
	}

}
