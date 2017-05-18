package org.epsilonlabs.workflow.execution.impl;

import org.epsilonlabs.workflow.execution.EventualDataConsumer;

import io.reactivex.disposables.Disposable;

/**
 * Consumer of EventualData
 * 
 * @author kb
 *
 */
public class ConsoleOutput implements EventualDataConsumer {

	@Override
	public void onSubscribe(Disposable d) {
		// TODO

	}

	@Override
	public void onNext(Object o) {

		if (o instanceof Iterable<?>)
			for (Object oo : (Iterable<?>) o) {
				System.out.println(">>> " + oo);

			}
		else {
			System.out.println(">>> " + o);

		}
	}

	@Override
	public void onError(Throwable e) {

		System.err.println(e);

	}

	@Override
	public void onComplete() {
		System.out.println("DATA STREAM ENDED");
	}

}
