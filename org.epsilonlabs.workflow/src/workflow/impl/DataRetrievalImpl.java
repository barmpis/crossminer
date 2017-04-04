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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.DataRetrieval;
import workflow.DataSource;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Retrieval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.DataRetrievalImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link workflow.impl.DataRetrievalImpl#isAcceptsPartialData <em>Accepts Partial Data</em>}</li>
 *   <li>{@link workflow.impl.DataRetrievalImpl#getRepoPatterns <em>Repo Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataRetrievalImpl extends ElementImpl implements DataRetrieval {
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> sources;

	/**
	 * The default value of the '{@link #isAcceptsPartialData() <em>Accepts Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptsPartialData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCEPTS_PARTIAL_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAcceptsPartialData() <em>Accepts Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptsPartialData()
	 * @generated
	 * @ordered
	 */
	protected boolean acceptsPartialData = ACCEPTS_PARTIAL_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepoPatterns() <em>Repo Patterns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepoPatterns()
	 * @generated
	 * @ordered
	 */
	protected static final String REPO_PATTERNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepoPatterns() <em>Repo Patterns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepoPatterns()
	 * @generated
	 * @ordered
	 */
	protected String repoPatterns = REPO_PATTERNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRetrievalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DATA_RETRIEVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSource> getSources() {
		if (sources == null) {
			sources = new EObjectWithInverseResolvingEList.ManyInverse<DataSource>(DataSource.class, this, WorkflowPackage.DATA_RETRIEVAL__SOURCES, WorkflowPackage.DATA_SOURCE__RETRIEVALS);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAcceptsPartialData() {
		return acceptsPartialData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptsPartialData(boolean newAcceptsPartialData) {
		boolean oldAcceptsPartialData = acceptsPartialData;
		acceptsPartialData = newAcceptsPartialData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA, oldAcceptsPartialData, acceptsPartialData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepoPatterns() {
		return repoPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepoPatterns(String newRepoPatterns) {
		String oldRepoPatterns = repoPatterns;
		repoPatterns = newRepoPatterns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DATA_RETRIEVAL__REPO_PATTERNS, oldRepoPatterns, repoPatterns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.DATA_RETRIEVAL__SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSources()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.DATA_RETRIEVAL__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.DATA_RETRIEVAL__SOURCES:
				return getSources();
			case WorkflowPackage.DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA:
				return isAcceptsPartialData();
			case WorkflowPackage.DATA_RETRIEVAL__REPO_PATTERNS:
				return getRepoPatterns();
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
			case WorkflowPackage.DATA_RETRIEVAL__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends DataSource>)newValue);
				return;
			case WorkflowPackage.DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA:
				setAcceptsPartialData((Boolean)newValue);
				return;
			case WorkflowPackage.DATA_RETRIEVAL__REPO_PATTERNS:
				setRepoPatterns((String)newValue);
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
			case WorkflowPackage.DATA_RETRIEVAL__SOURCES:
				getSources().clear();
				return;
			case WorkflowPackage.DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA:
				setAcceptsPartialData(ACCEPTS_PARTIAL_DATA_EDEFAULT);
				return;
			case WorkflowPackage.DATA_RETRIEVAL__REPO_PATTERNS:
				setRepoPatterns(REPO_PATTERNS_EDEFAULT);
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
			case WorkflowPackage.DATA_RETRIEVAL__SOURCES:
				return sources != null && !sources.isEmpty();
			case WorkflowPackage.DATA_RETRIEVAL__ACCEPTS_PARTIAL_DATA:
				return acceptsPartialData != ACCEPTS_PARTIAL_DATA_EDEFAULT;
			case WorkflowPackage.DATA_RETRIEVAL__REPO_PATTERNS:
				return REPO_PATTERNS_EDEFAULT == null ? repoPatterns != null : !REPO_PATTERNS_EDEFAULT.equals(repoPatterns);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (acceptsPartialData: ");
		result.append(acceptsPartialData);
		result.append(", repoPatterns: ");
		result.append(repoPatterns);
		result.append(')');
		return result.toString();
	}

} //DataRetrievalImpl
