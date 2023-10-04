package com.tapiwa.implicitObj

trait Comparator[A]
{
  def compare(x: A, y: A): Int
}

object Comparator 
{
  implicit object IntCompataor extends Comparator[Int] 
  {
    def compare(x: Int, y: Int): Int = x.compareTo(y)
  }

  implicit object StringComparator extends Comparator[String]
  {
    def compare(x: String, y: String): Int = x.compareTo(y)
  }

  implicit object BoolComparator extends Comparator[Boolean]
  {
    def compare(x: Boolean, y: Boolean): Int = x.compareTo(y)
  }
}

class Max
{
  def max[A](x: A, y: A)(implicit comp: Comparator[A]): A =
    if (comp.compare(x, y) >= 0) x else y
}
