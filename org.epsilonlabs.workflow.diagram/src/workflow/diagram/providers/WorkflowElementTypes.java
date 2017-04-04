/*
 * 
 */
package workflow.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.AuthorsEditPart;
import workflow.diagram.edit.parts.CommitsEditPart;
import workflow.diagram.edit.parts.CustomScriptEditPart;
import workflow.diagram.edit.parts.DataAggregationEditPart;
import workflow.diagram.edit.parts.DataFilteringEditPart;
import workflow.diagram.edit.parts.DataManipulationEditPart;
import workflow.diagram.edit.parts.DataManipulationSourcesEditPart;
import workflow.diagram.edit.parts.DataRetrievalSourcesEditPart;
import workflow.diagram.edit.parts.DataSourceRetrievalsEditPart;
import workflow.diagram.edit.parts.FilesEditPart;
import workflow.diagram.edit.parts.GHTorrentEditPart;
import workflow.diagram.edit.parts.GithubBigQueryEditPart;
import workflow.diagram.edit.parts.GithubEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.part.WorkflowDiagramEditorPlugin;

/**
 * @generated
 */
public class WorkflowElementTypes {

	/**
	* @generated
	*/
	private WorkflowElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WorkflowDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Workflow_1000 = getElementType("org.epsilonlabs.workflow.diagram.Workflow_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Github_2001 = getElementType("org.epsilonlabs.workflow.diagram.Github_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GithubBigQuery_2002 = getElementType(
			"org.epsilonlabs.workflow.diagram.GithubBigQuery_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GHTorrent_2003 = getElementType("org.epsilonlabs.workflow.diagram.GHTorrent_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Commits_2004 = getElementType("org.epsilonlabs.workflow.diagram.Commits_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Authors_2005 = getElementType("org.epsilonlabs.workflow.diagram.Authors_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Files_2006 = getElementType("org.epsilonlabs.workflow.diagram.Files_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataAggregation_2007 = getElementType(
			"org.epsilonlabs.workflow.diagram.DataAggregation_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataFiltering_2008 = getElementType(
			"org.epsilonlabs.workflow.diagram.DataFiltering_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CustomScript_2009 = getElementType(
			"org.epsilonlabs.workflow.diagram.CustomScript_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataManipulation_2010 = getElementType(
			"org.epsilonlabs.workflow.diagram.DataManipulation_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataSourceRetrievals_4001 = getElementType(
			"org.epsilonlabs.workflow.diagram.DataSourceRetrievals_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataRetrievalSources_4002 = getElementType(
			"org.epsilonlabs.workflow.diagram.DataRetrievalSources_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataManipulationSources_4003 = getElementType(
			"org.epsilonlabs.workflow.diagram.DataManipulationSources_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Workflow_1000, WorkflowPackage.eINSTANCE.getWorkflow());

			elements.put(Github_2001, WorkflowPackage.eINSTANCE.getGithub());

			elements.put(GithubBigQuery_2002, WorkflowPackage.eINSTANCE.getGithubBigQuery());

			elements.put(GHTorrent_2003, WorkflowPackage.eINSTANCE.getGHTorrent());

			elements.put(Commits_2004, WorkflowPackage.eINSTANCE.getCommits());

			elements.put(Authors_2005, WorkflowPackage.eINSTANCE.getAuthors());

			elements.put(Files_2006, WorkflowPackage.eINSTANCE.getFiles());

			elements.put(DataAggregation_2007, WorkflowPackage.eINSTANCE.getDataAggregation());

			elements.put(DataFiltering_2008, WorkflowPackage.eINSTANCE.getDataFiltering());

			elements.put(CustomScript_2009, WorkflowPackage.eINSTANCE.getCustomScript());

			elements.put(DataManipulation_2010, WorkflowPackage.eINSTANCE.getDataManipulation());

			elements.put(DataSourceRetrievals_4001, WorkflowPackage.eINSTANCE.getDataSource_Retrievals());

			elements.put(DataRetrievalSources_4002, WorkflowPackage.eINSTANCE.getDataRetrieval_Sources());

			elements.put(DataManipulationSources_4003, WorkflowPackage.eINSTANCE.getDataManipulation_Sources());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Workflow_1000);
			KNOWN_ELEMENT_TYPES.add(Github_2001);
			KNOWN_ELEMENT_TYPES.add(GithubBigQuery_2002);
			KNOWN_ELEMENT_TYPES.add(GHTorrent_2003);
			KNOWN_ELEMENT_TYPES.add(Commits_2004);
			KNOWN_ELEMENT_TYPES.add(Authors_2005);
			KNOWN_ELEMENT_TYPES.add(Files_2006);
			KNOWN_ELEMENT_TYPES.add(DataAggregation_2007);
			KNOWN_ELEMENT_TYPES.add(DataFiltering_2008);
			KNOWN_ELEMENT_TYPES.add(CustomScript_2009);
			KNOWN_ELEMENT_TYPES.add(DataManipulation_2010);
			KNOWN_ELEMENT_TYPES.add(DataSourceRetrievals_4001);
			KNOWN_ELEMENT_TYPES.add(DataRetrievalSources_4002);
			KNOWN_ELEMENT_TYPES.add(DataManipulationSources_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WorkflowEditPart.VISUAL_ID:
			return Workflow_1000;
		case GithubEditPart.VISUAL_ID:
			return Github_2001;
		case GithubBigQueryEditPart.VISUAL_ID:
			return GithubBigQuery_2002;
		case GHTorrentEditPart.VISUAL_ID:
			return GHTorrent_2003;
		case CommitsEditPart.VISUAL_ID:
			return Commits_2004;
		case AuthorsEditPart.VISUAL_ID:
			return Authors_2005;
		case FilesEditPart.VISUAL_ID:
			return Files_2006;
		case DataAggregationEditPart.VISUAL_ID:
			return DataAggregation_2007;
		case DataFilteringEditPart.VISUAL_ID:
			return DataFiltering_2008;
		case CustomScriptEditPart.VISUAL_ID:
			return CustomScript_2009;
		case DataManipulationEditPart.VISUAL_ID:
			return DataManipulation_2010;
		case DataSourceRetrievalsEditPart.VISUAL_ID:
			return DataSourceRetrievals_4001;
		case DataRetrievalSourcesEditPart.VISUAL_ID:
			return DataRetrievalSources_4002;
		case DataManipulationSourcesEditPart.VISUAL_ID:
			return DataManipulationSources_4003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return workflow.diagram.providers.WorkflowElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return workflow.diagram.providers.WorkflowElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return workflow.diagram.providers.WorkflowElementTypes.getElement(elementTypeAdapter);
		}
	};

}
