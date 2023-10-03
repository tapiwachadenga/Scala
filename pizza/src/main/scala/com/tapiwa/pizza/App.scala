package com.tapiwa.pizza

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "In main" )
   // println("concat arguments = " + foo(args))
  }

}
