package com.dsa.Searching

import scala.annotation.tailrec

object BinaryRecursiveSearch extends App {

  def recursiveBinarySearch(list: List[Int], search: Int): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    searchElement(list, search, 0, list.size - 1)
  }

  @tailrec
  private def searchElement(list: List[Int], search: Int, low: Int, high: Int): Int =
    if (low > high) -1
    else {
      val mid = (high + low) / 2
      if (list(mid) == search) mid
      else if (list(mid) > search) searchElement(list, search, low, mid - 1)
      else searchElement(list, search, mid + 1, high)
    }

  println(recursiveBinarySearch(List(5, 10, 15, 20, 25, 35), 20))

}
