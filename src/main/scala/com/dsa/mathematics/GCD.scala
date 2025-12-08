package com.dsa.mathematics

object GCD extends App {

  def getGCD(number1: Int, number2: Int): Int = {
    if(number2 == 0) number1
    else getGCD(number2, number1 % number2)
  }

  println(getGCD(5, 8))

}
