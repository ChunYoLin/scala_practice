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

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc)
{
  var z: Int = zc;
  def move(dx: Int, dy: Int, dz: Int)
  {
    x += dx;
    y += dy;
    z += dz;
  }
}


object Demo
{
  def main(args: Array[String])
  {
    var loc = new Location(10, 100, 1000)
    println("z location: " + loc.z);
    loc.move(10, 0, 100);
    println("z location after move: " + loc.z);
  }
}
