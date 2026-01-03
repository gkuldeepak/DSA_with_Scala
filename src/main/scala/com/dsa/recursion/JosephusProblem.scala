package com.dsa.recursion

object JosephusProblem extends App {

  def getJosephusProblem(n: Int, k: Int): Int =
    if (n == 0) 0
    else (getJosephusProblem(n - 1, k) + k) % n

  println(getJosephusProblem(5, 3))

}
