package com.tapiwa

class Point(val xc: Int, val yc: Int)
{
  var x: Int = xc
  var y: Int = yc

  def move( dx: Int, dy: Int)
  {
    x += dx
    y += dy 
  }

  def point()
  {
    val x_ = "x value: %d"
    val y_ = "y value: %d"

    val xStr = x_.format(x)
    val yStr = y_.format(y)

    println(xStr)
    println(yStr)

  }
}

class Point_3_D( override val xc: Int, override val yc: Int, val zc: Int ) extends Point( xc, yc )
{
  var z: Int = zc

  def move( dx: Int,dy: Int,dz: Int )
  {
    x += dx
    y += dy
    z += dz
  }

  override def point()
  {

    val x_ = "x value: %d"
    val y_ = "y value: %d"
    val z_ = "z value: %d"

    val xStr = x_.format(x)
    val yStr = y_.format(y)
    val zStr = z_.format(z)

    println(xStr)
    println(yStr)
    println(zStr)
  }
}
/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {

    var pt_1 = new Point_3_D(10, 20, 30)

    val rand = new scala.util.Random
    val dx = rand.nextInt(100)
    val dy = rand.nextInt(100)
    val dz = rand.nextInt(100)
     
    println("\nBefore move:" )
    pt_1.point()
    val mv = "let dx = %d, dy = %d and dz = %d"
    println()
    val mv_print = mv.format(dx, dy, dz)
    println(mv_print)
    println()

    pt_1.move(dx, dy, dz)
    println("After move:" )
    pt_1.point()
    println()
  }

}
