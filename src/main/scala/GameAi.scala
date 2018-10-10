object GameAi {

  def firstGuess():String = {
    aiGuessValueConvert(makeRandomGuess())
  }
  private def makeRandomGuess():Int={
    val aiGuess = scala.util.Random
    aiGuess.nextInt(3)
  }
  private def aiGuessValueConvert(guess:Int):String= guess match{
    case 0 => "Paper"
    case 1 => "Rock"
    case 2 => "Scissors"
  }
}
