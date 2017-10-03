/**
 */
package workflow;

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
 *   <li>{@link workflow.Task#isAcceptsPartialData <em>Accepts Partial Data</em>}</li>
 *   <li>{@link workflow.Task#isProvidesPartialData <em>Provides Partial Data</em>}</li>
 *   <li>{@link workflow.Task#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link workflow.Task#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link workflow.Task#getLocalVariables <em>Local Variables</em>}</li>
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
	 * Returns the value of the '<em><b>Provides Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Partial Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Partial Data</em>' attribute.
	 * @see #setProvidesPartialData(boolean)
	 * @see workflow.WorkflowPackage#getTask_ProvidesPartialData()
	 * @model required="true"
	 * @generated
	 */
	boolean isProvidesPartialData();

	/**
	 * Sets the value of the '{@link workflow.Task#isProvidesPartialData <em>Provides Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Partial Data</em>' attribute.
	 * @see #isProvidesPartialData()
	 * @generated
	 */
	void setProvidesPartialData(boolean value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link workflow.CommunicationChannel}.
	 * It is bidirectional and its opposite is '{@link workflow.CommunicationChannel#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see workflow.WorkflowPackage#getTask_Incoming()
	 * @see workflow.CommunicationChannel#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	EList<CommunicationChannel> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link workflow.CommunicationChannel}.
	 * It is bidirectional and its opposite is '{@link workflow.CommunicationChannel#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see workflow.WorkflowPackage#getTask_Outgoing()
	 * @see workflow.CommunicationChannel#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	EList<CommunicationChannel> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.DataStructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getTask_LocalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataStructure> getLocalVariables();

} // Task
