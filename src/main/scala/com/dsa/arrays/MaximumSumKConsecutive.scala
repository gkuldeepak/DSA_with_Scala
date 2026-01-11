package com.dsa.arrays

import scala.annotation.tailrec

object MaximumSumKConsecutive extends App {

  def getMaximumSum(list: List[Int], k: Int): Int = {
    require(list.size >= k, throw new NullPointerException("Invalid List !!!"))
    val initialSum = getSum(list.slice(0, k))
    findMaximumSum(list, k, 0, initialSum, initialSum)
  }

  @tailrec
  private def findMaximumSum(
    list: List[Int],
    index: Int,
    tailIndex: Int,
    currentSum: Int,
    maxSum: Int
  ): Int =
    if (index == list.size) maxSum
    else {
      val newSum = currentSum + list(index) - list(tailIndex)
      findMaximumSum(list, index + 1, tailIndex + 1, newSum, Math.max(maxSum, newSum))
    }

  @tailrec
  private def getSum(list: List[Int], sum: Int = 0): Int =
    list match {
      case last :: Nil  => sum + last
      case head :: tail => getSum(tail, head + sum)
    }

  println(getMaximumSum(List(5, -10, 6, 90, 3), 2))
}
