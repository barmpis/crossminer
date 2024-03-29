/*
 * 
 */
package workflow.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.tooling.runtime.LogHelper;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import workflow.diagram.edit.policies.WorkflowBaseItemSemanticEditPolicy;
import workflow.diagram.expressions.WorkflowOCLFactory;
import workflow.diagram.providers.ElementInitializers;
import workflow.provider.WorkflowItemProviderAdapterFactory;

/**
 * @generated
 */
public class WorkflowDiagramEditorPlugin extends AbstractUIPlugin {

	/**
	* @generated
	*/
	public static final String ID = "org.epsilonlabs.workflow.diagram"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private LogHelper myLogHelper;

	/**
	* @generated
	*/
	public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(ID);

	/**
	* @generated
	*/
	private static WorkflowDiagramEditorPlugin instance;

	/**
	* @generated
	*/
	private ComposedAdapterFactory adapterFactory;

	/**
	* @generated
	*/
	private WorkflowDocumentProvider documentProvider;

	/**
	* @generated
	*/
	private WorkflowBaseItemSemanticEditPolicy.LinkConstraints linkConstraints;

	/**
	* @generated
	*/
	private ElementInitializers initializers;

	/**
	* @generated
	*/
	private WorkflowOCLFactory oclFactory;

	/**
	* @generated
	*/
	public WorkflowDiagramEditorPlugin() {
	}

	/**
	* @generated
	*/
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		myLogHelper = new LogHelper(this);
		PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT, getPreferenceStore());
		adapterFactory = createAdapterFactory();
	}

	/**
	* @generated
	*/
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		linkConstraints = null;
		initializers = null;
		oclFactory = null;
		instance = null;
		super.stop(context);
	}

	/**
	* @generated
	*/
	public static WorkflowDiagramEditorPlugin getInstance() {
		return instance;
	}

	/**
	* @generated
	*/
	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	* @generated
	*/
	protected void fillItemProviderFactories(List<AdapterFactory> factories) {
		factories.add(new WorkflowItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	* @generated
	*/
	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

	/**
	* @generated
	*/
	public ImageDescriptor getItemImageDescriptor(Object item) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(item, IItemLabelProvider.class);
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(labelProvider.getImage(item));
		}
		return null;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @generated
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getBundledImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
	}

	/**
	 * Respects images residing in any plug-in. If path is relative,
	 * then this bundle is looked up for the image, otherwise, for absolute 
	 * path, first segment is taken as id of plug-in with image
	 *
	 * @generated
	 * @param path the path to image, either absolute (with plug-in id as first segment), or relative for bundled images
	 * @return the image descriptor
	 */
	public static ImageDescriptor findImageDescriptor(String path) {
		final IPath p = new Path(path);
		if (p.isAbsolute() && p.segmentCount() > 1) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0),
					p.removeFirstSegments(1).makeAbsolute().toString());
		} else {
			return getBundledImageDescriptor(p.makeAbsolute().toString());
		}
	}

	/**
	 * Returns an image for the image file at the given plug-in relative path.
	 * Client do not need to dispose this image. Images will be disposed automatically.
	 *
	 * @generated
	 * @param path the path
	 * @return image instance
	 */
	public Image getBundledImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image == null) {
			getImageRegistry().put(path, getBundledImageDescriptor(path));
			image = getImageRegistry().get(path);
		}
		return image;
	}

	/**
	 * Returns string from plug-in's resource bundle
	 *
	 * @generated
	 */
	public static String getString(String key) {
		return Platform.getResourceString(getInstance().getBundle(), "%" + key); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public WorkflowDocumentProvider getDocumentProvider() {
		if (documentProvider == null) {
			documentProvider = new WorkflowDocumentProvider();
		}
		return documentProvider;
	}

	/**
	* @generated
	*/
	public WorkflowBaseItemSemanticEditPolicy.LinkConstraints getLinkConstraints() {
		return linkConstraints;
	}

	/**
	* @generated
	*/
	public void setLinkConstraints(WorkflowBaseItemSemanticEditPolicy.LinkConstraints lc) {
		this.linkConstraints = lc;
	}

	/**
	* @generated
	*/
	public ElementInitializers getElementInitializers() {
		return initializers;
	}

	/**
	* @generated
	*/
	public void setElementInitializers(ElementInitializers i) {
		this.initializers = i;
	}

	/**
	* @generated
	*/
	public WorkflowOCLFactory getWorkflowOCLFactory() {
		return oclFactory;
	}

	/**
	* @generated
	*/
	public void setWorkflowOCLFactory(WorkflowOCLFactory f) {
		this.oclFactory = f;
	}

	/**
	* @generated
	*/
	public void logError(String error) {
		getLogHelper().logError(error, null);
	}

	/**
	* @generated
	*/
	public void logError(String error, Throwable throwable) {
		getLogHelper().logError(error, throwable);
	}

	/**
	* @generated
	*/
	public void logInfo(String message) {
		getLogHelper().logInfo(message, null);
	}

	/**
	* @generated
	*/
	public void logInfo(String message, Throwable throwable) {
		getLogHelper().logInfo(message, throwable);
	}

	/**
	* @generated
	*/
	public LogHelper getLogHelper() {
		return myLogHelper;
	}

}
