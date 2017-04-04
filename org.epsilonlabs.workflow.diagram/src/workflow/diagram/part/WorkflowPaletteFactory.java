
/*
 * 
 */
package workflow.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createAuthors1CreationTool());
		paletteContainer.add(createCommits2CreationTool());
		paletteContainer.add(createCustomScript3CreationTool());
		paletteContainer.add(createDataAggregation4CreationTool());
		paletteContainer.add(createDataFiltering5CreationTool());
		paletteContainer.add(createDataManipulation6CreationTool());
		paletteContainer.add(createFiles7CreationTool());
		paletteContainer.add(createGHTorrent8CreationTool());
		paletteContainer.add(createGithub9CreationTool());
		paletteContainer.add(createGithubBigQuery10CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createRetrievals1CreationTool());
		paletteContainer.add(createSources2CreationTool());
		paletteContainer.add(createSources3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAuthors1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Authors1CreationTool_title,
				Messages.Authors1CreationTool_desc, Collections.singletonList(WorkflowElementTypes.Authors_2005));
		entry.setId("createAuthors1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Authors_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCommits2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Commits2CreationTool_title,
				Messages.Commits2CreationTool_desc, Collections.singletonList(WorkflowElementTypes.Commits_2004));
		entry.setId("createCommits2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Commits_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCustomScript3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CustomScript3CreationTool_title,
				Messages.CustomScript3CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.CustomScript_2009));
		entry.setId("createCustomScript3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.CustomScript_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataAggregation4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataAggregation4CreationTool_title,
				Messages.DataAggregation4CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.DataAggregation_2007));
		entry.setId("createDataAggregation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.DataAggregation_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataFiltering5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataFiltering5CreationTool_title,
				Messages.DataFiltering5CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.DataFiltering_2008));
		entry.setId("createDataFiltering5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.DataFiltering_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataManipulation6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataManipulation6CreationTool_title,
				Messages.DataManipulation6CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.DataManipulation_2010));
		entry.setId("createDataManipulation6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.DataManipulation_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFiles7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Files7CreationTool_title,
				Messages.Files7CreationTool_desc, Collections.singletonList(WorkflowElementTypes.Files_2006));
		entry.setId("createFiles7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Files_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGHTorrent8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GHTorrent8CreationTool_title,
				Messages.GHTorrent8CreationTool_desc, Collections.singletonList(WorkflowElementTypes.GHTorrent_2003));
		entry.setId("createGHTorrent8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.GHTorrent_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGithub9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Github9CreationTool_title,
				Messages.Github9CreationTool_desc, Collections.singletonList(WorkflowElementTypes.Github_2001));
		entry.setId("createGithub9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Github_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGithubBigQuery10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GithubBigQuery10CreationTool_title,
				Messages.GithubBigQuery10CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.GithubBigQuery_2002));
		entry.setId("createGithubBigQuery10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.GithubBigQuery_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRetrievals1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Retrievals1CreationTool_title,
				Messages.Retrievals1CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.DataSourceRetrievals_4001));
		entry.setId("createRetrievals1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.DataSourceRetrievals_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSources2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Sources2CreationTool_title,
				Messages.Sources2CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.DataRetrievalSources_4002));
		entry.setId("createSources2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.DataRetrievalSources_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSources3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Sources3CreationTool_title,
				Messages.Sources3CreationTool_desc,
				Collections.singletonList(WorkflowElementTypes.DataManipulationSources_4003));
		entry.setId("createSources3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.DataManipulationSources_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
