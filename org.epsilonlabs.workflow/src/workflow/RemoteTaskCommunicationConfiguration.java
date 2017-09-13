/**
 */
package workflow;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Task Communication Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.RemoteTaskCommunicationConfiguration#getAddress <em>Address</em>}</li>
 *   <li>{@link workflow.RemoteTaskCommunicationConfiguration#getPort <em>Port</em>}</li>
 *   <li>{@link workflow.RemoteTaskCommunicationConfiguration#isSingleQueue <em>Single Queue</em>}</li>
 *   <li>{@link workflow.RemoteTaskCommunicationConfiguration#getQueuePersistance <em>Queue Persistance</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getRemoteTaskCommunicationConfiguration()
 * @model annotation="gmf.link label='address,port,singleQueue,queuePersistance' style='dot'"
 * @generated
 */
public interface RemoteTaskCommunicationConfiguration extends TaskCommunicationConfiguration {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see workflow.WorkflowPackage#getRemoteTaskCommunicationConfiguration_Address()
	 * @model required="true"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link workflow.RemoteTaskCommunicationConfiguration#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see workflow.WorkflowPackage#getRemoteTaskCommunicationConfiguration_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link workflow.RemoteTaskCommunicationConfiguration#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Single Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Queue</em>' attribute.
	 * @see #setSingleQueue(boolean)
	 * @see workflow.WorkflowPackage#getRemoteTaskCommunicationConfiguration_SingleQueue()
	 * @model required="true"
	 * @generated
	 */
	boolean isSingleQueue();

	/**
	 * Sets the value of the '{@link workflow.RemoteTaskCommunicationConfiguration#isSingleQueue <em>Single Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Queue</em>' attribute.
	 * @see #isSingleQueue()
	 * @generated
	 */
	void setSingleQueue(boolean value);

	/**
	 * Returns the value of the '<em><b>Queue Persistance</b></em>' attribute.
	 * The literals are from the enumeration {@link workflow.QueuePersistanceOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Persistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Persistance</em>' attribute.
	 * @see workflow.QueuePersistanceOptions
	 * @see #setQueuePersistance(QueuePersistanceOptions)
	 * @see workflow.WorkflowPackage#getRemoteTaskCommunicationConfiguration_QueuePersistance()
	 * @model required="true"
	 * @generated
	 */
	QueuePersistanceOptions getQueuePersistance();

	/**
	 * Sets the value of the '{@link workflow.RemoteTaskCommunicationConfiguration#getQueuePersistance <em>Queue Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Persistance</em>' attribute.
	 * @see workflow.QueuePersistanceOptions
	 * @see #getQueuePersistance()
	 * @generated
	 */
	void setQueuePersistance(QueuePersistanceOptions value);

} // RemoteTaskCommunicationConfiguration
