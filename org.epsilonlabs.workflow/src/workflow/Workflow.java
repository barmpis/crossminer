/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Workflow#getStartingPoints <em>Starting Points</em>}</li>
 *   <li>{@link workflow.Workflow#getEndPoints <em>End Points</em>}</li>
 *   <li>{@link workflow.Workflow#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getWorkflow()
 * @model annotation="gmf.diagram onefile='true'"
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting Points</b></em>' reference list.
	 * The list contents are of type {@link workflow.DataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Points</em>' reference list.
	 * @see workflow.WorkflowPackage#getWorkflow_StartingPoints()
	 * @model required="true"
	 * @generated
	 */
	EList<DataSource> getStartingPoints();

	/**
	 * Returns the value of the '<em><b>End Points</b></em>' reference list.
	 * The list contents are of type {@link workflow.DataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Points</em>' reference list.
	 * @see workflow.WorkflowPackage#getWorkflow_EndPoints()
	 * @model required="true"
	 * @generated
	 */
	EList<DataSource> getEndPoints();

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getWorkflow_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getContents();

} // Workflow
