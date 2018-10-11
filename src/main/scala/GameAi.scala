object GameAi {
  var rockCounter = 0
  var paperCounter = 0
  var scissorCounter = 0
  val rock = "Rock"
  val paper = "Paper"
  val scissors = "Scissors"

  def firstGuess():String = {
    aiGuessValueConvert(makeRandomGuess())
  }
  def guess():String ={
    if (rockCounter==3){
      rockCounter=0;
      makeLogicicalGuess(1)
    }
    else if(paperCounter==3) {
      paperCounter=0;
      makeLogicicalGuess(0)
    }
    else if (scissorCounter==3)
    {
      scissorCounter=0;
      makeLogicicalGuess(2)
    }
    else
    {
      firstGuess()
    }
  }
  def incrementCounters(increment:String):Unit = increment match{
    case rock => paperCounter+=1
    case paper => rockCounter+=1
    case scissors => scissorCounter+=1
  }
  private def makeRandomGuess():Int={
    val aiGuess = scala.util.Random
    aiGuess.nextInt(3)
  }
  private def makeLogicicalGuess(mostCommon:Int):String = mostCommon match {
    case 0 => aiGuessValueConvert(2)
    case 1 => aiGuessValueConvert(0)
    case 2 => aiGuessValueConvert(1)
  }
  private def aiGuessValueConvert(guess:Int):String= guess match{
    case 0 => paper
    case 1 => rock
    case 2 => scissors
  }
}
