package com.classes


class Point( x: Int, y: Int)
{
  override def toString(): String = f"Point ( $x%d, $y%d )" 
}
/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    val r = scala.util.Random
    val x = r.nextInt(100)
    val y = r.nextInt(100)

    val pt = new Point( x, y )
    println(pt)
  }

}
