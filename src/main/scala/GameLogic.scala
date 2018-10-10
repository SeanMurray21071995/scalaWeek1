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
   case guesses("Rock", "Paper") => 1
   case guesses("Paper", "Rock") => 0
   case guesses("Rock","Scissors") => 0
   case guesses("Scissors","Rock") => 1
   case guesses("Scissors", "Paper") => 1
   case guesses("Paper","Scissors") => 0
 }

  def finalMessage(winner:String, aiGuesses: String): String = {
    if(winner=="DRAW")
      s"It is a DRAW since the Ai also picked $aiGuesses"
    else
      s"The $winner has won the Ai guessed $aiGuesses"
  }

  /*def recordPlayerMove(guess:String):Unit={
    var rockCount =0
    var scissorsCount =0
    var paperCount =0
    if(guess=="Rock")
      rockCount+=1
    else if(guess=="Scissors")
      scissorsCount+=1
    else
     paperCount+=1
  }*/
}
