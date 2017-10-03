/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.JavaTask#getImplementationFullyQualifiedName <em>Implementation Fully Qualified Name</em>}</li>
 *   <li>{@link workflow.JavaTask#getImplementationEntryPoint <em>Implementation Entry Point</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getJavaTask()
 * @model
 * @generated
 */
public interface JavaTask extends Task {
	/**
	 * Returns the value of the '<em><b>Implementation Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Fully Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Fully Qualified Name</em>' attribute.
	 * @see #setImplementationFullyQualifiedName(String)
	 * @see workflow.WorkflowPackage#getJavaTask_ImplementationFullyQualifiedName()
	 * @model
	 * @generated
	 */
	String getImplementationFullyQualifiedName();

	/**
	 * Sets the value of the '{@link workflow.JavaTask#getImplementationFullyQualifiedName <em>Implementation Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Fully Qualified Name</em>' attribute.
	 * @see #getImplementationFullyQualifiedName()
	 * @generated
	 */
	void setImplementationFullyQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Entry Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Entry Point</em>' attribute.
	 * @see #setImplementationEntryPoint(String)
	 * @see workflow.WorkflowPackage#getJavaTask_ImplementationEntryPoint()
	 * @model
	 * @generated
	 */
	String getImplementationEntryPoint();

	/**
	 * Sets the value of the '{@link workflow.JavaTask#getImplementationEntryPoint <em>Implementation Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Entry Point</em>' attribute.
	 * @see #getImplementationEntryPoint()
	 * @generated
	 */
	void setImplementationEntryPoint(String value);

} // JavaTask
