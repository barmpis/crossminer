/*
* 
*/
package workflow.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import workflow.CommunicationChannel;
import workflow.DataStructure;
import workflow.JavaTask;
import workflow.RemoteCommunicationChannel;
import workflow.ScriptedTask;
import workflow.Task;
import workflow.Workflow;
import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.CommunicationChannelCommunicationChannelTypeCompartmentEditPart;
import workflow.diagram.edit.parts.CommunicationChannelEditPart;
import workflow.diagram.edit.parts.CommunicationChannelIncomingEditPart;
import workflow.diagram.edit.parts.DataStructure2EditPart;
import workflow.diagram.edit.parts.DataStructureEditPart;
import workflow.diagram.edit.parts.JavaTaskEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart;
import workflow.diagram.edit.parts.ScriptedTaskEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.edit.parts.TaskIncomingEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class WorkflowDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getSemanticChildren(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000SemanticChildren(view);
		case RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
			return getRemoteCommunicationChannelRemoteCommunicationChannelTypeCompartment_7001SemanticChildren(view);
		case CommunicationChannelCommunicationChannelTypeCompartmentEditPart.VISUAL_ID:
			return getCommunicationChannelCommunicationChannelTypeCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getWorkflow_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Workflow modelElement = (Workflow) view.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == JavaTaskEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptedTaskEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TaskEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getChannels().iterator(); it.hasNext();) {
			CommunicationChannel childElement = (CommunicationChannel) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RemoteCommunicationChannelEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommunicationChannelEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGlobalVariables().iterator(); it.hasNext();) {
			DataStructure childElement = (DataStructure) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataStructureEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getRemoteCommunicationChannelRemoteCommunicationChannelTypeCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		RemoteCommunicationChannel modelElement = (RemoteCommunicationChannel) containerView.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		{
			DataStructure childElement = modelElement.getType();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataStructure2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getCommunicationChannelCommunicationChannelTypeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CommunicationChannel modelElement = (CommunicationChannel) containerView.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		{
			DataStructure childElement = modelElement.getType();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataStructure2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getContainedLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000ContainedLinks(view);
		case JavaTaskEditPart.VISUAL_ID:
			return getJavaTask_2017ContainedLinks(view);
		case ScriptedTaskEditPart.VISUAL_ID:
			return getScriptedTask_2018ContainedLinks(view);
		case RemoteCommunicationChannelEditPart.VISUAL_ID:
			return getRemoteCommunicationChannel_2020ContainedLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2016ContainedLinks(view);
		case CommunicationChannelEditPart.VISUAL_ID:
			return getCommunicationChannel_2021ContainedLinks(view);
		case DataStructureEditPart.VISUAL_ID:
			return getDataStructure_2019ContainedLinks(view);
		case DataStructure2EditPart.VISUAL_ID:
			return getDataStructure_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getIncomingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case JavaTaskEditPart.VISUAL_ID:
			return getJavaTask_2017IncomingLinks(view);
		case ScriptedTaskEditPart.VISUAL_ID:
			return getScriptedTask_2018IncomingLinks(view);
		case RemoteCommunicationChannelEditPart.VISUAL_ID:
			return getRemoteCommunicationChannel_2020IncomingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2016IncomingLinks(view);
		case CommunicationChannelEditPart.VISUAL_ID:
			return getCommunicationChannel_2021IncomingLinks(view);
		case DataStructureEditPart.VISUAL_ID:
			return getDataStructure_2019IncomingLinks(view);
		case DataStructure2EditPart.VISUAL_ID:
			return getDataStructure_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getOutgoingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case JavaTaskEditPart.VISUAL_ID:
			return getJavaTask_2017OutgoingLinks(view);
		case ScriptedTaskEditPart.VISUAL_ID:
			return getScriptedTask_2018OutgoingLinks(view);
		case RemoteCommunicationChannelEditPart.VISUAL_ID:
			return getRemoteCommunicationChannel_2020OutgoingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2016OutgoingLinks(view);
		case CommunicationChannelEditPart.VISUAL_ID:
			return getCommunicationChannel_2021OutgoingLinks(view);
		case DataStructureEditPart.VISUAL_ID:
			return getDataStructure_2019OutgoingLinks(view);
		case DataStructure2EditPart.VISUAL_ID:
			return getDataStructure_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflow_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getJavaTask_2017ContainedLinks(View view) {
		JavaTask modelElement = (JavaTask) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Incoming_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getScriptedTask_2018ContainedLinks(View view) {
		ScriptedTask modelElement = (ScriptedTask) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Incoming_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getRemoteCommunicationChannel_2020ContainedLinks(View view) {
		RemoteCommunicationChannel modelElement = (RemoteCommunicationChannel) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationChannel_Incoming_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getTask_2016ContainedLinks(View view) {
		Task modelElement = (Task) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Incoming_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getCommunicationChannel_2021ContainedLinks(View view) {
		CommunicationChannel modelElement = (CommunicationChannel) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationChannel_Incoming_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataStructure_2019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getDataStructure_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getJavaTask_2017IncomingLinks(View view) {
		JavaTask modelElement = (JavaTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_CommunicationChannel_Incoming_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getScriptedTask_2018IncomingLinks(View view) {
		ScriptedTask modelElement = (ScriptedTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_CommunicationChannel_Incoming_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getRemoteCommunicationChannel_2020IncomingLinks(View view) {
		RemoteCommunicationChannel modelElement = (RemoteCommunicationChannel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Incoming_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getTask_2016IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_CommunicationChannel_Incoming_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getCommunicationChannel_2021IncomingLinks(View view) {
		CommunicationChannel modelElement = (CommunicationChannel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Incoming_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataStructure_2019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getDataStructure_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getJavaTask_2017OutgoingLinks(View view) {
		JavaTask modelElement = (JavaTask) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Incoming_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getScriptedTask_2018OutgoingLinks(View view) {
		ScriptedTask modelElement = (ScriptedTask) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Incoming_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getRemoteCommunicationChannel_2020OutgoingLinks(View view) {
		RemoteCommunicationChannel modelElement = (RemoteCommunicationChannel) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationChannel_Incoming_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getTask_2016OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Incoming_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getCommunicationChannel_2021OutgoingLinks(View view) {
		CommunicationChannel modelElement = (CommunicationChannel) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CommunicationChannel_Incoming_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataStructure_2019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getDataStructure_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getIncomingFeatureModelFacetLinks_Task_Incoming_4001(
			CommunicationChannel target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkflowPackage.eINSTANCE.getTask_Incoming()) {
				result.add(new WorkflowLinkDescriptor(setting.getEObject(), target,
						WorkflowElementTypes.TaskIncoming_4001, TaskIncomingEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getIncomingFeatureModelFacetLinks_CommunicationChannel_Incoming_4002(
			Task target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkflowPackage.eINSTANCE.getCommunicationChannel_Incoming()) {
				result.add(new WorkflowLinkDescriptor(setting.getEObject(), target,
						WorkflowElementTypes.CommunicationChannelIncoming_4002,
						CommunicationChannelIncomingEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getOutgoingFeatureModelFacetLinks_Task_Incoming_4001(
			Task source) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> destinations = source.getIncoming().iterator(); destinations.hasNext();) {
			CommunicationChannel destination = (CommunicationChannel) destinations.next();
			result.add(new WorkflowLinkDescriptor(source, destination, WorkflowElementTypes.TaskIncoming_4001,
					TaskIncomingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getOutgoingFeatureModelFacetLinks_CommunicationChannel_Incoming_4002(
			CommunicationChannel source) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> destinations = source.getIncoming().iterator(); destinations.hasNext();) {
			Task destination = (Task) destinations.next();
			result.add(new WorkflowLinkDescriptor(source, destination,
					WorkflowElementTypes.CommunicationChannelIncoming_4002,
					CommunicationChannelIncomingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<WorkflowNodeDescriptor> getSemanticChildren(View view) {
			return WorkflowDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkflowLinkDescriptor> getContainedLinks(View view) {
			return WorkflowDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkflowLinkDescriptor> getIncomingLinks(View view) {
			return WorkflowDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkflowLinkDescriptor> getOutgoingLinks(View view) {
			return WorkflowDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
