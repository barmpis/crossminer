
package org.epsilonlabs.workflow.execution;

import java.util.Map;

/**
 * Responsible for executing a datasource element of a workflow
 * 
 * @author kb
 *
 */
public interface DataSourceExecutor extends EventualDataProvider {

	public Map<String, String> getExecutionParameters();

	public void setExecutionParameters(Map<String, String> params);

}
