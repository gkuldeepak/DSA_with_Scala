package com.dsa.arrays

object StockBuySell extends App {

  def getMaxProfit(list: List[Int]): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List Found !!!"))
    calculateMaxProfit(list, 1, 0)
  }

  private def calculateMaxProfit(list: List[Int], index: Int, profit: Int): Int =
    if (index == list.size) profit
    else if (list(index) > list(index - 1))
      calculateMaxProfit(list, index + 1, profit + (list(index) - list(index - 1)))
    else calculateMaxProfit(list, index + 1, profit)

  println(getMaxProfit(List(1, 5, 3, 8, 12)))

}
