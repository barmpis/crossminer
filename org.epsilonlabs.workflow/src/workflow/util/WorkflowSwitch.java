/**
 */
package workflow.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import workflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public class WorkflowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSwitch() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WorkflowPackage.WORKFLOW: {
				Workflow workflow = (Workflow)theEObject;
				T result = caseWorkflow(workflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = caseElement(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.GITHUB: {
				Github github = (Github)theEObject;
				T result = caseGithub(github);
				if (result == null) result = caseDataSource(github);
				if (result == null) result = caseElement(github);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.GITHUB_BIG_QUERY: {
				GithubBigQuery githubBigQuery = (GithubBigQuery)theEObject;
				T result = caseGithubBigQuery(githubBigQuery);
				if (result == null) result = caseDataSource(githubBigQuery);
				if (result == null) result = caseElement(githubBigQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.GH_TORRENT: {
				GHTorrent ghTorrent = (GHTorrent)theEObject;
				T result = caseGHTorrent(ghTorrent);
				if (result == null) result = caseDataSource(ghTorrent);
				if (result == null) result = caseElement(ghTorrent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DATA_RETRIEVAL: {
				DataRetrieval dataRetrieval = (DataRetrieval)theEObject;
				T result = caseDataRetrieval(dataRetrieval);
				if (result == null) result = caseElement(dataRetrieval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.COMMITS: {
				Commits commits = (Commits)theEObject;
				T result = caseCommits(commits);
				if (result == null) result = caseDataRetrieval(commits);
				if (result == null) result = caseElement(commits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.AUTHORS: {
				Authors authors = (Authors)theEObject;
				T result = caseAuthors(authors);
				if (result == null) result = caseDataRetrieval(authors);
				if (result == null) result = caseElement(authors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.FILES: {
				Files files = (Files)theEObject;
				T result = caseFiles(files);
				if (result == null) result = caseDataRetrieval(files);
				if (result == null) result = caseElement(files);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DATA_MANIPULATION: {
				DataManipulation dataManipulation = (DataManipulation)theEObject;
				T result = caseDataManipulation(dataManipulation);
				if (result == null) result = caseElement(dataManipulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DATA_AGGREGATION: {
				DataAggregation dataAggregation = (DataAggregation)theEObject;
				T result = caseDataAggregation(dataAggregation);
				if (result == null) result = caseDataManipulation(dataAggregation);
				if (result == null) result = caseElement(dataAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DATA_FILTERING: {
				DataFiltering dataFiltering = (DataFiltering)theEObject;
				T result = caseDataFiltering(dataFiltering);
				if (result == null) result = caseDataManipulation(dataFiltering);
				if (result == null) result = caseElement(dataFiltering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CUSTOM_SCRIPT: {
				CustomScript customScript = (CustomScript)theEObject;
				T result = caseCustomScript(customScript);
				if (result == null) result = caseDataManipulation(customScript);
				if (result == null) result = caseElement(customScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Github</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Github</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGithub(Github object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Github Big Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Github Big Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGithubBigQuery(GithubBigQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GH Torrent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GH Torrent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGHTorrent(GHTorrent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Retrieval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Retrieval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRetrieval(DataRetrieval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommits(Commits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthors(Authors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiles(Files object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Manipulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Manipulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataManipulation(DataManipulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAggregation(DataAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Filtering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFiltering(DataFiltering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomScript(CustomScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WorkflowSwitch
