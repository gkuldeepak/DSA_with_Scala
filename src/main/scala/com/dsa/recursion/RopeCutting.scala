package com.dsa.recursion

object RopeCutting extends App {

  def getMaxRopeCut(ropeLength: Int, one: Int, two: Int, three: Int, currentLength: Int = 0): Int =
    if (ropeLength < 0) -1
    else if (ropeLength == 0) currentLength
    else
      Math.max(
        Math.max(
          getMaxRopeCut(ropeLength - one, one, two, three, currentLength + 1),
          getMaxRopeCut(ropeLength - two, one, two, three, currentLength + 1)
        ),
        getMaxRopeCut(ropeLength - three, one, two, three, currentLength + 1)
      )

  println(getMaxRopeCut(23, 4, 5, 7))
}
