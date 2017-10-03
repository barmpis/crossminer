/**
 */
package workflow.tests;

import junit.textui.TestRunner;

import workflow.RemoteCommunicationChannel;
import workflow.WorkflowFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remote Communication Channel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteCommunicationChannelTest extends CommunicationChannelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoteCommunicationChannelTest.class);
	}

	/**
	 * Constructs a new Remote Communication Channel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteCommunicationChannelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remote Communication Channel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoteCommunicationChannel getFixture() {
		return (RemoteCommunicationChannel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkflowFactory.eINSTANCE.createRemoteCommunicationChannel());
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

} //RemoteCommunicationChannelTest
