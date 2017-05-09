package org.epsilonlabs.workflow.execution.launch;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.epsilonlabs.workflow.execution.WorkflowLaunchConfigurationAttributes;
import org.epsilonlabs.workflow.execution.launch.examples.ExecuteWorkflow;

public class LaunchConfigurationDelegateImpl implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {

		System.out.println("Executing Workflow...");

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = null;

		String path = configuration.getAttribute(WorkflowLaunchConfigurationAttributes.RESOURCE_FILE_PATH,
				"no_file_path_provided");

		File resourceFile = new File(path);

		try {
			if (resourceFile.exists()) {
				// resource =
				// resourceSet.getResource(URI.createFileURI(resourceFile.getPath()),
				// true);

				// XXX to ensure both paths have the same separators File(...)
				// and toFile() are called in both cases to use OS-specific
				// paths (Eclipse workspace paths default to '/' regardless of
				// OS)
				String workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().getPath();
				String relativeWorkflowPath = resourceFile.getPath().replace(workspacePath, "");
				resource = resourceSet.getResource(URI.createPlatformResourceURI(relativeWorkflowPath, true), true);
				System.out.println(resource.getURI());
			}
		} catch (Exception e) {
			System.err.println("Cannot parse resource file.");
			e.printStackTrace();
		}

		if (resource != null) {
			Job j = new ExecuteWorkflow(resource);
			j.schedule();
			String attribute = configuration.getAttribute(WorkflowLaunchConfigurationAttributes.CONSOLE_TEXT,
					"Executed.");
			System.out.println(attribute);
		} else
			System.out.println("Workflow file not found at: " + path);
	}

}
