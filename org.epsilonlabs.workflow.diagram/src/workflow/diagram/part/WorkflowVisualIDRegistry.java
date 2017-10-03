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
import workflow.diagram.edit.parts.CommunicationChannelCommunicationChannelTypeCompartmentEditPart;
import workflow.diagram.edit.parts.CommunicationChannelEditPart;
import workflow.diagram.edit.parts.CommunicationChannelIncomingEditPart;
import workflow.diagram.edit.parts.CommunicationChannelNEditPart;
import workflow.diagram.edit.parts.DataStructure2EditPart;
import workflow.diagram.edit.parts.DataStructureDataStructureTypeCompartment2EditPart;
import workflow.diagram.edit.parts.DataStructureDataStructureTypeCompartmentEditPart;
import workflow.diagram.edit.parts.DataStructureEditPart;
import workflow.diagram.edit.parts.DataStructureName2EditPart;
import workflow.diagram.edit.parts.DataStructureNameEditPart;
import workflow.diagram.edit.parts.JavaTaskEditPart;
import workflow.diagram.edit.parts.JavaTaskNameEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelNEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart;
import workflow.diagram.edit.parts.ScriptedTaskEditPart;
import workflow.diagram.edit.parts.ScriptedTaskNameEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.edit.parts.TaskIncomingEditPart;
import workflow.diagram.edit.parts.TaskNameEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.edit.parts.WrappingLabel2EditPart;
import workflow.diagram.edit.parts.WrappingLabel3EditPart;
import workflow.diagram.edit.parts.WrappingLabelEditPart;

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
			if (WorkflowPackage.eINSTANCE.getJavaTask().isSuperTypeOf(domainElement.eClass())) {
				return JavaTaskEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getScriptedTask().isSuperTypeOf(domainElement.eClass())) {
				return ScriptedTaskEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getRemoteCommunicationChannel().isSuperTypeOf(domainElement.eClass())) {
				return RemoteCommunicationChannelEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getTask().isSuperTypeOf(domainElement.eClass())) {
				return TaskEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getCommunicationChannel().isSuperTypeOf(domainElement.eClass())) {
				return CommunicationChannelEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getDataStructure().isSuperTypeOf(domainElement.eClass())) {
				return DataStructureEditPart.VISUAL_ID;
			}
			break;
		case RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getDataStructure().isSuperTypeOf(domainElement.eClass())) {
				return DataStructure2EditPart.VISUAL_ID;
			}
			break;
		case CommunicationChannelCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getDataStructure().isSuperTypeOf(domainElement.eClass())) {
				return DataStructure2EditPart.VISUAL_ID;
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
			if (JavaTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptedTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RemoteCommunicationChannelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommunicationChannelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStructureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JavaTaskEditPart.VISUAL_ID:
			if (JavaTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScriptedTaskEditPart.VISUAL_ID:
			if (ScriptedTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RemoteCommunicationChannelEditPart.VISUAL_ID:
			if (RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskEditPart.VISUAL_ID:
			if (TaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicationChannelEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommunicationChannelCommunicationChannelTypeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataStructureEditPart.VISUAL_ID:
			if (DataStructureNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStructureDataStructureTypeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataStructure2EditPart.VISUAL_ID:
			if (DataStructureName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStructureDataStructureTypeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
			if (DataStructure2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicationChannelCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
			if (DataStructure2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskIncomingEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicationChannelIncomingEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
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
		case RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
		case DataStructureDataStructureTypeCompartmentEditPart.VISUAL_ID:
		case CommunicationChannelCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
		case DataStructureDataStructureTypeCompartment2EditPart.VISUAL_ID:
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
		case TaskEditPart.VISUAL_ID:
		case JavaTaskEditPart.VISUAL_ID:
		case ScriptedTaskEditPart.VISUAL_ID:
		case DataStructureEditPart.VISUAL_ID:
		case DataStructure2EditPart.VISUAL_ID:
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
