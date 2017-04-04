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

import workflow.diagram.edit.commands.AuthorsCreateCommand;
import workflow.diagram.edit.commands.CommitsCreateCommand;
import workflow.diagram.edit.commands.CustomScriptCreateCommand;
import workflow.diagram.edit.commands.DataAggregationCreateCommand;
import workflow.diagram.edit.commands.DataFilteringCreateCommand;
import workflow.diagram.edit.commands.DataManipulationCreateCommand;
import workflow.diagram.edit.commands.FilesCreateCommand;
import workflow.diagram.edit.commands.GHTorrentCreateCommand;
import workflow.diagram.edit.commands.GithubBigQueryCreateCommand;
import workflow.diagram.edit.commands.GithubCreateCommand;
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
		if (WorkflowElementTypes.Github_2001 == req.getElementType()) {
			return getGEFWrapper(new GithubCreateCommand(req));
		}
		if (WorkflowElementTypes.GithubBigQuery_2002 == req.getElementType()) {
			return getGEFWrapper(new GithubBigQueryCreateCommand(req));
		}
		if (WorkflowElementTypes.GHTorrent_2003 == req.getElementType()) {
			return getGEFWrapper(new GHTorrentCreateCommand(req));
		}
		if (WorkflowElementTypes.Commits_2004 == req.getElementType()) {
			return getGEFWrapper(new CommitsCreateCommand(req));
		}
		if (WorkflowElementTypes.Authors_2005 == req.getElementType()) {
			return getGEFWrapper(new AuthorsCreateCommand(req));
		}
		if (WorkflowElementTypes.Files_2006 == req.getElementType()) {
			return getGEFWrapper(new FilesCreateCommand(req));
		}
		if (WorkflowElementTypes.DataAggregation_2007 == req.getElementType()) {
			return getGEFWrapper(new DataAggregationCreateCommand(req));
		}
		if (WorkflowElementTypes.DataFiltering_2008 == req.getElementType()) {
			return getGEFWrapper(new DataFilteringCreateCommand(req));
		}
		if (WorkflowElementTypes.CustomScript_2009 == req.getElementType()) {
			return getGEFWrapper(new CustomScriptCreateCommand(req));
		}
		if (WorkflowElementTypes.DataManipulation_2010 == req.getElementType()) {
			return getGEFWrapper(new DataManipulationCreateCommand(req));
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
