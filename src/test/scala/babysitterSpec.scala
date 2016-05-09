import babysitter.Calculator
import org.scalatest._

class BabysitterSpec extends FlatSpec {

  "A Babysitter" should "be paid $12 for the hour from 6 to 7" in {
    val babysitterCalculator = Calculator
    val start = 18
    val end = 19
    val bed_time = 22
    assert (babysitterCalculator(start, end, bed_time) == 12)
  }
  
  it should "be paid $24 for the two hours from 6 to 8" in {
    val babysitterCalculator = Calculator
    val start = 18
    val end = 20
    val bed_time = 22
    assert (babysitterCalculator(start, end, bed_time) == 24)
  }
}
