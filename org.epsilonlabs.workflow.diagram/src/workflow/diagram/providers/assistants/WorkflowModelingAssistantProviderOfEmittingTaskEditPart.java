/*
 * 
 */
package workflow.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import workflow.diagram.edit.parts.EmittingTaskEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.providers.WorkflowElementTypes;
import workflow.diagram.providers.WorkflowModelingAssistantProvider;

/**
 * @generated
 */
public class WorkflowModelingAssistantProviderOfEmittingTaskEditPart extends WorkflowModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EmittingTaskEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(EmittingTaskEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004);
		types.add(WorkflowElementTypes.TaskCommunicationConfiguration_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EmittingTaskEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(EmittingTaskEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EmittingTaskEditPart) {
			types.add(WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004);
		}
		if (targetEditPart instanceof TaskEditPart) {
			types.add(WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004);
		}
		if (targetEditPart instanceof EmittingTaskEditPart) {
			types.add(WorkflowElementTypes.TaskCommunicationConfiguration_4005);
		}
		if (targetEditPart instanceof TaskEditPart) {
			types.add(WorkflowElementTypes.TaskCommunicationConfiguration_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((EmittingTaskEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(EmittingTaskEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004) {
			types.add(WorkflowElementTypes.EmittingTask_2011);
			types.add(WorkflowElementTypes.Task_2016);
		} else if (relationshipType == WorkflowElementTypes.TaskCommunicationConfiguration_4005) {
			types.add(WorkflowElementTypes.EmittingTask_2011);
			types.add(WorkflowElementTypes.Task_2016);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EmittingTaskEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EmittingTaskEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004);
		types.add(WorkflowElementTypes.TaskCommunicationConfiguration_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EmittingTaskEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EmittingTaskEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004) {
			types.add(WorkflowElementTypes.EmittingTask_2011);
		} else if (relationshipType == WorkflowElementTypes.TaskCommunicationConfiguration_4005) {
			types.add(WorkflowElementTypes.EmittingTask_2011);
		}
		return types;
	}

}
