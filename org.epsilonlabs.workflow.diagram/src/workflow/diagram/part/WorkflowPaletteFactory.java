
/*
 * 
 */
package workflow.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class WorkflowPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createBoolean1CreationTool());
		paletteContainer.add(createDouble2CreationTool());
		paletteContainer.add(createEmittingTask3CreationTool());
		paletteContainer.add(createInteger4CreationTool());
		paletteContainer.add(createString5CreationTool());
		paletteContainer.add(createTask6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createRemoteTaskCommunicationConfiguration1CreationTool());
		paletteContainer.add(createTaskCommunicationConfiguration2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createBoolean1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.Boolean_3003);
		types.add(WorkflowElementTypes.Boolean_2014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Boolean1CreationTool_title,
				Messages.Boolean1CreationTool_desc, types);
		entry.setId("createBoolean1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Boolean_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDouble2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.Double_3004);
		types.add(WorkflowElementTypes.Double_2015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Double2CreationTool_title,
				Messages.Double2CreationTool_desc, types);
		entry.setId("createDouble2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Double_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEmittingTask3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EmittingTask3CreationTool_title,
				Messages.EmittingTask3CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.EmittingTask_2011));
		entry.setId("createEmittingTask3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.EmittingTask_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInteger4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.Integer_3002);
		types.add(WorkflowElementTypes.Integer_2013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Integer4CreationTool_title,
				Messages.Integer4CreationTool_desc, types);
		entry.setId("createInteger4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Integer_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createString5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.String_3001);
		types.add(WorkflowElementTypes.String_2012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.String5CreationTool_title,
				Messages.String5CreationTool_desc, types);
		entry.setId("createString5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.String_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTask6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Task6CreationTool_title,
				Messages.Task6CreationTool_desc, Collections.singletonList(WorkflowElementTypes.Task_2016));
		entry.setId("createTask6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Task_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRemoteTaskCommunicationConfiguration1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RemoteTaskCommunicationConfiguration1CreationTool_title,
				Messages.RemoteTaskCommunicationConfiguration1CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004));
		entry.setId("createRemoteTaskCommunicationConfiguration1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes
				.getImageDescriptor(WorkflowElementTypes.RemoteTaskCommunicationConfiguration_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaskCommunicationConfiguration2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.TaskCommunicationConfiguration2CreationTool_title,
				Messages.TaskCommunicationConfiguration2CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.TaskCommunicationConfiguration_4005));
		entry.setId("createTaskCommunicationConfiguration2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.TaskCommunicationConfiguration_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
