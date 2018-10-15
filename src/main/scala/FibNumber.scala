object FibNumber extends App {
  def fibonacciNumber(nth:Int, index: Int=0, preNum1:Int=0, preNum2:Int=1):Int = nth match{
    case nth if nth==index => preNum1
    case nth=> fibonacciNumber(nth,index+1,preNum1+preNum2,preNum1)
  }
 for(i<-0 to 10) println(fibonacciNumber(i))
}