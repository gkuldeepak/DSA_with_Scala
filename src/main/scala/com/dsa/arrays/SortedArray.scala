package com.dsa.arrays

import scala.annotation.tailrec

object SortedArray extends App {

  def checkIfArraySorted(list: List[Int]): Boolean = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    isSorted(list.tail, list.head)
  }

  @tailrec
  private def isSorted(list: List[Int], element: Int): Boolean =
    list match {
      case last :: Nil  => element < last
      case head :: tail => (element < head) && isSorted(tail, head)
    }

  println(checkIfArraySorted(List(1, 2, 4, 3)))

}
