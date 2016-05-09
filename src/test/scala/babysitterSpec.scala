import babysitter.Calculator
import org.scalatest._

class BabysitterSpec extends FlatSpec with Matchers {

  val babysitterCalculator = Calculator

  "A Babysitter" should "be paid $12 for the hour from 6 to 7" in {
    babysitterCalculator(18, 19) shouldBe 12
  }

  it should "be paid $24 for the two hours from 6 to 8" in {
    babysitterCalculator(18, 20) shouldBe 24
  }

  it should "be paid $16 for the two hours from 10 to 12" in {
    babysitterCalculator(22, 24) shouldBe 16
  }

  it should "be paid $32 for the two hours from 1 to 3" in {
    babysitterCalculator(25, 27) shouldBe 32
  }

  it should "be paid $104 for the nine hours from 6 to 3" in {
    babysitterCalculator(18, 27) shouldBe 104
  }

  it should "refuse to work before 5 and return 0" in {
    babysitterCalculator(14, 18) shouldBe 0
  }

  it should "refuse to work after 4 and return 0" in {
    babysitterCalculator(29, 31) shouldBe 0
  }
}
