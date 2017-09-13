/**
 */
package workflow;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Task#getName <em>Name</em>}</li>
 *   <li>{@link workflow.Task#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link workflow.Task#getImplementationFullyQualifiedName <em>Implementation Fully Qualified Name</em>}</li>
 *   <li>{@link workflow.Task#getImplementationEntryPoint <em>Implementation Entry Point</em>}</li>
 *   <li>{@link workflow.Task#isAcceptsPartialData <em>Accepts Partial Data</em>}</li>
 *   <li>{@link workflow.Task#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link workflow.Task#getLocals <em>Locals</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getTask()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workflow.WorkflowPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The literals are from the enumeration {@link workflow.TaskConcurrency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see workflow.TaskConcurrency
	 * @see #setConcurrency(TaskConcurrency)
	 * @see workflow.WorkflowPackage#getTask_Concurrency()
	 * @model required="true"
	 * @generated
	 */
	TaskConcurrency getConcurrency();

	/**
	 * Sets the value of the '{@link workflow.Task#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see workflow.TaskConcurrency
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(TaskConcurrency value);

	/**
	 * Returns the value of the '<em><b>Implementation Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Fully Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Fully Qualified Name</em>' attribute.
	 * @see #setImplementationFullyQualifiedName(String)
	 * @see workflow.WorkflowPackage#getTask_ImplementationFullyQualifiedName()
	 * @model
	 * @generated
	 */
	String getImplementationFullyQualifiedName();

	/**
	 * Sets the value of the '{@link workflow.Task#getImplementationFullyQualifiedName <em>Implementation Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Fully Qualified Name</em>' attribute.
	 * @see #getImplementationFullyQualifiedName()
	 * @generated
	 */
	void setImplementationFullyQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Entry Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Entry Point</em>' attribute.
	 * @see #setImplementationEntryPoint(String)
	 * @see workflow.WorkflowPackage#getTask_ImplementationEntryPoint()
	 * @model
	 * @generated
	 */
	String getImplementationEntryPoint();

	/**
	 * Sets the value of the '{@link workflow.Task#getImplementationEntryPoint <em>Implementation Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Entry Point</em>' attribute.
	 * @see #getImplementationEntryPoint()
	 * @generated
	 */
	void setImplementationEntryPoint(String value);

	/**
	 * Returns the value of the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepts Partial Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepts Partial Data</em>' attribute.
	 * @see #setAcceptsPartialData(boolean)
	 * @see workflow.WorkflowPackage#getTask_AcceptsPartialData()
	 * @model required="true"
	 * @generated
	 */
	boolean isAcceptsPartialData();

	/**
	 * Sets the value of the '{@link workflow.Task#isAcceptsPartialData <em>Accepts Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepts Partial Data</em>' attribute.
	 * @see #isAcceptsPartialData()
	 * @generated
	 */
	void setAcceptsPartialData(boolean value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link workflow.TaskCommunicationConfiguration}.
	 * It is bidirectional and its opposite is '{@link workflow.TaskCommunicationConfiguration#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see workflow.WorkflowPackage#getTask_Incoming()
	 * @see workflow.TaskCommunicationConfiguration#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	EList<TaskCommunicationConfiguration> getIncoming();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getTask_Locals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getLocals();

} // Task
