package org.epsilonlabs.workflow.execution.impl;

import java.util.Collection;

import org.epsilonlabs.workflow.execution.WorkflowConsumerNode;
import org.ossmeter.platform.delta.bugtrackingsystem.BugTrackingSystemComment;
import org.ossmeter.repository.model.BugTrackingSystem;
import org.ossmeter.repository.model.bts.bugzilla.Bugzilla;
import org.ossmeter.sentimentclassifier.opennlptartarus.libsvm.ClassificationInstance;
import org.ossmeter.sentimentclassifier.opennlptartarus.libsvm.Classifier;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class SentimentAnalysisTask implements WorkflowConsumerNode {

	@Override
	public void onSubscribe(Disposable d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onNext(Object t) {

		BugTrackingSystemComment c = (BugTrackingSystemComment) t;
		BugTrackingSystem b = new Bugzilla();

		Classifier cl = new Classifier();

		ClassificationInstance classificationInstance = prepareBugTrackerCommentInstance(b, c);
		cl.add(classificationInstance);

		cl.classify();

		System.out.println(">" + cl.getClassificationResult(classificationInstance));

	}

	@Override
	public void onError(Throwable e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void subscribe(Observer<? super Object> observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		// TODO Auto-generated method stub
		return null;
	}

	private ClassificationInstance prepareBugTrackerCommentInstance(BugTrackingSystem bugTracker,
			BugTrackingSystemComment comment) {
		ClassificationInstance classificationInstance = new ClassificationInstance();
		classificationInstance.setBugTrackerId(bugTracker.getOSSMeterId());
		classificationInstance.setBugId(comment.getBugId());
		classificationInstance.setCommentId(comment.getCommentId());
		classificationInstance.setText(comment.getText());
		return classificationInstance;
	}

}
