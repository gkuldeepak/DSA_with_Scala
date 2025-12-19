package com.dsa.recursion

object Palindrome extends App {

  def checkIfPalindrome(input: Any, forwardCounter:Int = 0): Boolean = {
    val length = input.toString.length - 1
    if(forwardCounter >= length/2) true
    else (input.toString.charAt(forwardCounter) == input.toString.charAt(length - forwardCounter)) && checkIfPalindrome(input, forwardCounter + 1)
  }

  println(checkIfPalindrome("asca"))

}
