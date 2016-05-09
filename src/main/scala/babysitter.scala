package babysitter

object Calculator{

  def apply ( start:Int, end:Int, bedtime:Int ) : Int = {
    val dur = end - start
    return dur * 12
}
}
