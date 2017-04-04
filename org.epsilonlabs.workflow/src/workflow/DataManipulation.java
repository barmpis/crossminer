/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Manipulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.DataManipulation#getTemp <em>Temp</em>}</li>
 *   <li>{@link workflow.DataManipulation#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getDataManipulation()
 * @model annotation="gmf.node label='temp'"
 * @generated
 */
public interface DataManipulation extends Element {
	/**
	 * Returns the value of the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp</em>' attribute.
	 * @see #setTemp(String)
	 * @see workflow.WorkflowPackage#getDataManipulation_Temp()
	 * @model
	 * @generated
	 */
	String getTemp();

	/**
	 * Sets the value of the '{@link workflow.DataManipulation#getTemp <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp</em>' attribute.
	 * @see #getTemp()
	 * @generated
	 */
	void setTemp(String value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link workflow.DataRetrieval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see workflow.WorkflowPackage#getDataManipulation_Sources()
	 * @model required="true"
	 * @generated
	 */
	EList<DataRetrieval> getSources();

} // DataManipulation
