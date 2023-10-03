package com.tapiwa

object FunctionLiterals{

  def main( args: Array[String] ){

    val inc = (x: Int) =>x + 1 

    println(inc(9))
  }
}
