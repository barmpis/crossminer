/*
 * 
 */
package workflow.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import workflow.diagram.edit.policies.RemoteTaskCommunicationConfigurationItemSemanticEditPolicy;

/**
 * @generated
 */
public class RemoteTaskCommunicationConfigurationEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4004;

	/**
	* @generated
	*/
	public RemoteTaskCommunicationConfigurationEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RemoteTaskCommunicationConfigurationItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected Connection createConnectionFigure() {
		return new RemoteTaskCommunicationConfigurationFigure();
	}

	/**
	* @generated
	*/
	public RemoteTaskCommunicationConfigurationFigure getPrimaryShape() {
		return (RemoteTaskCommunicationConfigurationFigure) getFigure();
	}

	/**
	* @generated
	*/
	public class RemoteTaskCommunicationConfigurationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RemoteTaskCommunicationConfigurationFigure() {
			this.setLineStyle(Graphics.LINE_DOT);

		}

	}

}
