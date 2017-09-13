/**
 */
package workflow.impl;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.QueuePersistanceOptions;
import workflow.RemoteTaskCommunicationConfiguration;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Task Communication Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.RemoteTaskCommunicationConfigurationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link workflow.impl.RemoteTaskCommunicationConfigurationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link workflow.impl.RemoteTaskCommunicationConfigurationImpl#isSingleQueue <em>Single Queue</em>}</li>
 *   <li>{@link workflow.impl.RemoteTaskCommunicationConfigurationImpl#getQueuePersistance <em>Queue Persistance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteTaskCommunicationConfigurationImpl extends TaskCommunicationConfigurationImpl implements RemoteTaskCommunicationConfiguration {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingleQueue() <em>Single Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleQueue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLE_QUEUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleQueue() <em>Single Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleQueue()
	 * @generated
	 * @ordered
	 */
	protected boolean singleQueue = SINGLE_QUEUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueuePersistance() <em>Queue Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuePersistance()
	 * @generated
	 * @ordered
	 */
	protected static final QueuePersistanceOptions QUEUE_PERSISTANCE_EDEFAULT = QueuePersistanceOptions.NONE;

	/**
	 * The cached value of the '{@link #getQueuePersistance() <em>Queue Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuePersistance()
	 * @generated
	 * @ordered
	 */
	protected QueuePersistanceOptions queuePersistance = QUEUE_PERSISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteTaskCommunicationConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.REMOTE_TASK_COMMUNICATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleQueue() {
		return singleQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleQueue(boolean newSingleQueue) {
		boolean oldSingleQueue = singleQueue;
		singleQueue = newSingleQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__SINGLE_QUEUE, oldSingleQueue, singleQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuePersistanceOptions getQueuePersistance() {
		return queuePersistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueuePersistance(QueuePersistanceOptions newQueuePersistance) {
		QueuePersistanceOptions oldQueuePersistance = queuePersistance;
		queuePersistance = newQueuePersistance == null ? QUEUE_PERSISTANCE_EDEFAULT : newQueuePersistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__QUEUE_PERSISTANCE, oldQueuePersistance, queuePersistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__ADDRESS:
				return getAddress();
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__PORT:
				return getPort();
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__SINGLE_QUEUE:
				return isSingleQueue();
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__QUEUE_PERSISTANCE:
				return getQueuePersistance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__ADDRESS:
				setAddress((String)newValue);
				return;
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__PORT:
				setPort((Integer)newValue);
				return;
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__SINGLE_QUEUE:
				setSingleQueue((Boolean)newValue);
				return;
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__QUEUE_PERSISTANCE:
				setQueuePersistance((QueuePersistanceOptions)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__SINGLE_QUEUE:
				setSingleQueue(SINGLE_QUEUE_EDEFAULT);
				return;
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__QUEUE_PERSISTANCE:
				setQueuePersistance(QUEUE_PERSISTANCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__PORT:
				return port != PORT_EDEFAULT;
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__SINGLE_QUEUE:
				return singleQueue != SINGLE_QUEUE_EDEFAULT;
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__QUEUE_PERSISTANCE:
				return queuePersistance != QUEUE_PERSISTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (address: ");
		result.append(address);
		result.append(", port: ");
		result.append(port);
		result.append(", singleQueue: ");
		result.append(singleQueue);
		result.append(", queuePersistance: ");
		result.append(queuePersistance);
		result.append(')');
		return result.toString();
	}

} //RemoteTaskCommunicationConfigurationImpl
