/*
 * 
 */
package workflow.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.AuthorsRepoPatternsEditPart;
import workflow.diagram.edit.parts.CommitsRepoPatternsEditPart;
import workflow.diagram.edit.parts.CustomScriptTempEditPart;
import workflow.diagram.edit.parts.DataAggregationTempEditPart;
import workflow.diagram.edit.parts.DataFilteringTempEditPart;
import workflow.diagram.edit.parts.DataManipulationTempEditPart;
import workflow.diagram.edit.parts.FilesRepoPatternsEditPart;
import workflow.diagram.edit.parts.GHTorrentUrlEditPart;
import workflow.diagram.edit.parts.GithubBigQueryUrlEditPart;
import workflow.diagram.edit.parts.GithubUrlEditPart;
import workflow.diagram.parsers.MessageFormatParser;
import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser githubUrl_5001Parser;

	/**
	* @generated
	*/
	private IParser getGithubUrl_5001Parser() {
		if (githubUrl_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataSource_Url() };
			MessageFormatParser parser = new MessageFormatParser(features);
			githubUrl_5001Parser = parser;
		}
		return githubUrl_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser githubBigQueryUrl_5002Parser;

	/**
	* @generated
	*/
	private IParser getGithubBigQueryUrl_5002Parser() {
		if (githubBigQueryUrl_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataSource_Url() };
			MessageFormatParser parser = new MessageFormatParser(features);
			githubBigQueryUrl_5002Parser = parser;
		}
		return githubBigQueryUrl_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser gHTorrentUrl_5003Parser;

	/**
	* @generated
	*/
	private IParser getGHTorrentUrl_5003Parser() {
		if (gHTorrentUrl_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataSource_Url() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gHTorrentUrl_5003Parser = parser;
		}
		return gHTorrentUrl_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser commitsRepoPatterns_5004Parser;

	/**
	* @generated
	*/
	private IParser getCommitsRepoPatterns_5004Parser() {
		if (commitsRepoPatterns_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataRetrieval_RepoPatterns() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commitsRepoPatterns_5004Parser = parser;
		}
		return commitsRepoPatterns_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser authorsRepoPatterns_5005Parser;

	/**
	* @generated
	*/
	private IParser getAuthorsRepoPatterns_5005Parser() {
		if (authorsRepoPatterns_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataRetrieval_RepoPatterns() };
			MessageFormatParser parser = new MessageFormatParser(features);
			authorsRepoPatterns_5005Parser = parser;
		}
		return authorsRepoPatterns_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser filesRepoPatterns_5006Parser;

	/**
	* @generated
	*/
	private IParser getFilesRepoPatterns_5006Parser() {
		if (filesRepoPatterns_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataRetrieval_RepoPatterns() };
			MessageFormatParser parser = new MessageFormatParser(features);
			filesRepoPatterns_5006Parser = parser;
		}
		return filesRepoPatterns_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser dataAggregationTemp_5007Parser;

	/**
	* @generated
	*/
	private IParser getDataAggregationTemp_5007Parser() {
		if (dataAggregationTemp_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataManipulation_Temp() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataAggregationTemp_5007Parser = parser;
		}
		return dataAggregationTemp_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser dataFilteringTemp_5008Parser;

	/**
	* @generated
	*/
	private IParser getDataFilteringTemp_5008Parser() {
		if (dataFilteringTemp_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataManipulation_Temp() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataFilteringTemp_5008Parser = parser;
		}
		return dataFilteringTemp_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser customScriptTemp_5009Parser;

	/**
	* @generated
	*/
	private IParser getCustomScriptTemp_5009Parser() {
		if (customScriptTemp_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataManipulation_Temp() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customScriptTemp_5009Parser = parser;
		}
		return customScriptTemp_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser dataManipulationTemp_5010Parser;

	/**
	* @generated
	*/
	private IParser getDataManipulationTemp_5010Parser() {
		if (dataManipulationTemp_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataManipulation_Temp() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataManipulationTemp_5010Parser = parser;
		}
		return dataManipulationTemp_5010Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GithubUrlEditPart.VISUAL_ID:
			return getGithubUrl_5001Parser();
		case GithubBigQueryUrlEditPart.VISUAL_ID:
			return getGithubBigQueryUrl_5002Parser();
		case GHTorrentUrlEditPart.VISUAL_ID:
			return getGHTorrentUrl_5003Parser();
		case CommitsRepoPatternsEditPart.VISUAL_ID:
			return getCommitsRepoPatterns_5004Parser();
		case AuthorsRepoPatternsEditPart.VISUAL_ID:
			return getAuthorsRepoPatterns_5005Parser();
		case FilesRepoPatternsEditPart.VISUAL_ID:
			return getFilesRepoPatterns_5006Parser();
		case DataAggregationTempEditPart.VISUAL_ID:
			return getDataAggregationTemp_5007Parser();
		case DataFilteringTempEditPart.VISUAL_ID:
			return getDataFilteringTemp_5008Parser();
		case CustomScriptTempEditPart.VISUAL_ID:
			return getCustomScriptTemp_5009Parser();
		case DataManipulationTempEditPart.VISUAL_ID:
			return getDataManipulationTemp_5010Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WorkflowVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WorkflowVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WorkflowElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
