/**
 */
package workflow.impl;

import java.lang.Boolean;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.EmittingTask;
import workflow.TaskCommunicationConfiguration;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emitting Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.EmittingTaskImpl#isProvidesPartialData <em>Provides Partial Data</em>}</li>
 *   <li>{@link workflow.impl.EmittingTaskImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmittingTaskImpl extends TaskImpl implements EmittingTask {
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
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskCommunicationConfiguration> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmittingTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.EMITTING_TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EMITTING_TASK__PROVIDES_PARTIAL_DATA, oldProvidesPartialData, providesPartialData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskCommunicationConfiguration> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList.ManyInverse<TaskCommunicationConfiguration>(TaskCommunicationConfiguration.class, this, WorkflowPackage.EMITTING_TASK__OUTGOING, WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__INCOMING);
		}
		return outgoing;
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
			case WorkflowPackage.EMITTING_TASK__OUTGOING:
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
			case WorkflowPackage.EMITTING_TASK__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.EMITTING_TASK__PROVIDES_PARTIAL_DATA:
				return isProvidesPartialData();
			case WorkflowPackage.EMITTING_TASK__OUTGOING:
				return getOutgoing();
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
			case WorkflowPackage.EMITTING_TASK__PROVIDES_PARTIAL_DATA:
				setProvidesPartialData((Boolean)newValue);
				return;
			case WorkflowPackage.EMITTING_TASK__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends TaskCommunicationConfiguration>)newValue);
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
			case WorkflowPackage.EMITTING_TASK__PROVIDES_PARTIAL_DATA:
				setProvidesPartialData(PROVIDES_PARTIAL_DATA_EDEFAULT);
				return;
			case WorkflowPackage.EMITTING_TASK__OUTGOING:
				getOutgoing().clear();
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
			case WorkflowPackage.EMITTING_TASK__PROVIDES_PARTIAL_DATA:
				return providesPartialData != PROVIDES_PARTIAL_DATA_EDEFAULT;
			case WorkflowPackage.EMITTING_TASK__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
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
		result.append(" (providesPartialData: ");
		result.append(providesPartialData);
		result.append(')');
		return result.toString();
	}

} //EmittingTaskImpl
