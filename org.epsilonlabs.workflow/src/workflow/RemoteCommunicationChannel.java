/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Communication Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.RemoteCommunicationChannel#getAddress <em>Address</em>}</li>
 *   <li>{@link workflow.RemoteCommunicationChannel#getPort <em>Port</em>}</li>
 *   <li>{@link workflow.RemoteCommunicationChannel#isSingleQueue <em>Single Queue</em>}</li>
 *   <li>{@link workflow.RemoteCommunicationChannel#getQueuePersistance <em>Queue Persistance</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getRemoteCommunicationChannel()
 * @model
 * @generated
 */
public interface RemoteCommunicationChannel extends CommunicationChannel {
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
	 * @see workflow.WorkflowPackage#getRemoteCommunicationChannel_Address()
	 * @model required="true"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link workflow.RemoteCommunicationChannel#getAddress <em>Address</em>}' attribute.
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
	 * @see workflow.WorkflowPackage#getRemoteCommunicationChannel_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link workflow.RemoteCommunicationChannel#getPort <em>Port</em>}' attribute.
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
	 * @see workflow.WorkflowPackage#getRemoteCommunicationChannel_SingleQueue()
	 * @model required="true"
	 * @generated
	 */
	boolean isSingleQueue();

	/**
	 * Sets the value of the '{@link workflow.RemoteCommunicationChannel#isSingleQueue <em>Single Queue</em>}' attribute.
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
	 * @see workflow.WorkflowPackage#getRemoteCommunicationChannel_QueuePersistance()
	 * @model required="true"
	 * @generated
	 */
	QueuePersistanceOptions getQueuePersistance();

	/**
	 * Sets the value of the '{@link workflow.RemoteCommunicationChannel#getQueuePersistance <em>Queue Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Persistance</em>' attribute.
	 * @see workflow.QueuePersistanceOptions
	 * @see #getQueuePersistance()
	 * @generated
	 */
	void setQueuePersistance(QueuePersistanceOptions value);

} // RemoteCommunicationChannel
