package com.tapiwa

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    printf( "\nHello World!\nWelcome to your life!\n" )
    println("concat arguments = " + foo(args))
  }

}
