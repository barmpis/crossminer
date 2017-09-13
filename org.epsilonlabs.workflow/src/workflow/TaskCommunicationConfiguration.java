/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Communication Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.TaskCommunicationConfiguration#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link workflow.TaskCommunicationConfiguration#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getTaskCommunicationConfiguration()
 * @model annotation="gmf.link source='incoming' target='outgoing'"
 * @generated
 */
public interface TaskCommunicationConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link workflow.EmittingTask}.
	 * It is bidirectional and its opposite is '{@link workflow.EmittingTask#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see workflow.WorkflowPackage#getTaskCommunicationConfiguration_Incoming()
	 * @see workflow.EmittingTask#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	EList<EmittingTask> getIncoming();

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
	 * @see workflow.WorkflowPackage#getTaskCommunicationConfiguration_Outgoing()
	 * @see workflow.Task#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	EList<Task> getOutgoing();

} // TaskCommunicationConfiguration
