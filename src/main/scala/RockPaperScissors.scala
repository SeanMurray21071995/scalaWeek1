object RockPaperScissors extends App {
  var continue = true
  var i = 0
  while(continue) {
    val input = readLine("Enter your choice or type \"Exit\" to quit\n")
    if(input.toLowerCase=="exit") {
      continue=false;
    }
    else {
      if (i == 0) {
        val aiFirstGuess = GameAi.firstGuess()
        println(GameLogic.checkWinner(input, GameAi.firstGuess()))
        i += 1
      }
      else {
        println(GameLogic.checkWinner(input, GameAi.guess()))
      }
      GameAi.incrementCounters(input)
    }
  }
}
