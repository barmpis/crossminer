package org.epsilonlabs.workflow.execution;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import workflow.DataSource;
import workflow.diagram.part.WorkflowDiagramEditor;
import workflow.diagram.subscription.WorkflowGraphicalChangeSubscription;

/**
 * @generated NOT
 * @author kb
 *
 */
public class ExecuteWorkflow extends Job {

	private static Resource resource = null;

	public ExecuteWorkflow(Resource r) {
		super("workflow execution job");
		resource = r;
	}

	public IStatus run(IProgressMonitor m) {

		// try find out workload based on ???
		SubMonitor subMonitor = SubMonitor.convert(m, 6);

		// m.beginTask("Workflow execution task", 3);

		try {
			execute(subMonitor);
		} catch (Exception e) {
			e.printStackTrace();
			m.done();
			return new Status(IStatus.ERROR, "org.epsilonlabs.workflow.execution", "execution failed");
		}
		m.done();
		return new Status(IStatus.OK, "org.epsilonlabs.workflow.execution", "execution successful");
	}

	public void execute(IProgressMonitor m) throws Exception {

		long init = System.currentTimeMillis();

		// IWorkbenchWindow window =
		// HandlerUtil.getActiveWorkbenchWindowChecked(null);

		System.out.println("Running execution...");

		//
		System.out.println("Finding relevant open editors...");
		//
		for (IWorkbenchWindow window : PlatformUI.getWorkbench().getWorkbenchWindows()) {
			for (IWorkbenchPage page : window.getPages()) {
				for (IEditorReference editor : page.getEditorReferences()) {
					if (editor.getId().equals("workflow.diagram.part.WorkflowDiagramEditorID")) {
						WorkflowDiagramEditor wde = ((WorkflowDiagramEditor) editor.getEditor(false));
						Resource editorResource = wde.getDiagram().getElement().eResource();
						String editorResourcePath = editorResource.getURI().path();
						String workflowResourcePath = resource.getURI().path();
						//
						if (editorResourcePath.equals(workflowResourcePath)) {
							System.out.println("Found open editor to: " + editorResourcePath);
							System.out.println("Using this editor's workflow model resource instead");
							resource.unload();
							resource = editorResource;
							//

						}
					}
				}
			}

		}

		// FIXME execution stub
		WorkflowGraphicalChangeSubscription.executionStarted();

		TreeIterator<EObject> children = resource.getAllContents();
		List<DataSource> sources = new LinkedList<>();

		while (children.hasNext()) {

			EObject child = children.next();

			if (child instanceof DataSource) {
				sources.add((DataSource) child);
			}

		}

		//

		for (DataSource d : sources) {

			// System.out.println(c)
			System.out
					.println("(stub) retrieving data from datasource: " + d.eClass().getName() + "  at: " + d.getUrl());

			// setInProgressState(child);
			System.out.println("data retrieval in progress");
			WorkflowGraphicalChangeSubscription.elementInProgress(d);
			Thread.sleep(500);
			m.worked(1);

		}

		for (DataSource d : sources) {

			// setBlockedState(child);
			System.err.println("data retrieval blocked!");
			WorkflowGraphicalChangeSubscription.elementBlocked(d);
			Thread.sleep(500);
			m.worked(1);

		}

		for (DataSource d : sources) {

			// setComletedState(child);
			System.out.println("data retrieval complete");
			WorkflowGraphicalChangeSubscription.elementComplete(d);
			Thread.sleep(500);
			m.worked(1);
		}

		WorkflowGraphicalChangeSubscription.executionEnded();

		// if (wde != null && false) {
		//
		// String fp =
		// wde.getDiagram().eResource().getURI().path().replace("/resource/",
		// "");
		// IFile file = (IFile)
		// ResourcesPlugin.getWorkspace().getRoot().findMember(fp);
		//

		// wde.close(false);

		// if (file != null)
		// page.openEditor(new FileEditorInput(file),
		// "workflow.diagram.part.WorkflowDiagramEditorID");
		// else
		// System.out.println("file not found to re-open editor:
		// " + fp);

		//

		// System.out.println("updating editor: " + editor);

		// WorkflowDiagramEditor wde = (WorkflowDiagramEditor)
		// r.getEditor(false);

		// wde.close(false);

		// wde.showBusy(true);

		// AbstractEMFOperation emfOp = new
		// AbstractEMFOperation(wde.getEditingDomain(), "Recolor
		// Datasources") {
		//
		// @Override
		// protected IStatus doExecute(IProgressMonitor monitor,
		// IAdaptable
		// info) throws ExecutionException {
		//
		// wde.selectionChanged(wde, null);
		//
		// return null;
		// }
		// };
		//
		// try {
		// OperationHistoryFactory.getOperationHistory().execute(emfOp,
		// null, null);
		// } catch (
		//
		// ExecutionException e) {
		// e.printStackTrace();
		// }

		//
		// Iterator<EObject> itt = wde.getDiagram().eAllContents();
		// while (itt.hasNext()) {
		// EObject e = itt.next();
		// List<?> editPolicies =
		// CanonicalEditPolicy.getRegisteredEditPolicies(e);
		// for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {
		// CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
		// nextEditPolicy.refresh();
		// }
		// }
		//
		// wde.commandStackChanged(null);
		// wde.close(false);

		// wde.showBusy(false);

		// }

		long totaltime = System.currentTimeMillis() - init;

		System.out.println("Executed workflow, took: " + totaltime + "s");

	}

}

/**
 * 
 * // System.err.println("..."); IAction a = new RunAction(page);
 * 
 * a.setId("thisisanidipromiseyou"); a.setEnabled(true);
 * a.setImageDescriptor(ExtendedImageRegistry.getInstance().getImageDescriptor(
 * AbstractUIPlugin.imageDescriptorFromPlugin(
 * "org.epsilonlabs.workflow.diagram", "icons/Go-small.png")));
 * a.setText("Run!"); a.setDescription("Execute the workflow.");
 * 
 * addAction(a); bars.getToolBarManager().add(a);
 * 
 **/
