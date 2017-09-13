/*
* 
*/
package workflow.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import workflow.Workflow;
import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.Boolean2EditPart;
import workflow.diagram.edit.parts.BooleanEditPart;
import workflow.diagram.edit.parts.BooleanName2EditPart;
import workflow.diagram.edit.parts.BooleanNameEditPart;
import workflow.diagram.edit.parts.BooleanValue2EditPart;
import workflow.diagram.edit.parts.BooleanValueEditPart;
import workflow.diagram.edit.parts.Double2EditPart;
import workflow.diagram.edit.parts.DoubleEditPart;
import workflow.diagram.edit.parts.DoubleName2EditPart;
import workflow.diagram.edit.parts.DoubleNameEditPart;
import workflow.diagram.edit.parts.DoubleValue2EditPart;
import workflow.diagram.edit.parts.DoubleValueEditPart;
import workflow.diagram.edit.parts.EmittingTaskAcceptsPartialDataEditPart;
import workflow.diagram.edit.parts.EmittingTaskConcurrencyEditPart;
import workflow.diagram.edit.parts.EmittingTaskEditPart;
import workflow.diagram.edit.parts.EmittingTaskEmittingTaskLocalsCompartmentEditPart;
import workflow.diagram.edit.parts.EmittingTaskImplementationEntryPoinEditPart;
import workflow.diagram.edit.parts.EmittingTaskImplementationFullyQualEditPart;
import workflow.diagram.edit.parts.EmittingTaskNameEditPart;
import workflow.diagram.edit.parts.EmittingTaskProvidesPartialDataEditPart;
import workflow.diagram.edit.parts.Integer2EditPart;
import workflow.diagram.edit.parts.IntegerEditPart;
import workflow.diagram.edit.parts.IntegerName2EditPart;
import workflow.diagram.edit.parts.IntegerNameEditPart;
import workflow.diagram.edit.parts.IntegerValue2EditPart;
import workflow.diagram.edit.parts.IntegerValueEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationAddressEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationAddressPortSingleQueueEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationAddressPortSingleQueueQEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationPortEditPart;
import workflow.diagram.edit.parts.String2EditPart;
import workflow.diagram.edit.parts.StringEditPart;
import workflow.diagram.edit.parts.StringName2EditPart;
import workflow.diagram.edit.parts.StringNameEditPart;
import workflow.diagram.edit.parts.StringValue2EditPart;
import workflow.diagram.edit.parts.StringValueEditPart;
import workflow.diagram.edit.parts.TaskAcceptsPartialDataEditPart;
import workflow.diagram.edit.parts.TaskCommunicationConfigurationEditPart;
import workflow.diagram.edit.parts.TaskConcurrencyEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.edit.parts.TaskImplementationEntryPoinEditPart;
import workflow.diagram.edit.parts.TaskImplementationFullyQualEditPart;
import workflow.diagram.edit.parts.TaskNameEditPart;
import workflow.diagram.edit.parts.TaskTaskLocalsCompartmentEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WorkflowVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.epsilonlabs.workflow.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WorkflowEditPart.MODEL_ID.equals(view.getType())) {
				return WorkflowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return workflow.diagram.part.WorkflowVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				WorkflowDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WorkflowPackage.eINSTANCE.getWorkflow().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Workflow) domainElement)) {
			return WorkflowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = workflow.diagram.part.WorkflowVisualIDRegistry.getModelID(containerView);
		if (!WorkflowEditPart.MODEL_ID.equals(containerModelID) && !"workflow".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (WorkflowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = workflow.diagram.part.WorkflowVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkflowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WorkflowEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getEmittingTask().isSuperTypeOf(domainElement.eClass())) {
				return EmittingTaskEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getString().isSuperTypeOf(domainElement.eClass())) {
				return StringEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getInteger().isSuperTypeOf(domainElement.eClass())) {
				return IntegerEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getBoolean().isSuperTypeOf(domainElement.eClass())) {
				return BooleanEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getDouble().isSuperTypeOf(domainElement.eClass())) {
				return DoubleEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getTask().isSuperTypeOf(domainElement.eClass())) {
				return TaskEditPart.VISUAL_ID;
			}
			break;
		case EmittingTaskEmittingTaskLocalsCompartmentEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getString().isSuperTypeOf(domainElement.eClass())) {
				return String2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getInteger().isSuperTypeOf(domainElement.eClass())) {
				return Integer2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getBoolean().isSuperTypeOf(domainElement.eClass())) {
				return Boolean2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getDouble().isSuperTypeOf(domainElement.eClass())) {
				return Double2EditPart.VISUAL_ID;
			}
			break;
		case TaskTaskLocalsCompartmentEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getString().isSuperTypeOf(domainElement.eClass())) {
				return String2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getInteger().isSuperTypeOf(domainElement.eClass())) {
				return Integer2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getBoolean().isSuperTypeOf(domainElement.eClass())) {
				return Boolean2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getDouble().isSuperTypeOf(domainElement.eClass())) {
				return Double2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = workflow.diagram.part.WorkflowVisualIDRegistry.getModelID(containerView);
		if (!WorkflowEditPart.MODEL_ID.equals(containerModelID) && !"workflow".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (WorkflowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = workflow.diagram.part.WorkflowVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkflowEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WorkflowEditPart.VISUAL_ID:
			if (EmittingTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StringEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IntegerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BooleanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DoubleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EmittingTaskEditPart.VISUAL_ID:
			if (EmittingTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmittingTaskConcurrencyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmittingTaskImplementationFullyQualEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmittingTaskImplementationEntryPoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmittingTaskAcceptsPartialDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmittingTaskProvidesPartialDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmittingTaskEmittingTaskLocalsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StringEditPart.VISUAL_ID:
			if (StringNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StringValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IntegerEditPart.VISUAL_ID:
			if (IntegerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IntegerValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BooleanEditPart.VISUAL_ID:
			if (BooleanNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BooleanValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DoubleEditPart.VISUAL_ID:
			if (DoubleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DoubleValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskEditPart.VISUAL_ID:
			if (TaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskConcurrencyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskImplementationFullyQualEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskImplementationEntryPoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskAcceptsPartialDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskTaskLocalsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case String2EditPart.VISUAL_ID:
			if (StringName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StringValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Integer2EditPart.VISUAL_ID:
			if (IntegerName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IntegerValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Boolean2EditPart.VISUAL_ID:
			if (BooleanName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BooleanValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Double2EditPart.VISUAL_ID:
			if (DoubleName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DoubleValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EmittingTaskEmittingTaskLocalsCompartmentEditPart.VISUAL_ID:
			if (String2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Integer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Boolean2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Double2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskTaskLocalsCompartmentEditPart.VISUAL_ID:
			if (String2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Integer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Boolean2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Double2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID:
			if (RemoteTaskCommunicationConfigurationAddressPortSingleQueueQEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WorkflowPackage.eINSTANCE.getRemoteTaskCommunicationConfiguration().isSuperTypeOf(domainElement.eClass())) {
			return RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID;
		}
		if (WorkflowPackage.eINSTANCE.getTaskCommunicationConfiguration().isSuperTypeOf(domainElement.eClass())) {
			return TaskCommunicationConfigurationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Workflow element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case EmittingTaskEmittingTaskLocalsCompartmentEditPart.VISUAL_ID:
		case TaskTaskLocalsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WorkflowEditPart.VISUAL_ID:
			return false;
		case StringEditPart.VISUAL_ID:
		case IntegerEditPart.VISUAL_ID:
		case BooleanEditPart.VISUAL_ID:
		case DoubleEditPart.VISUAL_ID:
		case String2EditPart.VISUAL_ID:
		case Integer2EditPart.VISUAL_ID:
		case Boolean2EditPart.VISUAL_ID:
		case Double2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
