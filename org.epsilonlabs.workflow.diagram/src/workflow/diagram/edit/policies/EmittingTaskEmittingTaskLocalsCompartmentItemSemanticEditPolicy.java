/*
* 
*/
package workflow.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import workflow.diagram.edit.commands.Boolean2CreateCommand;
import workflow.diagram.edit.commands.Double2CreateCommand;
import workflow.diagram.edit.commands.Integer2CreateCommand;
import workflow.diagram.edit.commands.String2CreateCommand;
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class EmittingTaskEmittingTaskLocalsCompartmentItemSemanticEditPolicy
		extends WorkflowBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EmittingTaskEmittingTaskLocalsCompartmentItemSemanticEditPolicy() {
		super(WorkflowElementTypes.EmittingTask_2011);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkflowElementTypes.String_3001 == req.getElementType()) {
			return getGEFWrapper(new String2CreateCommand(req));
		}
		if (WorkflowElementTypes.Integer_3002 == req.getElementType()) {
			return getGEFWrapper(new Integer2CreateCommand(req));
		}
		if (WorkflowElementTypes.Boolean_3003 == req.getElementType()) {
			return getGEFWrapper(new Boolean2CreateCommand(req));
		}
		if (WorkflowElementTypes.Double_3004 == req.getElementType()) {
			return getGEFWrapper(new Double2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
