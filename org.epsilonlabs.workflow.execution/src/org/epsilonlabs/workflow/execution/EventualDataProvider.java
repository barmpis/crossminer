package org.epsilonlabs.workflow.execution;

public interface EventualDataProvider {

	enum Filters {
		FILETBYFILEEXTENSION, FILTERBYFILENAME
	}

	enum DATATYPES {
		REPOSITORIES, FILES, AUTHORS
	}
	
	
	/**
	 * 
	 * @return the EventualDataSet which will eventually provide the requested
	 *         data
	 */
	public EventualDataset execute();

}
