/**
 */
package workflow.tests;

import junit.textui.TestRunner;

import workflow.GithubBigQuery;
import workflow.WorkflowFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Github Big Query</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubBigQueryTest extends DataSourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GithubBigQueryTest.class);
	}

	/**
	 * Constructs a new Github Big Query test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubBigQueryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Github Big Query test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GithubBigQuery getFixture() {
		return (GithubBigQuery)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkflowFactory.eINSTANCE.createGithubBigQuery());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GithubBigQueryTest
