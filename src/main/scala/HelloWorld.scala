object HelloWorld extends App {

  //println("Hello World")

  val h = "hello world"
  //println(h)

  def output(s: String): Unit = {
    println(s)
  }

  def outputString(): String = {
    "Hello World!"
  }

  //output(h)
  //output(outputString())

  def outputAny(o: Any): Unit = {
    println(o.getClass.getSimpleName)
  }

  //outputAny("String")
  //outputAny(true)
  //outputAny(213)
  //outputAny(42.24)

  def stringIntOutput(i: Int, s: String): String = {
    val c = s.charAt(s.length - (i + 1))
    val arr = s.split(c)
    arr(arr.length - 1)
  }

  //println(stringIntOutput(5, "MagicRoundAbout"))

  def stringReplaceOutput(sFirst: String, sSecond: String, cOld: Char, cNew: Char): String = {
    val temp = sFirst.concat(sSecond)
    temp.replace(cOld, cNew)
  }
  //println(stringReplaceOutput("Hello", "World", 'l', 'q'))

  def multiply(int1: Int, int2: Int):Int={
    int1 + int2
  }
  //println(multiply(1,2))

  def multiplyBoolean(int1: Int, int2: Int, bool: Boolean):Int={
    if (bool==true)
      int1 + int2
    else
      int1*int2
  }

  //println(multiplyBoolean(5,10,false))
  //println(multiplyBoolean(5,10,true))

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

  //println(conditionsTwo(5,0,false))

  def Iteration(s:String, i:Int):Unit={
    for(y<-1 to i)
      println(s)
  }
  //Iteration("HelloWorld!!", 3)

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
  //Iteration2("H", 6)

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

  //FizzBuzz("FIZZ","BUZZ", 20)

  def recursion(s:String, i:Int):Unit={
    if(i==1){
      println(s)
    }
    else{
      recursion(s,i-1)
      println(s)
    }
  }
  //recursion("HelloWorld!!", 3)

  def recursion2(s: String, i: Int, count:Int):Unit={
    if(i%count==0)
      {
        println(s*i)
      }
    if(count==1)
      {
        print(s)
      }
    else
      {
        recursion2(s,i,count-1)
        print(s)
      }
    }
//  recursion2("J",6,6)

  def recursaion3(string1:String, string2:String, i:Int):Unit={
    if(i==1){
      println(i)
    }
    else
      {
        if (i%3==0){
          if(i%5==0){
            recursaion3(string1,string2,i-1)
            println(string1+string2)
          }else {
            recursaion3(string1,string2,i-1)
            println(string1)
          }
        }
        else if (i%5==0){
          recursaion3(string1,string2,i-1)
          println(string2)
        }
        else{
          recursaion3(string1,string2,i-1)
          println(i)
        }
      }
  }

//  recursaion3("Fizz","Buzz", 16)
  def patternMatching(int1:Int, int2:Int, bool:Boolean):Unit = bool match{
    case true => println(int1+int2)
    case false => println(int1*int2)
  }
 // patternMatching(2,4,false)

  case class intake(int: Int, int2: Int, bool: Boolean)
  def patternMatching2(info: Any):Unit = info match{
    case intake(0,int2, bool)=> println(int2)
    case intake(int1, 0,bool) => println(int1)
    case intake(int1, int2, true)=> println(int1+int2)
    case intake(int1, int2, false)=>println(int1*int2)
  }
 // patternMatching2(intake(2,4,false))
 // patternMatching2(intake(2,4,true))

  def patternMatching3(info: Any):Any= info match{
    case info: List[Any] => println(info.tail.head, info.head)
    case info: Array[Any] => Array((info(1),info(0)))foreach(println)
    case info: Tuple2[Any,Any] => println(info._2, info._1)
    case _=>println("Invalid Input has been entered")
  }
  val list = List("there","hi")
  val arr = Array("world","Hello")
  //patternMatching3(list)
  //patternMatching3(arr)
  //patternMatching3(2,3)
  //patternMatching3(4,5,6)


  java.util.TimeZone.getAvailableIDs.map(data => data.split("/"))  // replaces the value with a new value that meets the condition in this case replces a string with an array "
    .filter(data => data.length==2) // reads in the arrays and gets rid of the arrays that only contain one element
    .flatMap(_.toList) // converst the array into a list
    .distinct // gets rid of any duplicates
    .grouped(10) // Iterator that puts the elements into groups of 10
    .toList(0) // puts each of the first items in the groups into a list
    .foreach(println) // prints out all of the elements in teh list


}


