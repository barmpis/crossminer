package org.epsilonlabs.workflow.execution;

public interface EventualDataProvider {

	enum FILTERS {
		FILETBYFILEEXTENSION, FILTERBYNAME
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
