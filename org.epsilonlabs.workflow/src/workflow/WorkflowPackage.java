/**
 */
package workflow;

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
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CHANNELS = 2;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__GLOBAL_VARIABLES = 3;

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
	 * The feature id for the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACCEPTS_PARTIAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Provides Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROVIDES_PARTIAL_DATA = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = 4;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LOCAL_VARIABLES = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link workflow.impl.JavaTaskImpl <em>Java Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.JavaTaskImpl
	 * @see workflow.impl.WorkflowPackageImpl#getJavaTask()
	 * @generated
	 */
	int JAVA_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TASK__ACCEPTS_PARTIAL_DATA = TASK__ACCEPTS_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Provides Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TASK__PROVIDES_PARTIAL_DATA = TASK__PROVIDES_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TASK__LOCAL_VARIABLES = TASK__LOCAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Implementation Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TASK__IMPLEMENTATION_ENTRY_POINT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.ScriptedTaskImpl <em>Scripted Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ScriptedTaskImpl
	 * @see workflow.impl.WorkflowPackageImpl#getScriptedTask()
	 * @generated
	 */
	int SCRIPTED_TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__ACCEPTS_PARTIAL_DATA = TASK__ACCEPTS_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Provides Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__PROVIDES_PARTIAL_DATA = TASK__PROVIDES_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__LOCAL_VARIABLES = TASK__LOCAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Script Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__SCRIPT_TYPE = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__SCRIPT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scripted Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.CommunicationChannelImpl <em>Communication Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.CommunicationChannelImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCommunicationChannel()
	 * @generated
	 */
	int COMMUNICATION_CHANNEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL__INCOMING = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL__OUTGOING = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Communication Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link workflow.impl.RemoteCommunicationChannelImpl <em>Remote Communication Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.RemoteCommunicationChannelImpl
	 * @see workflow.impl.WorkflowPackageImpl#getRemoteCommunicationChannel()
	 * @generated
	 */
	int REMOTE_COMMUNICATION_CHANNEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COMMUNICATION_CHANNEL__NAME = COMMUNICATION_CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COMMUNICATION_CHANNEL__INCOMING = COMMUNICATION_CHANNEL__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COMMUNICATION_CHANNEL__OUTGOING = COMMUNICATION_CHANNEL__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COMMUNICATION_CHANNEL__TYPE = COMMUNICATION_CHANNEL__TYPE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COMMUNICATION_CHANNEL__ADDRESS = COMMUNICATION_CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COMMUNICATION_CHANNEL__PORT = COMMUNICATION_CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Single Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COMMUNICATION_CHANNEL__SINGLE_QUEUE = COMMUNICATION_CHANNEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Queue Persistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COMMUNICATION_CHANNEL__QUEUE_PERSISTANCE = COMMUNICATION_CHANNEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Remote Communication Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COMMUNICATION_CHANNEL_FEATURE_COUNT = COMMUNICATION_CHANNEL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link workflow.impl.DataStructureImpl <em>Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DataStructureImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__IS_MANY = 2;

	/**
	 * The number of structural features of the '<em>Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.QueuePersistanceOptions <em>Queue Persistance Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.QueuePersistanceOptions
	 * @see workflow.impl.WorkflowPackageImpl#getQueuePersistanceOptions()
	 * @generated
	 */
	int QUEUE_PERSISTANCE_OPTIONS = 7;


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
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see workflow.Workflow#getChannels()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Channels();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variables</em>'.
	 * @see workflow.Workflow#getGlobalVariables()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_GlobalVariables();

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
	 * Returns the meta object for the attribute '{@link workflow.Task#isProvidesPartialData <em>Provides Partial Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Data</em>'.
	 * @see workflow.Task#isProvidesPartialData()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ProvidesPartialData();

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
	 * Returns the meta object for the reference list '{@link workflow.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see workflow.Task#getOutgoing()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outgoing();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Task#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see workflow.Task#getLocalVariables()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_LocalVariables();

	/**
	 * Returns the meta object for class '{@link workflow.JavaTask <em>Java Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Task</em>'.
	 * @see workflow.JavaTask
	 * @generated
	 */
	EClass getJavaTask();

	/**
	 * Returns the meta object for the attribute '{@link workflow.JavaTask#getImplementationFullyQualifiedName <em>Implementation Fully Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Fully Qualified Name</em>'.
	 * @see workflow.JavaTask#getImplementationFullyQualifiedName()
	 * @see #getJavaTask()
	 * @generated
	 */
	EAttribute getJavaTask_ImplementationFullyQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link workflow.JavaTask#getImplementationEntryPoint <em>Implementation Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Entry Point</em>'.
	 * @see workflow.JavaTask#getImplementationEntryPoint()
	 * @see #getJavaTask()
	 * @generated
	 */
	EAttribute getJavaTask_ImplementationEntryPoint();

	/**
	 * Returns the meta object for class '{@link workflow.ScriptedTask <em>Scripted Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Task</em>'.
	 * @see workflow.ScriptedTask
	 * @generated
	 */
	EClass getScriptedTask();

	/**
	 * Returns the meta object for the attribute '{@link workflow.ScriptedTask#getScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Type</em>'.
	 * @see workflow.ScriptedTask#getScriptType()
	 * @see #getScriptedTask()
	 * @generated
	 */
	EAttribute getScriptedTask_ScriptType();

	/**
	 * Returns the meta object for the attribute '{@link workflow.ScriptedTask#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see workflow.ScriptedTask#getScript()
	 * @see #getScriptedTask()
	 * @generated
	 */
	EAttribute getScriptedTask_Script();

	/**
	 * Returns the meta object for class '{@link workflow.CommunicationChannel <em>Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Channel</em>'.
	 * @see workflow.CommunicationChannel
	 * @generated
	 */
	EClass getCommunicationChannel();

	/**
	 * Returns the meta object for the attribute '{@link workflow.CommunicationChannel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.CommunicationChannel#getName()
	 * @see #getCommunicationChannel()
	 * @generated
	 */
	EAttribute getCommunicationChannel_Name();

	/**
	 * Returns the meta object for the reference list '{@link workflow.CommunicationChannel#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see workflow.CommunicationChannel#getIncoming()
	 * @see #getCommunicationChannel()
	 * @generated
	 */
	EReference getCommunicationChannel_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link workflow.CommunicationChannel#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see workflow.CommunicationChannel#getOutgoing()
	 * @see #getCommunicationChannel()
	 * @generated
	 */
	EReference getCommunicationChannel_Outgoing();

	/**
	 * Returns the meta object for the containment reference '{@link workflow.CommunicationChannel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see workflow.CommunicationChannel#getType()
	 * @see #getCommunicationChannel()
	 * @generated
	 */
	EReference getCommunicationChannel_Type();

	/**
	 * Returns the meta object for class '{@link workflow.RemoteCommunicationChannel <em>Remote Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Communication Channel</em>'.
	 * @see workflow.RemoteCommunicationChannel
	 * @generated
	 */
	EClass getRemoteCommunicationChannel();

	/**
	 * Returns the meta object for the attribute '{@link workflow.RemoteCommunicationChannel#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see workflow.RemoteCommunicationChannel#getAddress()
	 * @see #getRemoteCommunicationChannel()
	 * @generated
	 */
	EAttribute getRemoteCommunicationChannel_Address();

	/**
	 * Returns the meta object for the attribute '{@link workflow.RemoteCommunicationChannel#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see workflow.RemoteCommunicationChannel#getPort()
	 * @see #getRemoteCommunicationChannel()
	 * @generated
	 */
	EAttribute getRemoteCommunicationChannel_Port();

	/**
	 * Returns the meta object for the attribute '{@link workflow.RemoteCommunicationChannel#isSingleQueue <em>Single Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Queue</em>'.
	 * @see workflow.RemoteCommunicationChannel#isSingleQueue()
	 * @see #getRemoteCommunicationChannel()
	 * @generated
	 */
	EAttribute getRemoteCommunicationChannel_SingleQueue();

	/**
	 * Returns the meta object for the attribute '{@link workflow.RemoteCommunicationChannel#getQueuePersistance <em>Queue Persistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Persistance</em>'.
	 * @see workflow.RemoteCommunicationChannel#getQueuePersistance()
	 * @see #getRemoteCommunicationChannel()
	 * @generated
	 */
	EAttribute getRemoteCommunicationChannel_QueuePersistance();

	/**
	 * Returns the meta object for class '{@link workflow.DataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Structure</em>'.
	 * @see workflow.DataStructure
	 * @generated
	 */
	EClass getDataStructure();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DataStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.DataStructure#getName()
	 * @see #getDataStructure()
	 * @generated
	 */
	EAttribute getDataStructure_Name();

	/**
	 * Returns the meta object for the containment reference '{@link workflow.DataStructure#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see workflow.DataStructure#getType()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_Type();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DataStructure#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see workflow.DataStructure#isIsMany()
	 * @see #getDataStructure()
	 * @generated
	 */
	EAttribute getDataStructure_IsMany();

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
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CHANNELS = eINSTANCE.getWorkflow_Channels();

		/**
		 * The meta object literal for the '<em><b>Global Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__GLOBAL_VARIABLES = eINSTANCE.getWorkflow_GlobalVariables();

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
		 * The meta object literal for the '<em><b>Accepts Partial Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ACCEPTS_PARTIAL_DATA = eINSTANCE.getTask_AcceptsPartialData();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PROVIDES_PARTIAL_DATA = eINSTANCE.getTask_ProvidesPartialData();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INCOMING = eINSTANCE.getTask_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTGOING = eINSTANCE.getTask_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__LOCAL_VARIABLES = eINSTANCE.getTask_LocalVariables();

		/**
		 * The meta object literal for the '{@link workflow.impl.JavaTaskImpl <em>Java Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.JavaTaskImpl
		 * @see workflow.impl.WorkflowPackageImpl#getJavaTask()
		 * @generated
		 */
		EClass JAVA_TASK = eINSTANCE.getJavaTask();

		/**
		 * The meta object literal for the '<em><b>Implementation Fully Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME = eINSTANCE.getJavaTask_ImplementationFullyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Implementation Entry Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_TASK__IMPLEMENTATION_ENTRY_POINT = eINSTANCE.getJavaTask_ImplementationEntryPoint();

		/**
		 * The meta object literal for the '{@link workflow.impl.ScriptedTaskImpl <em>Scripted Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ScriptedTaskImpl
		 * @see workflow.impl.WorkflowPackageImpl#getScriptedTask()
		 * @generated
		 */
		EClass SCRIPTED_TASK = eINSTANCE.getScriptedTask();

		/**
		 * The meta object literal for the '<em><b>Script Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_TASK__SCRIPT_TYPE = eINSTANCE.getScriptedTask_ScriptType();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_TASK__SCRIPT = eINSTANCE.getScriptedTask_Script();

		/**
		 * The meta object literal for the '{@link workflow.impl.CommunicationChannelImpl <em>Communication Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.CommunicationChannelImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCommunicationChannel()
		 * @generated
		 */
		EClass COMMUNICATION_CHANNEL = eINSTANCE.getCommunicationChannel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_CHANNEL__NAME = eINSTANCE.getCommunicationChannel_Name();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_CHANNEL__INCOMING = eINSTANCE.getCommunicationChannel_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_CHANNEL__OUTGOING = eINSTANCE.getCommunicationChannel_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_CHANNEL__TYPE = eINSTANCE.getCommunicationChannel_Type();

		/**
		 * The meta object literal for the '{@link workflow.impl.RemoteCommunicationChannelImpl <em>Remote Communication Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.RemoteCommunicationChannelImpl
		 * @see workflow.impl.WorkflowPackageImpl#getRemoteCommunicationChannel()
		 * @generated
		 */
		EClass REMOTE_COMMUNICATION_CHANNEL = eINSTANCE.getRemoteCommunicationChannel();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_COMMUNICATION_CHANNEL__ADDRESS = eINSTANCE.getRemoteCommunicationChannel_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_COMMUNICATION_CHANNEL__PORT = eINSTANCE.getRemoteCommunicationChannel_Port();

		/**
		 * The meta object literal for the '<em><b>Single Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_COMMUNICATION_CHANNEL__SINGLE_QUEUE = eINSTANCE.getRemoteCommunicationChannel_SingleQueue();

		/**
		 * The meta object literal for the '<em><b>Queue Persistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_COMMUNICATION_CHANNEL__QUEUE_PERSISTANCE = eINSTANCE.getRemoteCommunicationChannel_QueuePersistance();

		/**
		 * The meta object literal for the '{@link workflow.impl.DataStructureImpl <em>Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DataStructureImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDataStructure()
		 * @generated
		 */
		EClass DATA_STRUCTURE = eINSTANCE.getDataStructure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STRUCTURE__NAME = eINSTANCE.getDataStructure_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__TYPE = eINSTANCE.getDataStructure_Type();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STRUCTURE__IS_MANY = eINSTANCE.getDataStructure_IsMany();

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
