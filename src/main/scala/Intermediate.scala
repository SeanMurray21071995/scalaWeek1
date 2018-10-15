import scala.collection.mutable.ArrayBuffer

object Intermediate extends App {

  def blackJack(entry: Int, entry2: Int): Int = {
    if (entry > 21 & entry2 > 21) {
      0
    }
    if (21 - entry > 21 - entry2) {

      entry2
    }
    else if (21 - entry < 21 - entry2) {
      entry
    }
    else {
      0
    }
  }

  //println(blackJack(12,10))



  def uniquesSum(num1:Int, num2:Int, num3:Int):Int={
    val arr = ArrayBuffer(num1,num2,num3)
    val dis = arr.distinct
    val check = arr diff dis
    var total = 0
    if (check.length != 0) {
      for (a <- arr; b <- check) {
        if (a != b)
          total += a
      }
    }
    else {
      for (a <- arr)
        total += a
    }
    total
  }

  println(uniquesSum(12, 3, 8))

  def totalHot(temp: Int, isSummer: Boolean): Boolean = {
    var uperLimit = 90
    var lowerLimit = 60
    if (isSummer) {
      uperLimit = 100
      lowerLimit = 90
    }
    if (temp < uperLimit && temp > lowerLimit) {
      true
    }
    else {
      false
    }
  }

  println(totalHot(123, true))
}