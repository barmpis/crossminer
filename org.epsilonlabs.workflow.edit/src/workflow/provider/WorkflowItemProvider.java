/**
 */
package workflow.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import workflow.Workflow;
import workflow.WorkflowFactory;
import workflow.WorkflowPackage;

/**
 * This is the item provider adapter for a {@link workflow.Workflow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowItemProvider(AdapterFactory adapterFactory) {
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

			addStartingPointsPropertyDescriptor(object);
			addEndPointsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Starting Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartingPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workflow_startingPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workflow_startingPoints_feature", "_UI_Workflow_type"),
				 WorkflowPackage.Literals.WORKFLOW__STARTING_POINTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workflow_endPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workflow_endPoints_feature", "_UI_Workflow_type"),
				 WorkflowPackage.Literals.WORKFLOW__END_POINTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WorkflowPackage.Literals.WORKFLOW__CONTENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Workflow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Workflow"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Workflow_type");
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

		switch (notification.getFeatureID(Workflow.class)) {
			case WorkflowPackage.WORKFLOW__CONTENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createGithub()));

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createGithubBigQuery()));

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createGHTorrent()));

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createCommits()));

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createAuthors()));

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createFiles()));

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createDataManipulation()));

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createDataAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createDataFiltering()));

		newChildDescriptors.add
			(createChildParameter
				(WorkflowPackage.Literals.WORKFLOW__CONTENTS,
				 WorkflowFactory.eINSTANCE.createCustomScript()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WorkflowEditPlugin.INSTANCE;
	}

}
