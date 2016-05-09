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
    val rateForHour = beforeBed orElse bedToMidnight orElse afterMidnight
    val adjusted_end = if (end < 5) (end + 24) else end
    val adjusted_start = if (start < 6) start + 24 else start

    val all_hours = adjusted_start until adjusted_end

    val all_rates = all_hours.map(x => rateForHour(x))
    println(all_hours)
    println(all_rates)

    return all_rates.sum
  }
}
