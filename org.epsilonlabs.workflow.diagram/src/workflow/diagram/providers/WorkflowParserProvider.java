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
import workflow.diagram.edit.parts.CommunicationChannelNEditPart;
import workflow.diagram.edit.parts.DataStructureName2EditPart;
import workflow.diagram.edit.parts.DataStructureNameEditPart;
import workflow.diagram.edit.parts.JavaTaskNameEditPart;
import workflow.diagram.edit.parts.RemoteCommunicationChannelNEditPart;
import workflow.diagram.edit.parts.ScriptedTaskNameEditPart;
import workflow.diagram.edit.parts.TaskNameEditPart;
import workflow.diagram.edit.parts.WrappingLabelEditPart;
import workflow.diagram.parsers.CommunicationChannelLabelExpressionLabelParser;
import workflow.diagram.parsers.MessageFormatParser;
import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser javaTaskName_5038Parser;

	/**
	* @generated
	*/
	private IParser getJavaTaskName_5038Parser() {
		if (javaTaskName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			javaTaskName_5038Parser = parser;
		}
		return javaTaskName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser scriptedTaskName_5039Parser;

	/**
	* @generated
	*/
	private IParser getScriptedTaskName_5039Parser() {
		if (scriptedTaskName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scriptedTaskName_5039Parser = parser;
		}
		return scriptedTaskName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser taskName_5016Parser;

	/**
	* @generated
	*/
	private IParser getTaskName_5016Parser() {
		if (taskName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskName_5016Parser = parser;
		}
		return taskName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser getCommunicationChannelLabel_5042Parser() {
		return new CommunicationChannelLabelExpressionLabelParser();
	}

	/**
	* @generated
	*/
	private IParser dataStructureName_5040Parser;

	/**
	* @generated
	*/
	private IParser getDataStructureName_5040Parser() {
		if (dataStructureName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataStructure_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataStructureName_5040Parser = parser;
		}
		return dataStructureName_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser dataStructureName_5044Parser;

	/**
	* @generated
	*/
	private IParser getDataStructureName_5044Parser() {
		if (dataStructureName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDataStructure_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataStructureName_5044Parser = parser;
		}
		return dataStructureName_5044Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case JavaTaskNameEditPart.VISUAL_ID:
			return getJavaTaskName_5038Parser();
		case ScriptedTaskNameEditPart.VISUAL_ID:
			return getScriptedTaskName_5039Parser();
		case TaskNameEditPart.VISUAL_ID:
			return getTaskName_5016Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getCommunicationChannelLabel_5042Parser();
		case DataStructureNameEditPart.VISUAL_ID:
			return getDataStructureName_5040Parser();
		case DataStructureName2EditPart.VISUAL_ID:
			return getDataStructureName_5044Parser();
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
