package com.tapiwa.app

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object MySparkContext {
  def main(args:Array[String]): Unit = {
    val sparkConf = new SparkConf()
    sparkConf.setAppName("First Spark Application")
    sparkConf.setMaster("local")
    val sc = new SparkContext(sparkConf)

    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val arrRDD = sc.parallelize(arr, 2)
    println("Num of elements in arrDD: ", arrRDD.count())
    arrRDD.foreach(println)
  }
}
