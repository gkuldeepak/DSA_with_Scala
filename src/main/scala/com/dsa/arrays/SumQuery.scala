package com.dsa.arrays

import scala.annotation.tailrec

object SumQuery extends App {

  def getSum(list: List[Int], firstIndex: Int, lastIndex: Int): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    val prefixSumList = getPrefixSum(list.tail, List(list.head))
    if (firstIndex == 0) prefixSumList(lastIndex)
    else prefixSumList(lastIndex) - prefixSumList(firstIndex - 1)
  }

  @tailrec
  private def getPrefixSum(tailList: List[Int], prefixSumList: List[Int]): List[Int] =
    tailList match {
      case last :: Nil  => prefixSumList :+ (prefixSumList.last + last)
      case head :: tail => getPrefixSum(tail, prefixSumList :+ (prefixSumList.last + head))
    }

  println(getSum(List(2, 8, 3, 9, 6, 5, 4), 2, 6))

}
