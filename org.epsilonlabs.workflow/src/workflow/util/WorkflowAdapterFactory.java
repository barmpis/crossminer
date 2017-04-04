/**
 */
package workflow.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import workflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public class WorkflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowSwitch<Adapter> modelSwitch =
		new WorkflowSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseGithub(Github object) {
				return createGithubAdapter();
			}
			@Override
			public Adapter caseGithubBigQuery(GithubBigQuery object) {
				return createGithubBigQueryAdapter();
			}
			@Override
			public Adapter caseGHTorrent(GHTorrent object) {
				return createGHTorrentAdapter();
			}
			@Override
			public Adapter caseDataRetrieval(DataRetrieval object) {
				return createDataRetrievalAdapter();
			}
			@Override
			public Adapter caseCommits(Commits object) {
				return createCommitsAdapter();
			}
			@Override
			public Adapter caseAuthors(Authors object) {
				return createAuthorsAdapter();
			}
			@Override
			public Adapter caseFiles(Files object) {
				return createFilesAdapter();
			}
			@Override
			public Adapter caseDataManipulation(DataManipulation object) {
				return createDataManipulationAdapter();
			}
			@Override
			public Adapter caseDataAggregation(DataAggregation object) {
				return createDataAggregationAdapter();
			}
			@Override
			public Adapter caseDataFiltering(DataFiltering object) {
				return createDataFilteringAdapter();
			}
			@Override
			public Adapter caseCustomScript(CustomScript object) {
				return createCustomScriptAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Github <em>Github</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Github
	 * @generated
	 */
	public Adapter createGithubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.GithubBigQuery <em>Github Big Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.GithubBigQuery
	 * @generated
	 */
	public Adapter createGithubBigQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.GHTorrent <em>GH Torrent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.GHTorrent
	 * @generated
	 */
	public Adapter createGHTorrentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DataRetrieval <em>Data Retrieval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DataRetrieval
	 * @generated
	 */
	public Adapter createDataRetrievalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Commits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Commits
	 * @generated
	 */
	public Adapter createCommitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Authors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Authors
	 * @generated
	 */
	public Adapter createAuthorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Files <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Files
	 * @generated
	 */
	public Adapter createFilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DataManipulation <em>Data Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DataManipulation
	 * @generated
	 */
	public Adapter createDataManipulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DataAggregation <em>Data Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DataAggregation
	 * @generated
	 */
	public Adapter createDataAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DataFiltering <em>Data Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DataFiltering
	 * @generated
	 */
	public Adapter createDataFilteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.CustomScript <em>Custom Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.CustomScript
	 * @generated
	 */
	public Adapter createCustomScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WorkflowAdapterFactory
