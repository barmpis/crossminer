package workflow.diagram.subscription;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import workflow.diagram.part.WorkflowDiagramEditor;

/**
 * @generated NOT
 */
public class WorkflowGraphicalChangeSubscription {

	private static Set<DiagramDocumentEditor> subscribers = new HashSet<DiagramDocumentEditor>();

	private static Map<EObject, ShapeNodeEditPart> elementCache = new HashMap<>();

	public static boolean subscribeToGraphicalChanges(DiagramDocumentEditor e) {
		return subscribers.add(e);
	}

	public static void elementInProgress(EObject e) {

		for (DiagramDocumentEditor d : subscribers) {
			Diagram diag = d.getDiagram();
			URI diaguri = diag.getElement().eResource().getURI();
			URI elementuri = e.eResource().getURI();

			if (diaguri.equals(elementuri)) {

				ShapeNodeEditPart v = getVisibleElementFromCache(d, e);
				// v.makepretty
				v.notifyChanged(new NotificationImpl(Notification.EVENT_TYPE_COUNT, "ignored", "running"));

			}
		}

	}

	public static void elementBlocked(EObject e) {

		for (DiagramDocumentEditor d : subscribers) {
			Diagram diag = d.getDiagram();
			URI diaguri = diag.getElement().eResource().getURI();
			URI elementuri = e.eResource().getURI();

			if (diaguri.equals(elementuri)) {

				ShapeNodeEditPart v = getVisibleElementFromCache(d, e);
				// v.makepretty
				v.notifyChanged(new NotificationImpl(Notification.EVENT_TYPE_COUNT, "ignored", "busy"));

			}
		}

	}

	public static void elementComplete(EObject e) {

		for (DiagramDocumentEditor d : subscribers) {
			Diagram diag = d.getDiagram();
			URI diaguri = diag.getElement().eResource().getURI();
			URI elementuri = e.eResource().getURI();

			if (diaguri.equals(elementuri)) {

				ShapeNodeEditPart v = getVisibleElementFromCache(d, e);
				// v.makepretty
				v.notifyChanged(new NotificationImpl(Notification.EVENT_TYPE_COUNT, "ignored", "empty"));

			}
		}

	}

	public static void executionStarted() {
		for (DiagramDocumentEditor d : subscribers)
			d.showBusy(true);

	}

	public static void executionEnded() {
		for (final DiagramDocumentEditor d : subscribers) {
			d.showBusy(false);

			Job j = new Job("saving diagram resource") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					d.doSave(monitor);
					return new Status(IStatus.OK, "org.epsilonlabs.workflow.diagram", "save successful");
				}
			};
			j.schedule();
		}
	}

	public static void cancelSubscription(WorkflowDiagramEditor wde) {
		subscribers.remove(wde);
	}

	private static ShapeNodeEditPart getVisibleElementFromCache(DiagramDocumentEditor d, EObject e) {

		ShapeNodeEditPart ret = elementCache.get(e);

		if (ret == null) {

			IDiagramGraphicalViewer viewer = (IDiagramGraphicalViewer) d.getDiagramEditPart().getViewer();
			Collection<EditPart> editParts;

			for (Iterator<?> it = d.getDiagram().eAllContents(); it.hasNext();) {

				Object next = it.next();

				if (next instanceof View) {

					View n = (View) next;

					if (n.getElement() != null && n.getElement().equals(e)) {

						Object reg = viewer.getEditPartRegistry().get(n);

						if (reg instanceof Iterable)
							editParts = (Collection<EditPart>) reg;
						else {
							editParts = new LinkedList<EditPart>();
							if (reg != null)
								editParts.add((EditPart) reg);
						}
						for (EditPart ep : editParts) {
							if (ep instanceof ShapeNodeEditPart) {
								ShapeNodeEditPart shape = (ShapeNodeEditPart) ep;
								elementCache.put(e, shape);
								return shape;
							}
						}
					}

				}
			}

		}

		return ret;

	}

}
