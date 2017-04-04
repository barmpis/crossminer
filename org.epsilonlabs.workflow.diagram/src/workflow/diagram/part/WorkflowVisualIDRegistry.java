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
import workflow.diagram.edit.parts.AuthorsEditPart;
import workflow.diagram.edit.parts.AuthorsRepoPatternsEditPart;
import workflow.diagram.edit.parts.CommitsEditPart;
import workflow.diagram.edit.parts.CommitsRepoPatternsEditPart;
import workflow.diagram.edit.parts.CustomScriptEditPart;
import workflow.diagram.edit.parts.CustomScriptTempEditPart;
import workflow.diagram.edit.parts.DataAggregationEditPart;
import workflow.diagram.edit.parts.DataAggregationTempEditPart;
import workflow.diagram.edit.parts.DataFilteringEditPart;
import workflow.diagram.edit.parts.DataFilteringTempEditPart;
import workflow.diagram.edit.parts.DataManipulationEditPart;
import workflow.diagram.edit.parts.DataManipulationSourcesEditPart;
import workflow.diagram.edit.parts.DataManipulationTempEditPart;
import workflow.diagram.edit.parts.DataRetrievalSourcesEditPart;
import workflow.diagram.edit.parts.DataSourceRetrievalsEditPart;
import workflow.diagram.edit.parts.FilesEditPart;
import workflow.diagram.edit.parts.FilesRepoPatternsEditPart;
import workflow.diagram.edit.parts.GHTorrentEditPart;
import workflow.diagram.edit.parts.GHTorrentUrlEditPart;
import workflow.diagram.edit.parts.GithubBigQueryEditPart;
import workflow.diagram.edit.parts.GithubBigQueryUrlEditPart;
import workflow.diagram.edit.parts.GithubEditPart;
import workflow.diagram.edit.parts.GithubUrlEditPart;
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
			if (WorkflowPackage.eINSTANCE.getGithub().isSuperTypeOf(domainElement.eClass())) {
				return GithubEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getGithubBigQuery().isSuperTypeOf(domainElement.eClass())) {
				return GithubBigQueryEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getGHTorrent().isSuperTypeOf(domainElement.eClass())) {
				return GHTorrentEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getCommits().isSuperTypeOf(domainElement.eClass())) {
				return CommitsEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getAuthors().isSuperTypeOf(domainElement.eClass())) {
				return AuthorsEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getFiles().isSuperTypeOf(domainElement.eClass())) {
				return FilesEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getDataAggregation().isSuperTypeOf(domainElement.eClass())) {
				return DataAggregationEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getDataFiltering().isSuperTypeOf(domainElement.eClass())) {
				return DataFilteringEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getCustomScript().isSuperTypeOf(domainElement.eClass())) {
				return CustomScriptEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getDataManipulation().isSuperTypeOf(domainElement.eClass())) {
				return DataManipulationEditPart.VISUAL_ID;
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
			if (GithubEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GithubBigQueryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GHTorrentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommitsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AuthorsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataAggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataFilteringEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomScriptEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataManipulationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GithubEditPart.VISUAL_ID:
			if (GithubUrlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GithubBigQueryEditPart.VISUAL_ID:
			if (GithubBigQueryUrlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GHTorrentEditPart.VISUAL_ID:
			if (GHTorrentUrlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommitsEditPart.VISUAL_ID:
			if (CommitsRepoPatternsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AuthorsEditPart.VISUAL_ID:
			if (AuthorsRepoPatternsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilesEditPart.VISUAL_ID:
			if (FilesRepoPatternsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataAggregationEditPart.VISUAL_ID:
			if (DataAggregationTempEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataFilteringEditPart.VISUAL_ID:
			if (DataFilteringTempEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomScriptEditPart.VISUAL_ID:
			if (CustomScriptTempEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataManipulationEditPart.VISUAL_ID:
			if (DataManipulationTempEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataSourceRetrievalsEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataRetrievalSourcesEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataManipulationSourcesEditPart.VISUAL_ID:
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
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WorkflowEditPart.VISUAL_ID:
			return false;
		case GithubEditPart.VISUAL_ID:
		case GithubBigQueryEditPart.VISUAL_ID:
		case GHTorrentEditPart.VISUAL_ID:
		case CommitsEditPart.VISUAL_ID:
		case AuthorsEditPart.VISUAL_ID:
		case FilesEditPart.VISUAL_ID:
		case DataAggregationEditPart.VISUAL_ID:
		case DataFilteringEditPart.VISUAL_ID:
		case CustomScriptEditPart.VISUAL_ID:
		case DataManipulationEditPart.VISUAL_ID:
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
