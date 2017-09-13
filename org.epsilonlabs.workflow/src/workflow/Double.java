/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Double#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getDouble()
 * @model
 * @generated
 */
public interface Double extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see workflow.WorkflowPackage#getDouble_Value()
	 * @model required="true"
	 * @generated
	 */
	EList<java.lang.Double> getValue();

} // Double
