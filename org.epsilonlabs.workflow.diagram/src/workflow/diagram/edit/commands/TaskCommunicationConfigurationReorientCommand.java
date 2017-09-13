/*
 * 
 */
package workflow.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import workflow.EmittingTask;
import workflow.Task;
import workflow.TaskCommunicationConfiguration;
import workflow.Workflow;
import workflow.diagram.edit.policies.WorkflowBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TaskCommunicationConfigurationReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public TaskCommunicationConfigurationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof TaskCommunicationConfiguration) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof EmittingTask && newEnd instanceof EmittingTask)) {
			return false;
		}
		if (getLink().getOutgoing().size() != 1) {
			return false;
		}
		Task target = (Task) getLink().getOutgoing().get(0);
		if (!(getLink().eContainer() instanceof Workflow)) {
			return false;
		}
		Workflow container = (Workflow) getLink().eContainer();
		return WorkflowBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTaskCommunicationConfiguration_4005(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Task && newEnd instanceof Task)) {
			return false;
		}
		if (getLink().getIncoming().size() != 1) {
			return false;
		}
		EmittingTask source = (EmittingTask) getLink().getIncoming().get(0);
		if (!(getLink().eContainer() instanceof Workflow)) {
			return false;
		}
		Workflow container = (Workflow) getLink().eContainer();
		return WorkflowBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTaskCommunicationConfiguration_4005(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getIncoming().remove(getOldSource());
		getLink().getIncoming().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getOutgoing().remove(getOldTarget());
		getLink().getOutgoing().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected TaskCommunicationConfiguration getLink() {
		return (TaskCommunicationConfiguration) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected EmittingTask getOldSource() {
		return (EmittingTask) oldEnd;
	}

	/**
	* @generated
	*/
	protected EmittingTask getNewSource() {
		return (EmittingTask) newEnd;
	}

	/**
	* @generated
	*/
	protected Task getOldTarget() {
		return (Task) oldEnd;
	}

	/**
	* @generated
	*/
	protected Task getNewTarget() {
		return (Task) newEnd;
	}
}
