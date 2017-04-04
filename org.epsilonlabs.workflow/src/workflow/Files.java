/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Files#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getFiles()
 * @model
 * @generated
 */
public interface Files extends DataRetrieval {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' attribute.
	 * @see #setPatterns(String)
	 * @see workflow.WorkflowPackage#getFiles_Patterns()
	 * @model
	 * @generated
	 */
	String getPatterns();

	/**
	 * Sets the value of the '{@link workflow.Files#getPatterns <em>Patterns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patterns</em>' attribute.
	 * @see #getPatterns()
	 * @generated
	 */
	void setPatterns(String value);

} // Files
