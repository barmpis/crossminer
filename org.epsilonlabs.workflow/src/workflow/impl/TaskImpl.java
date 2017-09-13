/**
 */
package workflow.impl;

import java.lang.Boolean;
import java.lang.String;

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

import workflow.Task;
import workflow.TaskCommunicationConfiguration;
import workflow.TaskConcurrency;
import workflow.Variable;
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
 *   <li>{@link workflow.impl.TaskImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#getImplementationFullyQualifiedName <em>Implementation Fully Qualified Name</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#getImplementationEntryPoint <em>Implementation Entry Point</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#isAcceptsPartialData <em>Accepts Partial Data</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#getLocals <em>Locals</em>}</li>
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
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final TaskConcurrency CONCURRENCY_EDEFAULT = TaskConcurrency.NONE;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected TaskConcurrency concurrency = CONCURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationFullyQualifiedName() <em>Implementation Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_FULLY_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationFullyQualifiedName() <em>Implementation Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String implementationFullyQualifiedName = IMPLEMENTATION_FULLY_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationEntryPoint() <em>Implementation Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_ENTRY_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationEntryPoint() <em>Implementation Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected String implementationEntryPoint = IMPLEMENTATION_ENTRY_POINT_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskCommunicationConfiguration> incoming;

	/**
	 * The cached value of the '{@link #getLocals() <em>Locals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocals()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> locals;

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
	public TaskConcurrency getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(TaskConcurrency newConcurrency) {
		TaskConcurrency oldConcurrency = concurrency;
		concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__CONCURRENCY, oldConcurrency, concurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationFullyQualifiedName() {
		return implementationFullyQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationFullyQualifiedName(String newImplementationFullyQualifiedName) {
		String oldImplementationFullyQualifiedName = implementationFullyQualifiedName;
		implementationFullyQualifiedName = newImplementationFullyQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME, oldImplementationFullyQualifiedName, implementationFullyQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationEntryPoint() {
		return implementationEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationEntryPoint(String newImplementationEntryPoint) {
		String oldImplementationEntryPoint = implementationEntryPoint;
		implementationEntryPoint = newImplementationEntryPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__IMPLEMENTATION_ENTRY_POINT, oldImplementationEntryPoint, implementationEntryPoint));
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
	public EList<TaskCommunicationConfiguration> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList.ManyInverse<TaskCommunicationConfiguration>(TaskCommunicationConfiguration.class, this, WorkflowPackage.TASK__INCOMING, WorkflowPackage.TASK_COMMUNICATION_CONFIGURATION__OUTGOING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getLocals() {
		if (locals == null) {
			locals = new EObjectContainmentEList<Variable>(Variable.class, this, WorkflowPackage.TASK__LOCALS);
		}
		return locals;
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
			case WorkflowPackage.TASK__LOCALS:
				return ((InternalEList<?>)getLocals()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.TASK__CONCURRENCY:
				return getConcurrency();
			case WorkflowPackage.TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME:
				return getImplementationFullyQualifiedName();
			case WorkflowPackage.TASK__IMPLEMENTATION_ENTRY_POINT:
				return getImplementationEntryPoint();
			case WorkflowPackage.TASK__ACCEPTS_PARTIAL_DATA:
				return isAcceptsPartialData();
			case WorkflowPackage.TASK__INCOMING:
				return getIncoming();
			case WorkflowPackage.TASK__LOCALS:
				return getLocals();
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
			case WorkflowPackage.TASK__CONCURRENCY:
				setConcurrency((TaskConcurrency)newValue);
				return;
			case WorkflowPackage.TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME:
				setImplementationFullyQualifiedName((String)newValue);
				return;
			case WorkflowPackage.TASK__IMPLEMENTATION_ENTRY_POINT:
				setImplementationEntryPoint((String)newValue);
				return;
			case WorkflowPackage.TASK__ACCEPTS_PARTIAL_DATA:
				setAcceptsPartialData((Boolean)newValue);
				return;
			case WorkflowPackage.TASK__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends TaskCommunicationConfiguration>)newValue);
				return;
			case WorkflowPackage.TASK__LOCALS:
				getLocals().clear();
				getLocals().addAll((Collection<? extends Variable>)newValue);
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
			case WorkflowPackage.TASK__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case WorkflowPackage.TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME:
				setImplementationFullyQualifiedName(IMPLEMENTATION_FULLY_QUALIFIED_NAME_EDEFAULT);
				return;
			case WorkflowPackage.TASK__IMPLEMENTATION_ENTRY_POINT:
				setImplementationEntryPoint(IMPLEMENTATION_ENTRY_POINT_EDEFAULT);
				return;
			case WorkflowPackage.TASK__ACCEPTS_PARTIAL_DATA:
				setAcceptsPartialData(ACCEPTS_PARTIAL_DATA_EDEFAULT);
				return;
			case WorkflowPackage.TASK__INCOMING:
				getIncoming().clear();
				return;
			case WorkflowPackage.TASK__LOCALS:
				getLocals().clear();
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
			case WorkflowPackage.TASK__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
			case WorkflowPackage.TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME:
				return IMPLEMENTATION_FULLY_QUALIFIED_NAME_EDEFAULT == null ? implementationFullyQualifiedName != null : !IMPLEMENTATION_FULLY_QUALIFIED_NAME_EDEFAULT.equals(implementationFullyQualifiedName);
			case WorkflowPackage.TASK__IMPLEMENTATION_ENTRY_POINT:
				return IMPLEMENTATION_ENTRY_POINT_EDEFAULT == null ? implementationEntryPoint != null : !IMPLEMENTATION_ENTRY_POINT_EDEFAULT.equals(implementationEntryPoint);
			case WorkflowPackage.TASK__ACCEPTS_PARTIAL_DATA:
				return acceptsPartialData != ACCEPTS_PARTIAL_DATA_EDEFAULT;
			case WorkflowPackage.TASK__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case WorkflowPackage.TASK__LOCALS:
				return locals != null && !locals.isEmpty();
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
		result.append(", concurrency: ");
		result.append(concurrency);
		result.append(", implementationFullyQualifiedName: ");
		result.append(implementationFullyQualifiedName);
		result.append(", implementationEntryPoint: ");
		result.append(implementationEntryPoint);
		result.append(", acceptsPartialData: ");
		result.append(acceptsPartialData);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
