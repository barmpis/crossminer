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

import workflow.diagram.edit.parts.AuthorsEditPart;
import workflow.diagram.edit.parts.GHTorrentEditPart;
import workflow.diagram.edit.parts.GithubBigQueryEditPart;
import workflow.diagram.edit.parts.GithubEditPart;
import workflow.diagram.providers.WorkflowElementTypes;
import workflow.diagram.providers.WorkflowModelingAssistantProvider;

/**
 * @generated
 */
public class WorkflowModelingAssistantProviderOfAuthorsEditPart extends WorkflowModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AuthorsEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(AuthorsEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WorkflowElementTypes.DataRetrievalSources_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((AuthorsEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(AuthorsEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof GithubEditPart) {
			types.add(WorkflowElementTypes.DataRetrievalSources_4002);
		}
		if (targetEditPart instanceof GithubBigQueryEditPart) {
			types.add(WorkflowElementTypes.DataRetrievalSources_4002);
		}
		if (targetEditPart instanceof GHTorrentEditPart) {
			types.add(WorkflowElementTypes.DataRetrievalSources_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((AuthorsEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(AuthorsEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.DataRetrievalSources_4002) {
			types.add(WorkflowElementTypes.Github_2001);
			types.add(WorkflowElementTypes.GithubBigQuery_2002);
			types.add(WorkflowElementTypes.GHTorrent_2003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AuthorsEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(AuthorsEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.DataSourceRetrievals_4001);
		types.add(WorkflowElementTypes.DataManipulationSources_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((AuthorsEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(AuthorsEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.DataSourceRetrievals_4001) {
			types.add(WorkflowElementTypes.Github_2001);
			types.add(WorkflowElementTypes.GithubBigQuery_2002);
			types.add(WorkflowElementTypes.GHTorrent_2003);
		} else if (relationshipType == WorkflowElementTypes.DataManipulationSources_4003) {
			types.add(WorkflowElementTypes.DataAggregation_2007);
			types.add(WorkflowElementTypes.DataFiltering_2008);
			types.add(WorkflowElementTypes.CustomScript_2009);
			types.add(WorkflowElementTypes.DataManipulation_2010);
		}
		return types;
	}

}
