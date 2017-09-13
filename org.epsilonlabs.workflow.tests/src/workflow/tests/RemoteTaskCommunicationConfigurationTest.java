/**
 */
package workflow.tests;

import junit.textui.TestRunner;

import workflow.RemoteTaskCommunicationConfiguration;
import workflow.WorkflowFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remote Task Communication Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteTaskCommunicationConfigurationTest extends TaskCommunicationConfigurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoteTaskCommunicationConfigurationTest.class);
	}

	/**
	 * Constructs a new Remote Task Communication Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteTaskCommunicationConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remote Task Communication Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoteTaskCommunicationConfiguration getFixture() {
		return (RemoteTaskCommunicationConfiguration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkflowFactory.eINSTANCE.createRemoteTaskCommunicationConfiguration());
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

} //RemoteTaskCommunicationConfigurationTest
