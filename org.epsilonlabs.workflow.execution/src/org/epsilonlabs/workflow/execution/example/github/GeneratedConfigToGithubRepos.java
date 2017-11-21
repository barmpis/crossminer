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
package org.epsilonlabs.workflow.execution.example.github;

import java.util.Collection;
import java.util.LinkedList;

import org.epsilonlabs.workflow.execution.WorkflowProcessingNode;
import org.epsilonlabs.workflow.execution.github.GithubClient;
import org.epsilonlabs.workflow.execution.github.GithubClient.Repo;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class GeneratedConfigToGithubRepos implements WorkflowProcessingNode {

	protected PublishSubject<Repo> repoObs = PublishSubject.create();
	protected Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	private int current = 0;

	private int period = 10;

	public Observable<Repo> repos() {
		return repoObs;
	}

	@Override
	public void onNext(Object o) {

		if (o instanceof Iterable<?>) {
			for (Object oo : (Iterable<?>) o)
				onNext(oo);
		}

		else {

			try {

				GithubClient client = new GithubClient();
				Observable<Repo> repos = client.getRepositoriesByFileExtension(o.toString());

				repos.subscribe(repoObs);

				System.out
						.println("GeneratedConfigToGithubRepos created GithubClient for getting repos with ext: " + o);
				// XXX add client to registry for stub execution -- remove for
				// production
				StubExecutionCoordinator.getActiveRepoClients().add(client);
				//

			} catch (Exception e) {
				System.err.println("Error in onNext() of GeneratedConfigToGithubRepos:");
				e.printStackTrace();
			}

		}

		current++;
		if (current == 1 || current % period == 0)
			notifyObserversOfStatusChange("processed " + current + " config elements");

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
		repoObs.onComplete();
		notifyObserversOfStatusChange("task complete");
	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
