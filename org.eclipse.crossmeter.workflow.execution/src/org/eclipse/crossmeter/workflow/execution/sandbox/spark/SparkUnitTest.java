package org.eclipse.crossmeter.workflow.execution.sandbox.spark;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.junit.Test;

public class SparkUnitTest {

	@Test
	public void simpleOutputTest() throws Exception {

		SparkConf conf = new SparkConf().setMaster("local[4]").setAppName("App");

		JavaStreamingContext jssc = new JavaStreamingContext(conf, Durations.seconds(5));
		JavaSparkContext sc = jssc.sparkContext();

		try {

			Queue<JavaRDD<String>> lines = new LinkedList<JavaRDD<String>>();
			// append data to DStream -- as if from github
			lines.add(sc.parallelize(Arrays.asList("Repo1", "Repo2")));
			lines.add(sc.parallelize(Arrays.asList("Repo3", "Repo4")));
			JavaDStream<String> dstream = jssc.queueStream(lines, false);

			//
			
			JavaDStream<JavaDStream<String>> ddstream = dstream.map(new Function<String, JavaDStream<String>>() {
				private static final long serialVersionUID = 1L;

				@Override
				public JavaDStream<String> call(String v1) throws Exception {
					// TODO Auto-generated method stub
					return null;
				}
			});

			// NB change to variable store for comparison of expected output
			// with actual
			// dstream.print();

			jssc.start();
			jssc.awaitTerminationOrTimeout(6000);

		} finally {
			jssc.close();
		}
	}

}