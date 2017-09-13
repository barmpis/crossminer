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
import workflow.diagram.edit.parts.Boolean2EditPart;
import workflow.diagram.edit.parts.BooleanEditPart;
import workflow.diagram.edit.parts.Double2EditPart;
import workflow.diagram.edit.parts.DoubleEditPart;
import workflow.diagram.edit.parts.EmittingTaskEditPart;
import workflow.diagram.edit.parts.Integer2EditPart;
import workflow.diagram.edit.parts.IntegerEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationEditPart;
import workflow.diagram.edit.parts.String2EditPart;
import workflow.diagram.edit.parts.StringEditPart;
import workflow.diagram.edit.parts.TaskCommunicationConfigurationEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
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
	public static final IElementType EmittingTask_2011 = getElementType(
			"org.epsilonlabs.workflow.diagram.EmittingTask_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType String_2012 = getElementType("org.epsilonlabs.workflow.diagram.String_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Integer_2013 = getElementType("org.epsilonlabs.workflow.diagram.Integer_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Boolean_2014 = getElementType("org.epsilonlabs.workflow.diagram.Boolean_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Double_2015 = getElementType("org.epsilonlabs.workflow.diagram.Double_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Task_2016 = getElementType("org.epsilonlabs.workflow.diagram.Task_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType String_3001 = getElementType("org.epsilonlabs.workflow.diagram.String_3001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Integer_3002 = getElementType("org.epsilonlabs.workflow.diagram.Integer_3002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Boolean_3003 = getElementType("org.epsilonlabs.workflow.diagram.Boolean_3003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Double_3004 = getElementType("org.epsilonlabs.workflow.diagram.Double_3004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType RemoteTaskCommunicationConfiguration_4004 = getElementType(
			"org.epsilonlabs.workflow.diagram.RemoteTaskCommunicationConfiguration_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TaskCommunicationConfiguration_4005 = getElementType(
			"org.epsilonlabs.workflow.diagram.TaskCommunicationConfiguration_4005"); //$NON-NLS-1$

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

			elements.put(EmittingTask_2011, WorkflowPackage.eINSTANCE.getEmittingTask());

			elements.put(String_2012, WorkflowPackage.eINSTANCE.getString());

			elements.put(Integer_2013, WorkflowPackage.eINSTANCE.getInteger());

			elements.put(Boolean_2014, WorkflowPackage.eINSTANCE.getBoolean());

			elements.put(Double_2015, WorkflowPackage.eINSTANCE.getDouble());

			elements.put(Task_2016, WorkflowPackage.eINSTANCE.getTask());

			elements.put(String_3001, WorkflowPackage.eINSTANCE.getString());

			elements.put(Integer_3002, WorkflowPackage.eINSTANCE.getInteger());

			elements.put(Boolean_3003, WorkflowPackage.eINSTANCE.getBoolean());

			elements.put(Double_3004, WorkflowPackage.eINSTANCE.getDouble());

			elements.put(RemoteTaskCommunicationConfiguration_4004,
					WorkflowPackage.eINSTANCE.getRemoteTaskCommunicationConfiguration());

			elements.put(TaskCommunicationConfiguration_4005,
					WorkflowPackage.eINSTANCE.getTaskCommunicationConfiguration());
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
			KNOWN_ELEMENT_TYPES.add(EmittingTask_2011);
			KNOWN_ELEMENT_TYPES.add(String_2012);
			KNOWN_ELEMENT_TYPES.add(Integer_2013);
			KNOWN_ELEMENT_TYPES.add(Boolean_2014);
			KNOWN_ELEMENT_TYPES.add(Double_2015);
			KNOWN_ELEMENT_TYPES.add(Task_2016);
			KNOWN_ELEMENT_TYPES.add(String_3001);
			KNOWN_ELEMENT_TYPES.add(Integer_3002);
			KNOWN_ELEMENT_TYPES.add(Boolean_3003);
			KNOWN_ELEMENT_TYPES.add(Double_3004);
			KNOWN_ELEMENT_TYPES.add(RemoteTaskCommunicationConfiguration_4004);
			KNOWN_ELEMENT_TYPES.add(TaskCommunicationConfiguration_4005);
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
		case EmittingTaskEditPart.VISUAL_ID:
			return EmittingTask_2011;
		case StringEditPart.VISUAL_ID:
			return String_2012;
		case IntegerEditPart.VISUAL_ID:
			return Integer_2013;
		case BooleanEditPart.VISUAL_ID:
			return Boolean_2014;
		case DoubleEditPart.VISUAL_ID:
			return Double_2015;
		case TaskEditPart.VISUAL_ID:
			return Task_2016;
		case String2EditPart.VISUAL_ID:
			return String_3001;
		case Integer2EditPart.VISUAL_ID:
			return Integer_3002;
		case Boolean2EditPart.VISUAL_ID:
			return Boolean_3003;
		case Double2EditPart.VISUAL_ID:
			return Double_3004;
		case RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID:
			return RemoteTaskCommunicationConfiguration_4004;
		case TaskCommunicationConfigurationEditPart.VISUAL_ID:
			return TaskCommunicationConfiguration_4005;
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
