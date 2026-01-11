package com.dsa.arrays

import scala.annotation.tailrec

object EquilibriumPoint extends App {

  def checkIfEquilibrium(list: List[Int]): Boolean = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    isEquilibriumPoint(list, list.sum, 0, 0)
  }

  @tailrec
  private def isEquilibriumPoint(list: List[Int], sum: Int, LSum: Int, index: Int): Boolean =
    if (index == list.size) false
    else
      (LSum == sum - list(index)) || isEquilibriumPoint(
        list,
        sum - list(index),
        LSum + list(index),
        index + 1
      )

  println(checkIfEquilibrium(List(4, 2, 2)))
}
