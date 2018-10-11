import scala.collection.mutable.ArrayBuffer

object Intermediate extends App {

  def blackJack(entry:Int, entry2:Int):Int=
    {
      if(entry >21 & entry2 >21){
        0
      }
      if(21-entry > 21-entry2){

        entry2
      }
      else if(21-entry<21-entry2)
      {
        entry
      }
      else{
        0
      }
    }

  //println(blackJack(12,10))



  def uniquesSum(num1:Int, num2:Int, num3:Int):Int={
    var arr = ArrayBuffer(num1,num2,num3)
    var dis = arr.distinct
    var check = arr diff dis
    var total = 0
    for(a<-arr; b<-check){
      if(a!=b | check.length==0)
        total+= a
      }
    total
  }
  println(uniquesSum(12,8,4))
}
