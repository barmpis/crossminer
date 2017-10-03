/*
* 
*/
package workflow.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import workflow.diagram.edit.parts.CommunicationChannelCommunicationChannelTypeCompartmentEditPart;
import workflow.diagram.edit.parts.CommunicationChannelEditPart;
import workflow.diagram.edit.parts.CommunicationChannelIncomingEditPart;
import workflow.diagram.edit.parts.DataStructure2EditPart;
import workflow.diagram.edit.parts.DataStructureEditPart;
import workflow.diagram.edit.parts.JavaTaskEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart;
import workflow.diagram.edit.parts.ScriptedTaskEditPart;
import workflow.diagram.edit.parts.TaskEditPart;
import workflow.diagram.edit.parts.TaskIncomingEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.part.Messages;
import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public WorkflowNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<WorkflowNavigatorItem> result = new ArrayList<WorkflowNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, WorkflowEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof WorkflowNavigatorGroup) {
			WorkflowNavigatorGroup group = (WorkflowNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof WorkflowNavigatorItem) {
			WorkflowNavigatorItem navigatorItem = (WorkflowNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {

		case WorkflowEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			WorkflowNavigatorGroup links = new WorkflowNavigatorGroup(Messages.NavigatorGroupName_Workflow_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(JavaTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(ScriptedTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(RemoteCommunicationChannelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(CommunicationChannelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(DataStructureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(TaskIncomingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(CommunicationChannelIncomingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case TaskEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Task_2016_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Task_2016_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(TaskIncomingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(CommunicationChannelIncomingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case JavaTaskEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_JavaTask_2017_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_JavaTask_2017_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(TaskIncomingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(CommunicationChannelIncomingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScriptedTaskEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_ScriptedTask_2018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_ScriptedTask_2018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(TaskIncomingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(CommunicationChannelIncomingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RemoteCommunicationChannelEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_RemoteCommunicationChannel_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_RemoteCommunicationChannel_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), WorkflowVisualIDRegistry
					.getType(RemoteCommunicationChannelRemoteCommunicationChannelTypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(DataStructure2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(TaskIncomingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(CommunicationChannelIncomingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CommunicationChannelEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_CommunicationChannel_2021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_CommunicationChannel_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), WorkflowVisualIDRegistry
					.getType(CommunicationChannelCommunicationChannelTypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(DataStructure2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(TaskIncomingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(CommunicationChannelIncomingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TaskIncomingEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkflowNavigatorGroup target = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_TaskIncoming_4001_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup source = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_TaskIncoming_4001_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(RemoteCommunicationChannelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(CommunicationChannelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(JavaTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(ScriptedTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CommunicationChannelIncomingEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkflowNavigatorGroup target = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_CommunicationChannelIncoming_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkflowNavigatorGroup source = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_CommunicationChannelIncoming_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(JavaTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(ScriptedTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(RemoteCommunicationChannelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(CommunicationChannelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WorkflowEditPart.MODEL_ID.equals(WorkflowVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<WorkflowNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<WorkflowNavigatorItem> result = new ArrayList<WorkflowNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new WorkflowNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<WorkflowNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof WorkflowAbstractNavigatorItem) {
			WorkflowAbstractNavigatorItem abstractNavigatorItem = (WorkflowAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
