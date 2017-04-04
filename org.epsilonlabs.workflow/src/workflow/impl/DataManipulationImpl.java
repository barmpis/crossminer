/**
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import workflow.DataManipulation;
import workflow.DataRetrieval;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Manipulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.DataManipulationImpl#getTemp <em>Temp</em>}</li>
 *   <li>{@link workflow.impl.DataManipulationImpl#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataManipulationImpl extends ElementImpl implements DataManipulation {
	/**
	 * The default value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected String temp = TEMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRetrieval> sources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataManipulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DATA_MANIPULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemp() {
		return temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemp(String newTemp) {
		String oldTemp = temp;
		temp = newTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DATA_MANIPULATION__TEMP, oldTemp, temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRetrieval> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<DataRetrieval>(DataRetrieval.class, this, WorkflowPackage.DATA_MANIPULATION__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.DATA_MANIPULATION__TEMP:
				return getTemp();
			case WorkflowPackage.DATA_MANIPULATION__SOURCES:
				return getSources();
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
			case WorkflowPackage.DATA_MANIPULATION__TEMP:
				setTemp((String)newValue);
				return;
			case WorkflowPackage.DATA_MANIPULATION__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends DataRetrieval>)newValue);
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
			case WorkflowPackage.DATA_MANIPULATION__TEMP:
				setTemp(TEMP_EDEFAULT);
				return;
			case WorkflowPackage.DATA_MANIPULATION__SOURCES:
				getSources().clear();
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
			case WorkflowPackage.DATA_MANIPULATION__TEMP:
				return TEMP_EDEFAULT == null ? temp != null : !TEMP_EDEFAULT.equals(temp);
			case WorkflowPackage.DATA_MANIPULATION__SOURCES:
				return sources != null && !sources.isEmpty();
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
		result.append(" (temp: ");
		result.append(temp);
		result.append(')');
		return result.toString();
	}

} //DataManipulationImpl
