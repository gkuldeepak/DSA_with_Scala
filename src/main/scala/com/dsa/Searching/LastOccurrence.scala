package com.dsa.Searching

import scala.annotation.tailrec

object LastOccurrence extends App {

  def getLastOccurrence(list: List[Int], search: Int): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List !!!"))
    searchOccurrence(list, search, 0, list.size - 1)
  }

  @tailrec
  private def searchOccurrence(list: List[Int], search: Int, low: Int, high: Int): Int = {
    val mid = (low + high) / 2
    if (low > high) -1
    else if (list(mid) > search) searchOccurrence(list, search, low, mid - 1)
    else if (list(mid) < search) searchOccurrence(list, search, mid + 1, high)
    else {
      if (mid == list.size - 1 || list(mid) != list(mid + 1)) mid
      else searchOccurrence(list, search, mid + 1, high)
    }
  }

  println(getLastOccurrence(List(1, 10, 10, 10, 20, 20, 40), 20))

}
