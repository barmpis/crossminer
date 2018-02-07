package org.eclipse.crossmeter.workflow.execution.example.mde;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.eclipse.crossmeter.workflow.execution.WorkflowProviderNode;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;

public class EMFReader implements WorkflowProviderNode {

	public HashMap<EClass, PublishSubject<EObject>> data = new HashMap<>();

	protected Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	@Override
	public void subscribe(Observer<? super Object> observer) {
		subscribers.add(observer);

	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

	public PublishSubject<EObject> getData(String type) {
		PublishSubject<EObject> d = data.get(type);
		if (d == null) {
			EClass t = getType(type);
			PublishSubject<EObject> newd = PublishSubject.create();
			data.put(t, newd);
			d = newd;
		}
		return d;
	}

	public void connect() throws InterruptedException {
		for (Entry<EClass, PublishSubject<EObject>> e : data.entrySet()) {

			EClass type = e.getKey();
			PublishSubject<EObject> elements = e.getValue();

			HashSet<EObject> obs = getElements(type);
			for (EObject o : obs) {
				elements.onNext(o);
				//
				Thread.sleep(25);
				//
			}
		}
		for (Entry<EClass, PublishSubject<EObject>> e : data.entrySet()) {
			e.getValue().onComplete();
		}
	}

	public Observable<EObject> getCompositeData(Observable<EObject> sourceObs, EStructuralFeature f) {

		@SuppressWarnings("unchecked")
		Observable<Iterable<EObject>> o = sourceObs.map(s -> (Iterable<EObject>) s.eGet(f));
		Observable<Observable<EObject>> oo = o.map(s -> Observable.fromIterable((Iterable<EObject>) s));
		return Observable.concat(oo);

	}

	private EClass getType(String type) {
		Iterator<EObject> it = mmr.getAllContents();
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof EClass)
				if (((EClass) next).getName().equals(type))
					return ((EClass) next);
		}
		return null;
	}

	private HashSet<EObject> getElements(EClass type) {
		HashSet<EObject> ret = new HashSet<>();
		Iterator<EObject> it = mr.getAllContents();
		int totalcount = 0;
		int count = 0;
		while (it.hasNext()) {
			totalcount++;
			EObject next = it.next();
			if (next.eClass().equals(type)) {
				count++;
				ret.add(next);
			}
		}
		// System.out.println(totalcount);
		// System.out.println(count);
		return ret;
	}

	public EStructuralFeature getFeature(String name, String f) {
		return getType(name).getEStructuralFeature(f);
	}

	public EMFReader(String mm, String m) throws IOException {
		load(mm, m);
	}

	private ResourceSet resourceSet;
	private Resource mmr;
	private Resource mr;

	private void load(String mm, String m) throws IOException {
		Class<?> clazz = EMFReader.class;
		URL mmurl = clazz.getResource(mm);
		URL murl = clazz.getResource(m);

		resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		mmr = resourceSet.createResource(URI.createFileURI(mmurl.getPath()));
		mmr.load(null);
		// yeah...
		EPackage mmp = (EPackage) mmr.getContents().get(0);
		//
		resourceSet.getPackageRegistry().put(mmp.getNsURI(), mmp);

		mr = resourceSet.createResource(URI.createFileURI(murl.getPath()));
		mr.load(null);
	}

	public static void main(String[] a) throws IOException {
		final Observable<String> observable = Observable.just("1", "2");
		final Observable<Observable<String>> nested = observable
				.map(value -> Observable.just(value + "1", value + "2"));
		final Observable<String> flattened = Observable.concat(nested);

		flattened.subscribe(System.out::println);

		EMFReader reader = new EMFReader("ghmde.ecore", "ghmde.model");

		System.out.println("repo:" + reader.getElements(reader.getType("Repository")).size());

		System.out.println("file:" + reader.getElements(reader.getType("File")).size());

	}

}
