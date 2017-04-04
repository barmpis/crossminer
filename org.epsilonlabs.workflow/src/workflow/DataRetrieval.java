/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Retrieval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.DataRetrieval#getSources <em>Sources</em>}</li>
 *   <li>{@link workflow.DataRetrieval#isAcceptsPartialData <em>Accepts Partial Data</em>}</li>
 *   <li>{@link workflow.DataRetrieval#getRepoPatterns <em>Repo Patterns</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getDataRetrieval()
 * @model abstract="true"
 *        annotation="gmf.node label='repoPatterns'"
 * @generated
 */
public interface DataRetrieval extends Element {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link workflow.DataSource}.
	 * It is bidirectional and its opposite is '{@link workflow.DataSource#getRetrievals <em>Retrievals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see workflow.WorkflowPackage#getDataRetrieval_Sources()
	 * @see workflow.DataSource#getRetrievals
	 * @model opposite="retrievals" required="true"
	 * @generated
	 */
	EList<DataSource> getSources();

	/**
	 * Returns the value of the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepts Partial Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepts Partial Data</em>' attribute.
	 * @see #setAcceptsPartialData(boolean)
	 * @see workflow.WorkflowPackage#getDataRetrieval_AcceptsPartialData()
	 * @model
	 * @generated
	 */
	boolean isAcceptsPartialData();

	/**
	 * Sets the value of the '{@link workflow.DataRetrieval#isAcceptsPartialData <em>Accepts Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepts Partial Data</em>' attribute.
	 * @see #isAcceptsPartialData()
	 * @generated
	 */
	void setAcceptsPartialData(boolean value);

	/**
	 * Returns the value of the '<em><b>Repo Patterns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo Patterns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo Patterns</em>' attribute.
	 * @see #setRepoPatterns(String)
	 * @see workflow.WorkflowPackage#getDataRetrieval_RepoPatterns()
	 * @model
	 * @generated
	 */
	String getRepoPatterns();

	/**
	 * Sets the value of the '{@link workflow.DataRetrieval#getRepoPatterns <em>Repo Patterns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo Patterns</em>' attribute.
	 * @see #getRepoPatterns()
	 * @generated
	 */
	void setRepoPatterns(String value);

} // DataRetrieval
