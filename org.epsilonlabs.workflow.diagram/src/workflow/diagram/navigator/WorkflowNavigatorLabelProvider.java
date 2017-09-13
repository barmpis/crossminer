/*
* 
*/
package workflow.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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

import workflow.RemoteTaskCommunicationConfiguration;
import workflow.Workflow;
import workflow.diagram.edit.parts.Boolean2EditPart;
import workflow.diagram.edit.parts.BooleanEditPart;
import workflow.diagram.edit.parts.BooleanName2EditPart;
import workflow.diagram.edit.parts.BooleanNameEditPart;
import workflow.diagram.edit.parts.Double2EditPart;
import workflow.diagram.edit.parts.DoubleEditPart;
import workflow.diagram.edit.parts.DoubleName2EditPart;
import workflow.diagram.edit.parts.DoubleNameEditPart;
import workflow.diagram.edit.parts.EmittingTaskEditPart;
import workflow.diagram.edit.parts.EmittingTaskNameEditPart;
import workflow.diagram.edit.parts.Integer2EditPart;
import workflow.diagram.edit.parts.IntegerEditPart;
import workflow.diagram.edit.parts.IntegerName2EditPart;
import workflow.diagram.edit.parts.IntegerNameEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationAddressEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationAddressPortSingleQueueEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationAddressPortSingleQueueQEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationPortEditPart;
import workflow.diagram.edit.parts.String2EditPart;
import workflow.diagram.edit.parts.StringEditPart;
import workflow.diagram.edit.parts.StringName2EditPart;
import workflow.diagram.edit.parts.StringNameEditPart;
import workflow.diagram.edit.parts.TaskCommunicationConfigurationEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.edit.parts.TaskNameEditPart;
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
			return getImage("Navigator?Diagram?http://org.crossminer.workflow?Workflow", //$NON-NLS-1$
					WorkflowElementTypes.Workflow_1000);
		case EmittingTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?EmittingTask", //$NON-NLS-1$
					WorkflowElementTypes.EmittingTask_2011);
		case StringEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?String", //$NON-NLS-1$
					WorkflowElementTypes.String_2012);
		case IntegerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?Integer", //$NON-NLS-1$
					WorkflowElementTypes.Integer_2013);
		case BooleanEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?Boolean", //$NON-NLS-1$
					WorkflowElementTypes.Boolean_2014);
		case DoubleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?Double", //$NON-NLS-1$
					WorkflowElementTypes.Double_2015);
		case TaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.crossminer.workflow?Task", //$NON-NLS-1$
					WorkflowElementTypes.Task_2016);
		case String2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://org.crossminer.workflow?String", WorkflowElementTypes.String_3001); //$NON-NLS-1$
		case Integer2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://org.crossminer.workflow?Integer", WorkflowElementTypes.Integer_3002); //$NON-NLS-1$
		case Boolean2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://org.crossminer.workflow?Boolean", WorkflowElementTypes.Boolean_3003); //$NON-NLS-1$
		case Double2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://org.crossminer.workflow?Double", WorkflowElementTypes.Double_3004); //$NON-NLS-1$
		case RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://org.crossminer.workflow?RemoteTaskCommunicationConfiguration", //$NON-NLS-1$
					WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004);
		case TaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://org.crossminer.workflow?TaskCommunicationConfiguration", //$NON-NLS-1$
					WorkflowElementTypes.TaskCommunicationConfiguration_4005);
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
		case EmittingTaskEditPart.VISUAL_ID:
			return getEmittingTask_2011Text(view);
		case StringEditPart.VISUAL_ID:
			return getString_2012Text(view);
		case IntegerEditPart.VISUAL_ID:
			return getInteger_2013Text(view);
		case BooleanEditPart.VISUAL_ID:
			return getBoolean_2014Text(view);
		case DoubleEditPart.VISUAL_ID:
			return getDouble_2015Text(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2016Text(view);
		case String2EditPart.VISUAL_ID:
			return getString_3001Text(view);
		case Integer2EditPart.VISUAL_ID:
			return getInteger_3002Text(view);
		case Boolean2EditPart.VISUAL_ID:
			return getBoolean_3003Text(view);
		case Double2EditPart.VISUAL_ID:
			return getDouble_3004Text(view);
		case RemoteTaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getRemoteTaskCommunicationConfiguration_4004Text(view);
		case TaskCommunicationConfigurationEditPart.VISUAL_ID:
			return getTaskCommunicationConfiguration_4005Text(view);
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
	private String getEmittingTask_2011Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.EmittingTask_2011,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(EmittingTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getString_2012Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.String_2012,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(StringNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInteger_2013Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Integer_2013,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(IntegerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBoolean_2014Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Boolean_2014,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(BooleanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDouble_2015Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Double_2015,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(DoubleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
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
	private String getString_3001Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.String_3001,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(StringName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInteger_3002Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Integer_3002,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(IntegerName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBoolean_3003Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Boolean_3003,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(BooleanName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDouble_3004Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Double_3004,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(DoubleName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRemoteTaskCommunicationConfiguration_4004Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(
				WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004,
				view.getElement() != null ? view.getElement() : view, WorkflowVisualIDRegistry
						.getType(RemoteTaskCommunicationConfigurationAddressPortSingleQueueQEditPart.VISUAL_ID));
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
	private String getTaskCommunicationConfiguration_4005Text(View view) {
		return ""; //$NON-NLS-1$
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
