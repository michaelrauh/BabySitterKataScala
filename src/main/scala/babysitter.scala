package babysitter
import com.github.nscala_time.time.Imports._

object Calculator{

  def apply ( start:DateTime, end:DateTime, bedtime:DateTime ) : Int = {
    val dur = new Duration (start, end)
    return dur.hours.toInt * 12
}
}
