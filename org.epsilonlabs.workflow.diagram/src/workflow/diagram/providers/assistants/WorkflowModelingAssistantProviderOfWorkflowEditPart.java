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
		List<IElementType> types = new ArrayList<IElementType>(10);
		types.add(WorkflowElementTypes.Github_2001);
		types.add(WorkflowElementTypes.GithubBigQuery_2002);
		types.add(WorkflowElementTypes.GHTorrent_2003);
		types.add(WorkflowElementTypes.Commits_2004);
		types.add(WorkflowElementTypes.Authors_2005);
		types.add(WorkflowElementTypes.Files_2006);
		types.add(WorkflowElementTypes.DataAggregation_2007);
		types.add(WorkflowElementTypes.DataFiltering_2008);
		types.add(WorkflowElementTypes.CustomScript_2009);
		types.add(WorkflowElementTypes.DataManipulation_2010);
		return types;
	}

}
