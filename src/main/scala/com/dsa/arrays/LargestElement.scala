package com.dsa.arrays

object LargestElement extends App {

  def getMaximumElement(list: List[Int]): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    val initial = list.head
    getMaximum(list.tail, initial)
  }

  private def getMaximum(list: List[Int], currentMaximum: Int): Int =
    list match {
      case element :: Nil => if (element > currentMaximum) element else currentMaximum
      case head :: tail =>
        if (head > currentMaximum) getMaximum(tail, head) else getMaximum(tail, currentMaximum)
    }

  println(getMaximumElement(List(1, 5, 3, 10, 6, 20)))

}
