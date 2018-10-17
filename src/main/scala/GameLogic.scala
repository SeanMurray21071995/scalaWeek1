object GameLogic {

  def checkWinner(player1:String, player2: String ):String=
  {
    val winner = checkWinningGuess(guesses(player1,player2))
    if(winner ==0)
        finalMessage("Player", player2)
    else if(winner ==1)
        finalMessage("Ai", player2)
    else
      finalMessage("DRAW",player2)
  }

  case class guesses(guess1: String, guess2: String)
private def checkWinningGuess(info:guesses):Int =  info match {
   case guesses (guess1, guess2 ) if guess1 == guess2 => 2
   case guesses("Paper", "Rock") => 0
   case guesses("Rock", "Paper") => 1
   case guesses("Rock","Scissors") => 0
   case guesses("Scissors","Rock") => 1
   case guesses("Scissors", "Paper") => 0
   case guesses("Paper","Scissors") => 1
 }
  def finalMessage(winner:String, aiGuesses: String): String = {
    if(winner=="DRAW")
      s"It is a DRAW since the Ai also picked $aiGuesses \n"
    else
      s"The $winner has won the Ai guessed $aiGuesses \n"
  }
}
