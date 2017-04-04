/**
 */
package workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://workflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.WorkflowImpl
	 * @see workflow.impl.WorkflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Starting Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__STARTING_POINTS = 0;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__END_POINTS = 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONTENTS = 2;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ElementImpl
	 * @see workflow.impl.WorkflowPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DataSourceImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Retrievals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__RETRIEVALS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__URL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offers Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__OFFERS_PARTIAL_DATA = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link workflow.impl.GithubImpl <em>Github</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.GithubImpl
	 * @see workflow.impl.WorkflowPackageImpl#getGithub()
	 * @generated
	 */
	int GITHUB = 3;

	/**
	 * The feature id for the '<em><b>Retrievals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB__RETRIEVALS = DATA_SOURCE__RETRIEVALS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB__URL = DATA_SOURCE__URL;

	/**
	 * The feature id for the '<em><b>Offers Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB__OFFERS_PARTIAL_DATA = DATA_SOURCE__OFFERS_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Un</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB__UN = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB__PW = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Github</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.GithubBigQueryImpl <em>Github Big Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.GithubBigQueryImpl
	 * @see workflow.impl.WorkflowPackageImpl#getGithubBigQuery()
	 * @generated
	 */
	int GITHUB_BIG_QUERY = 4;

	/**
	 * The feature id for the '<em><b>Retrievals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_BIG_QUERY__RETRIEVALS = DATA_SOURCE__RETRIEVALS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_BIG_QUERY__URL = DATA_SOURCE__URL;

	/**
	 * The feature id for the '<em><b>Offers Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_BIG_QUERY__OFFERS_PARTIAL_DATA = DATA_SOURCE__OFFERS_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Un</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_BIG_QUERY__UN = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_BIG_QUERY__PW = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Github Big Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_BIG_QUERY_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.GHTorrentImpl <em>GH Torrent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.GHTorrentImpl
	 * @see workflow.impl.WorkflowPackageImpl#getGHTorrent()
	 * @generated
	 */
	int GH_TORRENT = 5;

	/**
	 * The feature id for the '<em><b>Retrievals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GH_TORRENT__RETRIEVALS = DATA_SOURCE__RETRIEVALS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GH_TORRENT__URL = DATA_SOURCE__URL;

	/**
	 * The feature id for the '<em><b>Offers Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GH_TORRENT__OFFERS_PARTIAL_DATA = DATA_SOURCE__OFFERS_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GH_TORRENT__PUBLIC_KEY = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GH Torrent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GH_TORRENT_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.DataRetrievalImpl <em>Data Retrieval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DataRetrievalImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDataRetrieval()
	 * @generated
	 */
	int DATA_RETRIEVAL = 6;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RETRIEVAL__SOURCES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repo Patterns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RETRIEVAL__REPO_PATTERNS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Retrieval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RETRIEVAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link workflow.impl.CommitsImpl <em>Commits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.CommitsImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCommits()
	 * @generated
	 */
	int COMMITS = 7;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS__SOURCES = DATA_RETRIEVAL__SOURCES;

	/**
	 * The feature id for the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS__ACCEPTS_PARTIAL_DATA = DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Repo Patterns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS__REPO_PATTERNS = DATA_RETRIEVAL__REPO_PATTERNS;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS__PATTERNS = DATA_RETRIEVAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS__START_DATE = DATA_RETRIEVAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS__END_DATE = DATA_RETRIEVAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Commits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS_FEATURE_COUNT = DATA_RETRIEVAL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link workflow.impl.AuthorsImpl <em>Authors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.AuthorsImpl
	 * @see workflow.impl.WorkflowPackageImpl#getAuthors()
	 * @generated
	 */
	int AUTHORS = 8;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS__SOURCES = DATA_RETRIEVAL__SOURCES;

	/**
	 * The feature id for the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS__ACCEPTS_PARTIAL_DATA = DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Repo Patterns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS__REPO_PATTERNS = DATA_RETRIEVAL__REPO_PATTERNS;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS__PATTERNS = DATA_RETRIEVAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_FEATURE_COUNT = DATA_RETRIEVAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.FilesImpl <em>Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.FilesImpl
	 * @see workflow.impl.WorkflowPackageImpl#getFiles()
	 * @generated
	 */
	int FILES = 9;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES__SOURCES = DATA_RETRIEVAL__SOURCES;

	/**
	 * The feature id for the '<em><b>Accepts Partial Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES__ACCEPTS_PARTIAL_DATA = DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA;

	/**
	 * The feature id for the '<em><b>Repo Patterns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES__REPO_PATTERNS = DATA_RETRIEVAL__REPO_PATTERNS;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES__PATTERNS = DATA_RETRIEVAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_FEATURE_COUNT = DATA_RETRIEVAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.DataManipulationImpl <em>Data Manipulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DataManipulationImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDataManipulation()
	 * @generated
	 */
	int DATA_MANIPULATION = 10;

	/**
	 * The feature id for the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANIPULATION__TEMP = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANIPULATION__SOURCES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Manipulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANIPULATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.DataAggregationImpl <em>Data Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DataAggregationImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDataAggregation()
	 * @generated
	 */
	int DATA_AGGREGATION = 11;

	/**
	 * The feature id for the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGGREGATION__TEMP = DATA_MANIPULATION__TEMP;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGGREGATION__SOURCES = DATA_MANIPULATION__SOURCES;

	/**
	 * The number of structural features of the '<em>Data Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGGREGATION_FEATURE_COUNT = DATA_MANIPULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.DataFilteringImpl <em>Data Filtering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DataFilteringImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDataFiltering()
	 * @generated
	 */
	int DATA_FILTERING = 12;

	/**
	 * The feature id for the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__TEMP = DATA_MANIPULATION__TEMP;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__SOURCES = DATA_MANIPULATION__SOURCES;

	/**
	 * The number of structural features of the '<em>Data Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING_FEATURE_COUNT = DATA_MANIPULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.CustomScriptImpl <em>Custom Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.CustomScriptImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCustomScript()
	 * @generated
	 */
	int CUSTOM_SCRIPT = 13;

	/**
	 * The feature id for the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCRIPT__TEMP = DATA_MANIPULATION__TEMP;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCRIPT__SOURCES = DATA_MANIPULATION__SOURCES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCRIPT__LANGUAGE = DATA_MANIPULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCRIPT__CODE = DATA_MANIPULATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCRIPT_FEATURE_COUNT = DATA_MANIPULATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see workflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Workflow#getStartingPoints <em>Starting Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Starting Points</em>'.
	 * @see workflow.Workflow#getStartingPoints()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_StartingPoints();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Workflow#getEndPoints <em>End Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Points</em>'.
	 * @see workflow.Workflow#getEndPoints()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_EndPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see workflow.Workflow#getContents()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Contents();

	/**
	 * Returns the meta object for class '{@link workflow.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see workflow.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link workflow.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see workflow.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the reference list '{@link workflow.DataSource#getRetrievals <em>Retrievals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Retrievals</em>'.
	 * @see workflow.DataSource#getRetrievals()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Retrievals();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DataSource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see workflow.DataSource#getUrl()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Url();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DataSource#isOffersPartialData <em>Offers Partial Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offers Partial Data</em>'.
	 * @see workflow.DataSource#isOffersPartialData()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_OffersPartialData();

	/**
	 * Returns the meta object for class '{@link workflow.Github <em>Github</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Github</em>'.
	 * @see workflow.Github
	 * @generated
	 */
	EClass getGithub();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Github#getUn <em>Un</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un</em>'.
	 * @see workflow.Github#getUn()
	 * @see #getGithub()
	 * @generated
	 */
	EAttribute getGithub_Un();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Github#getPw <em>Pw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pw</em>'.
	 * @see workflow.Github#getPw()
	 * @see #getGithub()
	 * @generated
	 */
	EAttribute getGithub_Pw();

	/**
	 * Returns the meta object for class '{@link workflow.GithubBigQuery <em>Github Big Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Github Big Query</em>'.
	 * @see workflow.GithubBigQuery
	 * @generated
	 */
	EClass getGithubBigQuery();

	/**
	 * Returns the meta object for the attribute '{@link workflow.GithubBigQuery#getUn <em>Un</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un</em>'.
	 * @see workflow.GithubBigQuery#getUn()
	 * @see #getGithubBigQuery()
	 * @generated
	 */
	EAttribute getGithubBigQuery_Un();

	/**
	 * Returns the meta object for the attribute '{@link workflow.GithubBigQuery#getPw <em>Pw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pw</em>'.
	 * @see workflow.GithubBigQuery#getPw()
	 * @see #getGithubBigQuery()
	 * @generated
	 */
	EAttribute getGithubBigQuery_Pw();

	/**
	 * Returns the meta object for class '{@link workflow.GHTorrent <em>GH Torrent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GH Torrent</em>'.
	 * @see workflow.GHTorrent
	 * @generated
	 */
	EClass getGHTorrent();

	/**
	 * Returns the meta object for the attribute '{@link workflow.GHTorrent#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see workflow.GHTorrent#getPublicKey()
	 * @see #getGHTorrent()
	 * @generated
	 */
	EAttribute getGHTorrent_PublicKey();

	/**
	 * Returns the meta object for class '{@link workflow.DataRetrieval <em>Data Retrieval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Retrieval</em>'.
	 * @see workflow.DataRetrieval
	 * @generated
	 */
	EClass getDataRetrieval();

	/**
	 * Returns the meta object for the reference list '{@link workflow.DataRetrieval#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see workflow.DataRetrieval#getSources()
	 * @see #getDataRetrieval()
	 * @generated
	 */
	EReference getDataRetrieval_Sources();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DataRetrieval#isAcceptsPartialData <em>Accepts Partial Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepts Partial Data</em>'.
	 * @see workflow.DataRetrieval#isAcceptsPartialData()
	 * @see #getDataRetrieval()
	 * @generated
	 */
	EAttribute getDataRetrieval_AcceptsPartialData();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DataRetrieval#getRepoPatterns <em>Repo Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repo Patterns</em>'.
	 * @see workflow.DataRetrieval#getRepoPatterns()
	 * @see #getDataRetrieval()
	 * @generated
	 */
	EAttribute getDataRetrieval_RepoPatterns();

	/**
	 * Returns the meta object for class '{@link workflow.Commits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commits</em>'.
	 * @see workflow.Commits
	 * @generated
	 */
	EClass getCommits();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Commits#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patterns</em>'.
	 * @see workflow.Commits#getPatterns()
	 * @see #getCommits()
	 * @generated
	 */
	EAttribute getCommits_Patterns();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Commits#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see workflow.Commits#getStartDate()
	 * @see #getCommits()
	 * @generated
	 */
	EAttribute getCommits_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Commits#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see workflow.Commits#getEndDate()
	 * @see #getCommits()
	 * @generated
	 */
	EAttribute getCommits_EndDate();

	/**
	 * Returns the meta object for class '{@link workflow.Authors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authors</em>'.
	 * @see workflow.Authors
	 * @generated
	 */
	EClass getAuthors();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Authors#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patterns</em>'.
	 * @see workflow.Authors#getPatterns()
	 * @see #getAuthors()
	 * @generated
	 */
	EAttribute getAuthors_Patterns();

	/**
	 * Returns the meta object for class '{@link workflow.Files <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Files</em>'.
	 * @see workflow.Files
	 * @generated
	 */
	EClass getFiles();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Files#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patterns</em>'.
	 * @see workflow.Files#getPatterns()
	 * @see #getFiles()
	 * @generated
	 */
	EAttribute getFiles_Patterns();

	/**
	 * Returns the meta object for class '{@link workflow.DataManipulation <em>Data Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Manipulation</em>'.
	 * @see workflow.DataManipulation
	 * @generated
	 */
	EClass getDataManipulation();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DataManipulation#getTemp <em>Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp</em>'.
	 * @see workflow.DataManipulation#getTemp()
	 * @see #getDataManipulation()
	 * @generated
	 */
	EAttribute getDataManipulation_Temp();

	/**
	 * Returns the meta object for the reference list '{@link workflow.DataManipulation#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see workflow.DataManipulation#getSources()
	 * @see #getDataManipulation()
	 * @generated
	 */
	EReference getDataManipulation_Sources();

	/**
	 * Returns the meta object for class '{@link workflow.DataAggregation <em>Data Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Aggregation</em>'.
	 * @see workflow.DataAggregation
	 * @generated
	 */
	EClass getDataAggregation();

	/**
	 * Returns the meta object for class '{@link workflow.DataFiltering <em>Data Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Filtering</em>'.
	 * @see workflow.DataFiltering
	 * @generated
	 */
	EClass getDataFiltering();

	/**
	 * Returns the meta object for class '{@link workflow.CustomScript <em>Custom Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Script</em>'.
	 * @see workflow.CustomScript
	 * @generated
	 */
	EClass getCustomScript();

	/**
	 * Returns the meta object for the attribute '{@link workflow.CustomScript#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see workflow.CustomScript#getLanguage()
	 * @see #getCustomScript()
	 * @generated
	 */
	EAttribute getCustomScript_Language();

	/**
	 * Returns the meta object for the attribute '{@link workflow.CustomScript#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see workflow.CustomScript#getCode()
	 * @see #getCustomScript()
	 * @generated
	 */
	EAttribute getCustomScript_Code();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.WorkflowImpl
		 * @see workflow.impl.WorkflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Starting Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__STARTING_POINTS = eINSTANCE.getWorkflow_StartingPoints();

		/**
		 * The meta object literal for the '<em><b>End Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__END_POINTS = eINSTANCE.getWorkflow_EndPoints();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CONTENTS = eINSTANCE.getWorkflow_Contents();

		/**
		 * The meta object literal for the '{@link workflow.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ElementImpl
		 * @see workflow.impl.WorkflowPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link workflow.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DataSourceImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Retrievals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__RETRIEVALS = eINSTANCE.getDataSource_Retrievals();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__URL = eINSTANCE.getDataSource_Url();

		/**
		 * The meta object literal for the '<em><b>Offers Partial Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__OFFERS_PARTIAL_DATA = eINSTANCE.getDataSource_OffersPartialData();

		/**
		 * The meta object literal for the '{@link workflow.impl.GithubImpl <em>Github</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.GithubImpl
		 * @see workflow.impl.WorkflowPackageImpl#getGithub()
		 * @generated
		 */
		EClass GITHUB = eINSTANCE.getGithub();

		/**
		 * The meta object literal for the '<em><b>Un</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GITHUB__UN = eINSTANCE.getGithub_Un();

		/**
		 * The meta object literal for the '<em><b>Pw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GITHUB__PW = eINSTANCE.getGithub_Pw();

		/**
		 * The meta object literal for the '{@link workflow.impl.GithubBigQueryImpl <em>Github Big Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.GithubBigQueryImpl
		 * @see workflow.impl.WorkflowPackageImpl#getGithubBigQuery()
		 * @generated
		 */
		EClass GITHUB_BIG_QUERY = eINSTANCE.getGithubBigQuery();

		/**
		 * The meta object literal for the '<em><b>Un</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GITHUB_BIG_QUERY__UN = eINSTANCE.getGithubBigQuery_Un();

		/**
		 * The meta object literal for the '<em><b>Pw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GITHUB_BIG_QUERY__PW = eINSTANCE.getGithubBigQuery_Pw();

		/**
		 * The meta object literal for the '{@link workflow.impl.GHTorrentImpl <em>GH Torrent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.GHTorrentImpl
		 * @see workflow.impl.WorkflowPackageImpl#getGHTorrent()
		 * @generated
		 */
		EClass GH_TORRENT = eINSTANCE.getGHTorrent();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GH_TORRENT__PUBLIC_KEY = eINSTANCE.getGHTorrent_PublicKey();

		/**
		 * The meta object literal for the '{@link workflow.impl.DataRetrievalImpl <em>Data Retrieval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DataRetrievalImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDataRetrieval()
		 * @generated
		 */
		EClass DATA_RETRIEVAL = eINSTANCE.getDataRetrieval();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RETRIEVAL__SOURCES = eINSTANCE.getDataRetrieval_Sources();

		/**
		 * The meta object literal for the '<em><b>Accepts Partial Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA = eINSTANCE.getDataRetrieval_AcceptsPartialData();

		/**
		 * The meta object literal for the '<em><b>Repo Patterns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RETRIEVAL__REPO_PATTERNS = eINSTANCE.getDataRetrieval_RepoPatterns();

		/**
		 * The meta object literal for the '{@link workflow.impl.CommitsImpl <em>Commits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.CommitsImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCommits()
		 * @generated
		 */
		EClass COMMITS = eINSTANCE.getCommits();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMITS__PATTERNS = eINSTANCE.getCommits_Patterns();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMITS__START_DATE = eINSTANCE.getCommits_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMITS__END_DATE = eINSTANCE.getCommits_EndDate();

		/**
		 * The meta object literal for the '{@link workflow.impl.AuthorsImpl <em>Authors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.AuthorsImpl
		 * @see workflow.impl.WorkflowPackageImpl#getAuthors()
		 * @generated
		 */
		EClass AUTHORS = eINSTANCE.getAuthors();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS__PATTERNS = eINSTANCE.getAuthors_Patterns();

		/**
		 * The meta object literal for the '{@link workflow.impl.FilesImpl <em>Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.FilesImpl
		 * @see workflow.impl.WorkflowPackageImpl#getFiles()
		 * @generated
		 */
		EClass FILES = eINSTANCE.getFiles();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILES__PATTERNS = eINSTANCE.getFiles_Patterns();

		/**
		 * The meta object literal for the '{@link workflow.impl.DataManipulationImpl <em>Data Manipulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DataManipulationImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDataManipulation()
		 * @generated
		 */
		EClass DATA_MANIPULATION = eINSTANCE.getDataManipulation();

		/**
		 * The meta object literal for the '<em><b>Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MANIPULATION__TEMP = eINSTANCE.getDataManipulation_Temp();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MANIPULATION__SOURCES = eINSTANCE.getDataManipulation_Sources();

		/**
		 * The meta object literal for the '{@link workflow.impl.DataAggregationImpl <em>Data Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DataAggregationImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDataAggregation()
		 * @generated
		 */
		EClass DATA_AGGREGATION = eINSTANCE.getDataAggregation();

		/**
		 * The meta object literal for the '{@link workflow.impl.DataFilteringImpl <em>Data Filtering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DataFilteringImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDataFiltering()
		 * @generated
		 */
		EClass DATA_FILTERING = eINSTANCE.getDataFiltering();

		/**
		 * The meta object literal for the '{@link workflow.impl.CustomScriptImpl <em>Custom Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.CustomScriptImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCustomScript()
		 * @generated
		 */
		EClass CUSTOM_SCRIPT = eINSTANCE.getCustomScript();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCRIPT__LANGUAGE = eINSTANCE.getCustomScript_Language();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCRIPT__CODE = eINSTANCE.getCustomScript_Code();

	}

} //WorkflowPackage
