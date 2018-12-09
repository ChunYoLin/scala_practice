class Point(val xc: Int, val yc: Int)
{
  var x: Int = xc;
  var y: Int = yc;

  def move(dx: Int, dy: Int)
  {
    x += dx;
    y += dy;
  }
}


object Demo
{
  def main(args: Array[String])
  {
    var pt = new Point(10, 100);
    println("x location: " + pt.x);
    pt.move(10, 0);
    println("x location after move: " + pt.x);
  }
}
