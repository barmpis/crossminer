package org.epsilonlabs.workflow.execution.impl;

import java.util.Collection;
import java.util.LinkedList;

import org.epsilonlabs.workflow.execution.WorkflowProviderNode;

import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;

public class BugTrackingSystemExampleProvider implements WorkflowProviderNode {

	private LinkedList<Observer<? super Object>> subs = new LinkedList<>();

	private PublishSubject<Object> data = PublishSubject.create();

	@Override
	public void subscribe(Observer<? super Object> observer) {

		subs.add(observer);

	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subs;
	}

	public PublishSubject<Object> getComments() {
		return data;
	}

	public void iHasData(Object t) {
		data.onNext(t);
	}

}
