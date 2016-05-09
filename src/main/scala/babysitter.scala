package babysitter

object Calculator{

  def apply ( start:Int, end:Int, bedtime:Int ) : Int = {
    var new_end = end
    var rate = 12
    if (end < 5) {new_end = end + 24}
    if (start >= bedtime){rate = 8}
    val dur = new_end - start
    return dur * rate
  }
}
