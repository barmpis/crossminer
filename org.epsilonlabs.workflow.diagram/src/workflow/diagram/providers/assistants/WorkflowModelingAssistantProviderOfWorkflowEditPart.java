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
		types.add(WorkflowElementTypes.EmittingTask_2011);
		types.add(WorkflowElementTypes.String_2012);
		types.add(WorkflowElementTypes.Integer_2013);
		types.add(WorkflowElementTypes.Boolean_2014);
		types.add(WorkflowElementTypes.Double_2015);
		types.add(WorkflowElementTypes.Task_2016);
		return types;
	}

}
