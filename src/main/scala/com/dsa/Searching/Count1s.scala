package com.dsa.Searching

import scala.annotation.tailrec

object Count1s extends App {

  def get1sCount(list: List[Int]): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    val firstOccurrence = searchFirstOccurrence(list, 1, 0, list.size - 1)
    if (firstOccurrence == -1) -1
    else searchLastOccurrence(list, 1, 0, list.size - 1) - firstOccurrence + 1
  }

  @tailrec
  private def searchFirstOccurrence(list: List[Int], search: Int, low: Int, high: Int): Int = {
    val mid = (low + high) / 2
    if (low > high) -1
    else if (list(mid) > search) searchFirstOccurrence(list, search, low, mid - 1)
    else if (list(mid) < search) searchFirstOccurrence(list, search, mid + 1, high)
    else {
      if (mid == 0 || list(mid) != list(mid - 1)) mid
      else searchFirstOccurrence(list, search, low, mid - 1)
    }
  }

  @tailrec
  private def searchLastOccurrence(list: List[Int], search: Int, low: Int, high: Int): Int = {
    val mid = (low + high) / 2
    if (low > high) -1
    else if (list(mid) > search) searchLastOccurrence(list, search, low, mid - 1)
    else if (list(mid) < search) searchLastOccurrence(list, search, mid + 1, high)
    else {
      if (mid == list.size - 1 || list(mid) != list(mid + 1)) mid
      else searchLastOccurrence(list, search, mid + 1, high)
    }
  }

  println(get1sCount(List(0, 0, 1, 1, 1, 1)))

}
