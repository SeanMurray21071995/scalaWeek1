object GameAi {
  var rockCounter = 0
  var paperCounter = 0
  var scissorCounter = 0

  def firstGuess():String = {
    aiGuessValueConvert(makeRandomGuess())
  }
  def guess():String ={
    if (rockCounter>5){
      rockCounter=0;
      "f"
    }
    else if(paperCounter>5) {
      paperCounter=0;
      "f"
    }
    else if (scissorCounter>5)
    {
      scissorCounter=0;
      "f"
    }
    else
    {
      firstGuess()
    }
  }
  def incrementCounters(paper:Int, rock:Int, scissors:Int):Unit ={
    if(paper>=0)
      paperCounter+=1
    if (rock>=0)
      rockCounter+=1
    if(scissors>=0)
      scissorCounter+=1
  }
  private def makeRandomGuess():Int={
    val aiGuess = scala.util.Random
    aiGuess.nextInt(3)
  }
  private def makeLogicicalGuess():Int={
    1
  }
  private def aiGuessValueConvert(guess:Int):String= guess match{
    case 0 => "Paper"
    case 1 => "Rock"
    case 2 => "Scissors"
  }
}
