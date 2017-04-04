package workflow.diagram.part;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @generated NOT
 * @author kb
 *
 */
public class RunAction extends Action {

	private IWorkbenchPage page = null;

	@Override
	public int getStyle() {
		return Action.AS_PUSH_BUTTON;
	}

	public RunAction(IWorkbenchPage page) {
		this.page = page;
	}

	@Override
	public void run() {

		IEditorPart ep = page.getActiveEditor();

		WorkflowDiagramEditor wde = ((WorkflowDiagramEditor) ep);

		AbstractEMFOperation emfOp = new AbstractEMFOperation(wde.getEditingDomain(), "Recolor Datasources") {

			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

				DiagramImpl n = (DiagramImpl) wde.getDiagramEditPart().getModel();
				// MMM model = (MMM) n.basicGetElement();

				TreeIterator<EObject> children = n.eAllContents();

				while (children.hasNext()) {

					EObject child = children.next();

					if (child instanceof ShapeImpl) {

						ShapeImpl c = (ShapeImpl) child;

						// System.out.println(c);

						if (c.getFillColor() == 8388352)
							c.setFillColor(3158271);
						else if (c.getFillColor() == 3158271)
							c.setFillColor(16777215);
						else
							c.setFillColor(8388352);
					}

				}

				wde.doSave(new NullProgressMonitor());

				return Status.OK_STATUS;
			}
		};

		try {

			OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

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
