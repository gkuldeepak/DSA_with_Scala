package com.dsa.mathematics

object PrimeNumber extends App {

  def checkIfPrime(number: Int): Boolean =
    if (number == 1) false
    else if (number == 2 || number == 3) true
    else if (number % 2 == 0 || number % 3 == 0) false
    else Range(5, Math.sqrt(number).toInt + 1, 6).forall(index => number % index != 0)

  println(checkIfPrime(85))

}
