package com.vl.spark.test;


import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;
public class WordCount 
{
    public static void main( String[] args )
    {
    	SparkSession spark = SparkSession.builder().appName("SparkApp").config("spark.master", "local").getOrCreate();
    	Dataset<String> textFile = spark.read().textFile(args[0]);
    	System.out.println("Number of lines " + textFile.count());
    	spark.stop();
    }
}
