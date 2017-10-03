/*
* 
*/
package workflow.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import workflow.diagram.edit.commands.CommunicationChannelCreateCommand;
import workflow.diagram.edit.commands.DataStructureCreateCommand;
import workflow.diagram.edit.commands.JavaTaskCreateCommand;
import workflow.diagram.edit.commands.RemoteCommunicationChannelCreateCommand;
import workflow.diagram.edit.commands.ScriptedTaskCreateCommand;
import workflow.diagram.edit.commands.TaskCreateCommand;
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class WorkflowItemSemanticEditPolicy extends WorkflowBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public WorkflowItemSemanticEditPolicy() {
		super(WorkflowElementTypes.Workflow_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkflowElementTypes.JavaTask_2017 == req.getElementType()) {
			return getGEFWrapper(new JavaTaskCreateCommand(req));
		}
		if (WorkflowElementTypes.ScriptedTask_2018 == req.getElementType()) {
			return getGEFWrapper(new ScriptedTaskCreateCommand(req));
		}
		if (WorkflowElementTypes.RemoteCommunicationChannel_2020 == req.getElementType()) {
			return getGEFWrapper(new RemoteCommunicationChannelCreateCommand(req));
		}
		if (WorkflowElementTypes.Task_2016 == req.getElementType()) {
			return getGEFWrapper(new TaskCreateCommand(req));
		}
		if (WorkflowElementTypes.CommunicationChannel_2021 == req.getElementType()) {
			return getGEFWrapper(new CommunicationChannelCreateCommand(req));
		}
		if (WorkflowElementTypes.DataStructure_2019 == req.getElementType()) {
			return getGEFWrapper(new DataStructureCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
