object GameAi {
  var rockCounter = 0
  var paperCounter = 0
  var scissorCounter = 0
  var hitCounter = 0

  def firstGuess():String = {
    aiGuessValueConvert(makeRandomGuess())
  }
  def guess():String ={
    if (rockCounter==2){
      if(hitCounter==makeRandomGuess()){
        rockCounter = 0
        makeLogicicalGuess(0)
      }
      else {
        rockCounter = 0
        makeLogicicalGuess(1)
      }
    }
    else if(paperCounter==2) {
      if(hitCounter==makeRandomGuess()){
        paperCounter=0
        makeLogicicalGuess(2)
      }
      else {
        paperCounter = 0
        makeLogicicalGuess(0)
      }
    }
    else if (scissorCounter==2) {
      if(hitCounter==makeRandomGuess()){
        scissorCounter=0
        makeLogicicalGuess(1)
      }
      else{
        scissorCounter=0
        makeLogicicalGuess(2)
      }
    }
    else {
      firstGuess()
    }
  }
  def incrementCounters(increment:String):Unit = increment match{
    case "Paper" => paperCounter+=1
    case "Rock" => rockCounter+=1
    case "Scissors" => scissorCounter+=1
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
    case 0 => "Paper"
    case 1 => "Rock"
    case 2 => "Scissors"
  }
}
