/*
 * 
 */
package workflow.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import workflow.diagram.edit.policies.EmittingTaskItemSemanticEditPolicy;
import workflow.diagram.edit.policies.OpenDiagramEditPolicy;
import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class EmittingTaskEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2011;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public EmittingTaskEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new EmittingTaskItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new EmittingTaskFigure();
	}

	/**
	* @generated
	*/
	public EmittingTaskFigure getPrimaryShape() {
		return (EmittingTaskFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EmittingTaskNameEditPart) {
			((EmittingTaskNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureEmittingTaskLabelFigure());
			return true;
		}
		if (childEditPart instanceof EmittingTaskConcurrencyEditPart) {
			((EmittingTaskConcurrencyEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTaskConcurrencyLabelFigure());
			return true;
		}
		if (childEditPart instanceof EmittingTaskImplementationFullyQualEditPart) {
			((EmittingTaskImplementationFullyQualEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTaskImplementationFullyQualifiedNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof EmittingTaskImplementationEntryPoinEditPart) {
			((EmittingTaskImplementationEntryPoinEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTaskImplementationEntryPointLabelFigure());
			return true;
		}
		if (childEditPart instanceof EmittingTaskAcceptsPartialDataEditPart) {
			((EmittingTaskAcceptsPartialDataEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTaskAcceptsPartialDataLabelFigure());
			return true;
		}
		if (childEditPart instanceof EmittingTaskProvidesPartialDataEditPart) {
			((EmittingTaskProvidesPartialDataEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureEmittingTaskProvidesPartialDataLabelFigure());
			return true;
		}
		if (childEditPart instanceof EmittingTaskEmittingTaskLocalsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getEmittingTaskLocalsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((EmittingTaskEmittingTaskLocalsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EmittingTaskNameEditPart) {
			return true;
		}
		if (childEditPart instanceof EmittingTaskConcurrencyEditPart) {
			return true;
		}
		if (childEditPart instanceof EmittingTaskImplementationFullyQualEditPart) {
			return true;
		}
		if (childEditPart instanceof EmittingTaskImplementationEntryPoinEditPart) {
			return true;
		}
		if (childEditPart instanceof EmittingTaskAcceptsPartialDataEditPart) {
			return true;
		}
		if (childEditPart instanceof EmittingTaskProvidesPartialDataEditPart) {
			return true;
		}
		if (childEditPart instanceof EmittingTaskEmittingTaskLocalsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getEmittingTaskLocalsCompartmentFigure();
			pane.remove(((EmittingTaskEmittingTaskLocalsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof EmittingTaskEmittingTaskLocalsCompartmentEditPart) {
			return getPrimaryShape().getEmittingTaskLocalsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(WorkflowVisualIDRegistry.getType(EmittingTaskNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class EmittingTaskFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEmittingTaskLabelFigure;

		/**
		* @generated
		*/
		private WrappingLabel fFigureTaskConcurrencyLabelFigure;
		/**
		* @generated
		*/
		private WrappingLabel fFigureTaskImplementationFullyQualifiedNameLabelFigure;
		/**
		* @generated
		*/
		private WrappingLabel fFigureTaskImplementationEntryPointLabelFigure;
		/**
		* @generated
		*/
		private WrappingLabel fFigureTaskAcceptsPartialDataLabelFigure;
		/**
		* @generated
		*/
		private WrappingLabel fFigureEmittingTaskProvidesPartialDataLabelFigure;
		/**
		* @generated
		*/
		private RectangleFigure fEmittingTaskLocalsCompartmentFigure;

		/**
			 * @generated
			 */
		public EmittingTaskFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureEmittingTaskLabelFigure = new WrappingLabel();

			fFigureEmittingTaskLabelFigure.setText("EmittingTask");
			fFigureEmittingTaskLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureEmittingTaskLabelFigure);

			fFigureTaskConcurrencyLabelFigure = new WrappingLabel();

			fFigureTaskConcurrencyLabelFigure.setText("");

			this.add(fFigureTaskConcurrencyLabelFigure);

			fFigureTaskImplementationFullyQualifiedNameLabelFigure = new WrappingLabel();

			fFigureTaskImplementationFullyQualifiedNameLabelFigure.setText("");

			this.add(fFigureTaskImplementationFullyQualifiedNameLabelFigure);

			fFigureTaskImplementationEntryPointLabelFigure = new WrappingLabel();

			fFigureTaskImplementationEntryPointLabelFigure.setText("");

			this.add(fFigureTaskImplementationEntryPointLabelFigure);

			fFigureTaskAcceptsPartialDataLabelFigure = new WrappingLabel();

			fFigureTaskAcceptsPartialDataLabelFigure.setText("");

			this.add(fFigureTaskAcceptsPartialDataLabelFigure);

			fFigureEmittingTaskProvidesPartialDataLabelFigure = new WrappingLabel();

			fFigureEmittingTaskProvidesPartialDataLabelFigure.setText("");

			this.add(fFigureEmittingTaskProvidesPartialDataLabelFigure);

			fEmittingTaskLocalsCompartmentFigure = new RectangleFigure();

			fEmittingTaskLocalsCompartmentFigure.setOutline(false);

			this.add(fEmittingTaskLocalsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEmittingTaskLabelFigure() {
			return fFigureEmittingTaskLabelFigure;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureTaskConcurrencyLabelFigure() {
			return fFigureTaskConcurrencyLabelFigure;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureTaskImplementationFullyQualifiedNameLabelFigure() {
			return fFigureTaskImplementationFullyQualifiedNameLabelFigure;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureTaskImplementationEntryPointLabelFigure() {
			return fFigureTaskImplementationEntryPointLabelFigure;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureTaskAcceptsPartialDataLabelFigure() {
			return fFigureTaskAcceptsPartialDataLabelFigure;
		}

		/**
		* @generated
		*/
		public WrappingLabel getFigureEmittingTaskProvidesPartialDataLabelFigure() {
			return fFigureEmittingTaskProvidesPartialDataLabelFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getEmittingTaskLocalsCompartmentFigure() {
			return fEmittingTaskLocalsCompartmentFigure;
		}

	}

}
