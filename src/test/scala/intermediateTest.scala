class intermediateTest extends unitSpec  {
  "If both entries are greater than 21 then the system"should "return 0"in {
    assertResult(0){Intermediate.blackJack(24,45)}
  }
  "If one entry is bigger than the other then the method" should "return the second entry if it is bigger than the first" in {
    Intermediate.blackJack(2,7) should equal(7)
  }
  it can "return the first entry if it is larger than the second" in {
    Intermediate.blackJack(7,2) should equal(7)
  }
  "If both entries are the same then the method" should "return 0" in {
    assertResult(0){Intermediate.blackJack(8,8)}
  }
  "If all of the numbers are diffrent then it" should "return the sum of all three numbers" in{
    assertResult(6){Intermediate.uniquesSum(1,2,3)}
  }
  "If all the numbers are the same then it" should "will return 0 if all the numbers are the same" in{
    assertResult(0){Intermediate.uniquesSum(1,1,1)}
  }
  "If two of the numbers are the same then it" should "only retrun the unique number"in{
    assertResult(3){Intermediate.uniquesSum(3,2,2)}
  }
  "If its not summer and the tempeture is beetween 90 and 60 then the method" should "its shoukd return true" in{
    assertResult(true){Intermediate.totalHot(70, false)}
  }
  "If true and between 90 and 100" should "return true" in{
    assertResult(true){Intermediate.totalHot(95,true)}
  }
  "If false and not between 90 and 60" should "return false" in{
    assertResult(false){Intermediate.totalHot(30, true)}
  }
  "If true and not between 100 and 90" should "return true" in{
    assertResult(false){Intermediate.totalHot(30,false)}
  }
}
