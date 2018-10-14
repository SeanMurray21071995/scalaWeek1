object GameAi {
  var rockCounter = 0
  var paperCounter = 0
  var scissorCounter = 0
  var hitCounter = 0

  def firstGuess():String = {
    aiGuessValueConvert(makeRandomGuess())
  }
  def guess(input:String ):String = input match {
    case "Rock" if rockCounter ==2=> rockCounter=0;makeLogicicalGuess(1)
    case "Paper" if paperCounter==2=> paperCounter=0;makeLogicicalGuess(0)
    case "Scissors" if scissorCounter==2=> scissorCounter=0;makeLogicicalGuess(2)
    case _=> firstGuess()
  }
  def incrementCounters(increment:String):Unit = increment match{
    case "Paper" => paperCounter+=1
    case "Rock" => rockCounter+=1
    case "Scissors" => scissorCounter+=1
  }
  private def makeRandomGuess():Int={
    scala.util.Random.nextInt(3)
  }
  private def makeLogicicalGuess(mostCommon:Int):String = mostCommon match {
    case 0 if hitCounter==makeRandomGuess() => aiGuessValueConvert(1)
    case 1 if hitCounter==makeRandomGuess() => aiGuessValueConvert(2)
    case 2 if hitCounter==makeRandomGuess() => aiGuessValueConvert(0)
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
