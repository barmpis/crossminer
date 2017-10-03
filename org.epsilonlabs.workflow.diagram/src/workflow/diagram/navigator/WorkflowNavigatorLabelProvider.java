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

import workflow.RemoteCommunicationChannel;
import workflow.Workflow;
import workflow.diagram.edit.parts.CommunicationChannelEditPart;
import workflow.diagram.edit.parts.CommunicationChannelIncomingEditPart;
import workflow.diagram.edit.parts.CommunicationChannelNEditPart;
import workflow.diagram.edit.parts.DataStructure2EditPart;
import workflow.diagram.edit.parts.DataStructureEditPart;
import workflow.diagram.edit.parts.DataStructureName2EditPart;
import workflow.diagram.edit.parts.DataStructureNameEditPart;
import workflow.diagram.edit.parts.JavaTaskEditPart;
import workflow.diagram.edit.parts.JavaTaskNameEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelNEditPart;
import workflow.diagram.edit.parts.ScriptedTaskEditPart;
import workflow.diagram.edit.parts.ScriptedTaskNameEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.edit.parts.TaskIncomingEditPart;
import workflow.diagram.edit.parts.TaskNameEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.edit.parts.WrappingLabelEditPart;
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
			return getImage("Navigator?Diagram?http://org.crossminer.workflow?Workflow", //$NON-NLS-1$
					WorkflowElementTypes.Workflow_1000);
		case TaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?Task", //$NON-NLS-1$
					WorkflowElementTypes.Task_2016);
		case JavaTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?JavaTask", //$NON-NLS-1$
					WorkflowElementTypes.JavaTask_2017);
		case ScriptedTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?ScriptedTask", //$NON-NLS-1$
					WorkflowElementTypes.ScriptedTask_2018);
		case DataStructureEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?DataStructure", //$NON-NLS-1$
					WorkflowElementTypes.DataStructure_2019);
		case RemoteCommunicationChannelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?RemoteCommunicationChannel", //$NON-NLS-1$
					WorkflowElementTypes.RemoteCommunicationChannel_2020);
		case CommunicationChannelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?CommunicationChannel", //$NON-NLS-1$
					WorkflowElementTypes.CommunicationChannel_2021);
		case DataStructure2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://org.crossminer.workflow?DataStructure", //$NON-NLS-1$
					WorkflowElementTypes.DataStructure_3001);
		case TaskIncomingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://org.crossminer.workflow?Task?incoming", //$NON-NLS-1$
					WorkflowElementTypes.TaskIncoming_4001);
		case CommunicationChannelIncomingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://org.crossminer.workflow?CommunicationChannel?incoming", //$NON-NLS-1$
					WorkflowElementTypes.CommunicationChannelIncoming_4002);
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
		case TaskEditPart.VISUAL_ID:
			return getTask_2016Text(view);
		case JavaTaskEditPart.VISUAL_ID:
			return getJavaTask_2017Text(view);
		case ScriptedTaskEditPart.VISUAL_ID:
			return getScriptedTask_2018Text(view);
		case DataStructureEditPart.VISUAL_ID:
			return getDataStructure_2019Text(view);
		case RemoteCommunicationChannelEditPart.VISUAL_ID:
			return getRemoteCommunicationChannel_2020Text(view);
		case CommunicationChannelEditPart.VISUAL_ID:
			return getCommunicationChannel_2021Text(view);
		case DataStructure2EditPart.VISUAL_ID:
			return getDataStructure_3001Text(view);
		case TaskIncomingEditPart.VISUAL_ID:
			return getTaskIncoming_4001Text(view);
		case CommunicationChannelIncomingEditPart.VISUAL_ID:
			return getCommunicationChannelIncoming_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getWorkflow_1000Text(View view) {
		Workflow domainModelElement = (Workflow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTask_2016Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Task_2016,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(TaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJavaTask_2017Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.JavaTask_2017,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(JavaTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getScriptedTask_2018Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.ScriptedTask_2018,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(ScriptedTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataStructure_2019Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.DataStructure_2019,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(DataStructureNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRemoteCommunicationChannel_2020Text(View view) {
		RemoteCommunicationChannel domainModelElement = (RemoteCommunicationChannel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommunicationChannel_2021Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.CommunicationChannel_2021,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataStructure_3001Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.DataStructure_3001,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(DataStructureName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTaskIncoming_4001Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.TaskIncoming_4001,
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
	private String getCommunicationChannelIncoming_4002Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.CommunicationChannelIncoming_4002,
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
