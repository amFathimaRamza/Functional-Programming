object Q2 extends App{
  println("Enter a integer=> ")
  val num = scala.io.StdIn.readInt()//assign the value to a variable

  val result = number(num)
   
def number(x:Int):Any = x match{
  case y if (y==0 || y<0) => println("Negative/Zero")
  case y if (y%2 == 0) => println("Even")
  case _ => println("Odd")
}
}
