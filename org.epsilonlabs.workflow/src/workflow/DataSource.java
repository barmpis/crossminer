/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.DataSource#getRetrievals <em>Retrievals</em>}</li>
 *   <li>{@link workflow.DataSource#getUrl <em>Url</em>}</li>
 *   <li>{@link workflow.DataSource#isOffersPartialData <em>Offers Partial Data</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getDataSource()
 * @model abstract="true"
 *        annotation="gmf.node label='url'"
 * @generated
 */
public interface DataSource extends Element {
	/**
	 * Returns the value of the '<em><b>Retrievals</b></em>' reference list.
	 * The list contents are of type {@link workflow.DataRetrieval}.
	 * It is bidirectional and its opposite is '{@link workflow.DataRetrieval#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retrievals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retrievals</em>' reference list.
	 * @see workflow.WorkflowPackage#getDataSource_Retrievals()
	 * @see workflow.DataRetrieval#getSources
	 * @model opposite="sources" required="true"
	 * @generated
	 */
	EList<DataRetrieval> getRetrievals();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see workflow.WorkflowPackage#getDataSource_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link workflow.DataSource#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Offers Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers Partial Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers Partial Data</em>' attribute.
	 * @see #setOffersPartialData(boolean)
	 * @see workflow.WorkflowPackage#getDataSource_OffersPartialData()
	 * @model
	 * @generated
	 */
	boolean isOffersPartialData();

	/**
	 * Sets the value of the '{@link workflow.DataSource#isOffersPartialData <em>Offers Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offers Partial Data</em>' attribute.
	 * @see #isOffersPartialData()
	 * @generated
	 */
	void setOffersPartialData(boolean value);

} // DataSource
