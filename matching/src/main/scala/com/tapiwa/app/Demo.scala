package com.tapiwa.app

object Demo
{
  def main(args: Array[String])
  {
    for (i <- 1 to 5)
      println(matchTest(i))
  }

  def matchTest(num: Int): String = num match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}
