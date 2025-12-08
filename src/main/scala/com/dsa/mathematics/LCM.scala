package com.dsa.mathematics

object LCM extends App {

  def getLCM(number1: Int, number2: Int): Int = {
    (number1 * number2) / getGCD(number1, number2)
  }

  private def getGCD(number1: Int, number2: Int): Int = {
    if(number2 == 0) number1
    else getGCD(number2, number1 % number2)
  }

  println(getLCM(10, 5))

}
