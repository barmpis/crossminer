/**
 *
 * $Id$
 */
package workflow.validation;

import org.eclipse.emf.common.util.EList;

import workflow.DataRetrieval;

/**
 * A sample validator interface for {@link workflow.DataSource}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataSourceValidator {
	boolean validate();

	boolean validateRetrievals(EList<DataRetrieval> value);
	boolean validateUrl(String value);
	boolean validateOffersPartialData(boolean value);
}
