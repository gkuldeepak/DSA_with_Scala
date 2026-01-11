package com.dsa.Searching

object BinaryIterativeSearch extends App {

  def iterativeBinarySearch(list: List[Int], search: Int): Int = {
    require(list.nonEmpty, throw new NullPointerException("Empty List !!!"))
    var low  = 0
    var high = list.size - 1
    while (low <= high) {
      var mid = (low + high) / 2
      if (list(mid) == search) return mid
      else if (list(mid) > search) high = mid - 1
      else low = mid + 1
    }
    -1
  }

  println(iterativeBinarySearch(List(5, 10, 15, 25, 35), 20))

}
