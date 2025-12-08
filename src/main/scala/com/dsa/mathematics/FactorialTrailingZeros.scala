package com.dsa.mathematics

object FactorialTrailingZeros extends App {

  def getTrailingZeros(number: Int, trail: Int = 5, count: Int = 0):Int = {
    if(trail > number) count
    else getTrailingZeros(number, trail*trail, count + number/trail)
  }

  println(getTrailingZeros(128))

}
