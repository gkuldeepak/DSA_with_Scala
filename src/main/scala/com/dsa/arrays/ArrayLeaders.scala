package com.dsa.arrays

object ArrayLeaders extends App {

  def getArrayLeaders(list: List[Int]): List[Int] = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    selectLeaders(list, list.size - 2, list.last, List(list.last))
  }

  private def selectLeaders(
    list: List[Int],
    index: Int,
    lastLeader: Int,
    leaders: List[Int]
  ): List[Int] =
    if (index < 0) leaders
    else if (list(index) > lastLeader)
      selectLeaders(list, index - 1, list(index), list(index) +: leaders)
    else selectLeaders(list, index - 1, lastLeader, leaders)

  println(getArrayLeaders(List(30, 20, 10)))

}
