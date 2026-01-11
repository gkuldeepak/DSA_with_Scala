package com.dsa.arrays

import scala.annotation.tailrec

object MaximumAppearingNumber extends App {

  def getMaximumAppearingNumber(left: List[Int], right: List[Int]): Int = {
    require(
      left.nonEmpty && right.nonEmpty && left.size == right.size,
      throw new NullPointerException("Invalid List")
    )
    val numList = Range(0, right.max + 2).map(_ => 0).toList
    val list    = getSumList(left, right, 0, numList)
    getPrefixSum(list.tail, List(list.head)).indexOf(getPrefixSum(list.tail, List(list.head)).max)
  }

  @tailrec
  private def getSumList(
    left: List[Int],
    right: List[Int],
    index: Int,
    currentList: List[Int]
  ): List[Int] =
    if (index == left.size) currentList
    else {
      val leftValue  = (left(index), currentList(left(index)) + 1)
      val rightValue = (right(index) + 1, currentList(right(index) + 1) - 1)
      getSumList(
        left,
        right,
        index + 1,
        currentList.updated(leftValue._1, leftValue._2).updated(rightValue._1, rightValue._2)
      )
    }

  @tailrec
  private def getPrefixSum(list: List[Int], existingList: List[Int]): List[Int] =
    list match {
      case last :: Nil  => existingList :+ (existingList.last + last)
      case head :: tail => getPrefixSum(tail, existingList :+ (existingList.last + head))
    }

  println(getMaximumAppearingNumber(List(1, 2, 3), List(3, 5, 7)))

}
