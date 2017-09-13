/**
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.EmittingTask;
import workflow.Task;
import workflow.TaskCommunicationConfiguration;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Communication Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.TaskCommunicationConfigurationImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link workflow.impl.TaskCommunicationConfigurationImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskCommunicationConfigurationImpl extends EObjectImpl implements TaskCommunicationConfiguration {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<EmittingTask> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCommunicationConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.TASK_COMMUNICATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmittingTask> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList.ManyInverse<EmittingTask>(EmittingTask.class, this, WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__INCOMING, WorkflowPackage.EMITTING_TASK__OUTGOING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList.ManyInverse<Task>(Task.class, this, WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__OUTGOING, WorkflowPackage.TASK__INCOMING);
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
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__OUTGOING:
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
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__OUTGOING:
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
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__INCOMING:
				return getIncoming();
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__OUTGOING:
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
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends EmittingTask>)newValue);
				return;
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Task>)newValue);
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
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__INCOMING:
				getIncoming().clear();
				return;
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__OUTGOING:
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
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskCommunicationConfigurationImpl
