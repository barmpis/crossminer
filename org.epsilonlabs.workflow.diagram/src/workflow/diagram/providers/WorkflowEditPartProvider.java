/*
 * 
 */
package workflow.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.edit.parts.WorkflowEditPartFactory;
import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public WorkflowEditPartProvider() {
		super(new WorkflowEditPartFactory(), WorkflowVisualIDRegistry.TYPED_INSTANCE, WorkflowEditPart.MODEL_ID);
	}

}
