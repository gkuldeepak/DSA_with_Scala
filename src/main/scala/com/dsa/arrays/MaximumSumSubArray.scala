package com.dsa.arrays

import scala.annotation.tailrec

object MaximumSumSubArray extends App {

  def maximumSumSubArray(list: List[Int]): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    calculateMaxSum(list, 1, list.head, list.head)
  }

  @tailrec
  private def calculateMaxSum(list: List[Int], index: Int, previousSum: Int, max: Int): Int =
    if (index == list.size) max
    else {
      val newSum = Math.max(previousSum + list(index), list(index))
      calculateMaxSum(list, index + 1, newSum, Math.max(max, newSum))
    }

  println(maximumSumSubArray(List(2, 3, -8, 7, -1, 2, 3)))

}
