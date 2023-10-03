package com.tapiwa

class Outer {

  class Inner {
    private def f { println("\nJust printed \"f\"\n") }
    class InnerMost {
      f
    }
  }
}

object AccessDemo1 {

  def main(args: Array[String]){
    val outer = new Outer
    val inner = new outer.Inner
    new inner.InnerMost
  }
}
