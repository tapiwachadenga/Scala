package com.tapiwa

import java.io._

class Point(val xc: Int, val yc: Int ){
  var (x: Int, xC: Int ) = Pair(xc, xc)
  var (y: Int, yC: Int) = Pair(yc, yc)

  def move ( dx: Int, dy: Int ): Unit = {
     x += dx
     y += dy

    println(f"\nIf Point($xC%d, $yC%d), and dx = $dx%d and dy = $dy%d are applied, then Point($x%d, $y%d)\n")
  }
}

class Location (override val xc: Int, override val yc: Int, val zc: Int) extends Point( xc, yc){

  var (z: Int, zC: Int) = Pair(zc, zc)

}

object PointDemo{

  def main(args: Array[String]){
    val pt = new Point(10, 20)
    val loc = new Location(25, 36, 47)

    pt.move(10, 10)
    loc.move(10, 10)
  }
}

