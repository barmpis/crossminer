/*
* 
*/
package workflow.diagram.edit.policies;

import java.util.Iterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import workflow.diagram.edit.commands.CommunicationChannelIncomingCreateCommand;
import workflow.diagram.edit.commands.CommunicationChannelIncomingReorientCommand;
import workflow.diagram.edit.commands.TaskIncomingCreateCommand;
import workflow.diagram.edit.commands.TaskIncomingReorientCommand;
import workflow.diagram.edit.parts.CommunicationChannelCommunicationChannelTypeCompartmentEditPart;
import workflow.diagram.edit.parts.CommunicationChannelIncomingEditPart;
import workflow.diagram.edit.parts.DataStructure2EditPart;
import workflow.diagram.edit.parts.TaskIncomingEditPart;
import workflow.diagram.part.WorkflowVisualIDRegistry;
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class CommunicationChannelItemSemanticEditPolicy extends WorkflowBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CommunicationChannelItemSemanticEditPolicy() {
		super(WorkflowElementTypes.CommunicationChannel_2021);
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
			if (WorkflowVisualIDRegistry.getVisualID(incomingLink) == TaskIncomingEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (WorkflowVisualIDRegistry.getVisualID(outgoingLink) == CommunicationChannelIncomingEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (WorkflowVisualIDRegistry.getVisualID(node)) {
			case CommunicationChannelCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (WorkflowVisualIDRegistry.getVisualID(cnode)) {
					case DataStructure2EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (WorkflowElementTypes.TaskIncoming_4001 == req.getElementType()) {
			return null;
		}
		if (WorkflowElementTypes.CommunicationChannelIncoming_4002 == req.getElementType()) {
			return getGEFWrapper(new CommunicationChannelIncomingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (WorkflowElementTypes.TaskIncoming_4001 == req.getElementType()) {
			return getGEFWrapper(new TaskIncomingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (WorkflowElementTypes.CommunicationChannelIncoming_4002 == req.getElementType()) {
			return null;
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
		case TaskIncomingEditPart.VISUAL_ID:
			return getGEFWrapper(new TaskIncomingReorientCommand(req));
		case CommunicationChannelIncomingEditPart.VISUAL_ID:
			return getGEFWrapper(new CommunicationChannelIncomingReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
