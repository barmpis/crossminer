/*
 * 
 */
package workflow.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WorkflowVisualIDRegistry.getVisualID(view)) {

			case WorkflowEditPart.VISUAL_ID:
				return new WorkflowEditPart(view);

			case GithubEditPart.VISUAL_ID:
				return new GithubEditPart(view);

			case GithubUrlEditPart.VISUAL_ID:
				return new GithubUrlEditPart(view);

			case GithubBigQueryEditPart.VISUAL_ID:
				return new GithubBigQueryEditPart(view);

			case GithubBigQueryUrlEditPart.VISUAL_ID:
				return new GithubBigQueryUrlEditPart(view);

			case GHTorrentEditPart.VISUAL_ID:
				return new GHTorrentEditPart(view);

			case GHTorrentUrlEditPart.VISUAL_ID:
				return new GHTorrentUrlEditPart(view);

			case CommitsEditPart.VISUAL_ID:
				return new CommitsEditPart(view);

			case CommitsRepoPatternsEditPart.VISUAL_ID:
				return new CommitsRepoPatternsEditPart(view);

			case AuthorsEditPart.VISUAL_ID:
				return new AuthorsEditPart(view);

			case AuthorsRepoPatternsEditPart.VISUAL_ID:
				return new AuthorsRepoPatternsEditPart(view);

			case FilesEditPart.VISUAL_ID:
				return new FilesEditPart(view);

			case FilesRepoPatternsEditPart.VISUAL_ID:
				return new FilesRepoPatternsEditPart(view);

			case DataAggregationEditPart.VISUAL_ID:
				return new DataAggregationEditPart(view);

			case DataAggregationTempEditPart.VISUAL_ID:
				return new DataAggregationTempEditPart(view);

			case DataFilteringEditPart.VISUAL_ID:
				return new DataFilteringEditPart(view);

			case DataFilteringTempEditPart.VISUAL_ID:
				return new DataFilteringTempEditPart(view);

			case CustomScriptEditPart.VISUAL_ID:
				return new CustomScriptEditPart(view);

			case CustomScriptTempEditPart.VISUAL_ID:
				return new CustomScriptTempEditPart(view);

			case DataManipulationEditPart.VISUAL_ID:
				return new DataManipulationEditPart(view);

			case DataManipulationTempEditPart.VISUAL_ID:
				return new DataManipulationTempEditPart(view);

			case DataSourceRetrievalsEditPart.VISUAL_ID:
				return new DataSourceRetrievalsEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case DataRetrievalSourcesEditPart.VISUAL_ID:
				return new DataRetrievalSourcesEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case DataManipulationSourcesEditPart.VISUAL_ID:
				return new DataManipulationSourcesEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
