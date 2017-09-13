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

import workflow.diagram.edit.commands.BooleanCreateCommand;
import workflow.diagram.edit.commands.DoubleCreateCommand;
import workflow.diagram.edit.commands.EmittingTaskCreateCommand;
import workflow.diagram.edit.commands.IntegerCreateCommand;
import workflow.diagram.edit.commands.StringCreateCommand;
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
		if (WorkflowElementTypes.EmittingTask_2011 == req.getElementType()) {
			return getGEFWrapper(new EmittingTaskCreateCommand(req));
		}
		if (WorkflowElementTypes.String_2012 == req.getElementType()) {
			return getGEFWrapper(new StringCreateCommand(req));
		}
		if (WorkflowElementTypes.Integer_2013 == req.getElementType()) {
			return getGEFWrapper(new IntegerCreateCommand(req));
		}
		if (WorkflowElementTypes.Boolean_2014 == req.getElementType()) {
			return getGEFWrapper(new BooleanCreateCommand(req));
		}
		if (WorkflowElementTypes.Double_2015 == req.getElementType()) {
			return getGEFWrapper(new DoubleCreateCommand(req));
		}
		if (WorkflowElementTypes.Task_2016 == req.getElementType()) {
			return getGEFWrapper(new TaskCreateCommand(req));
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
