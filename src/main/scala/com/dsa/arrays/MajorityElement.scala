package com.dsa.arrays

import scala.annotation.tailrec

object MajorityElement extends App {

  def findMajorityElement(list: List[Int]): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    val majorityElement = findElement(list, 1, list.head, 1)
    val elementCount    = getCount(list, majorityElement)
    if (elementCount > list.size / 2) majorityElement else -1
  }

  @tailrec
  private def findElement(list: List[Int], index: Int, currentElement: Int, voteCount: Int): Int =
    if (index == list.size) currentElement
    else if (list(index) == currentElement)
      findElement(list, index + 1, currentElement, voteCount + 1)
    else if (list(index) != currentElement && voteCount == 0)
      findElement(list, index + 1, list(index), 1)
    else findElement(list, index + 1, currentElement, voteCount - 1)

  private def getCount(list: List[Int], element: Int): Int =
    list.count(_ == element)

  println(findMajorityElement(List(20, 30, 40, 50, 50, 50, 50)))

}
