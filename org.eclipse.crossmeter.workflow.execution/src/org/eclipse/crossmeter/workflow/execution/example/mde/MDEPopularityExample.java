package org.eclipse.crossmeter.workflow.execution.example.mde;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.crossmeter.workflow.execution.example.GraphOutput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.jfree.ui.RefineryUtilities;

import io.reactivex.Observable;

public class MDEPopularityExample {

	public static void main(String[] a) throws InterruptedException, IOException {

		// stub github client
		EMFReader reader = new EMFReader("ghmde.ecore", "ghmde.model");

		// stub to going to get repos from github
		Observable<EObject> repos = reader.getData("Repository");

		EStructuralFeature filef = reader.getFeature("Repository", "files");

		// stub to going to github to getting files from a repo
		Observable<EObject> files = reader.getCompositeData(repos, filef);

		// create empty graph for files
		GraphOutput filepertech = new GraphOutput("MDE popularity results", "Files per technology", "Technology",
				"Count");
		filepertech.pack();
		RefineryUtilities.positionFrameRandomly(filepertech);
		filepertech.setVisible(true);
		// create empty graph for repos
		GraphOutput repospertech = new GraphOutput("MDE popularity results", "Repositories per technology",
				"Technology", "Count");
		repospertech.pack();
		RefineryUtilities.positionFrameRandomly(repospertech);
		repospertech.setVisible(true);

		// connect file data to graph
		Observable<Object> fileentrydata = files.map(aa -> new Entry<String, String>() {
			public String getKey() {
				List<String> techs = new LinkedList<String>();
				Iterable<EObject> iterable = ((Iterable<EObject>) aa.eGet(reader.getFeature("File", "technologies")));
				for (EObject eo : iterable) {
					techs.add(eo.eGet(reader.getFeature("Technology", "name")).toString());
				}
				if (techs.size() == 1)
					return techs.get(0);
				else
					return techs.toString();

			}

			public String getValue() {
				return aa.eGet(reader.getFeature("File", "path")).toString();
			}

			public String setValue(String value) {
				return null;
			}
		});
		fileentrydata.subscribe(filepertech);

		// connect repo data to graph
		Observable<Object> repoentrydata = files.map(aa -> new Entry<String, String>() {
			public String getKey() {
				List<String> techs = new LinkedList<String>();
				Iterable<EObject> iterable = ((Iterable<EObject>) aa.eGet(reader.getFeature("File", "technologies")));
				for (EObject eo : iterable) {
					techs.add(eo.eGet(reader.getFeature("Technology", "name")).toString());
				}
				if (techs.size() == 1)
					return techs.get(0);
				else
					return techs.toString();
			}

			public String getValue() {
				return (String) (((EObject) aa.eGet(reader.getFeature("File", "repository")))
						.eGet(reader.getFeature("Repository", "name")));
			}

			public String setValue(String value) {
				return null;
			}
		});
		repoentrydata.subscribe(repospertech);

		// start stub data provision
		Thread.sleep(5000);
		//
		reader.connect();
		//

	}

}
