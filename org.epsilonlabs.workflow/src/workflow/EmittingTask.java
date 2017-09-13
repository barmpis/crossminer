/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emitting Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.EmittingTask#isProvidesPartialData <em>Provides Partial Data</em>}</li>
 *   <li>{@link workflow.EmittingTask#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getEmittingTask()
 * @model
 * @generated
 */
public interface EmittingTask extends Task {
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
	 * @see workflow.WorkflowPackage#getEmittingTask_ProvidesPartialData()
	 * @model required="true"
	 * @generated
	 */
	boolean isProvidesPartialData();

	/**
	 * Sets the value of the '{@link workflow.EmittingTask#isProvidesPartialData <em>Provides Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Partial Data</em>' attribute.
	 * @see #isProvidesPartialData()
	 * @generated
	 */
	void setProvidesPartialData(boolean value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link workflow.TaskCommunicationConfiguration}.
	 * It is bidirectional and its opposite is '{@link workflow.TaskCommunicationConfiguration#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see workflow.WorkflowPackage#getEmittingTask_Outgoing()
	 * @see workflow.TaskCommunicationConfiguration#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	EList<TaskCommunicationConfiguration> getOutgoing();

} // EmittingTask
