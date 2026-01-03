package com.dsa.mathematics

object CountDigits extends App {
  def countDigits(number: Double): Double =
    Math.floor(Math.log10(number) + 1)

  print(countDigits(586785859))
}
