package com.tapiwa

/**
 * @author ${user.name}
 */
object App {
  
  def adder(x : Array[String]) :Int = x.foldLeft(0)( (a,b) => a.toInt + b.toInt )
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    val value = "adder( %s, %s ) = %d"
    var args_ = new Array[String](2)
    if (args.length > 2) 
    {
      for ( i <- 0 until 2 )
        args_(i) = args(i)
    }
    val result = value.format( args_(0), args_(1), adder(args_) )
    println(result)
  }
}
