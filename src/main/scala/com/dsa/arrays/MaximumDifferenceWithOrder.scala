package com.dsa.arrays

import scala.annotation.tailrec

object MaximumDifferenceWithOrder extends App {

  def getMaximumDifference(list: List[Int]): Int = {
    require(list.size > 2, throw new NullPointerException("Empty List Found !!!"))
    getMaximum(list, 1, list.head, 0)
  }

  @tailrec
  private def getMaximum(list: List[Int], index: Int, minimum: Int, maximum: Int): Int =
    if (index == list.size) maximum
    else if (list(index) > list(index - 1)) {
      val min = Math.min(minimum, list(index))
      getMaximum(list, index + 1, min, Math.max(maximum, list(index) - min))
    } else {
      getMaximum(list, index + 1, Math.min(minimum, list(index)), maximum)
    }

  println(getMaximumDifference(List(2, 3, 1, 10, 6, 4, 8, 1)))

}
