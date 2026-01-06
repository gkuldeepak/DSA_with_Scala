package com.dsa.arrays

import scala.annotation.tailrec

object MaxConsecutive1s extends App {

  def getMaximumConsecutive(list: List[Int]): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    maxConsecutive(list, 0, 0, 0)
  }

  @tailrec
  private def maxConsecutive(list: List[Int], index: Int, currentStatus: Int, max: Int): Int =
    if (index == list.size) max
    else if (list(index) == 1) {
      val status = currentStatus + 1
      maxConsecutive(list, index + 1, status, Math.max(max, status))
    } else maxConsecutive(list, index + 1, 0, max)

  println(getMaximumConsecutive(List(0, 1, 1, 0, 1, 0)))

}
