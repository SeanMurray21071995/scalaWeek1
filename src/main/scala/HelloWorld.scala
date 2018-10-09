object HelloWorld extends App {

  println("Hello World")

  val h = "hello world"
  println(h)

  def output(s: String): Unit = {
    println(s)
  }

  def outputString(): String = {
    "Hello World!"
  }

  output(h)
  output(outputString())

  def outputAny(o: Any): Unit = {
    println(o.getClass.getSimpleName)
  }

  outputAny("String")
  outputAny(true)
  outputAny(213)
  outputAny(42.24)

  def stringIntOutput(i: Int, s: String): String = {
    val c = s.charAt(s.length - (i + 1))
    val arr = s.split(c)
    arr(arr.length - 1)
  }

  println(stringIntOutput(5, "MagicRoundAbout"))

  def stringReplaceOutput(sFirst: String, sSecond: String, cOld: Char, cNew: Char): String = {
    val temp = sFirst.concat(sSecond)
    temp.replace(cOld, cNew)
  }
  println(stringReplaceOutput("Hello", "World", 'l', 'q'))

  def multiply(int1: Int, int2: Int):Int={
    int1 + int2
  }
  println(multiply(1,2))

  def multiplyBoolean(int1: Int, int2: Int, bool: Boolean):Int={
    if (bool==true)
      int1 + int2
    else
      int1*int2
  }

  println(multiplyBoolean(5,10,false))
  println(multiplyBoolean(5,10,true))

  def conditionsTwo(int1: Int, int2: Int, bool: Boolean):Int={
    if(int1==0)
      int2
    else if(int2==0)
      int1
    else {
      if (bool == true)
        int1 + int2
      else
        int1 * int2
    }
  }

  println(conditionsTwo(5,0,false))

  def Iteration(s:String, i:Int):Unit={
    for(y<-1 to i)
      println(s)
  }
  Iteration("HelloWorld!!", 3)

 /* def Iteration2(s:String, i:Int):Unit={
    for(y<-1 to i){
      println(s*i)
    }
  }
  */
  def Iteration2(s: String, i: Int):Unit={
    for(y<-1 to i; j<-1 to i){
      if(j%i==0){
        println(s)
      }
      else{
        print(s)
      }
    }
  }
  Iteration2("H", 6)

  def FizzBuzz(string1:String, string2:String, i:Int):Unit={
      for(j<-1 to i){
        if (j%3==0){
          if(j%5==0){
            println(string1+string2)
          }else {
            println(string1)
          }
        }
        else if (j%5==0){
          println(string2)
        }
        else{
          println(j)
        }
      }
  }

  FizzBuzz("FIZZ","BUZZ", 20)

  def recursion(s:String, i:Int):Unit={
    if(i==1){
      println(s)
    }
    else{
      recursion(s,i-1)
      println(s)
    }
  }
  recursion("HelloWorld!!", 3)





}
