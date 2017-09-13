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

import workflow.diagram.edit.policies.OpenDiagramEditPolicy;
import workflow.diagram.edit.policies.TaskItemSemanticEditPolicy;
import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class TaskEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2016;

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
	public TaskEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new TaskItemSemanticEditPolicy());
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
		return primaryShape = new TaskFigure();
	}

	/**
	* @generated
	*/
	public TaskFigure getPrimaryShape() {
		return (TaskFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TaskNameEditPart) {
			((TaskNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureTaskLabelFigure());
			return true;
		}
		if (childEditPart instanceof TaskConcurrencyEditPart) {
			((TaskConcurrencyEditPart) childEditPart).setLabel(getPrimaryShape().getFigureTaskConcurrencyLabelFigure());
			return true;
		}
		if (childEditPart instanceof TaskImplementationFullyQualEditPart) {
			((TaskImplementationFullyQualEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTaskImplementationFullyQualifiedNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof TaskImplementationEntryPoinEditPart) {
			((TaskImplementationEntryPoinEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTaskImplementationEntryPointLabelFigure());
			return true;
		}
		if (childEditPart instanceof TaskAcceptsPartialDataEditPart) {
			((TaskAcceptsPartialDataEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTaskAcceptsPartialDataLabelFigure());
			return true;
		}
		if (childEditPart instanceof TaskTaskLocalsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTaskLocalsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TaskTaskLocalsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TaskNameEditPart) {
			return true;
		}
		if (childEditPart instanceof TaskConcurrencyEditPart) {
			return true;
		}
		if (childEditPart instanceof TaskImplementationFullyQualEditPart) {
			return true;
		}
		if (childEditPart instanceof TaskImplementationEntryPoinEditPart) {
			return true;
		}
		if (childEditPart instanceof TaskAcceptsPartialDataEditPart) {
			return true;
		}
		if (childEditPart instanceof TaskTaskLocalsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTaskLocalsCompartmentFigure();
			pane.remove(((TaskTaskLocalsCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof TaskTaskLocalsCompartmentEditPart) {
			return getPrimaryShape().getTaskLocalsCompartmentFigure();
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
		return getChildBySemanticHint(WorkflowVisualIDRegistry.getType(TaskNameEditPart.VISUAL_ID));
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
	public class TaskFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTaskLabelFigure;

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
		private RectangleFigure fTaskLocalsCompartmentFigure;

		/**
			 * @generated
			 */
		public TaskFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTaskLabelFigure = new WrappingLabel();

			fFigureTaskLabelFigure.setText("Task");
			fFigureTaskLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureTaskLabelFigure);

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

			fTaskLocalsCompartmentFigure = new RectangleFigure();

			fTaskLocalsCompartmentFigure.setOutline(false);

			this.add(fTaskLocalsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTaskLabelFigure() {
			return fFigureTaskLabelFigure;
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
		public RectangleFigure getTaskLocalsCompartmentFigure() {
			return fTaskLocalsCompartmentFigure;
		}

	}

}
