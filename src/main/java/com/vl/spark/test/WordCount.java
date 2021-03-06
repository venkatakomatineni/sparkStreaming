package com.vl.spark.test;


import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;
public class WordCount 
{
    public static void main( String[] args )
    {
    	SparkSession spark = SparkSession.builder().appName("SparkApp").config("spark.master", "local").getOrCreate();
    	Dataset<String> textFile = spark.read().textFile("README.md");
    	System.out.println("Number of lines " + textFile.count());
    	System.out.println("File path " + textFile);
    	spark.stop();
    }
}
