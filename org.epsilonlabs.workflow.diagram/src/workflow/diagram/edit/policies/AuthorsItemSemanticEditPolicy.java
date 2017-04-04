/*
* 
*/
package workflow.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import workflow.diagram.edit.commands.DataManipulationSourcesCreateCommand;
import workflow.diagram.edit.commands.DataManipulationSourcesReorientCommand;
import workflow.diagram.edit.commands.DataRetrievalSourcesCreateCommand;
import workflow.diagram.edit.commands.DataRetrievalSourcesReorientCommand;
import workflow.diagram.edit.commands.DataSourceRetrievalsCreateCommand;
import workflow.diagram.edit.commands.DataSourceRetrievalsReorientCommand;
import workflow.diagram.edit.parts.DataManipulationSourcesEditPart;
import workflow.diagram.edit.parts.DataRetrievalSourcesEditPart;
import workflow.diagram.edit.parts.DataSourceRetrievalsEditPart;
import workflow.diagram.part.WorkflowVisualIDRegistry;
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class AuthorsItemSemanticEditPolicy extends WorkflowBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AuthorsItemSemanticEditPolicy() {
		super(WorkflowElementTypes.Authors_2005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (WorkflowVisualIDRegistry.getVisualID(incomingLink) == DataSourceRetrievalsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WorkflowVisualIDRegistry.getVisualID(incomingLink) == DataManipulationSourcesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (WorkflowVisualIDRegistry.getVisualID(outgoingLink) == DataRetrievalSourcesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (WorkflowElementTypes.DataSourceRetrievals_4001 == req.getElementType()) {
			return null;
		}
		if (WorkflowElementTypes.DataRetrievalSources_4002 == req.getElementType()) {
			return getGEFWrapper(new DataRetrievalSourcesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (WorkflowElementTypes.DataManipulationSources_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (WorkflowElementTypes.DataSourceRetrievals_4001 == req.getElementType()) {
			return getGEFWrapper(new DataSourceRetrievalsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (WorkflowElementTypes.DataRetrievalSources_4002 == req.getElementType()) {
			return null;
		}
		if (WorkflowElementTypes.DataManipulationSources_4003 == req.getElementType()) {
			return getGEFWrapper(new DataManipulationSourcesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DataSourceRetrievalsEditPart.VISUAL_ID:
			return getGEFWrapper(new DataSourceRetrievalsReorientCommand(req));
		case DataRetrievalSourcesEditPart.VISUAL_ID:
			return getGEFWrapper(new DataRetrievalSourcesReorientCommand(req));
		case DataManipulationSourcesEditPart.VISUAL_ID:
			return getGEFWrapper(new DataManipulationSourcesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
