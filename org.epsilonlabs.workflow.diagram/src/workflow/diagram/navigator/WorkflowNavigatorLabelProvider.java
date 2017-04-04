/*
* 
*/
package workflow.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import workflow.diagram.edit.parts.AuthorsEditPart;
import workflow.diagram.edit.parts.AuthorsRepoPatternsEditPart;
import workflow.diagram.edit.parts.CommitsEditPart;
import workflow.diagram.edit.parts.CommitsRepoPatternsEditPart;
import workflow.diagram.edit.parts.CustomScriptEditPart;
import workflow.diagram.edit.parts.CustomScriptTempEditPart;
import workflow.diagram.edit.parts.DataAggregationEditPart;
import workflow.diagram.edit.parts.DataAggregationTempEditPart;
import workflow.diagram.edit.parts.DataFilteringEditPart;
import workflow.diagram.edit.parts.DataFilteringTempEditPart;
import workflow.diagram.edit.parts.DataManipulationEditPart;
import workflow.diagram.edit.parts.DataManipulationSourcesEditPart;
import workflow.diagram.edit.parts.DataManipulationTempEditPart;
import workflow.diagram.edit.parts.DataRetrievalSourcesEditPart;
import workflow.diagram.edit.parts.DataSourceRetrievalsEditPart;
import workflow.diagram.edit.parts.FilesEditPart;
import workflow.diagram.edit.parts.FilesRepoPatternsEditPart;
import workflow.diagram.edit.parts.GHTorrentEditPart;
import workflow.diagram.edit.parts.GHTorrentUrlEditPart;
import workflow.diagram.edit.parts.GithubBigQueryEditPart;
import workflow.diagram.edit.parts.GithubBigQueryUrlEditPart;
import workflow.diagram.edit.parts.GithubEditPart;
import workflow.diagram.edit.parts.GithubUrlEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.part.WorkflowDiagramEditorPlugin;
import workflow.diagram.part.WorkflowVisualIDRegistry;
import workflow.diagram.providers.WorkflowElementTypes;
import workflow.diagram.providers.WorkflowParserProvider;

/**
 * @generated
 */
public class WorkflowNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		WorkflowDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		WorkflowDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WorkflowNavigatorItem && !isOwnView(((WorkflowNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof WorkflowNavigatorGroup) {
			WorkflowNavigatorGroup group = (WorkflowNavigatorGroup) element;
			return WorkflowDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof WorkflowNavigatorItem) {
			WorkflowNavigatorItem navigatorItem = (WorkflowNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://workflow?Workflow", WorkflowElementTypes.Workflow_1000); //$NON-NLS-1$
		case GithubEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?Github", WorkflowElementTypes.Github_2001); //$NON-NLS-1$
		case GithubBigQueryEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?GithubBigQuery", //$NON-NLS-1$
					WorkflowElementTypes.GithubBigQuery_2002);
		case GHTorrentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?GHTorrent", WorkflowElementTypes.GHTorrent_2003); //$NON-NLS-1$
		case CommitsEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?Commits", WorkflowElementTypes.Commits_2004); //$NON-NLS-1$
		case AuthorsEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?Authors", WorkflowElementTypes.Authors_2005); //$NON-NLS-1$
		case FilesEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?Files", WorkflowElementTypes.Files_2006); //$NON-NLS-1$
		case DataAggregationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?DataAggregation", //$NON-NLS-1$
					WorkflowElementTypes.DataAggregation_2007);
		case DataFilteringEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?DataFiltering", //$NON-NLS-1$
					WorkflowElementTypes.DataFiltering_2008);
		case CustomScriptEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?CustomScript", //$NON-NLS-1$
					WorkflowElementTypes.CustomScript_2009);
		case DataManipulationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://workflow?DataManipulation", //$NON-NLS-1$
					WorkflowElementTypes.DataManipulation_2010);
		case DataSourceRetrievalsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://workflow?DataSource?retrievals", //$NON-NLS-1$
					WorkflowElementTypes.DataSourceRetrievals_4001);
		case DataRetrievalSourcesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://workflow?DataRetrieval?sources", //$NON-NLS-1$
					WorkflowElementTypes.DataRetrievalSources_4002);
		case DataManipulationSourcesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://workflow?DataManipulation?sources", //$NON-NLS-1$
					WorkflowElementTypes.DataManipulationSources_4003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WorkflowDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && WorkflowElementTypes.isKnownElementType(elementType)) {
			image = WorkflowElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof WorkflowNavigatorGroup) {
			WorkflowNavigatorGroup group = (WorkflowNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WorkflowNavigatorItem) {
			WorkflowNavigatorItem navigatorItem = (WorkflowNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000Text(view);
		case GithubEditPart.VISUAL_ID:
			return getGithub_2001Text(view);
		case GithubBigQueryEditPart.VISUAL_ID:
			return getGithubBigQuery_2002Text(view);
		case GHTorrentEditPart.VISUAL_ID:
			return getGHTorrent_2003Text(view);
		case CommitsEditPart.VISUAL_ID:
			return getCommits_2004Text(view);
		case AuthorsEditPart.VISUAL_ID:
			return getAuthors_2005Text(view);
		case FilesEditPart.VISUAL_ID:
			return getFiles_2006Text(view);
		case DataAggregationEditPart.VISUAL_ID:
			return getDataAggregation_2007Text(view);
		case DataFilteringEditPart.VISUAL_ID:
			return getDataFiltering_2008Text(view);
		case CustomScriptEditPart.VISUAL_ID:
			return getCustomScript_2009Text(view);
		case DataManipulationEditPart.VISUAL_ID:
			return getDataManipulation_2010Text(view);
		case DataSourceRetrievalsEditPart.VISUAL_ID:
			return getDataSourceRetrievals_4001Text(view);
		case DataRetrievalSourcesEditPart.VISUAL_ID:
			return getDataRetrievalSources_4002Text(view);
		case DataManipulationSourcesEditPart.VISUAL_ID:
			return getDataManipulationSources_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getWorkflow_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getGithub_2001Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Github_2001,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(GithubUrlEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGithubBigQuery_2002Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.GithubBigQuery_2002,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(GithubBigQueryUrlEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGHTorrent_2003Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.GHTorrent_2003,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(GHTorrentUrlEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommits_2004Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Commits_2004,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(CommitsRepoPatternsEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAuthors_2005Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Authors_2005,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(AuthorsRepoPatternsEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFiles_2006Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Files_2006,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(FilesRepoPatternsEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataAggregation_2007Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.DataAggregation_2007,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(DataAggregationTempEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataFiltering_2008Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.DataFiltering_2008,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(DataFilteringTempEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCustomScript_2009Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.CustomScript_2009,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(CustomScriptTempEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataManipulation_2010Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.DataManipulation_2010,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(DataManipulationTempEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataSourceRetrievals_4001Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.DataSourceRetrievals_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataRetrievalSources_4002Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.DataRetrievalSources_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataManipulationSources_4003Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.DataManipulationSources_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return WorkflowEditPart.MODEL_ID.equals(WorkflowVisualIDRegistry.getModelID(view));
	}

}
