package com.dsa.mathematics

object Factorial extends App {

  def getFactorial(number: Double, current: Double = 1): Double =
    number match {
      case base if base == 1 => current
      case _                 => getFactorial(number - 1, current * number)
    }

  println(getFactorial(5))

}
