package com.dsa.arrays

object LeftRotateByN extends App {

  def leftRotateByN(list: List[Int], n: Int): List[Int] = {
    val firstReverse  = reverse(list, 0, n - 1)
    val secondReverse = reverse(firstReverse, n, list.size - 1)
    reverse(secondReverse, 0, list.size - 1)
  }

  private def reverse(list: List[Int], low: Int, high: Int): List[Int] =
    if (low >= high) list
    else {
      val firstElement  = list(low)
      val secondElement = list(high)
      reverse(list.updated(low, secondElement).updated(high, firstElement), low + 1, high - 1)
    }

  println(leftRotateByN(List(1, 2, 3, 4, 5), 3))

}
