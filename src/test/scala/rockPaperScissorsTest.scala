import org.scalatest.FlatSpec

class rockPaperScissorsTest extends FlatSpec{

  "If player picks Rock" should "return Draw if ai picks Rock" in{
    assertResult( "It is a DRAW since the Ai also picked Rock \n"){
      GameLogic.checkWinner("Rock","Rock")}
  }
  it can "return player won if ai guesses scissors" in{
    assertResult("The Player has won the Ai guessed Scissors \n"){
      GameLogic.checkWinner("Rock","Scissors")}
  }
  it can "return Ai won if ai guesses Paper" in{
    assertResult( "The Ai has won the Ai guessed Paper \n"){
      GameLogic.checkWinner("Rock","Paper")}
  }
  "If player picks Scissors" should "return Draw if Ai picks scissors" in {
    assertResult("It is a DRAW since the Ai also picked Scissors \n") {
      GameLogic.checkWinner("Scissors", "Scissors")
    }
  }
  it can "return Player won if ai guesses Paper" in{
    assertResult("The Player has won the Ai guessed Paper \n"){
      GameLogic.checkWinner("Scissors","Paper")
    }
  }
  it can "return Ai won if Ai guessed Rock" in{
    assertResult("The Ai has won the Ai guessed Rock \n"){
      GameLogic.checkWinner("Scissors","Rock")
    }
  }
  "If player picks Paper" should "return Draw if the Ai also picks Paper" in{
    assertResult("It is a DRAW since the Ai also picked Paper \n"){
      GameLogic.checkWinner("Paper","Paper")
    }
  }
  it can "return Player won if ai guesses Rock" in{
    assertResult("The Player has won the Ai guessed Rock \n"){
      GameLogic.checkWinner("Paper","Rock")
    }
  }
  it can "return Ai won if the AI picks Scissors" in{
    assertResult("The Ai has won the Ai guessed Scissors \n"){
      GameLogic.checkWinner("Paper","Scissors")
    }
  }
}
