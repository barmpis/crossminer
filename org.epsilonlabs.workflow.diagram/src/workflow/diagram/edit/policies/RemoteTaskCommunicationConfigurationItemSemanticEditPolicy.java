/*
* 
*/
package workflow.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class RemoteTaskCommunicationConfigurationItemSemanticEditPolicy extends WorkflowBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RemoteTaskCommunicationConfigurationItemSemanticEditPolicy() {
		super(WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
