package com.tapiwa

object Apply {

  def main(args: Array[String]){
    println ( f"${apply ( layout, 321 )}" ) 
  }

  def apply(f: Int => String, v: Int) : String =  { f(v) }

  def layout[A](x: A) :String = { "[ " + x.toString() + " ]" } 
}
