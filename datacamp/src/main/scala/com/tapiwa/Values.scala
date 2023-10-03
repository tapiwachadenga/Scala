package com.tapiwa

object Values {

  def main(args: Array[String]) {
    val myVal: Int = 10
    var myVar: String = "My mutable string."
    var myVar1 = 34.6
    val myVal1 = "My immutable string."

    println(f"\n $myVal%d \n $myVar%s \n $myVar1%f \n $myVal1%s\n")
  }

}
