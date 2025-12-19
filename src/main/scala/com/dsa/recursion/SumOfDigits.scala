package com.dsa.recursion

object SumOfDigits extends App {

  def getSum(list: List[Int], currentSum: Int = 0): Int = {
    list match {
      case Nil => currentSum
      case head :: tail => getSum(tail, currentSum + head)
    }
  }

  println(getSum(List(1, 2, 3, 4, 5)))

}
