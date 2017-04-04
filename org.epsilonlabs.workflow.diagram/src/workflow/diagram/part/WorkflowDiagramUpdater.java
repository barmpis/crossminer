/*
* 
*/
package workflow.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import workflow.Authors;
import workflow.Commits;
import workflow.CustomScript;
import workflow.DataAggregation;
import workflow.DataFiltering;
import workflow.DataManipulation;
import workflow.DataRetrieval;
import workflow.DataSource;
import workflow.Element;
import workflow.Files;
import workflow.GHTorrent;
import workflow.Github;
import workflow.GithubBigQuery;
import workflow.Workflow;
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
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class WorkflowDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getSemanticChildren(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getWorkflow_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Workflow modelElement = (Workflow) view.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContents().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GithubEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GithubBigQueryEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GHTorrentEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommitsEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AuthorsEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilesEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataAggregationEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataFilteringEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomScriptEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataManipulationEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getContainedLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000ContainedLinks(view);
		case GithubEditPart.VISUAL_ID:
			return getGithub_2001ContainedLinks(view);
		case GithubBigQueryEditPart.VISUAL_ID:
			return getGithubBigQuery_2002ContainedLinks(view);
		case GHTorrentEditPart.VISUAL_ID:
			return getGHTorrent_2003ContainedLinks(view);
		case CommitsEditPart.VISUAL_ID:
			return getCommits_2004ContainedLinks(view);
		case AuthorsEditPart.VISUAL_ID:
			return getAuthors_2005ContainedLinks(view);
		case FilesEditPart.VISUAL_ID:
			return getFiles_2006ContainedLinks(view);
		case DataAggregationEditPart.VISUAL_ID:
			return getDataAggregation_2007ContainedLinks(view);
		case DataFilteringEditPart.VISUAL_ID:
			return getDataFiltering_2008ContainedLinks(view);
		case CustomScriptEditPart.VISUAL_ID:
			return getCustomScript_2009ContainedLinks(view);
		case DataManipulationEditPart.VISUAL_ID:
			return getDataManipulation_2010ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getIncomingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case GithubEditPart.VISUAL_ID:
			return getGithub_2001IncomingLinks(view);
		case GithubBigQueryEditPart.VISUAL_ID:
			return getGithubBigQuery_2002IncomingLinks(view);
		case GHTorrentEditPart.VISUAL_ID:
			return getGHTorrent_2003IncomingLinks(view);
		case CommitsEditPart.VISUAL_ID:
			return getCommits_2004IncomingLinks(view);
		case AuthorsEditPart.VISUAL_ID:
			return getAuthors_2005IncomingLinks(view);
		case FilesEditPart.VISUAL_ID:
			return getFiles_2006IncomingLinks(view);
		case DataAggregationEditPart.VISUAL_ID:
			return getDataAggregation_2007IncomingLinks(view);
		case DataFilteringEditPart.VISUAL_ID:
			return getDataFiltering_2008IncomingLinks(view);
		case CustomScriptEditPart.VISUAL_ID:
			return getCustomScript_2009IncomingLinks(view);
		case DataManipulationEditPart.VISUAL_ID:
			return getDataManipulation_2010IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getOutgoingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case GithubEditPart.VISUAL_ID:
			return getGithub_2001OutgoingLinks(view);
		case GithubBigQueryEditPart.VISUAL_ID:
			return getGithubBigQuery_2002OutgoingLinks(view);
		case GHTorrentEditPart.VISUAL_ID:
			return getGHTorrent_2003OutgoingLinks(view);
		case CommitsEditPart.VISUAL_ID:
			return getCommits_2004OutgoingLinks(view);
		case AuthorsEditPart.VISUAL_ID:
			return getAuthors_2005OutgoingLinks(view);
		case FilesEditPart.VISUAL_ID:
			return getFiles_2006OutgoingLinks(view);
		case DataAggregationEditPart.VISUAL_ID:
			return getDataAggregation_2007OutgoingLinks(view);
		case DataFilteringEditPart.VISUAL_ID:
			return getDataFiltering_2008OutgoingLinks(view);
		case CustomScriptEditPart.VISUAL_ID:
			return getCustomScript_2009OutgoingLinks(view);
		case DataManipulationEditPart.VISUAL_ID:
			return getDataManipulation_2010OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflow_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getGithub_2001ContainedLinks(View view) {
		Github modelElement = (Github) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataSource_Retrievals_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getGithubBigQuery_2002ContainedLinks(View view) {
		GithubBigQuery modelElement = (GithubBigQuery) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataSource_Retrievals_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getGHTorrent_2003ContainedLinks(View view) {
		GHTorrent modelElement = (GHTorrent) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataSource_Retrievals_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getCommits_2004ContainedLinks(View view) {
		Commits modelElement = (Commits) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataRetrieval_Sources_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAuthors_2005ContainedLinks(View view) {
		Authors modelElement = (Authors) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataRetrieval_Sources_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getFiles_2006ContainedLinks(View view) {
		Files modelElement = (Files) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataRetrieval_Sources_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataAggregation_2007ContainedLinks(View view) {
		DataAggregation modelElement = (DataAggregation) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataFiltering_2008ContainedLinks(View view) {
		DataFiltering modelElement = (DataFiltering) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getCustomScript_2009ContainedLinks(View view) {
		CustomScript modelElement = (CustomScript) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataManipulation_2010ContainedLinks(View view) {
		DataManipulation modelElement = (DataManipulation) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getGithub_2001IncomingLinks(View view) {
		Github modelElement = (Github) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DataRetrieval_Sources_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getGithubBigQuery_2002IncomingLinks(View view) {
		GithubBigQuery modelElement = (GithubBigQuery) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DataRetrieval_Sources_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getGHTorrent_2003IncomingLinks(View view) {
		GHTorrent modelElement = (GHTorrent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DataRetrieval_Sources_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getCommits_2004IncomingLinks(View view) {
		Commits modelElement = (Commits) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DataSource_Retrievals_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAuthors_2005IncomingLinks(View view) {
		Authors modelElement = (Authors) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DataSource_Retrievals_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getFiles_2006IncomingLinks(View view) {
		Files modelElement = (Files) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DataSource_Retrievals_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataAggregation_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataFiltering_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getCustomScript_2009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataManipulation_2010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getGithub_2001OutgoingLinks(View view) {
		Github modelElement = (Github) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataSource_Retrievals_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getGithubBigQuery_2002OutgoingLinks(View view) {
		GithubBigQuery modelElement = (GithubBigQuery) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataSource_Retrievals_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getGHTorrent_2003OutgoingLinks(View view) {
		GHTorrent modelElement = (GHTorrent) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataSource_Retrievals_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getCommits_2004OutgoingLinks(View view) {
		Commits modelElement = (Commits) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataRetrieval_Sources_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAuthors_2005OutgoingLinks(View view) {
		Authors modelElement = (Authors) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataRetrieval_Sources_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getFiles_2006OutgoingLinks(View view) {
		Files modelElement = (Files) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataRetrieval_Sources_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataAggregation_2007OutgoingLinks(View view) {
		DataAggregation modelElement = (DataAggregation) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataFiltering_2008OutgoingLinks(View view) {
		DataFiltering modelElement = (DataFiltering) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getCustomScript_2009OutgoingLinks(View view) {
		CustomScript modelElement = (CustomScript) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getDataManipulation_2010OutgoingLinks(View view) {
		DataManipulation modelElement = (DataManipulation) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataManipulation_Sources_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkflowLinkDescriptor> getIncomingFeatureModelFacetLinks_DataSource_Retrievals_4001(
			DataRetrieval target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkflowPackage.eINSTANCE.getDataSource_Retrievals()) {
				result.add(new WorkflowLinkDescriptor(setting.getEObject(), target,
						WorkflowElementTypes.DataSourceRetrievals_4001, DataSourceRetrievalsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkflowLinkDescriptor> getIncomingFeatureModelFacetLinks_DataRetrieval_Sources_4002(
			DataSource target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkflowPackage.eINSTANCE.getDataRetrieval_Sources()) {
				result.add(new WorkflowLinkDescriptor(setting.getEObject(), target,
						WorkflowElementTypes.DataRetrievalSources_4002, DataRetrievalSourcesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkflowLinkDescriptor> getIncomingFeatureModelFacetLinks_DataManipulation_Sources_4003(
			DataRetrieval target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkflowPackage.eINSTANCE.getDataManipulation_Sources()) {
				result.add(new WorkflowLinkDescriptor(setting.getEObject(), target,
						WorkflowElementTypes.DataManipulationSources_4003, DataManipulationSourcesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getOutgoingFeatureModelFacetLinks_DataSource_Retrievals_4001(
			DataSource source) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> destinations = source.getRetrievals().iterator(); destinations.hasNext();) {
			DataRetrieval destination = (DataRetrieval) destinations.next();
			result.add(new WorkflowLinkDescriptor(source, destination, WorkflowElementTypes.DataSourceRetrievals_4001,
					DataSourceRetrievalsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getOutgoingFeatureModelFacetLinks_DataRetrieval_Sources_4002(
			DataRetrieval source) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> destinations = source.getSources().iterator(); destinations.hasNext();) {
			DataSource destination = (DataSource) destinations.next();
			result.add(new WorkflowLinkDescriptor(source, destination, WorkflowElementTypes.DataRetrievalSources_4002,
					DataRetrievalSourcesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getOutgoingFeatureModelFacetLinks_DataManipulation_Sources_4003(
			DataManipulation source) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> destinations = source.getSources().iterator(); destinations.hasNext();) {
			DataRetrieval destination = (DataRetrieval) destinations.next();
			result.add(new WorkflowLinkDescriptor(source, destination,
					WorkflowElementTypes.DataManipulationSources_4003, DataManipulationSourcesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<WorkflowNodeDescriptor> getSemanticChildren(View view) {
			return WorkflowDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkflowLinkDescriptor> getContainedLinks(View view) {
			return WorkflowDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkflowLinkDescriptor> getIncomingLinks(View view) {
			return WorkflowDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkflowLinkDescriptor> getOutgoingLinks(View view) {
			return WorkflowDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
