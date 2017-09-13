/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Boolean#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getBoolean()
 * @model
 * @generated
 */
public interface Boolean extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see workflow.WorkflowPackage#getBoolean_Value()
	 * @model required="true"
	 * @generated
	 */
	EList<java.lang.Boolean> getValue();

} // Boolean
