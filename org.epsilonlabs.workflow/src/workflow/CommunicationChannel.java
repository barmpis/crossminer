/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.CommunicationChannel#getName <em>Name</em>}</li>
 *   <li>{@link workflow.CommunicationChannel#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link workflow.CommunicationChannel#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link workflow.CommunicationChannel#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getCommunicationChannel()
 * @model annotation="gmf.node label.placement='none'"
 * @generated
 */
public interface CommunicationChannel extends EObject {
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
	 * @see workflow.WorkflowPackage#getCommunicationChannel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.CommunicationChannel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link workflow.Task}.
	 * It is bidirectional and its opposite is '{@link workflow.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see workflow.WorkflowPackage#getCommunicationChannel_Incoming()
	 * @see workflow.Task#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	EList<Task> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link workflow.Task}.
	 * It is bidirectional and its opposite is '{@link workflow.Task#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see workflow.WorkflowPackage#getCommunicationChannel_Outgoing()
	 * @see workflow.Task#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	EList<Task> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DataStructure)
	 * @see workflow.WorkflowPackage#getCommunicationChannel_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataStructure getType();

	/**
	 * Sets the value of the '{@link workflow.CommunicationChannel#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataStructure value);

} // CommunicationChannel
