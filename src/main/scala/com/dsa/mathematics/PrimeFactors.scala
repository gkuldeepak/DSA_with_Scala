package com.dsa.mathematics

object PrimeFactors extends App {

  def getPrimeFactors(
    number: Int,
    counter: Int = 2,
    divisors: List[Int] = List.empty[Int]
  ): List[Int] =
    if (number == 1) divisors
    else if (number % counter == 0) getPrimeFactors(number / counter, counter, divisors :+ counter)
    else getPrimeFactors(number, counter + 1, divisors)

  println(getPrimeFactors(1250))

}
