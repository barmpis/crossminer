/**
 */
package workflow.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import workflow.TaskCommunicationConfiguration;
import workflow.WorkflowFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Communication Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskCommunicationConfigurationTest extends TestCase {

	/**
	 * The fixture for this Task Communication Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCommunicationConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskCommunicationConfigurationTest.class);
	}

	/**
	 * Constructs a new Task Communication Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCommunicationConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task Communication Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaskCommunicationConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task Communication Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCommunicationConfiguration getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkflowFactory.eINSTANCE.createTaskCommunicationConfiguration());
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

} //TaskCommunicationConfigurationTest
