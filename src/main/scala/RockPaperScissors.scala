object RockPaperScissors extends App {
  val rock = "Rock"
  for(i<-1 to 100) {
    val input = readLine("Enter your choice")
    if(i<2) {
      val aiFirstGuess = GameAi.firstGuess()
      println(GameLogic.checkWinner(input, aiFirstGuess))
    }
    else
      {
        val aiGuess = GameAi.guess()
        println(GameLogic.checkWinner(input, aiGuess))
      }
    GameAi.incrementCounters(input)
  }
}
