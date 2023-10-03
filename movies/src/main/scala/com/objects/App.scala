package com.objects

class Movie(val name: String, val year: Short)

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println((1, "third").swap)
  }

}
