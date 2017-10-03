/*
 * 
 */
package workflow.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import workflow.diagram.providers.WorkflowElementTypes;
import workflow.diagram.providers.WorkflowModelingAssistantProvider;

/**
 * @generated
 */
public class WorkflowModelingAssistantProviderOfWorkflowEditPart extends WorkflowModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(WorkflowElementTypes.JavaTask_2017);
		types.add(WorkflowElementTypes.ScriptedTask_2018);
		types.add(WorkflowElementTypes.RemoteCommunicationChannel_2020);
		types.add(WorkflowElementTypes.Task_2016);
		types.add(WorkflowElementTypes.CommunicationChannel_2021);
		types.add(WorkflowElementTypes.DataStructure_2019);
		return types;
	}

}
