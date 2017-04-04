/**
 */
package workflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import workflow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowFactory init() {
		try {
			WorkflowFactory theWorkflowFactory = (WorkflowFactory)EPackage.Registry.INSTANCE.getEFactory(WorkflowPackage.eNS_URI);
			if (theWorkflowFactory != null) {
				return theWorkflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WorkflowPackage.WORKFLOW: return createWorkflow();
			case WorkflowPackage.GITHUB: return createGithub();
			case WorkflowPackage.GITHUB_BIG_QUERY: return createGithubBigQuery();
			case WorkflowPackage.GH_TORRENT: return createGHTorrent();
			case WorkflowPackage.COMMITS: return createCommits();
			case WorkflowPackage.AUTHORS: return createAuthors();
			case WorkflowPackage.FILES: return createFiles();
			case WorkflowPackage.DATA_MANIPULATION: return createDataManipulation();
			case WorkflowPackage.DATA_AGGREGATION: return createDataAggregation();
			case WorkflowPackage.DATA_FILTERING: return createDataFiltering();
			case WorkflowPackage.CUSTOM_SCRIPT: return createCustomScript();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Github createGithub() {
		GithubImpl github = new GithubImpl();
		return github;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubBigQuery createGithubBigQuery() {
		GithubBigQueryImpl githubBigQuery = new GithubBigQueryImpl();
		return githubBigQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GHTorrent createGHTorrent() {
		GHTorrentImpl ghTorrent = new GHTorrentImpl();
		return ghTorrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commits createCommits() {
		CommitsImpl commits = new CommitsImpl();
		return commits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authors createAuthors() {
		AuthorsImpl authors = new AuthorsImpl();
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Files createFiles() {
		FilesImpl files = new FilesImpl();
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataManipulation createDataManipulation() {
		DataManipulationImpl dataManipulation = new DataManipulationImpl();
		return dataManipulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAggregation createDataAggregation() {
		DataAggregationImpl dataAggregation = new DataAggregationImpl();
		return dataAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFiltering createDataFiltering() {
		DataFilteringImpl dataFiltering = new DataFilteringImpl();
		return dataFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomScript createCustomScript() {
		CustomScriptImpl customScript = new CustomScriptImpl();
		return customScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowPackage getWorkflowPackage() {
		return (WorkflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowPackage getPackage() {
		return WorkflowPackage.eINSTANCE;
	}

} //WorkflowFactoryImpl
