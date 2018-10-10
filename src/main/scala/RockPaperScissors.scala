object RockPaperScissors extends App {
  for(i<-1 to 100) {
    val aiFirstGuess = GameAi.firstGuess()
    val input = readLine("Enter your choice")
    println(GameLogic.checkWinner(input, aiFirstGuess))
  }
}
