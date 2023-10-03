package com.tapiwa

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    val misc = new Misc
    //
    val outer = new Outer
    val outerInner = new outer.Inner
    
     //(new outerInner.InnerMost).p_value()

    new Outer { new Inner { (new InnerMost).p_value() }}
    (new Outer { (new Inner {(new InnerMost).p_value() }).p_value() }).p_value()
   // println(true should be (1))
    //(new Other).of()
  }

  class Misc {
    val rand = scala.util.Random
    val x = rand.nextInt(100)
    val y = rand.nextInt(100)
    val f_str = "If x = %d, and y = %d, then mult( x, y ) = %d"
    val myFun_1 = (int1: Int, int2: Int) => int1 * int2
    val result = f_str.format(x, y, myFun_1(x, y))
    println()
    println(result)
    println()
  }

}

class Outer{
  val value = "outer"
  def p_value() {
    println(f"\nIn $value%s")
  }
  class Inner{
    val value = "inner"
    def p_value() {
      println(f"\nIn $value%s")
    }
    class InnerMost{
      val value = "inner most"
      def p_value() {
        println(f"\nIn $value%s")
      }
    }
  }
}

class Super{
  protected def f() { println("Super")}
}

class Sub extends Super(){
  override def f(){ println("Sub") }
}

class Other {
  def of() {
    println("\nIn Other\n")
    (new Sub).f()
  }
}
