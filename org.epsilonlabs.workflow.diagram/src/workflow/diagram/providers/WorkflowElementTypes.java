/*
 * 
 */
package workflow.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.CommunicationChannelEditPart;
import workflow.diagram.edit.parts.CommunicationChannelIncomingEditPart;
import workflow.diagram.edit.parts.DataStructure2EditPart;
import workflow.diagram.edit.parts.DataStructureEditPart;
import workflow.diagram.edit.parts.JavaTaskEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelEditPart;
import workflow.diagram.edit.parts.ScriptedTaskEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.edit.parts.TaskIncomingEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.part.WorkflowDiagramEditorPlugin;

/**
 * @generated
 */
public class WorkflowElementTypes {

	/**
	* @generated
	*/
	private WorkflowElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WorkflowDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Workflow_1000 = getElementType("org.epsilonlabs.workflow.diagram.Workflow_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JavaTask_2017 = getElementType("org.epsilonlabs.workflow.diagram.JavaTask_2017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ScriptedTask_2018 = getElementType(
			"org.epsilonlabs.workflow.diagram.ScriptedTask_2018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RemoteCommunicationChannel_2020 = getElementType(
			"org.epsilonlabs.workflow.diagram.RemoteCommunicationChannel_2020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Task_2016 = getElementType("org.epsilonlabs.workflow.diagram.Task_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CommunicationChannel_2021 = getElementType(
			"org.epsilonlabs.workflow.diagram.CommunicationChannel_2021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataStructure_2019 = getElementType(
			"org.epsilonlabs.workflow.diagram.DataStructure_2019"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataStructure_3001 = getElementType(
			"org.epsilonlabs.workflow.diagram.DataStructure_3001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType TaskIncoming_4001 = getElementType(
			"org.epsilonlabs.workflow.diagram.TaskIncoming_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CommunicationChannelIncoming_4002 = getElementType(
			"org.epsilonlabs.workflow.diagram.CommunicationChannelIncoming_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Workflow_1000, WorkflowPackage.eINSTANCE.getWorkflow());

			elements.put(JavaTask_2017, WorkflowPackage.eINSTANCE.getJavaTask());

			elements.put(ScriptedTask_2018, WorkflowPackage.eINSTANCE.getScriptedTask());

			elements.put(RemoteCommunicationChannel_2020, WorkflowPackage.eINSTANCE.getRemoteCommunicationChannel());

			elements.put(Task_2016, WorkflowPackage.eINSTANCE.getTask());

			elements.put(CommunicationChannel_2021, WorkflowPackage.eINSTANCE.getCommunicationChannel());

			elements.put(DataStructure_2019, WorkflowPackage.eINSTANCE.getDataStructure());

			elements.put(DataStructure_3001, WorkflowPackage.eINSTANCE.getDataStructure());

			elements.put(TaskIncoming_4001, WorkflowPackage.eINSTANCE.getTask_Incoming());

			elements.put(CommunicationChannelIncoming_4002,
					WorkflowPackage.eINSTANCE.getCommunicationChannel_Incoming());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Workflow_1000);
			KNOWN_ELEMENT_TYPES.add(JavaTask_2017);
			KNOWN_ELEMENT_TYPES.add(ScriptedTask_2018);
			KNOWN_ELEMENT_TYPES.add(RemoteCommunicationChannel_2020);
			KNOWN_ELEMENT_TYPES.add(Task_2016);
			KNOWN_ELEMENT_TYPES.add(CommunicationChannel_2021);
			KNOWN_ELEMENT_TYPES.add(DataStructure_2019);
			KNOWN_ELEMENT_TYPES.add(DataStructure_3001);
			KNOWN_ELEMENT_TYPES.add(TaskIncoming_4001);
			KNOWN_ELEMENT_TYPES.add(CommunicationChannelIncoming_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WorkflowEditPart.VISUAL_ID:
			return Workflow_1000;
		case JavaTaskEditPart.VISUAL_ID:
			return JavaTask_2017;
		case ScriptedTaskEditPart.VISUAL_ID:
			return ScriptedTask_2018;
		case RemoteCommunicationChannelEditPart.VISUAL_ID:
			return RemoteCommunicationChannel_2020;
		case TaskEditPart.VISUAL_ID:
			return Task_2016;
		case CommunicationChannelEditPart.VISUAL_ID:
			return CommunicationChannel_2021;
		case DataStructureEditPart.VISUAL_ID:
			return DataStructure_2019;
		case DataStructure2EditPart.VISUAL_ID:
			return DataStructure_3001;
		case TaskIncomingEditPart.VISUAL_ID:
			return TaskIncoming_4001;
		case CommunicationChannelIncomingEditPart.VISUAL_ID:
			return CommunicationChannelIncoming_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return workflow.diagram.providers.WorkflowElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return workflow.diagram.providers.WorkflowElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return workflow.diagram.providers.WorkflowElementTypes.getElement(elementTypeAdapter);
		}
	};

}
