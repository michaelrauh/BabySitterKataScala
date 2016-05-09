package babysitter

object Calculator{
  val bedtime = 22

  val afterBed: PartialFunction[Int, Int] = {
    case hour if (hour >= bedtime) => 8
}

  val beforeBed: PartialFunction[Int, Int] = {
    case hour if (hour < bedtime) => 12
  }

  def apply ( start:Int, end:Int) : Int = {
    val rateForHour = afterBed orElse beforeBed
    val adjusted_end = if (end < 5) (end + 24) else end

    val all_hours = start until adjusted_end

    val all_rates = all_hours.map(x => rateForHour(x))
    println(all_hours)
    println(all_rates)

    return all_rates.sum
  }
}
