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
package org.eclipse.crossmeter.workflow.execution.example.github;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.crossmeter.workflow.execution.WorkflowProcessingNode;
import org.eclipse.crossmeter.workflow.execution.example.github.GithubClient.File;
import org.eclipse.crossmeter.workflow.execution.example.github.GithubClient.Repo;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class GeneratedGithubRepoToFiles implements WorkflowProcessingNode {

	protected PublishSubject<File> fileObs = PublishSubject.create();
	protected Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	private int current = 0;

	private int period = 10;

	public Observable<File> files() {
		return fileObs;
	}

	@Override
	public void onNext(Object o) {

		if (o instanceof Iterable<?>) {
			for (Object oo : (Iterable<?>) o)
				onNext(oo);
		}

		else {

			try {

				GithubClient.Repo r = (Repo) o;

				GithubClient client = new GithubClient();
				Observable<File> files = client.getFilesWithFileExtension(r.getName(), r.getType());

				files.subscribe(fileObs);

				System.out.println("GeneratedConfigToGithubFiles created GithubClient for getting files with ext: "
						+ r.getType() + ", from repo: " + r.getName());
				// XXX add client to registry for stub execution -- remove for
				// production
				StubExecutionCoordinator.getActiveFileClients().add(client);
				//

			} catch (Exception e) {
				System.err.println("Error in onNext() of GeneratedGithubRepoToFiles:");
				e.printStackTrace();
			}

		}

		current++;
		if (current == 1 || current % period == 0)
			notifyObserversOfStatusChange("processed " + current + " repo elements");

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
		fileObs.onComplete();
		notifyObserversOfStatusChange("task complete");
	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

}
