package com.dsa.recursion

object NaturalNumberSum extends App {

  def getSum(number: Int): Int = {
    number * (number + 1) / 2
  }

  println(getSum(4))

}
