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
    val end = 0
    assert (babysitterCalculator(start, end) == 16)
  }
}
