package com.dsa.arrays

object LeftRotate extends App {

  def leftRotate(list: List[Int]): List[Int] = {
    require(list.nonEmpty, throw new NullPointerException("Empty List"))
    leftRotateList(list, list.head, 1)
  }

  private def leftRotateList(list: List[Int], element: Int, index: Int): List[Int] =
    if (index == list.size) list.updated(index - 1, element)
    else leftRotateList(list.updated(index - 1, list(index)), element, index + 1)

  println(leftRotate(List(1, 2, 3, 4)))

}
