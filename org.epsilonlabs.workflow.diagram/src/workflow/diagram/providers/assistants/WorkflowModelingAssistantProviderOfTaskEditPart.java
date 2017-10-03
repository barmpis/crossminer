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
import workflow.diagram.edit.parts.CommunicationChannelEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.providers.WorkflowElementTypes;
import workflow.diagram.providers.WorkflowModelingAssistantProvider;

/**
 * @generated
 */
public class WorkflowModelingAssistantProviderOfTaskEditPart extends WorkflowModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TaskEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TaskEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WorkflowElementTypes.TaskIncoming_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TaskEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(TaskEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RemoteCommunicationChannelEditPart) {
			types.add(WorkflowElementTypes.TaskIncoming_4001);
		}
		if (targetEditPart instanceof CommunicationChannelEditPart) {
			types.add(WorkflowElementTypes.TaskIncoming_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TaskEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TaskEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.TaskIncoming_4001) {
			types.add(WorkflowElementTypes.RemoteCommunicationChannel_2020);
			types.add(WorkflowElementTypes.CommunicationChannel_2021);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TaskEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TaskEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WorkflowElementTypes.CommunicationChannelIncoming_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TaskEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TaskEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.CommunicationChannelIncoming_4002) {
			types.add(WorkflowElementTypes.RemoteCommunicationChannel_2020);
			types.add(WorkflowElementTypes.CommunicationChannel_2021);
		}
		return types;
	}

}
