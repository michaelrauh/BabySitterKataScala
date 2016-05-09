import babysitter.Calculator
import org.scalatest._
import com.github.nscala_time.time.Imports._

class BabysitterSpec extends FlatSpec {

  "A Babysitter" should "be paid $12 per hour from start time to bedtime" in {
    val babysitterCalculator = new Calculator
  }

  // it should "throw NoSuchElementException if an empty stack is popped" in {
  //   val emptyStack = new Stack[String]
  //   intercept[NoSuchElementException] {
  //     emptyStack.pop()
  //   }
  // }
}
