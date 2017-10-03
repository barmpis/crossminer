/**
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.CommunicationChannel;
import workflow.DataStructure;
import workflow.Task;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#isAcceptsPartialData <em>Accepts Partial Data</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#isProvidesPartialData <em>Provides Partial Data</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#getLocalVariables <em>Local Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAcceptsPartialData() <em>Accepts Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptsPartialData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCEPTS_PARTIAL_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAcceptsPartialData() <em>Accepts Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptsPartialData()
	 * @generated
	 * @ordered
	 */
	protected boolean acceptsPartialData = ACCEPTS_PARTIAL_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isProvidesPartialData() <em>Provides Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDES_PARTIAL_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvidesPartialData() <em>Provides Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialData()
	 * @generated
	 * @ordered
	 */
	protected boolean providesPartialData = PROVIDES_PARTIAL_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationChannel> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationChannel> outgoing;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStructure> localVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAcceptsPartialData() {
		return acceptsPartialData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptsPartialData(boolean newAcceptsPartialData) {
		boolean oldAcceptsPartialData = acceptsPartialData;
		acceptsPartialData = newAcceptsPartialData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__ACCEPTS_PARTIAL_DATA, oldAcceptsPartialData, acceptsPartialData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvidesPartialData() {
		return providesPartialData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesPartialData(boolean newProvidesPartialData) {
		boolean oldProvidesPartialData = providesPartialData;
		providesPartialData = newProvidesPartialData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__PROVIDES_PARTIAL_DATA, oldProvidesPartialData, providesPartialData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationChannel> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList.ManyInverse<CommunicationChannel>(CommunicationChannel.class, this, WorkflowPackage.TASK__INCOMING, WorkflowPackage.COMMUNICATION_CHANNEL__OUTGOING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationChannel> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList.ManyInverse<CommunicationChannel>(CommunicationChannel.class, this, WorkflowPackage.TASK__OUTGOING, WorkflowPackage.COMMUNICATION_CHANNEL__INCOMING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStructure> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<DataStructure>(DataStructure.class, this, WorkflowPackage.TASK__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.TASK__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case WorkflowPackage.TASK__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.TASK__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.TASK__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.TASK__LOCAL_VARIABLES:
				return ((InternalEList<?>)getLocalVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.TASK__NAME:
				return getName();
			case WorkflowPackage.TASK__ACCEPTS_PARTIAL_DATA:
				return isAcceptsPartialData();
			case WorkflowPackage.TASK__PROVIDES_PARTIAL_DATA:
				return isProvidesPartialData();
			case WorkflowPackage.TASK__INCOMING:
				return getIncoming();
			case WorkflowPackage.TASK__OUTGOING:
				return getOutgoing();
			case WorkflowPackage.TASK__LOCAL_VARIABLES:
				return getLocalVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.TASK__ACCEPTS_PARTIAL_DATA:
				setAcceptsPartialData((Boolean)newValue);
				return;
			case WorkflowPackage.TASK__PROVIDES_PARTIAL_DATA:
				setProvidesPartialData((Boolean)newValue);
				return;
			case WorkflowPackage.TASK__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends CommunicationChannel>)newValue);
				return;
			case WorkflowPackage.TASK__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends CommunicationChannel>)newValue);
				return;
			case WorkflowPackage.TASK__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends DataStructure>)newValue);
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
			case WorkflowPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.TASK__ACCEPTS_PARTIAL_DATA:
				setAcceptsPartialData(ACCEPTS_PARTIAL_DATA_EDEFAULT);
				return;
			case WorkflowPackage.TASK__PROVIDES_PARTIAL_DATA:
				setProvidesPartialData(PROVIDES_PARTIAL_DATA_EDEFAULT);
				return;
			case WorkflowPackage.TASK__INCOMING:
				getIncoming().clear();
				return;
			case WorkflowPackage.TASK__OUTGOING:
				getOutgoing().clear();
				return;
			case WorkflowPackage.TASK__LOCAL_VARIABLES:
				getLocalVariables().clear();
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
			case WorkflowPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.TASK__ACCEPTS_PARTIAL_DATA:
				return acceptsPartialData != ACCEPTS_PARTIAL_DATA_EDEFAULT;
			case WorkflowPackage.TASK__PROVIDES_PARTIAL_DATA:
				return providesPartialData != PROVIDES_PARTIAL_DATA_EDEFAULT;
			case WorkflowPackage.TASK__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case WorkflowPackage.TASK__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case WorkflowPackage.TASK__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", acceptsPartialData: ");
		result.append(acceptsPartialData);
		result.append(", providesPartialData: ");
		result.append(providesPartialData);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
