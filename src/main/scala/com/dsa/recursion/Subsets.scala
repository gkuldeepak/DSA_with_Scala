package com.dsa.recursion

object Subsets extends App {

  def getSubsets(input: String, current: List[String] = List.empty[String], index: Int = 0, result: List[String] = List.empty[String]): List[String] = {
    if(index == input.length) result :+ current.mkString
    else getSubsets(input, current, index + 1) ++ getSubsets(input, current :+ input.charAt(index).toString, index + 1)
  }

  println(getSubsets("abc"))

}
