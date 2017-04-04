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
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.DataSourceImpl#getRetrievals <em>Retrievals</em>}</li>
 *   <li>{@link workflow.impl.DataSourceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link workflow.impl.DataSourceImpl#isOffersPartialData <em>Offers Partial Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataSourceImpl extends ElementImpl implements DataSource {
	/**
	 * The cached value of the '{@link #getRetrievals() <em>Retrievals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetrievals()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRetrieval> retrievals;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isOffersPartialData() <em>Offers Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOffersPartialData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OFFERS_PARTIAL_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOffersPartialData() <em>Offers Partial Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOffersPartialData()
	 * @generated
	 * @ordered
	 */
	protected boolean offersPartialData = OFFERS_PARTIAL_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRetrieval> getRetrievals() {
		if (retrievals == null) {
			retrievals = new EObjectWithInverseResolvingEList.ManyInverse<DataRetrieval>(DataRetrieval.class, this, WorkflowPackage.DATA_SOURCE__RETRIEVALS, WorkflowPackage.DATA_RETRIEVAL__SOURCES);
		}
		return retrievals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DATA_SOURCE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOffersPartialData() {
		return offersPartialData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffersPartialData(boolean newOffersPartialData) {
		boolean oldOffersPartialData = offersPartialData;
		offersPartialData = newOffersPartialData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DATA_SOURCE__OFFERS_PARTIAL_DATA, oldOffersPartialData, offersPartialData));
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
			case WorkflowPackage.DATA_SOURCE__RETRIEVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRetrievals()).basicAdd(otherEnd, msgs);
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
			case WorkflowPackage.DATA_SOURCE__RETRIEVALS:
				return ((InternalEList<?>)getRetrievals()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.DATA_SOURCE__RETRIEVALS:
				return getRetrievals();
			case WorkflowPackage.DATA_SOURCE__URL:
				return getUrl();
			case WorkflowPackage.DATA_SOURCE__OFFERS_PARTIAL_DATA:
				return isOffersPartialData();
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
			case WorkflowPackage.DATA_SOURCE__RETRIEVALS:
				getRetrievals().clear();
				getRetrievals().addAll((Collection<? extends DataRetrieval>)newValue);
				return;
			case WorkflowPackage.DATA_SOURCE__URL:
				setUrl((String)newValue);
				return;
			case WorkflowPackage.DATA_SOURCE__OFFERS_PARTIAL_DATA:
				setOffersPartialData((Boolean)newValue);
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
			case WorkflowPackage.DATA_SOURCE__RETRIEVALS:
				getRetrievals().clear();
				return;
			case WorkflowPackage.DATA_SOURCE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case WorkflowPackage.DATA_SOURCE__OFFERS_PARTIAL_DATA:
				setOffersPartialData(OFFERS_PARTIAL_DATA_EDEFAULT);
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
			case WorkflowPackage.DATA_SOURCE__RETRIEVALS:
				return retrievals != null && !retrievals.isEmpty();
			case WorkflowPackage.DATA_SOURCE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case WorkflowPackage.DATA_SOURCE__OFFERS_PARTIAL_DATA:
				return offersPartialData != OFFERS_PARTIAL_DATA_EDEFAULT;
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
		result.append(" (url: ");
		result.append(url);
		result.append(", offersPartialData: ");
		result.append(offersPartialData);
		result.append(')');
		return result.toString();
	}

} //DataSourceImpl
