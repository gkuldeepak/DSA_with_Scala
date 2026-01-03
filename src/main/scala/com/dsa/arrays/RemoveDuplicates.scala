package com.dsa.arrays

import scala.annotation.tailrec

object RemoveDuplicates extends App {

  def removeDuplicatesFromSortedArray(list: List[Int]): List[Int] =
    removeDuplicates(list, 1, 1)

  @tailrec
  private def removeDuplicates(list: List[Int], sortedIndex: Int, index: Int): List[Int] =
    if (index == list.size) list.slice(0, sortedIndex)
    else if (list(sortedIndex - 1) != list(index)) {
      val updatedList = list.updated(sortedIndex, list(index))
      removeDuplicates(updatedList, sortedIndex + 1, index + 1)
    } else removeDuplicates(list, sortedIndex, index + 1)

  println(removeDuplicatesFromSortedArray(List(1, 1, 2, 2, 4, 6)))

}
