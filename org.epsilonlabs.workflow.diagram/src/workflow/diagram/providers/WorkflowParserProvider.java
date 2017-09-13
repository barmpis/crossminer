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

import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;
import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.BooleanName2EditPart;
import workflow.diagram.edit.parts.BooleanNameEditPart;
import workflow.diagram.edit.parts.BooleanValue2EditPart;
import workflow.diagram.edit.parts.BooleanValueEditPart;
import workflow.diagram.edit.parts.DoubleName2EditPart;
import workflow.diagram.edit.parts.DoubleNameEditPart;
import workflow.diagram.edit.parts.DoubleValue2EditPart;
import workflow.diagram.edit.parts.DoubleValueEditPart;
import workflow.diagram.edit.parts.EmittingTaskAcceptsPartialDataEditPart;
import workflow.diagram.edit.parts.EmittingTaskConcurrencyEditPart;
import workflow.diagram.edit.parts.EmittingTaskImplementationEntryPoinEditPart;
import workflow.diagram.edit.parts.EmittingTaskImplementationFullyQualEditPart;
import workflow.diagram.edit.parts.EmittingTaskNameEditPart;
import workflow.diagram.edit.parts.EmittingTaskProvidesPartialDataEditPart;
import workflow.diagram.edit.parts.IntegerName2EditPart;
import workflow.diagram.edit.parts.IntegerNameEditPart;
import workflow.diagram.edit.parts.IntegerValue2EditPart;
import workflow.diagram.edit.parts.IntegerValueEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationAddressEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationAddressPortSingleQueueEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationAddressPortSingleQueueQEditPart;
import workflow.diagram.edit.parts.RemoteTaskCommunicationConfigurationPortEditPart;
import workflow.diagram.edit.parts.StringName2EditPart;
import workflow.diagram.edit.parts.StringNameEditPart;
import workflow.diagram.edit.parts.StringValue2EditPart;
import workflow.diagram.edit.parts.StringValueEditPart;
import workflow.diagram.edit.parts.TaskAcceptsPartialDataEditPart;
import workflow.diagram.edit.parts.TaskConcurrencyEditPart;
import workflow.diagram.edit.parts.TaskImplementationEntryPoinEditPart;
import workflow.diagram.edit.parts.TaskImplementationFullyQualEditPart;
import workflow.diagram.edit.parts.TaskNameEditPart;
import workflow.diagram.parsers.MessageFormatParser;
import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser emittingTaskName_5011Parser;

	/**
	* @generated
	*/
	private IParser getEmittingTaskName_5011Parser() {
		if (emittingTaskName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			emittingTaskName_5011Parser = parser;
		}
		return emittingTaskName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser emittingTaskConcurrency_5025Parser;

	/**
	* @generated
	*/
	private IParser getEmittingTaskConcurrency_5025Parser() {
		if (emittingTaskConcurrency_5025Parser == null) {
			EAttribute editableFeature = WorkflowPackage.eINSTANCE.getTask_Concurrency();
			EnumParser parser = new EnumParser(editableFeature);
			emittingTaskConcurrency_5025Parser = parser;
		}
		return emittingTaskConcurrency_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser emittingTaskImplementationFullyQualifiedName_5026Parser;

	/**
	* @generated
	*/
	private IParser getEmittingTaskImplementationFullyQualifiedName_5026Parser() {
		if (emittingTaskImplementationFullyQualifiedName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WorkflowPackage.eINSTANCE.getTask_ImplementationFullyQualifiedName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			emittingTaskImplementationFullyQualifiedName_5026Parser = parser;
		}
		return emittingTaskImplementationFullyQualifiedName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser emittingTaskImplementationEntryPoint_5027Parser;

	/**
	* @generated
	*/
	private IParser getEmittingTaskImplementationEntryPoint_5027Parser() {
		if (emittingTaskImplementationEntryPoint_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getTask_ImplementationEntryPoint() };
			MessageFormatParser parser = new MessageFormatParser(features);
			emittingTaskImplementationEntryPoint_5027Parser = parser;
		}
		return emittingTaskImplementationEntryPoint_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser emittingTaskAcceptsPartialData_5028Parser;

	/**
	* @generated
	*/
	private IParser getEmittingTaskAcceptsPartialData_5028Parser() {
		if (emittingTaskAcceptsPartialData_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getTask_AcceptsPartialData() };
			MessageFormatParser parser = new MessageFormatParser(features);
			emittingTaskAcceptsPartialData_5028Parser = parser;
		}
		return emittingTaskAcceptsPartialData_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser emittingTaskProvidesPartialData_5029Parser;

	/**
	* @generated
	*/
	private IParser getEmittingTaskProvidesPartialData_5029Parser() {
		if (emittingTaskProvidesPartialData_5029Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WorkflowPackage.eINSTANCE.getEmittingTask_ProvidesPartialData() };
			MessageFormatParser parser = new MessageFormatParser(features);
			emittingTaskProvidesPartialData_5029Parser = parser;
		}
		return emittingTaskProvidesPartialData_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser stringName_5012Parser;

	/**
	* @generated
	*/
	private IParser getStringName_5012Parser() {
		if (stringName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stringName_5012Parser = parser;
		}
		return stringName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser stringValue_5030Parser;

	/**
	* @generated
	*/
	private IParser getStringValue_5030Parser() {
		if (stringValue_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getString_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stringValue_5030Parser = parser;
		}
		return stringValue_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser integerName_5013Parser;

	/**
	* @generated
	*/
	private IParser getIntegerName_5013Parser() {
		if (integerName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			integerName_5013Parser = parser;
		}
		return integerName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser integerValue_5031Parser;

	/**
	* @generated
	*/
	private IParser getIntegerValue_5031Parser() {
		if (integerValue_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getInteger_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			integerValue_5031Parser = parser;
		}
		return integerValue_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser booleanName_5014Parser;

	/**
	* @generated
	*/
	private IParser getBooleanName_5014Parser() {
		if (booleanName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			booleanName_5014Parser = parser;
		}
		return booleanName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser booleanValue_5032Parser;

	/**
	* @generated
	*/
	private IParser getBooleanValue_5032Parser() {
		if (booleanValue_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getBoolean_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			booleanValue_5032Parser = parser;
		}
		return booleanValue_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser doubleName_5015Parser;

	/**
	* @generated
	*/
	private IParser getDoubleName_5015Parser() {
		if (doubleName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			doubleName_5015Parser = parser;
		}
		return doubleName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser doubleValue_5033Parser;

	/**
	* @generated
	*/
	private IParser getDoubleValue_5033Parser() {
		if (doubleValue_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDouble_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			doubleValue_5033Parser = parser;
		}
		return doubleValue_5033Parser;
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
	private IParser taskConcurrency_5034Parser;

	/**
	* @generated
	*/
	private IParser getTaskConcurrency_5034Parser() {
		if (taskConcurrency_5034Parser == null) {
			EAttribute editableFeature = WorkflowPackage.eINSTANCE.getTask_Concurrency();
			EnumParser parser = new EnumParser(editableFeature);
			taskConcurrency_5034Parser = parser;
		}
		return taskConcurrency_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser taskImplementationFullyQualifiedName_5035Parser;

	/**
	* @generated
	*/
	private IParser getTaskImplementationFullyQualifiedName_5035Parser() {
		if (taskImplementationFullyQualifiedName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WorkflowPackage.eINSTANCE.getTask_ImplementationFullyQualifiedName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskImplementationFullyQualifiedName_5035Parser = parser;
		}
		return taskImplementationFullyQualifiedName_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser taskImplementationEntryPoint_5036Parser;

	/**
	* @generated
	*/
	private IParser getTaskImplementationEntryPoint_5036Parser() {
		if (taskImplementationEntryPoint_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getTask_ImplementationEntryPoint() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskImplementationEntryPoint_5036Parser = parser;
		}
		return taskImplementationEntryPoint_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser taskAcceptsPartialData_5037Parser;

	/**
	* @generated
	*/
	private IParser getTaskAcceptsPartialData_5037Parser() {
		if (taskAcceptsPartialData_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getTask_AcceptsPartialData() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskAcceptsPartialData_5037Parser = parser;
		}
		return taskAcceptsPartialData_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser stringName_5017Parser;

	/**
	* @generated
	*/
	private IParser getStringName_5017Parser() {
		if (stringName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stringName_5017Parser = parser;
		}
		return stringName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser stringValue_5018Parser;

	/**
	* @generated
	*/
	private IParser getStringValue_5018Parser() {
		if (stringValue_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getString_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stringValue_5018Parser = parser;
		}
		return stringValue_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser integerName_5019Parser;

	/**
	* @generated
	*/
	private IParser getIntegerName_5019Parser() {
		if (integerName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			integerName_5019Parser = parser;
		}
		return integerName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser integerValue_5020Parser;

	/**
	* @generated
	*/
	private IParser getIntegerValue_5020Parser() {
		if (integerValue_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getInteger_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			integerValue_5020Parser = parser;
		}
		return integerValue_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser booleanName_5021Parser;

	/**
	* @generated
	*/
	private IParser getBooleanName_5021Parser() {
		if (booleanName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			booleanName_5021Parser = parser;
		}
		return booleanName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser booleanValue_5022Parser;

	/**
	* @generated
	*/
	private IParser getBooleanValue_5022Parser() {
		if (booleanValue_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getBoolean_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			booleanValue_5022Parser = parser;
		}
		return booleanValue_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser doubleName_5023Parser;

	/**
	* @generated
	*/
	private IParser getDoubleName_5023Parser() {
		if (doubleName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			doubleName_5023Parser = parser;
		}
		return doubleName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser doubleValue_5024Parser;

	/**
	* @generated
	*/
	private IParser getDoubleValue_5024Parser() {
		if (doubleValue_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getDouble_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			doubleValue_5024Parser = parser;
		}
		return doubleValue_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser remoteTaskCommunicationConfigurationAddressPortSingleQueueQueuePersistance_6001Parser;

	/**
	* @generated
	*/
	private IParser getRemoteTaskCommunicationConfigurationAddressPortSingleQueueQueuePersistance_6001Parser() {
		if (remoteTaskCommunicationConfigurationAddressPortSingleQueueQueuePersistance_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WorkflowPackage.eINSTANCE.getRemoteTaskCommunicationConfiguration_Address(),
					WorkflowPackage.eINSTANCE.getRemoteTaskCommunicationConfiguration_Port(),
					WorkflowPackage.eINSTANCE.getRemoteTaskCommunicationConfiguration_SingleQueue(),
					WorkflowPackage.eINSTANCE.getRemoteTaskCommunicationConfiguration_QueuePersistance() };
			MessageFormatParser parser = new MessageFormatParser(features);
			remoteTaskCommunicationConfigurationAddressPortSingleQueueQueuePersistance_6001Parser = parser;
		}
		return remoteTaskCommunicationConfigurationAddressPortSingleQueueQueuePersistance_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EmittingTaskNameEditPart.VISUAL_ID:
			return getEmittingTaskName_5011Parser();

		case EmittingTaskConcurrencyEditPart.VISUAL_ID:
			return getEmittingTaskConcurrency_5025Parser();
		case EmittingTaskImplementationFullyQualEditPart.VISUAL_ID:
			return getEmittingTaskImplementationFullyQualifiedName_5026Parser();
		case EmittingTaskImplementationEntryPoinEditPart.VISUAL_ID:
			return getEmittingTaskImplementationEntryPoint_5027Parser();
		case EmittingTaskAcceptsPartialDataEditPart.VISUAL_ID:
			return getEmittingTaskAcceptsPartialData_5028Parser();
		case EmittingTaskProvidesPartialDataEditPart.VISUAL_ID:
			return getEmittingTaskProvidesPartialData_5029Parser();
		case StringNameEditPart.VISUAL_ID:
			return getStringName_5012Parser();
		case StringValueEditPart.VISUAL_ID:
			return getStringValue_5030Parser();
		case IntegerNameEditPart.VISUAL_ID:
			return getIntegerName_5013Parser();
		case IntegerValueEditPart.VISUAL_ID:
			return getIntegerValue_5031Parser();
		case BooleanNameEditPart.VISUAL_ID:
			return getBooleanName_5014Parser();
		case BooleanValueEditPart.VISUAL_ID:
			return getBooleanValue_5032Parser();
		case DoubleNameEditPart.VISUAL_ID:
			return getDoubleName_5015Parser();
		case DoubleValueEditPart.VISUAL_ID:
			return getDoubleValue_5033Parser();
		case TaskNameEditPart.VISUAL_ID:
			return getTaskName_5016Parser();

		case TaskConcurrencyEditPart.VISUAL_ID:
			return getTaskConcurrency_5034Parser();
		case TaskImplementationFullyQualEditPart.VISUAL_ID:
			return getTaskImplementationFullyQualifiedName_5035Parser();
		case TaskImplementationEntryPoinEditPart.VISUAL_ID:
			return getTaskImplementationEntryPoint_5036Parser();
		case TaskAcceptsPartialDataEditPart.VISUAL_ID:
			return getTaskAcceptsPartialData_5037Parser();
		case StringName2EditPart.VISUAL_ID:
			return getStringName_5017Parser();
		case StringValue2EditPart.VISUAL_ID:
			return getStringValue_5018Parser();
		case IntegerName2EditPart.VISUAL_ID:
			return getIntegerName_5019Parser();
		case IntegerValue2EditPart.VISUAL_ID:
			return getIntegerValue_5020Parser();
		case BooleanName2EditPart.VISUAL_ID:
			return getBooleanName_5021Parser();
		case BooleanValue2EditPart.VISUAL_ID:
			return getBooleanValue_5022Parser();
		case DoubleName2EditPart.VISUAL_ID:
			return getDoubleName_5023Parser();
		case DoubleValue2EditPart.VISUAL_ID:
			return getDoubleValue_5024Parser();
		case RemoteTaskCommunicationConfigurationAddressPortSingleQueueQEditPart.VISUAL_ID:
			return getRemoteTaskCommunicationConfigurationAddressPortSingleQueueQueuePersistance_6001Parser();
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
