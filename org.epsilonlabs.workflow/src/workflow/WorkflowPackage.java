/**
 */
package workflow;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.crossminer.workflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.WorkflowImpl
	 * @see workflow.impl.WorkflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONFIGS = 2;

	/**
	 * The feature id for the '<em><b>Globals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__GLOBALS = 3;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link workflow.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.TaskImpl
	 * @see workflow.impl.WorkflowPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONCURRENCY = 1;

	/**
	 * The feature id for the '<em><b>Implementation Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME = 2;

	/**
	 * The feature id for the '<em><b>Implementation Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPLEMENTATION_ENTRY_POINT = 3;

	/**
	 * The feature id for the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACCEPTS_PARTIAL_DATA = 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = 5;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LOCALS = 6;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link workflow.impl.EmittingTaskImpl <em>Emitting Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.EmittingTaskImpl
	 * @see workflow.impl.WorkflowPackageImpl#getEmittingTask()
	 * @generated
	 */
	int EMITTING_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK__CONCURRENCY = TASK__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Implementation Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME = TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Implementation Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK__IMPLEMENTATION_ENTRY_POINT = TASK__IMPLEMENTATION_ENTRY_POINT;

	/**
	 * The feature id for the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK__ACCEPTS_PARTIAL_DATA = TASK__ACCEPTS_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK__LOCALS = TASK__LOCALS;

	/**
	 * The feature id for the '<em><b>Provides Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK__PROVIDES_PARTIAL_DATA = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK__OUTGOING = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Emitting Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMITTING_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.TaskCommunicationConfigurationImpl <em>Task Communication Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.TaskCommunicationConfigurationImpl
	 * @see workflow.impl.WorkflowPackageImpl#getTaskCommunicationConfiguration()
	 * @generated
	 */
	int TASK_COMMUNICATION_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMMUNICATION_CONFIGURATION__INCOMING = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMMUNICATION_CONFIGURATION__OUTGOING = 1;

	/**
	 * The number of structural features of the '<em>Task Communication Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMMUNICATION_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.RemoteTaskCommunicationConfigurationImpl <em>Remote Task Communication Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.RemoteTaskCommunicationConfigurationImpl
	 * @see workflow.impl.WorkflowPackageImpl#getRemoteTaskCommunicationConfiguration()
	 * @generated
	 */
	int REMOTE_TASK_COMMUNICATION_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TASK_COMMUNICATION_CONFIGURATION__INCOMING = TASK_COMMUNICATION_CONFIGURATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TASK_COMMUNICATION_CONFIGURATION__OUTGOING = TASK_COMMUNICATION_CONFIGURATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TASK_COMMUNICATION_CONFIGURATION__ADDRESS = TASK_COMMUNICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TASK_COMMUNICATION_CONFIGURATION__PORT = TASK_COMMUNICATION_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Single Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TASK_COMMUNICATION_CONFIGURATION__SINGLE_QUEUE = TASK_COMMUNICATION_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Queue Persistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TASK_COMMUNICATION_CONFIGURATION__QUEUE_PERSISTANCE = TASK_COMMUNICATION_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Remote Task Communication Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TASK_COMMUNICATION_CONFIGURATION_FEATURE_COUNT = TASK_COMMUNICATION_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link workflow.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.VariableImpl
	 * @see workflow.impl.WorkflowPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.StringImpl
	 * @see workflow.impl.WorkflowPackageImpl#getString()
	 * @generated
	 */
	int STRING = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.IntegerImpl
	 * @see workflow.impl.WorkflowPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.BooleanImpl
	 * @see workflow.impl.WorkflowPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DoubleImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.TaskConcurrency <em>Task Concurrency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.TaskConcurrency
	 * @see workflow.impl.WorkflowPackageImpl#getTaskConcurrency()
	 * @generated
	 */
	int TASK_CONCURRENCY = 10;

	/**
	 * The meta object id for the '{@link workflow.QueuePersistanceOptions <em>Queue Persistance Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.QueuePersistanceOptions
	 * @see workflow.impl.WorkflowPackageImpl#getQueuePersistanceOptions()
	 * @generated
	 */
	int QUEUE_PERSISTANCE_OPTIONS = 11;


	/**
	 * Returns the meta object for class '{@link workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see workflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see workflow.Workflow#getTasks()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configs</em>'.
	 * @see workflow.Workflow#getConfigs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Configs();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getGlobals <em>Globals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Globals</em>'.
	 * @see workflow.Workflow#getGlobals()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Globals();

	/**
	 * Returns the meta object for class '{@link workflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see workflow.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Task#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency</em>'.
	 * @see workflow.Task#getConcurrency()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Concurrency();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Task#getImplementationFullyQualifiedName <em>Implementation Fully Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Fully Qualified Name</em>'.
	 * @see workflow.Task#getImplementationFullyQualifiedName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ImplementationFullyQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Task#getImplementationEntryPoint <em>Implementation Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Entry Point</em>'.
	 * @see workflow.Task#getImplementationEntryPoint()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ImplementationEntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Task#isAcceptsPartialData <em>Accepts Partial Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepts Partial Data</em>'.
	 * @see workflow.Task#isAcceptsPartialData()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_AcceptsPartialData();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Task#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see workflow.Task#getIncoming()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Incoming();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Task#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locals</em>'.
	 * @see workflow.Task#getLocals()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Locals();

	/**
	 * Returns the meta object for class '{@link workflow.EmittingTask <em>Emitting Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emitting Task</em>'.
	 * @see workflow.EmittingTask
	 * @generated
	 */
	EClass getEmittingTask();

	/**
	 * Returns the meta object for the attribute '{@link workflow.EmittingTask#isProvidesPartialData <em>Provides Partial Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Data</em>'.
	 * @see workflow.EmittingTask#isProvidesPartialData()
	 * @see #getEmittingTask()
	 * @generated
	 */
	EAttribute getEmittingTask_ProvidesPartialData();

	/**
	 * Returns the meta object for the reference list '{@link workflow.EmittingTask#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see workflow.EmittingTask#getOutgoing()
	 * @see #getEmittingTask()
	 * @generated
	 */
	EReference getEmittingTask_Outgoing();

	/**
	 * Returns the meta object for class '{@link workflow.TaskCommunicationConfiguration <em>Task Communication Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Communication Configuration</em>'.
	 * @see workflow.TaskCommunicationConfiguration
	 * @generated
	 */
	EClass getTaskCommunicationConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link workflow.TaskCommunicationConfiguration#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see workflow.TaskCommunicationConfiguration#getIncoming()
	 * @see #getTaskCommunicationConfiguration()
	 * @generated
	 */
	EReference getTaskCommunicationConfiguration_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link workflow.TaskCommunicationConfiguration#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see workflow.TaskCommunicationConfiguration#getOutgoing()
	 * @see #getTaskCommunicationConfiguration()
	 * @generated
	 */
	EReference getTaskCommunicationConfiguration_Outgoing();

	/**
	 * Returns the meta object for class '{@link workflow.RemoteTaskCommunicationConfiguration <em>Remote Task Communication Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Task Communication Configuration</em>'.
	 * @see workflow.RemoteTaskCommunicationConfiguration
	 * @generated
	 */
	EClass getRemoteTaskCommunicationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link workflow.RemoteTaskCommunicationConfiguration#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see workflow.RemoteTaskCommunicationConfiguration#getAddress()
	 * @see #getRemoteTaskCommunicationConfiguration()
	 * @generated
	 */
	EAttribute getRemoteTaskCommunicationConfiguration_Address();

	/**
	 * Returns the meta object for the attribute '{@link workflow.RemoteTaskCommunicationConfiguration#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see workflow.RemoteTaskCommunicationConfiguration#getPort()
	 * @see #getRemoteTaskCommunicationConfiguration()
	 * @generated
	 */
	EAttribute getRemoteTaskCommunicationConfiguration_Port();

	/**
	 * Returns the meta object for the attribute '{@link workflow.RemoteTaskCommunicationConfiguration#isSingleQueue <em>Single Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Queue</em>'.
	 * @see workflow.RemoteTaskCommunicationConfiguration#isSingleQueue()
	 * @see #getRemoteTaskCommunicationConfiguration()
	 * @generated
	 */
	EAttribute getRemoteTaskCommunicationConfiguration_SingleQueue();

	/**
	 * Returns the meta object for the attribute '{@link workflow.RemoteTaskCommunicationConfiguration#getQueuePersistance <em>Queue Persistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Persistance</em>'.
	 * @see workflow.RemoteTaskCommunicationConfiguration#getQueuePersistance()
	 * @see #getRemoteTaskCommunicationConfiguration()
	 * @generated
	 */
	EAttribute getRemoteTaskCommunicationConfiguration_QueuePersistance();

	/**
	 * Returns the meta object for class '{@link workflow.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see workflow.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link workflow.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see workflow.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute list '{@link workflow.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see workflow.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for class '{@link workflow.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see workflow.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute list '{@link workflow.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see workflow.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link workflow.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see workflow.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute list '{@link workflow.Boolean#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see workflow.Boolean#getValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link workflow.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see workflow.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for the attribute list '{@link workflow.Double#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see workflow.Double#getValue()
	 * @see #getDouble()
	 * @generated
	 */
	EAttribute getDouble_Value();

	/**
	 * Returns the meta object for enum '{@link workflow.TaskConcurrency <em>Task Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Concurrency</em>'.
	 * @see workflow.TaskConcurrency
	 * @generated
	 */
	EEnum getTaskConcurrency();

	/**
	 * Returns the meta object for enum '{@link workflow.QueuePersistanceOptions <em>Queue Persistance Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Queue Persistance Options</em>'.
	 * @see workflow.QueuePersistanceOptions
	 * @generated
	 */
	EEnum getQueuePersistanceOptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.WorkflowImpl
		 * @see workflow.impl.WorkflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__TASKS = eINSTANCE.getWorkflow_Tasks();

		/**
		 * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CONFIGS = eINSTANCE.getWorkflow_Configs();

		/**
		 * The meta object literal for the '<em><b>Globals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__GLOBALS = eINSTANCE.getWorkflow_Globals();

		/**
		 * The meta object literal for the '{@link workflow.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.TaskImpl
		 * @see workflow.impl.WorkflowPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CONCURRENCY = eINSTANCE.getTask_Concurrency();

		/**
		 * The meta object literal for the '<em><b>Implementation Fully Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME = eINSTANCE.getTask_ImplementationFullyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Implementation Entry Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IMPLEMENTATION_ENTRY_POINT = eINSTANCE.getTask_ImplementationEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Accepts Partial Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ACCEPTS_PARTIAL_DATA = eINSTANCE.getTask_AcceptsPartialData();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INCOMING = eINSTANCE.getTask_Incoming();

		/**
		 * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__LOCALS = eINSTANCE.getTask_Locals();

		/**
		 * The meta object literal for the '{@link workflow.impl.EmittingTaskImpl <em>Emitting Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.EmittingTaskImpl
		 * @see workflow.impl.WorkflowPackageImpl#getEmittingTask()
		 * @generated
		 */
		EClass EMITTING_TASK = eINSTANCE.getEmittingTask();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMITTING_TASK__PROVIDES_PARTIAL_DATA = eINSTANCE.getEmittingTask_ProvidesPartialData();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMITTING_TASK__OUTGOING = eINSTANCE.getEmittingTask_Outgoing();

		/**
		 * The meta object literal for the '{@link workflow.impl.TaskCommunicationConfigurationImpl <em>Task Communication Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.TaskCommunicationConfigurationImpl
		 * @see workflow.impl.WorkflowPackageImpl#getTaskCommunicationConfiguration()
		 * @generated
		 */
		EClass TASK_COMMUNICATION_CONFIGURATION = eINSTANCE.getTaskCommunicationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_COMMUNICATION_CONFIGURATION__INCOMING = eINSTANCE.getTaskCommunicationConfiguration_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_COMMUNICATION_CONFIGURATION__OUTGOING = eINSTANCE.getTaskCommunicationConfiguration_Outgoing();

		/**
		 * The meta object literal for the '{@link workflow.impl.RemoteTaskCommunicationConfigurationImpl <em>Remote Task Communication Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.RemoteTaskCommunicationConfigurationImpl
		 * @see workflow.impl.WorkflowPackageImpl#getRemoteTaskCommunicationConfiguration()
		 * @generated
		 */
		EClass REMOTE_TASK_COMMUNICATION_CONFIGURATION = eINSTANCE.getRemoteTaskCommunicationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_TASK_COMMUNICATION_CONFIGURATION__ADDRESS = eINSTANCE.getRemoteTaskCommunicationConfiguration_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_TASK_COMMUNICATION_CONFIGURATION__PORT = eINSTANCE.getRemoteTaskCommunicationConfiguration_Port();

		/**
		 * The meta object literal for the '<em><b>Single Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_TASK_COMMUNICATION_CONFIGURATION__SINGLE_QUEUE = eINSTANCE.getRemoteTaskCommunicationConfiguration_SingleQueue();

		/**
		 * The meta object literal for the '<em><b>Queue Persistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_TASK_COMMUNICATION_CONFIGURATION__QUEUE_PERSISTANCE = eINSTANCE.getRemoteTaskCommunicationConfiguration_QueuePersistance();

		/**
		 * The meta object literal for the '{@link workflow.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.VariableImpl
		 * @see workflow.impl.WorkflowPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.StringImpl
		 * @see workflow.impl.WorkflowPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '{@link workflow.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.IntegerImpl
		 * @see workflow.impl.WorkflowPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link workflow.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.BooleanImpl
		 * @see workflow.impl.WorkflowPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link workflow.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DoubleImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE__VALUE = eINSTANCE.getDouble_Value();

		/**
		 * The meta object literal for the '{@link workflow.TaskConcurrency <em>Task Concurrency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.TaskConcurrency
		 * @see workflow.impl.WorkflowPackageImpl#getTaskConcurrency()
		 * @generated
		 */
		EEnum TASK_CONCURRENCY = eINSTANCE.getTaskConcurrency();

		/**
		 * The meta object literal for the '{@link workflow.QueuePersistanceOptions <em>Queue Persistance Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.QueuePersistanceOptions
		 * @see workflow.impl.WorkflowPackageImpl#getQueuePersistanceOptions()
		 * @generated
		 */
		EEnum QUEUE_PERSISTANCE_OPTIONS = eINSTANCE.getQueuePersistanceOptions();

	}

} //WorkflowPackage
