/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Github Big Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.GithubBigQuery#getUn <em>Un</em>}</li>
 *   <li>{@link workflow.GithubBigQuery#getPw <em>Pw</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getGithubBigQuery()
 * @model
 * @generated
 */
public interface GithubBigQuery extends DataSource {
	/**
	 * Returns the value of the '<em><b>Un</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un</em>' attribute.
	 * @see #setUn(String)
	 * @see workflow.WorkflowPackage#getGithubBigQuery_Un()
	 * @model
	 * @generated
	 */
	String getUn();

	/**
	 * Sets the value of the '{@link workflow.GithubBigQuery#getUn <em>Un</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un</em>' attribute.
	 * @see #getUn()
	 * @generated
	 */
	void setUn(String value);

	/**
	 * Returns the value of the '<em><b>Pw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pw</em>' attribute.
	 * @see #setPw(String)
	 * @see workflow.WorkflowPackage#getGithubBigQuery_Pw()
	 * @model
	 * @generated
	 */
	String getPw();

	/**
	 * Sets the value of the '{@link workflow.GithubBigQuery#getPw <em>Pw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pw</em>' attribute.
	 * @see #getPw()
	 * @generated
	 */
	void setPw(String value);

} // GithubBigQuery
