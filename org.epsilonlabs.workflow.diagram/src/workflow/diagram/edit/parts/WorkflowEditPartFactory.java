/*
 * 
 */
package workflow.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WorkflowVisualIDRegistry.getVisualID(view)) {

			case WorkflowEditPart.VISUAL_ID:
				return new WorkflowEditPart(view);

			case JavaTaskEditPart.VISUAL_ID:
				return new JavaTaskEditPart(view);

			case JavaTaskNameEditPart.VISUAL_ID:
				return new JavaTaskNameEditPart(view);

			case ScriptedTaskEditPart.VISUAL_ID:
				return new ScriptedTaskEditPart(view);

			case ScriptedTaskNameEditPart.VISUAL_ID:
				return new ScriptedTaskNameEditPart(view);

			case RemoteCommunicationChannelEditPart.VISUAL_ID:
				return new RemoteCommunicationChannelEditPart(view);

			case TaskEditPart.VISUAL_ID:
				return new TaskEditPart(view);

			case TaskNameEditPart.VISUAL_ID:
				return new TaskNameEditPart(view);

			case CommunicationChannelEditPart.VISUAL_ID:
				return new CommunicationChannelEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case DataStructureEditPart.VISUAL_ID:
				return new DataStructureEditPart(view);

			case DataStructureNameEditPart.VISUAL_ID:
				return new DataStructureNameEditPart(view);

			case DataStructure2EditPart.VISUAL_ID:
				return new DataStructure2EditPart(view);

			case DataStructureName2EditPart.VISUAL_ID:
				return new DataStructureName2EditPart(view);

			case RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
				return new RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart(view);

			case DataStructureDataStructureTypeCompartmentEditPart.VISUAL_ID:
				return new DataStructureDataStructureTypeCompartmentEditPart(view);

			case CommunicationChannelCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
				return new CommunicationChannelCommunicationChannelTypeCompartmentEditPart(view);

			case DataStructureDataStructureTypeCompartment2EditPart.VISUAL_ID:
				return new DataStructureDataStructureTypeCompartment2EditPart(view);

			case TaskIncomingEditPart.VISUAL_ID:
				return new TaskIncomingEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case CommunicationChannelIncomingEditPart.VISUAL_ID:
				return new CommunicationChannelIncomingEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
