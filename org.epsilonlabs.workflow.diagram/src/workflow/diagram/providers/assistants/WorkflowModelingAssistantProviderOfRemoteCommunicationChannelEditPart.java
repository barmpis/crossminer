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
import workflow.diagram.edit.parts.JavaTaskEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelEditPart;
import workflow.diagram.edit.parts.ScriptedTaskEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.providers.WorkflowElementTypes;
import workflow.diagram.providers.WorkflowModelingAssistantProvider;

/**
 * @generated
 */
public class WorkflowModelingAssistantProviderOfRemoteCommunicationChannelEditPart
		extends WorkflowModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RemoteCommunicationChannelEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RemoteCommunicationChannelEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WorkflowElementTypes.CommunicationChannelIncoming_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RemoteCommunicationChannelEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RemoteCommunicationChannelEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof JavaTaskEditPart) {
			types.add(WorkflowElementTypes.CommunicationChannelIncoming_4002);
		}
		if (targetEditPart instanceof ScriptedTaskEditPart) {
			types.add(WorkflowElementTypes.CommunicationChannelIncoming_4002);
		}
		if (targetEditPart instanceof TaskEditPart) {
			types.add(WorkflowElementTypes.CommunicationChannelIncoming_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RemoteCommunicationChannelEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RemoteCommunicationChannelEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.CommunicationChannelIncoming_4002) {
			types.add(WorkflowElementTypes.JavaTask_2017);
			types.add(WorkflowElementTypes.ScriptedTask_2018);
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
		return doGetRelTypesOnTarget((RemoteCommunicationChannelEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RemoteCommunicationChannelEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WorkflowElementTypes.TaskIncoming_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RemoteCommunicationChannelEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RemoteCommunicationChannelEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.TaskIncoming_4001) {
			types.add(WorkflowElementTypes.JavaTask_2017);
			types.add(WorkflowElementTypes.ScriptedTask_2018);
			types.add(WorkflowElementTypes.Task_2016);
		}
		return types;
	}

}
