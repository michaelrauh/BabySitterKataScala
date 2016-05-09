package babysitter

object Calculator{
  val bedtime = 22

  val beforeBed: PartialFunction[Int, Int] = {
    case hour if (hour < bedtime) => 12
  }

  val bedToMidnight: PartialFunction[Int, Int] = {
    case hour if ((bedtime <= hour) && (hour <= 24)) => 8
  }

  val afterMidnight: PartialFunction[Int, Int] = {
    case hour if (hour > 24) => 16
  }

  def apply (start:Int, end:Int) : Int = {
    if (start < 17 || end > 28) {return 0}
    val rateForHour = beforeBed orElse bedToMidnight orElse afterMidnight
    return (start until end).map(x => rateForHour(x)).sum
  }
}
