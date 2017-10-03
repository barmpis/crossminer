/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.ScriptedTask;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripted Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.ScriptedTaskImpl#getScriptType <em>Script Type</em>}</li>
 *   <li>{@link workflow.impl.ScriptedTaskImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptedTaskImpl extends TaskImpl implements ScriptedTask {
	/**
	 * The default value of the '{@link #getScriptType() <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptType()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptType() <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptType()
	 * @generated
	 * @ordered
	 */
	protected String scriptType = SCRIPT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected String script = SCRIPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptedTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.SCRIPTED_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptType() {
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptType(String newScriptType) {
		String oldScriptType = scriptType;
		scriptType = newScriptType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SCRIPTED_TASK__SCRIPT_TYPE, oldScriptType, scriptType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(String newScript) {
		String oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SCRIPTED_TASK__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.SCRIPTED_TASK__SCRIPT_TYPE:
				return getScriptType();
			case WorkflowPackage.SCRIPTED_TASK__SCRIPT:
				return getScript();
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
			case WorkflowPackage.SCRIPTED_TASK__SCRIPT_TYPE:
				setScriptType((String)newValue);
				return;
			case WorkflowPackage.SCRIPTED_TASK__SCRIPT:
				setScript((String)newValue);
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
			case WorkflowPackage.SCRIPTED_TASK__SCRIPT_TYPE:
				setScriptType(SCRIPT_TYPE_EDEFAULT);
				return;
			case WorkflowPackage.SCRIPTED_TASK__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
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
			case WorkflowPackage.SCRIPTED_TASK__SCRIPT_TYPE:
				return SCRIPT_TYPE_EDEFAULT == null ? scriptType != null : !SCRIPT_TYPE_EDEFAULT.equals(scriptType);
			case WorkflowPackage.SCRIPTED_TASK__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
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
		result.append(" (scriptType: ");
		result.append(scriptType);
		result.append(", script: ");
		result.append(script);
		result.append(')');
		return result.toString();
	}

} //ScriptedTaskImpl
