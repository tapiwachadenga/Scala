package com.tapiwa.implicitObj

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
/*    println( "Hello World!" )
    println("concat arguments = " + foo(args))

      implicit val msg = "Hello "
      val name = "World!"

      def disp(implicit nm: String) = msg + nm

      val result = disp
      println(result)*/

     println((new Max).max(9, 78))
     println((new Max).max("tapiwa", "tapindurwa"))
     println((new Max).max(true, false))
  }

}
