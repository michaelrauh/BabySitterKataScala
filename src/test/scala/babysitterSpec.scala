import babysitter.Calculator
import org.scalatest._

class BabysitterSpec extends FlatSpec with Matchers {

  val babysitterCalculator = Calculator

  "A Babysitter" should "be paid $12 for the hour from 6 to 7" in {
    val start = 18
    val end = 19
    babysitterCalculator(start, end) shouldBe 12
  }

  it should "be paid $24 for the two hours from 6 to 8" in {
    val start = 18
    val end = 20
    babysitterCalculator(start, end) shouldBe 24
  }

  it should "be paid $16 for the two hours from 10 to 12" in {
    val start = 22
    val end = 24
    babysitterCalculator(start, end) shouldBe 16
  }

  it should "be paid $32 for the two hours from 1 to 3" in {
    val start = 25
    val end = 27
    babysitterCalculator(start, end) shouldBe 32
  }

  it should "be paid $104 for the nine hours from 6 to 3" in {
    val start = 18
    val end = 27
    babysitterCalculator(start, end) shouldBe 104
  }

  it should "refuse to work before 5 and return 0" in {
    val start = 14
    val end = 18
    babysitterCalculator(start, end) shouldBe 0
  }

  it should "refuse to work after 4 and return 0" in {
    val start = 29
    val end = 31
    babysitterCalculator(start, end) shouldBe 0
  }
}
