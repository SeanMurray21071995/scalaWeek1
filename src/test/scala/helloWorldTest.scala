class helloWorldTest extends unitSpec {
"entering helloWorld" should "Output HellWorld" in{
  assertResult("Hello World!"){
    HelloWorld.outputString()
  }
}
  "if given an int and a string" should "return the last int numbers in the string" in{
    assertResult("About"){
      HelloWorld.stringIntOutput(5,"MagicRoundAbout")
    }
  }
}
