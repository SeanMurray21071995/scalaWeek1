object RockPaperScissors extends App {
  var continue = true
  var i = 0
  while(continue) {
    val input = readLine("Enter your choice or type \"Exit\" to quit\n")
    if(input=="Exit") {
      continue=false;
    }
    else {
      if (i == 0) {
        val aiFirstGuess = GameAi.firstGuess()
        println(GameLogic.checkWinner(input, aiFirstGuess))
        i += 1
      }
      else {
        val aiGuess = GameAi.guess()
        println(GameLogic.checkWinner(input, aiGuess))
      }
      GameAi.incrementCounters(input)
    }
  }
}
