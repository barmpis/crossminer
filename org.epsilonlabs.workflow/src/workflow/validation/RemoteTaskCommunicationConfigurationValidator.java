/**
 *
 * $Id$
 */
package workflow.validation;

import workflow.QueuePersistanceOptions;

/**
 * A sample validator interface for {@link workflow.RemoteTaskCommunicationConfiguration}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RemoteTaskCommunicationConfigurationValidator {
	boolean validate();

	boolean validateAddress(String value);
	boolean validatePort(int value);
	boolean validateSingleQueue(boolean value);
	boolean validateQueuePersistance(QueuePersistanceOptions value);
}