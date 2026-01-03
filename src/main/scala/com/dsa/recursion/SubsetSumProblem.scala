package com.dsa.recursion

object SubsetSumProblem extends App {

  def totalSubset(list: List[Int], total: Int, index: Int, currentTotal: Int = 0): Int =
    if (currentTotal == total) 1
    else if (currentTotal > total || index == 0) 0
    else
      totalSubset(list, total, index - 1, currentTotal) + totalSubset(
        list,
        total,
        index - 1,
        currentTotal + list(index - 1)
      )

  println(totalSubset(List(10, 20, 15), 37, 3))

}
