package com.dsa.arrays

object MoveZeroesToEnd extends App {

  def moveZeroesToEnd(list: List[Int]): List[Int] =
    moveZeroes(list, 0, 0)

  private def moveZeroes(existingList: List[Int], zeroIndex: Int, nonZeroIndex: Int): List[Int] =
    if (nonZeroIndex == existingList.size) existingList
    else if (existingList(nonZeroIndex) != 0) {
      val old    = existingList(zeroIndex)
      val update = existingList(nonZeroIndex)
      moveZeroes(
        existingList.updated(zeroIndex, update).updated(nonZeroIndex, old),
        zeroIndex + 1,
        nonZeroIndex + 1
      )
    } else moveZeroes(existingList, zeroIndex, nonZeroIndex + 1)

  println(moveZeroesToEnd(List(1, 4, 0, 5, 0, 9)))

}
