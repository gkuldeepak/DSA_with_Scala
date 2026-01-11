package com.dsa.arrays

import scala.annotation.tailrec

object ThreeSubArray extends App {

  def checkIfSubArrayExists(list: List[Int]): Boolean = {
    require(list.size > 3, throw new NullPointerException("Invalid List !!!"))
    val requiredSum = getSum(list, 0) / 3
    verifyIfValidSubArray(list, 0, requiredSum)
  }

  @tailrec
  private def getSum(list: List[Int], sum: Int): Int =
    list match {
      case last :: Nil  => sum + last
      case head :: tail => getSum(tail, sum + head)
    }

  @tailrec
  private def verifyIfValidSubArray(list: List[Int], currentSum: Int, sum: Int): Boolean =
    if (list.isEmpty) true
    else if (list.head + currentSum > sum) false
    else if (list.head + currentSum < sum)
      verifyIfValidSubArray(list.tail, list.head + currentSum, sum)
    else
      (list.head + currentSum == sum) && verifyIfValidSubArray(list.tail, 0, sum)

  println(checkIfSubArrayExists(List(5, 2, 6, 1, 1, 1, 5)))

}
