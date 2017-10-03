
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
		paletteContainer.add(createCommunicationChannel1CreationTool());
		paletteContainer.add(createDataStructure2CreationTool());
		paletteContainer.add(createJavaTask3CreationTool());
		paletteContainer.add(createRemoteCommunicationChannel4CreationTool());
		paletteContainer.add(createScriptedTask5CreationTool());
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
		paletteContainer.add(createIncoming1CreationTool());
		paletteContainer.add(createIncoming2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCommunicationChannel1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CommunicationChannel1CreationTool_title,
				Messages.CommunicationChannel1CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.CommunicationChannel_2021));
		entry.setId("createCommunicationChannel1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.CommunicationChannel_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataStructure2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.DataStructure_3001);
		types.add(WorkflowElementTypes.DataStructure_2019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataStructure2CreationTool_title,
				Messages.DataStructure2CreationTool_desc, types);
		entry.setId("createDataStructure2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.DataStructure_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJavaTask3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.JavaTask3CreationTool_title,
				Messages.JavaTask3CreationTool_desc, Collections.singletonList(WorkflowElementTypes.JavaTask_2017));
		entry.setId("createJavaTask3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.JavaTask_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRemoteCommunicationChannel4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RemoteCommunicationChannel4CreationTool_title,
				Messages.RemoteCommunicationChannel4CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.RemoteCommunicationChannel_2020));
		entry.setId("createRemoteCommunicationChannel4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.RemoteCommunicationChannel_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createScriptedTask5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ScriptedTask5CreationTool_title,
				Messages.ScriptedTask5CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.ScriptedTask_2018));
		entry.setId("createScriptedTask5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.ScriptedTask_2018));
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
	private ToolEntry createIncoming1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Incoming1CreationTool_title,
				Messages.Incoming1CreationTool_desc, Collections.singletonList(WorkflowElementTypes.TaskIncoming_4001));
		entry.setId("createIncoming1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.TaskIncoming_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIncoming2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Incoming2CreationTool_title,
				Messages.Incoming2CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.CommunicationChannelIncoming_4002));
		entry.setId("createIncoming2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.CommunicationChannelIncoming_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
