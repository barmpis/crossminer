/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.JavaTask;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.JavaTaskImpl#getImplementationFullyQualifiedName <em>Implementation Fully Qualified Name</em>}</li>
 *   <li>{@link workflow.impl.JavaTaskImpl#getImplementationEntryPoint <em>Implementation Entry Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaTaskImpl extends TaskImpl implements JavaTask {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.JAVA_TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.JAVA_TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME, oldImplementationFullyQualifiedName, implementationFullyQualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.JAVA_TASK__IMPLEMENTATION_ENTRY_POINT, oldImplementationEntryPoint, implementationEntryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.JAVA_TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME:
				return getImplementationFullyQualifiedName();
			case WorkflowPackage.JAVA_TASK__IMPLEMENTATION_ENTRY_POINT:
				return getImplementationEntryPoint();
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
			case WorkflowPackage.JAVA_TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME:
				setImplementationFullyQualifiedName((String)newValue);
				return;
			case WorkflowPackage.JAVA_TASK__IMPLEMENTATION_ENTRY_POINT:
				setImplementationEntryPoint((String)newValue);
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
			case WorkflowPackage.JAVA_TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME:
				setImplementationFullyQualifiedName(IMPLEMENTATION_FULLY_QUALIFIED_NAME_EDEFAULT);
				return;
			case WorkflowPackage.JAVA_TASK__IMPLEMENTATION_ENTRY_POINT:
				setImplementationEntryPoint(IMPLEMENTATION_ENTRY_POINT_EDEFAULT);
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
			case WorkflowPackage.JAVA_TASK__IMPLEMENTATION_FULLY_QUALIFIED_NAME:
				return IMPLEMENTATION_FULLY_QUALIFIED_NAME_EDEFAULT == null ? implementationFullyQualifiedName != null : !IMPLEMENTATION_FULLY_QUALIFIED_NAME_EDEFAULT.equals(implementationFullyQualifiedName);
			case WorkflowPackage.JAVA_TASK__IMPLEMENTATION_ENTRY_POINT:
				return IMPLEMENTATION_ENTRY_POINT_EDEFAULT == null ? implementationEntryPoint != null : !IMPLEMENTATION_ENTRY_POINT_EDEFAULT.equals(implementationEntryPoint);
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
		result.append(" (implementationFullyQualifiedName: ");
		result.append(implementationFullyQualifiedName);
		result.append(", implementationEntryPoint: ");
		result.append(implementationEntryPoint);
		result.append(')');
		return result.toString();
	}

} //JavaTaskImpl
