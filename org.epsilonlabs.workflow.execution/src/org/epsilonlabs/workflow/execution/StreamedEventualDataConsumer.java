package org.epsilonlabs.workflow.execution;

/**
 * Consumer of EventualData
 * 
 * @author kb
 *
 */
public interface StreamedEventualDataConsumer extends EventualDataConsumer {

	/**
	 * The consumeData() method of this consumer can be called multiple times,
	 * once for each patrial data provision,until this method is called --
	 * denoting the end of stream.
	 */
	public void endOfStream();

}
