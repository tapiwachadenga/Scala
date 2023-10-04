package com.tapiwa.recursion

object Power
{
    def powerRecursion(num: Int, index: Int): Double =
    {
        index match
        {
          case  x if x <= 0 => 1
          case x => num * powerRecursion(num, x - 1)
        }
    }

    def powerTailRecursion(num: Int, index: Int): Double =
    {
      def power(num: Int, index: Int, acc: Double): Double =
      {
        index match
        {
            case x if x <= 0 => acc
            case x => power(num, index - 1, num * acc)
        }
      }
      power(num, index, 1)
    }
}
