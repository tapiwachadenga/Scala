package com.tapiwa.app

import org.apache.spark.sql.SparkSession

object MySparkContextWithSparkSession {
  def main(args: Array[String]): Unit = {
    val ss = SparkSession.builder()
      .appName("Creating Spark Context with Spark Session")
      .master("local")
      .getOrCreate()

    val arr = Array(1,2,3,4,5,6,7,8,9,0,12,13,19,15)
    val arrRDD = ss.sparkContext.parallelize(arr, 4)
    arrRDD.foreach(println)
  }
}
