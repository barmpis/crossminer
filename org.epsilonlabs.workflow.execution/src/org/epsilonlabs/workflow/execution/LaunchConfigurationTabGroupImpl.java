package org.epsilonlabs.workflow.execution;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/*
The tabs are contributed using the org.eclipse.debug.ui.launchConfigurationTabGroups 
extension point. 
In this extension, the id of a configuration type 
(defined using org.eclipse.debug.core.launchConfigurationTypes) 
is associated with the class that implements ILaunchConfigurationTabGroup.
*/

public class LaunchConfigurationTabGroupImpl extends AbstractLaunchConfigurationTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[] { new LaunchConfigurationTab() });
	}

}
