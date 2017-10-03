/*
* 
*/
package workflow.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import workflow.diagram.edit.commands.DataStructure2CreateCommand;
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentItemSemanticEditPolicy
		extends WorkflowBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentItemSemanticEditPolicy() {
		super(WorkflowElementTypes.RemoteCommunicationChannel_2020);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkflowElementTypes.DataStructure_3001 == req.getElementType()) {
			return getGEFWrapper(new DataStructure2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
