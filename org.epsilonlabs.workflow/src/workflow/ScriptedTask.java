/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripted Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.ScriptedTask#getScriptType <em>Script Type</em>}</li>
 *   <li>{@link workflow.ScriptedTask#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getScriptedTask()
 * @model
 * @generated
 */
public interface ScriptedTask extends Task {
	/**
	 * Returns the value of the '<em><b>Script Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Type</em>' attribute.
	 * @see #setScriptType(String)
	 * @see workflow.WorkflowPackage#getScriptedTask_ScriptType()
	 * @model
	 * @generated
	 */
	String getScriptType();

	/**
	 * Sets the value of the '{@link workflow.ScriptedTask#getScriptType <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Type</em>' attribute.
	 * @see #getScriptType()
	 * @generated
	 */
	void setScriptType(String value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see workflow.WorkflowPackage#getScriptedTask_Script()
	 * @model
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link workflow.ScriptedTask#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

} // ScriptedTask
