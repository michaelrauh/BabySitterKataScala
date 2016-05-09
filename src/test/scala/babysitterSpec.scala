import babysitter.Calculator
import org.scalatest._

class BabysitterSpec extends FlatSpec {

  "A Babysitter" should "be paid $12 for the hour from 6 to 7" in {
    val babysitterCalculator = Calculator
    val start = 18
    val end = 19
    assert (babysitterCalculator(start, end) == 12)
  }

  it should "be paid $24 for the two hours from 6 to 8" in {
    val babysitterCalculator = Calculator
    val start = 18
    val end = 20
    assert (babysitterCalculator(start, end) == 24)
  }

  it should "be paid $16 for the two hours from 10 to 12" in {
    val babysitterCalculator = Calculator
    val start = 22
    val end = 24
    assert (babysitterCalculator(start, end) == 16)
  }

  it should "be paid $32 for the two hours from 1 to 3" in {
    val babysitterCalculator = Calculator
    val start = 25
    val end = 27
    assert (babysitterCalculator(start, end) == 32)
  }

  it should "be paid $104 for the nine hours from 6 to 3" in {
    val babysitterCalculator = Calculator
    val start = 18
    val end = 27
    assert (babysitterCalculator(start, end) == 104)
  }

  it should "refuse to work before 5 and return 0" in {
    val babysitterCalculator = Calculator
    val start = 14
    val end = 18
    assert (babysitterCalculator(start, end) == 0)
  }

  it should "refuse to work after 4 and return 0" in {
    val babysitterCalculator = Calculator
    val start = 29
    val end = 31
    assert (babysitterCalculator(start, end) == 0)
  }
}
