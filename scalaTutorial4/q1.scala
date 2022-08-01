//19001304

object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter the deposit value")
    val deposit = scala.io.StdIn.readInt() //read the value as int and pass to a variable

    val interestAmount = interest(deposit) //calling the function and passing the deposit value
    println("Interest for the "+deposit+" amount => "+interestAmount)
  }
  
def interest(deposit:Int):Double = deposit match {
  case d if d<= 20000 => d* 0.02
  case d if d<= 200000 => d* 0.04
  case d if d<= 2000000 => d* 0.035
  case d if d> 2000000 => d* 0.065
}
}

