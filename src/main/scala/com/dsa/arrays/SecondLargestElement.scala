package com.dsa.arrays

import scala.annotation.tailrec

object SecondLargestElement extends App {

  def getSecondLargestElement(list: List[Int]): Int = {
    require(list.size > 1, throw new NullPointerException("Invalid List !!!"))
    findElement(list, list.head, list.head, 1)
  }

  @tailrec
  private def findElement(list: List[Int], first: Int, second: Int, index: Int): Int =
    if (index == list.size) second
    else if (list(index) > first) findElement(list, list(index), first, index + 1)
    else if (list(index) < first && list(index) > second)
      findElement(list, first, list(index), index + 1)
    else findElement(list, first, second, index + 1)

  println(getSecondLargestElement(List(1, 6, 2, 10, -2)))

}
