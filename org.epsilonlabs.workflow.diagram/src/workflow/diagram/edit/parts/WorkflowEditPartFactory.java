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

			case EmittingTaskEditPart.VISUAL_ID:
				return new EmittingTaskEditPart(view);

			case EmittingTaskNameEditPart.VISUAL_ID:
				return new EmittingTaskNameEditPart(view);

			case EmittingTaskConcurrencyEditPart.VISUAL_ID:
				return new EmittingTaskConcurrencyEditPart(view);

			case EmittingTaskImplementationFullyQualEditPart.VISUAL_ID:
				return new EmittingTaskImplementationFullyQualEditPart(view);

			case EmittingTaskImplementationEntryPoinEditPart.VISUAL_ID:
				return new EmittingTaskImplementationEntryPoinEditPart(view);

			case EmittingTaskAcceptsPartialDataEditPart.VISUAL_ID:
				return new EmittingTaskAcceptsPartialDataEditPart(view);

			case EmittingTaskProvidesPartialDataEditPart.VISUAL_ID:
				return new EmittingTaskProvidesPartialDataEditPart(view);

			case StringEditPart.VISUAL_ID:
				return new StringEditPart(view);

			case StringNameEditPart.VISUAL_ID:
				return new StringNameEditPart(view);

			case StringValueEditPart.VISUAL_ID:
				return new StringValueEditPart(view);

			case IntegerEditPart.VISUAL_ID:
				return new IntegerEditPart(view);

			case IntegerNameEditPart.VISUAL_ID:
				return new IntegerNameEditPart(view);

			case IntegerValueEditPart.VISUAL_ID:
				return new IntegerValueEditPart(view);

			case BooleanEditPart.VISUAL_ID:
				return new BooleanEditPart(view);

			case BooleanNameEditPart.VISUAL_ID:
				return new BooleanNameEditPart(view);

			case BooleanValueEditPart.VISUAL_ID:
				return new BooleanValueEditPart(view);

			case DoubleEditPart.VISUAL_ID:
				return new DoubleEditPart(view);

			case DoubleNameEditPart.VISUAL_ID:
				return new DoubleNameEditPart(view);

			case DoubleValueEditPart.VISUAL_ID:
				return new DoubleValueEditPart(view);

			case TaskEditPart.VISUAL_ID:
				return new TaskEditPart(view);

			case TaskNameEditPart.VISUAL_ID:
				return new TaskNameEditPart(view);

			case TaskConcurrencyEditPart.VISUAL_ID:
				return new TaskConcurrencyEditPart(view);

			case TaskImplementationFullyQualEditPart.VISUAL_ID:
				return new TaskImplementationFullyQualEditPart(view);

			case TaskImplementationEntryPoinEditPart.VISUAL_ID:
				return new TaskImplementationEntryPoinEditPart(view);

			case TaskAcceptsPartialDataEditPart.VISUAL_ID:
				return new TaskAcceptsPartialDataEditPart(view);

			case String2EditPart.VISUAL_ID:
				return new String2EditPart(view);

			case StringName2EditPart.VISUAL_ID:
				return new StringName2EditPart(view);

			case StringValue2EditPart.VISUAL_ID:
				return new StringValue2EditPart(view);

			case Integer2EditPart.VISUAL_ID:
				return new Integer2EditPart(view);

			case IntegerName2EditPart.VISUAL_ID:
				return new IntegerName2EditPart(view);

			case IntegerValue2EditPart.VISUAL_ID:
				return new IntegerValue2EditPart(view);

			case Boolean2EditPart.VISUAL_ID:
				return new Boolean2EditPart(view);

			case BooleanName2EditPart.VISUAL_ID:
				return new BooleanName2EditPart(view);

			case BooleanValue2EditPart.VISUAL_ID:
				return new BooleanValue2EditPart(view);

			case Double2EditPart.VISUAL_ID:
				return new Double2EditPart(view);

			case DoubleName2EditPart.VISUAL_ID:
				return new DoubleName2EditPart(view);

			case DoubleValue2EditPart.VISUAL_ID:
				return new DoubleValue2EditPart(view);

			case EmittingTaskEmittingTaskLocalsCompartmentEditPart.VISUAL_ID:
				return new EmittingTaskEmittingTaskLocalsCompartmentEditPart(view);

			case TaskTaskLocalsCompartmentEditPart.VISUAL_ID:
				return new TaskTaskLocalsCompartmentEditPart(view);

			case RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID:
				return new RemoteTaskCommunicationConfigurationEditPart(view);

			case RemoteTaskCommunicationConfigurationAddressPortSingleQueueQEditPart.VISUAL_ID:
				return new RemoteTaskCommunicationConfigurationAddressPortSingleQueueQEditPart(view);

			case TaskCommunicationConfigurationEditPart.VISUAL_ID:
				return new TaskCommunicationConfigurationEditPart(view);

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
