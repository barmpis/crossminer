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

import workflow.EmittingTask;
import workflow.RemoteTaskCommunicationConfiguration;
import workflow.Task;
import workflow.TaskCommunicationConfiguration;
import workflow.Variable;
import workflow.Workflow;
import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.Boolean2EditPart;
import workflow.diagram.edit.parts.BooleanEditPart;
import workflow.diagram.edit.parts.Double2EditPart;
import workflow.diagram.edit.parts.DoubleEditPart;
import workflow.diagram.edit.parts.EmittingTaskEditPart;
import workflow.diagram.edit.parts.EmittingTaskEmittingTaskLocalsCompartmentEditPart;
import workflow.diagram.edit.parts.Integer2EditPart;
import workflow.diagram.edit.parts.IntegerEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationEditPart;
import workflow.diagram.edit.parts.String2EditPart;
import workflow.diagram.edit.parts.StringEditPart;
import workflow.diagram.edit.parts.TaskCommunicationConfigurationEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.edit.parts.TaskTaskLocalsCompartmentEditPart;
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
		case EmittingTaskEmittingTaskLocalsCompartmentEditPart.VISUAL_ID:
			return getEmittingTaskEmittingTaskLocalsCompartment_7001SemanticChildren(view);
		case TaskTaskLocalsCompartmentEditPart.VISUAL_ID:
			return getTaskTaskLocalsCompartment_7002SemanticChildren(view);
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
			if (visualID == EmittingTaskEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TaskEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGlobals().iterator(); it.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StringEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IntegerEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BooleanEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DoubleEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getEmittingTaskEmittingTaskLocalsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EmittingTask modelElement = (EmittingTask) containerView.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLocals().iterator(); it.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == String2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Integer2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Boolean2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Double2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getTaskTaskLocalsCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Task modelElement = (Task) containerView.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLocals().iterator(); it.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == String2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Integer2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Boolean2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Double2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
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
		case EmittingTaskEditPart.VISUAL_ID:
			return getEmittingTask_2011ContainedLinks(view);
		case StringEditPart.VISUAL_ID:
			return getString_2012ContainedLinks(view);
		case IntegerEditPart.VISUAL_ID:
			return getInteger_2013ContainedLinks(view);
		case BooleanEditPart.VISUAL_ID:
			return getBoolean_2014ContainedLinks(view);
		case DoubleEditPart.VISUAL_ID:
			return getDouble_2015ContainedLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2016ContainedLinks(view);
		case String2EditPart.VISUAL_ID:
			return getString_3001ContainedLinks(view);
		case Integer2EditPart.VISUAL_ID:
			return getInteger_3002ContainedLinks(view);
		case Boolean2EditPart.VISUAL_ID:
			return getBoolean_3003ContainedLinks(view);
		case Double2EditPart.VISUAL_ID:
			return getDouble_3004ContainedLinks(view);
		case RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getRemoteTaskCommunicationConfiguration_4004ContainedLinks(view);
		case TaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getTaskCommunicationConfiguration_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getIncomingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case EmittingTaskEditPart.VISUAL_ID:
			return getEmittingTask_2011IncomingLinks(view);
		case StringEditPart.VISUAL_ID:
			return getString_2012IncomingLinks(view);
		case IntegerEditPart.VISUAL_ID:
			return getInteger_2013IncomingLinks(view);
		case BooleanEditPart.VISUAL_ID:
			return getBoolean_2014IncomingLinks(view);
		case DoubleEditPart.VISUAL_ID:
			return getDouble_2015IncomingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2016IncomingLinks(view);
		case String2EditPart.VISUAL_ID:
			return getString_3001IncomingLinks(view);
		case Integer2EditPart.VISUAL_ID:
			return getInteger_3002IncomingLinks(view);
		case Boolean2EditPart.VISUAL_ID:
			return getBoolean_3003IncomingLinks(view);
		case Double2EditPart.VISUAL_ID:
			return getDouble_3004IncomingLinks(view);
		case RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getRemoteTaskCommunicationConfiguration_4004IncomingLinks(view);
		case TaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getTaskCommunicationConfiguration_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getOutgoingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case EmittingTaskEditPart.VISUAL_ID:
			return getEmittingTask_2011OutgoingLinks(view);
		case StringEditPart.VISUAL_ID:
			return getString_2012OutgoingLinks(view);
		case IntegerEditPart.VISUAL_ID:
			return getInteger_2013OutgoingLinks(view);
		case BooleanEditPart.VISUAL_ID:
			return getBoolean_2014OutgoingLinks(view);
		case DoubleEditPart.VISUAL_ID:
			return getDouble_2015OutgoingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2016OutgoingLinks(view);
		case String2EditPart.VISUAL_ID:
			return getString_3001OutgoingLinks(view);
		case Integer2EditPart.VISUAL_ID:
			return getInteger_3002OutgoingLinks(view);
		case Boolean2EditPart.VISUAL_ID:
			return getBoolean_3003OutgoingLinks(view);
		case Double2EditPart.VISUAL_ID:
			return getDouble_3004OutgoingLinks(view);
		case RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getRemoteTaskCommunicationConfiguration_4004OutgoingLinks(view);
		case TaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getTaskCommunicationConfiguration_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflow_1000ContainedLinks(View view) {
		Workflow modelElement = (Workflow) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RemoteTaskCommunicationConfiguration_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TaskCommunicationConfiguration_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getEmittingTask_2011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getString_2012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getInteger_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getBoolean_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDouble_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getTask_2016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getString_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getInteger_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getBoolean_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getDouble_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getRemoteTaskCommunicationConfiguration_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getTaskCommunicationConfiguration_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getEmittingTask_2011IncomingLinks(View view) {
		EmittingTask modelElement = (EmittingTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RemoteTaskCommunicationConfiguration_4004(modelElement,
				crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_TaskCommunicationConfiguration_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getString_2012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getInteger_2013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getBoolean_2014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDouble_2015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getTask_2016IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RemoteTaskCommunicationConfiguration_4004(modelElement,
				crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_TaskCommunicationConfiguration_4005(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getString_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getInteger_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getBoolean_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getDouble_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getRemoteTaskCommunicationConfiguration_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getTaskCommunicationConfiguration_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getEmittingTask_2011OutgoingLinks(View view) {
		EmittingTask modelElement = (EmittingTask) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RemoteTaskCommunicationConfiguration_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_TaskCommunicationConfiguration_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getString_2012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getInteger_2013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getBoolean_2014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDouble_2015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getTask_2016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getString_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getInteger_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getBoolean_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getDouble_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getRemoteTaskCommunicationConfiguration_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getTaskCommunicationConfiguration_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getContainedTypeModelFacetLinks_RemoteTaskCommunicationConfiguration_4004(
			Workflow container) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> links = container.getConfigs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RemoteTaskCommunicationConfiguration) {
				continue;
			}
			RemoteTaskCommunicationConfiguration link = (RemoteTaskCommunicationConfiguration) linkObject;
			if (RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID != WorkflowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getOutgoing();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Task) {
				continue;
			}
			Task dst = (Task) theTarget;
			List sources = link.getIncoming();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof EmittingTask) {
				continue;
			}
			EmittingTask src = (EmittingTask) theSource;
			result.add(new WorkflowLinkDescriptor(src, dst, link,
					WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004,
					RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getContainedTypeModelFacetLinks_TaskCommunicationConfiguration_4005(
			Workflow container) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> links = container.getConfigs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TaskCommunicationConfiguration) {
				continue;
			}
			TaskCommunicationConfiguration link = (TaskCommunicationConfiguration) linkObject;
			if (TaskCommunicationConfigurationEditPart.VISUAL_ID != WorkflowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getOutgoing();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Task) {
				continue;
			}
			Task dst = (Task) theTarget;
			List sources = link.getIncoming();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof EmittingTask) {
				continue;
			}
			EmittingTask src = (EmittingTask) theSource;
			result.add(
					new WorkflowLinkDescriptor(src, dst, link, WorkflowElementTypes.TaskCommunicationConfiguration_4005,
							TaskCommunicationConfigurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkflowLinkDescriptor> getIncomingTypeModelFacetLinks_RemoteTaskCommunicationConfiguration_4004(
			Task target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WorkflowPackage.eINSTANCE
					.getTaskCommunicationConfiguration_Outgoing()
					|| false == setting.getEObject() instanceof RemoteTaskCommunicationConfiguration) {
				continue;
			}
			RemoteTaskCommunicationConfiguration link = (RemoteTaskCommunicationConfiguration) setting.getEObject();
			if (RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID != WorkflowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getIncoming();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof EmittingTask) {
				continue;
			}
			EmittingTask src = (EmittingTask) theSource;
			result.add(new WorkflowLinkDescriptor(src, target, link,
					WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004,
					RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkflowLinkDescriptor> getIncomingTypeModelFacetLinks_TaskCommunicationConfiguration_4005(
			Task target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WorkflowPackage.eINSTANCE
					.getTaskCommunicationConfiguration_Outgoing()
					|| false == setting.getEObject() instanceof TaskCommunicationConfiguration) {
				continue;
			}
			TaskCommunicationConfiguration link = (TaskCommunicationConfiguration) setting.getEObject();
			if (TaskCommunicationConfigurationEditPart.VISUAL_ID != WorkflowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getIncoming();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof EmittingTask) {
				continue;
			}
			EmittingTask src = (EmittingTask) theSource;
			result.add(new WorkflowLinkDescriptor(src, target, link,
					WorkflowElementTypes.TaskCommunicationConfiguration_4005,
					TaskCommunicationConfigurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getOutgoingTypeModelFacetLinks_RemoteTaskCommunicationConfiguration_4004(
			EmittingTask source) {
		Workflow container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Workflow) {
				container = (Workflow) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> links = container.getConfigs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RemoteTaskCommunicationConfiguration) {
				continue;
			}
			RemoteTaskCommunicationConfiguration link = (RemoteTaskCommunicationConfiguration) linkObject;
			if (RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID != WorkflowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getOutgoing();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Task) {
				continue;
			}
			Task dst = (Task) theTarget;
			List sources = link.getIncoming();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof EmittingTask) {
				continue;
			}
			EmittingTask src = (EmittingTask) theSource;
			if (src != source) {
				continue;
			}
			result.add(new WorkflowLinkDescriptor(src, dst, link,
					WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004,
					RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getOutgoingTypeModelFacetLinks_TaskCommunicationConfiguration_4005(
			EmittingTask source) {
		Workflow container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Workflow) {
				container = (Workflow) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> links = container.getConfigs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TaskCommunicationConfiguration) {
				continue;
			}
			TaskCommunicationConfiguration link = (TaskCommunicationConfiguration) linkObject;
			if (TaskCommunicationConfigurationEditPart.VISUAL_ID != WorkflowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getOutgoing();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Task) {
				continue;
			}
			Task dst = (Task) theTarget;
			List sources = link.getIncoming();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof EmittingTask) {
				continue;
			}
			EmittingTask src = (EmittingTask) theSource;
			if (src != source) {
				continue;
			}
			result.add(
					new WorkflowLinkDescriptor(src, dst, link, WorkflowElementTypes.TaskCommunicationConfiguration_4005,
							TaskCommunicationConfigurationEditPart.VISUAL_ID));
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
