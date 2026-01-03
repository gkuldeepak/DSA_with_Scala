package com.dsa.recursion

object TowerOfHanoi extends App {

  def getTOH(totalDisk: Int, source: String, medium: String, destination: String): Unit =
    if (totalDisk == 1) println(s"Move Disk 1 from ${source} to ${destination}")
    else {
      getTOH(totalDisk - 1, source, destination, medium)
      println(s"Move Disk ${totalDisk} from ${source} to ${destination}")
      getTOH(totalDisk - 1, medium, source, destination)
    }

  getTOH(3, "Source", "Auxiliary", "Destination")

}
