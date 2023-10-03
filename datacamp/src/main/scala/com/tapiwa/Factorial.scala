package com.tapiwa

object Factorial {

  def main(args: Array[String]){
    
    for ( i<- 1 to 10 )
      println(f"Factorial of $i%d is ${factorial(i)}")
  }

  def factorial(n: BigInt): BigInt = {
    if ( n <= 1 )
      1
    else
      n * factorial ( n - 1 )
  }
}
