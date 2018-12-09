object Run 
{
  implicit class IntTimes(x: Int) 
  {
    def times [A, B](f: =>A, b: B): Unit = 
    {
      def loop(current: Int): Unit =

        if(current > 0)
        {
          println("hihi"+b);
          f
          loop(current - 1)
        }
      loop(x)
    }
  }
}

