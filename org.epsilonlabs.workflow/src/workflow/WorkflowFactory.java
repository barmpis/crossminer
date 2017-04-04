/**
 */
package workflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public interface WorkflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowFactory eINSTANCE = workflow.impl.WorkflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Github</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Github</em>'.
	 * @generated
	 */
	Github createGithub();

	/**
	 * Returns a new object of class '<em>Github Big Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Github Big Query</em>'.
	 * @generated
	 */
	GithubBigQuery createGithubBigQuery();

	/**
	 * Returns a new object of class '<em>GH Torrent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GH Torrent</em>'.
	 * @generated
	 */
	GHTorrent createGHTorrent();

	/**
	 * Returns a new object of class '<em>Commits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commits</em>'.
	 * @generated
	 */
	Commits createCommits();

	/**
	 * Returns a new object of class '<em>Authors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authors</em>'.
	 * @generated
	 */
	Authors createAuthors();

	/**
	 * Returns a new object of class '<em>Files</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Files</em>'.
	 * @generated
	 */
	Files createFiles();

	/**
	 * Returns a new object of class '<em>Data Manipulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Manipulation</em>'.
	 * @generated
	 */
	DataManipulation createDataManipulation();

	/**
	 * Returns a new object of class '<em>Data Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Aggregation</em>'.
	 * @generated
	 */
	DataAggregation createDataAggregation();

	/**
	 * Returns a new object of class '<em>Data Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Filtering</em>'.
	 * @generated
	 */
	DataFiltering createDataFiltering();

	/**
	 * Returns a new object of class '<em>Custom Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Script</em>'.
	 * @generated
	 */
	CustomScript createCustomScript();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkflowPackage getWorkflowPackage();

} //WorkflowFactory
