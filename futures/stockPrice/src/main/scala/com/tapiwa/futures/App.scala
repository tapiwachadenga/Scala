package com.tapiwa.futures

/**
 * @author ${user.name}
 */

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object App {
  
  def currentTime = System.currentTimeMillis()

  def deltaTime (t0: Long) = currentTime - t0 

  // def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def sleep(time: Long): Unit = Thread.sleep(time)

  def getStockPrice(symbol: String): Future[Double] = Future
  {
    val r = scala.util.Random
    val randSleepTime = r.nextInt(2000)
    val randPrice = r.nextDouble * 1000
    sleep(randSleepTime)
    randPrice
  }

  def main(args : Array[String]) {
    // println( "Hello World!" )
    // println("concat arguments = " + foo(args))
  
     val startTime = currentTime

     val aaplFuture = getStockPrice("AAPL")
     val amznFuture = getStockPrice("AMZN")
     val googFuture = getStockPrice("GOOG")

     val result: Future[(Double, Double, Double)] = for 
     {
        aapl <- aaplFuture
        amzn <- amznFuture
        goog <- googFuture
     } yield (aapl, amzn, goog)

     result.onComplete 
     {
        case Success(x) => 
        {
          val totalTime = deltaTime(startTime)
          println(s"In Success case, time delta: ${totalTime}")
          println(s"The stock prices are: $x")
        }
        case Failure(e) => e.printStackTrace
     }
     sleep(5000)
  }
  //sleep(5000)
}
