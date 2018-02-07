package org.eclipse.crossmeter.workflow.execution.sandbox.spark;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import org.apache.spark.*;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.*;
import org.apache.spark.streaming.*;
import org.apache.spark.streaming.api.java.*;
import org.apache.spark.streaming.dstream.DStream;

import scala.Tuple2;

public class SparkTest {

	public static void main(String[] args) throws InterruptedException {

		// String logFile = "YOUR_SPARK_HOME/README.md";
		// SparkSession spark =
		// SparkSession.builder().appName("App").master("local[4]").getOrCreate();
		// Dataset<String> logData = spark.read().textFile(logFile).cache();
		//
		// long numAs = logData.filter(s -> s.contains("a")).count();
		// long numBs = logData.filter(s -> s.contains("b")).count();
		//
		// System.out.println("Lines with a: " + numAs + ", lines with b: " +
		// numBs);
		//
		// spark.stop();

		//
		//
		//
		//
		//

		// SparkConf conf = new
		// SparkConf().setMaster("local[4]").setAppName("App");
		// JavaStreamingContext jssc = new JavaStreamingContext(conf,
		// Durations.seconds(5));

		// JavaReceiverInputDStream<String> lines =
		// jssc.socketTextStream("localhost", 9999);

		// JavaDStream<String> words = lines.flatMap(x ->
		// Arrays.asList(x.split(" ")).iterator());
		// JavaPairDStream<String, Integer> pairs = words.mapToPair(s -> new
		// Tuple2<>(s, 1));
		// JavaPairDStream<String, Integer> wordCounts = pairs.reduceByKey((i1,
		// i2) -> i1 + i2);

		// JavaDStream<String> split = lines.transform(new
		// Function<JavaRDD<String>, JavaRDD<String>>() {
		//
		// private static final long serialVersionUID = 666L;
		//
		// @Override
		// public JavaRDD<String> call(JavaRDD<String> v1) throws Exception {
		// return new JavaRDD<>(new rdd, classTag);
		// }
		// });

		// Print the first ten elements of each RDD generated in this DStream to
		// the console
		// wordCounts.print();

		// jssc.start(); // Start the computation
		// jssc.awaitTermination(); // Wait for the computation to terminate

		// jssc.queueStream(...);

		// dosomething.take(100).forEach(f -> System.out.println(f));

		// for(Partition f : dosomething.partitions())
		// {
		// partrdd = dosomething.mapPartitionsWithIndex(
		// (
		// i : Int, iter : Iterator[Int]) => if (i == p.index) iter else
		// Iterator(), true
		// )
		// partrdd.foreach(println)
		// }

		SparkConf conf = new SparkConf().setMaster("local[4]").setAppName("App");
		JavaSparkContext sc = new JavaSparkContext(conf);

		// stub data from github...
		List<String> data = Arrays.asList("ecore", "etl", "ocl", "uml");

		JavaRDD<String> distData = sc.parallelize(data, 3);

//		DStream<String> getrepos = distData.map(new Function<String, DStream>() {
//			private static final long serialVersionUID = 666L;
//
//			@Override
//			public String call(String v1) throws Exception {
//				
//				// JavaStreamingContext jssc = new JavaStreamingContext(conf,
//				// Durations.seconds(5));
//
//				// JavaReceiverInputDStream<String> lines =
//				// jssc.socketTextStream("localhost", 9999);
//								
//				return v1 + 1;
//				
//			}
//		});
		
		System.out.println("gg");

	}

}
