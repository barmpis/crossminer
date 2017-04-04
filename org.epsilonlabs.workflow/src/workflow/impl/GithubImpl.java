/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.Github;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Github</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.GithubImpl#getUn <em>Un</em>}</li>
 *   <li>{@link workflow.impl.GithubImpl#getPw <em>Pw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubImpl extends DataSourceImpl implements Github {
	/**
	 * The default value of the '{@link #getUn() <em>Un</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUn()
	 * @generated
	 * @ordered
	 */
	protected static final String UN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUn() <em>Un</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUn()
	 * @generated
	 * @ordered
	 */
	protected String un = UN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPw() <em>Pw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPw()
	 * @generated
	 * @ordered
	 */
	protected static final String PW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPw() <em>Pw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPw()
	 * @generated
	 * @ordered
	 */
	protected String pw = PW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.GITHUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUn() {
		return un;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUn(String newUn) {
		String oldUn = un;
		un = newUn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.GITHUB__UN, oldUn, un));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPw() {
		return pw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPw(String newPw) {
		String oldPw = pw;
		pw = newPw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.GITHUB__PW, oldPw, pw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.GITHUB__UN:
				return getUn();
			case WorkflowPackage.GITHUB__PW:
				return getPw();
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
			case WorkflowPackage.GITHUB__UN:
				setUn((String)newValue);
				return;
			case WorkflowPackage.GITHUB__PW:
				setPw((String)newValue);
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
			case WorkflowPackage.GITHUB__UN:
				setUn(UN_EDEFAULT);
				return;
			case WorkflowPackage.GITHUB__PW:
				setPw(PW_EDEFAULT);
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
			case WorkflowPackage.GITHUB__UN:
				return UN_EDEFAULT == null ? un != null : !UN_EDEFAULT.equals(un);
			case WorkflowPackage.GITHUB__PW:
				return PW_EDEFAULT == null ? pw != null : !PW_EDEFAULT.equals(pw);
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
		result.append(" (un: ");
		result.append(un);
		result.append(", pw: ");
		result.append(pw);
		result.append(')');
		return result.toString();
	}

} //GithubImpl
