/**
 */
package workflow.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import workflow.RemoteTaskCommunicationConfiguration;
import workflow.WorkflowPackage;

/**
 * This is the item provider adapter for a {@link workflow.RemoteTaskCommunicationConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteTaskCommunicationConfigurationItemProvider extends TaskCommunicationConfigurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteTaskCommunicationConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAddressPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addSingleQueuePropertyDescriptor(object);
			addQueuePersistancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoteTaskCommunicationConfiguration_address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoteTaskCommunicationConfiguration_address_feature", "_UI_RemoteTaskCommunicationConfiguration_type"),
				 WorkflowPackage.Literals.REMOTE_TASK_COMMUNICATION_CONFIGURATION__ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoteTaskCommunicationConfiguration_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoteTaskCommunicationConfiguration_port_feature", "_UI_RemoteTaskCommunicationConfiguration_type"),
				 WorkflowPackage.Literals.REMOTE_TASK_COMMUNICATION_CONFIGURATION__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Single Queue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSingleQueuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoteTaskCommunicationConfiguration_singleQueue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoteTaskCommunicationConfiguration_singleQueue_feature", "_UI_RemoteTaskCommunicationConfiguration_type"),
				 WorkflowPackage.Literals.REMOTE_TASK_COMMUNICATION_CONFIGURATION__SINGLE_QUEUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Queue Persistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueuePersistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoteTaskCommunicationConfiguration_queuePersistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoteTaskCommunicationConfiguration_queuePersistance_feature", "_UI_RemoteTaskCommunicationConfiguration_type"),
				 WorkflowPackage.Literals.REMOTE_TASK_COMMUNICATION_CONFIGURATION__QUEUE_PERSISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RemoteTaskCommunicationConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RemoteTaskCommunicationConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RemoteTaskCommunicationConfiguration)object).getAddress();
		return label == null || label.length() == 0 ?
			getString("_UI_RemoteTaskCommunicationConfiguration_type") :
			getString("_UI_RemoteTaskCommunicationConfiguration_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RemoteTaskCommunicationConfiguration.class)) {
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__ADDRESS:
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__PORT:
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__SINGLE_QUEUE:
			case WorkflowPackage.REMOTE_TASK_COMMUNICATION_CONFIGURATION__QUEUE_PERSISTANCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
