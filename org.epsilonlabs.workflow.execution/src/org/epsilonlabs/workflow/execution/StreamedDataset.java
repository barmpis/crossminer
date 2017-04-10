package org.epsilonlabs.workflow.execution;

/**
 * 
 * A dataset representing data which can offer streamed results
 * 
 * @author kb
 *
 */
public interface StreamedDataset extends EventualDataset {

	/**
	 * The notifyAndProvideData() of a StreamedDataset will be called repeatedly.
	 * Calling notifySuccess() will denote that the stream has finished.
	 */
	public void notifySuccess();

}
