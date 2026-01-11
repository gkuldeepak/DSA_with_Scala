package com.dsa.arrays

import scala.annotation.tailrec

object MaximumCircularSubArray extends App {

  def getMaximumCircularSubArray(list: List[Int]): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    getSum(list, 0) - getMinimumSubArray(list, 1, list.head, list.head)
  }

  @tailrec
  private def getSum(list: List[Int], sum: Int): Int =
    list match {
      case last :: Nil  => sum + last
      case head :: tail => getSum(tail, head + sum)
    }

  @tailrec
  private def getMinimumSubArray(list: List[Int], index: Int, currentSum: Int, minimum: Int): Int =
    if (index == list.size) minimum
    else {
      val newMinimum = Math.min(list(index), currentSum + list(index))
      getMinimumSubArray(list, index + 1, newMinimum, Math.min(minimum, newMinimum))
    }

  println(getMaximumCircularSubArray(List(8, -4, 3, -5, 4)))

}
