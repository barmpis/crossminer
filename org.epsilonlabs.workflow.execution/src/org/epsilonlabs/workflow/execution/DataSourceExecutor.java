
package org.epsilonlabs.workflow.execution;

import java.util.Map;

/**
 * Responsible for executing a datasource element of a workflow
 * 
 * @author kb
 *
 */
public interface DataSourceExecutor extends EventualDataProvider {

	public Map<Object, Object> getExecutionParameters();

	public void setExecutionParameters(Map<Object, Object> params);

}
