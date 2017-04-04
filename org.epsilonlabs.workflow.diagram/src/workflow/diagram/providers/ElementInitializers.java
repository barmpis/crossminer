/*
 * 
 */
package workflow.diagram.providers;

import workflow.diagram.part.WorkflowDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WorkflowDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			WorkflowDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
