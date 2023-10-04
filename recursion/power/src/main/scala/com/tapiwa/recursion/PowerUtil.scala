package com.tapiwa.recursion

object PowerUtil extends App
{ 
    println()
    List(1,3,5,7,8).map(x => Power.powerRecursion(x, 2)).foreach(println)
    println()
    List(11,33,55,77,88).map(x => Power.powerTailRecursion(x, 2)).foreach(println)
    println()
}
