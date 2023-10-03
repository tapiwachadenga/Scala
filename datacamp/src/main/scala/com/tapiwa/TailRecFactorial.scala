package com.tapiwa

object TailRecFactorial{

  def main(args: Array[String]){
    println("\n")
    for ( i <- 1 to 10 ){
      println(f"$i%d! = ${factorial(i)}")
    }
    println("\n")
  }

  def factorial(n: BigInt): BigInt = {
    def factorial(n: BigInt, acc: BigInt): BigInt = {
      if (n <= 1)
        acc
      else
        factorial(n - 1, n * acc)
    }
    factorial(n, 1)
  }
}
