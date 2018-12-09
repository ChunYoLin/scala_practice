import Run._


object Demo 
{
  def main(args: Array[String])
  {
    4 times (println("hello"), 5);
    var factor = 3;
    val multiplier = (i: Int) => i * factor
    println("value: " + multiplier(3))
    factor = 5;
    println("value: " + multiplier(3))
  }
}
