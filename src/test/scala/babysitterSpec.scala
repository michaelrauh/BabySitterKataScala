import babysitter.Calculator
import org.scalatest._
import com.github.nscala_time.time.Imports._

class BabysitterSpec extends FlatSpec {

  "A Babysitter" should "be paid $12 per hour from start time to bedtime" in {
    val babysitterCalculator = Calculator
    val start = DateTime.now.hour(18)
    val end = DateTime.now.hour(19)
    assert (babysitterCalculator(start, end) == 12)
  }
}
