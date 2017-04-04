/**
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import workflow.DataSource;
import workflow.Element;
import workflow.Workflow;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.WorkflowImpl#getStartingPoints <em>Starting Points</em>}</li>
 *   <li>{@link workflow.impl.WorkflowImpl#getEndPoints <em>End Points</em>}</li>
 *   <li>{@link workflow.impl.WorkflowImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends EObjectImpl implements Workflow {
	/**
	 * The cached value of the '{@link #getStartingPoints() <em>Starting Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> startingPoints;

	/**
	 * The cached value of the '{@link #getEndPoints() <em>End Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> endPoints;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSource> getStartingPoints() {
		if (startingPoints == null) {
			startingPoints = new EObjectResolvingEList<DataSource>(DataSource.class, this, WorkflowPackage.WORKFLOW__STARTING_POINTS);
		}
		return startingPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSource> getEndPoints() {
		if (endPoints == null) {
			endPoints = new EObjectResolvingEList<DataSource>(DataSource.class, this, WorkflowPackage.WORKFLOW__END_POINTS);
		}
		return endPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<Element>(Element.class, this, WorkflowPackage.WORKFLOW__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__STARTING_POINTS:
				return getStartingPoints();
			case WorkflowPackage.WORKFLOW__END_POINTS:
				return getEndPoints();
			case WorkflowPackage.WORKFLOW__CONTENTS:
				return getContents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__STARTING_POINTS:
				getStartingPoints().clear();
				getStartingPoints().addAll((Collection<? extends DataSource>)newValue);
				return;
			case WorkflowPackage.WORKFLOW__END_POINTS:
				getEndPoints().clear();
				getEndPoints().addAll((Collection<? extends DataSource>)newValue);
				return;
			case WorkflowPackage.WORKFLOW__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Element>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__STARTING_POINTS:
				getStartingPoints().clear();
				return;
			case WorkflowPackage.WORKFLOW__END_POINTS:
				getEndPoints().clear();
				return;
			case WorkflowPackage.WORKFLOW__CONTENTS:
				getContents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__STARTING_POINTS:
				return startingPoints != null && !startingPoints.isEmpty();
			case WorkflowPackage.WORKFLOW__END_POINTS:
				return endPoints != null && !endPoints.isEmpty();
			case WorkflowPackage.WORKFLOW__CONTENTS:
				return contents != null && !contents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowImpl
