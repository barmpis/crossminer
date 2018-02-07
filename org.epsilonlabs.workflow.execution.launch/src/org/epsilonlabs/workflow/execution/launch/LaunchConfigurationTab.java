/*******************************************************************************
 * Copyright (c) 2017 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Konstantinos Barmpis - initial API and implementation
 ******************************************************************************/
package org.epsilonlabs.workflow.execution.launch;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class LaunchConfigurationTab extends AbstractLaunchConfigurationTab {

	private Text filePathTextField;
	private Text text;

	@Override
	public void createControl(Composite parent) {

		Composite comp = new Group(parent, SWT.BORDER);
		setControl(comp);

		GridLayoutFactory.swtDefaults().numColumns(3).applyTo(comp);

		//
		Label label = new Label(comp, SWT.NONE);
		label.setText("File Path:");
		GridDataFactory.swtDefaults().applyTo(label);

		filePathTextField = new Text(comp, SWT.BORDER);
		filePathTextField.setMessage("Path of the workflow file to execute.");
		filePathTextField.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				scheduleUpdateJob();
			}
		});

		Button b = new Button(comp, SWT.NONE);
		b.setText("Browse");
		b.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {

				FileDialog f = new FileDialog((Frame) null);
				f.setFilenameFilter(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
						return name.endsWith(".workflow_diagram");
					}
				});

				f.setName("Workflow File");
				f.setTitle("Select the workflow file to execute.");
				String workspacedir = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
				System.out.println(workspacedir);
				f.setDirectory(workspacedir);
				f.setBounds(400, 500, f.getWidth(), f.getHeight());
				f.setVisible(true);

				filePathTextField
						.setText(f.getFile() != null ? f.getDirectory() + f.getFile() : filePathTextField.getText());
				filePathTextField.update();

			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		//
		label = new Label(comp, SWT.NONE);
		label.setText("Console Text:");
		GridDataFactory.swtDefaults().applyTo(label);

		text = new Text(comp, SWT.BORDER);
		text.setMessage("Console Text");
		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				scheduleUpdateJob();
			}
		});

		label = new Label(comp, SWT.NONE);
		label.setText("");

		GridDataFactory.fillDefaults().grab(true, false).applyTo(filePathTextField);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(text);

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			String filePath = configuration.getAttribute(WorkflowLaunchConfigurationAttributes.RESOURCE_FILE_PATH, "");
			String consoleText = configuration.getAttribute(WorkflowLaunchConfigurationAttributes.CONSOLE_TEXT, "");
			//
			filePathTextField.setText(filePath);
			text.setText(consoleText);
		} catch (CoreException e) {
			// ignore here
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {

		configuration.setAttribute(WorkflowLaunchConfigurationAttributes.RESOURCE_FILE_PATH,
				filePathTextField.getText());
		// set the text value for the CONSOLE_TEXT key
		configuration.setAttribute(WorkflowLaunchConfigurationAttributes.CONSOLE_TEXT, text.getText());
	}

	@Override
	public boolean canSave() {
		return true;
	}

	@Override
	public boolean isValid(ILaunchConfiguration configuration) {
		return true;
	}

	@Override
	public String getName() {
		return "Workflow Execution Configuration";
	}

}
