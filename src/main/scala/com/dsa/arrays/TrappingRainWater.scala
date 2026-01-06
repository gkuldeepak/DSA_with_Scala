package com.dsa.arrays

import scala.annotation.tailrec

object TrappingRainWater extends App {

  def trappingRainWater(list: List[Int]): Int = {
    require(list.size > 2, throw new NullPointerException("Invalid List Size !!!"))
    val left  = getLeftMaxBoundaries(list, List(list.head), 1)
    val right = getRightMaxBoundaries(list, List(list.last), list.size - 2)
    calculateMaxWater(list, left, right, 0, 1)
  }

  @tailrec
  private def getLeftMaxBoundaries(list: List[Int], currentList: List[Int], index: Int): List[Int] =
    if (index == list.size) currentList
    else
      getLeftMaxBoundaries(list, currentList :+ Math.max(currentList.last, list(index)), index + 1)

  @tailrec
  private def getRightMaxBoundaries(
    list: List[Int],
    currentList: List[Int],
    index: Int
  ): List[Int] =
    if (index < 0) currentList
    else
      getRightMaxBoundaries(list, Math.max(currentList.head, list(index)) +: currentList, index - 1)

  @tailrec
  private def calculateMaxWater(
    list: List[Int],
    leftBoundary: List[Int],
    rightBoundary: List[Int],
    volume: Int,
    index: Int
  ): Int =
    if (index == list.size) volume
    else
      calculateMaxWater(
        list,
        leftBoundary,
        rightBoundary,
        volume + (Math.min(leftBoundary(index), rightBoundary(index)) - list(index)),
        index + 1
      )

  println(trappingRainWater(List(5, 0, 6, 2, 3)))
}
