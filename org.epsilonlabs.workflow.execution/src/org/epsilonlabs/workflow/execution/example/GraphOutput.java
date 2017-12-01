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
package org.epsilonlabs.workflow.execution.example;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.epsilonlabs.workflow.execution.WorkflowConsumerNode;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.SortOrder;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Trivial data consumer, printing to console
 * 
 * @author kb
 *
 */
public class GraphOutput extends ApplicationFrame implements WorkflowConsumerNode {

	/**
	 * 
	 */
	private static final long serialVersionUID = 666L;

	private Collection<Observer<? super Object>> subscribers = new LinkedList<>();

	private int current = 0;

	private int period = 10;

	public static void main(String[] a) {
		GraphOutput out = new GraphOutput("MDE popularity results", "Repositories per technology", "Technology",
				"Count");
		out.pack();
		RefineryUtilities.centerFrameOnScreen(out);
		out.setVisible(true);
	}

	JFreeChart barChart;

	public GraphOutput(String appname, String graphname, String x, String y) {
		super(appname);
		barChart = ChartFactory.createBarChart(graphname, x, y, dataset, PlotOrientation.VERTICAL, false, true, false);

		ChartPanel chartPanel = new ChartPanel(barChart);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = new Double(screenSize.getWidth()).intValue() - 100;
		chartPanel.setMaximumDrawHeight(500);
		chartPanel.setMaximumDrawWidth(width);
		chartPanel.setPreferredSize(new java.awt.Dimension(width, 500));
		setContentPane(chartPanel);

		Font font = new Font("Dialog", Font.PLAIN, 15);
		barChart.getCategoryPlot().getDomainAxis().setTickLabelFont(font);
		barChart.getCategoryPlot().setColumnRenderingOrder(SortOrder.DESCENDING);

	}

	private HashMap<String, HashSet<String>> data = new HashMap<>();

	final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

	@Override
	public void onNext(Object o) {

		// update graph
		Entry<?, ?> entry = (Entry<?, ?>) o;

		String key = entry.getKey().toString();
		String value = entry.getValue().toString();

		if (key.startsWith("[") && key.endsWith("]")) {
			String[] keys = key.split(",");
			for (String key1 : keys) {
				onNext(createEntry(key1, value));
			}
			return;
		}

		if (data.containsKey(key)) {
			data.get(key).add(value);
			// dataset.addValue(data.get(key).size(), "null", key);
		} else {
			HashSet<String> ret = new HashSet<>();
			ret.add(value);
			data.put(key, ret);
			// dataset.addValue(data.get(key).size(), "null", key);
		}

		// sort every 100 iterations to avoid flicker
		if (current % 100 == 0)
			dataset.clear();

		LinkedList<Entry<String, HashSet<String>>> list = new LinkedList<>();
		list.addAll(data.entrySet());
		list.sort(new Comparator<Entry<String, HashSet<String>>>() {
			@Override
			public int compare(Entry<String, HashSet<String>> o1, Entry<String, HashSet<String>> o2) {
				return new Integer(o2.getValue().size()).compareTo(o1.getValue().size());
			}
		});

		for (Entry<String, HashSet<String>> e : list)
			dataset.addValue(e.getValue().size(), "null", e.getKey());
		//
		//

		current++;
		if (current % period == 0)
			notifyObserversOfStatusChange("processed " + current + " elements");
	}

	@Override
	public void onError(Throwable e) {
		e.printStackTrace();
		notifyObserversOfStatusChange("task error:\n" + e.getStackTrace());
	}

	@Override
	public void onComplete() {
		System.out.println("DATA STREAM ENDED");
		notifyObserversOfStatusChange("task complete");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dispose();
	}

	@Override
	public void onSubscribe(Disposable d) {
		//
	}

	@Override
	public Collection<Observer<? super Object>> getSubscribers() {
		return subscribers;
	}

	private Object createEntry(String key1, String value) {
		return new Entry<String, String>() {

			@Override
			public String getKey() {
				return key1.replace("[", "").replace("]", "").trim();
			}

			@Override
			public String getValue() {
				return value;
			}

			@Override
			public String setValue(String value) {
				return null;
			}
		};
	}
}
