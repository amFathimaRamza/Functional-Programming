//Q4,Q5
object q4 extends App{
  def isEven(x:Int):Boolean = x match{
    case 0 => true
    case _ => isOdd(x-1)
  }
  def isOdd(x:Int):Boolean = !(isEven(x))

  println(isEven(4))
  println(isEven(9))
  println(isOdd(5))

    var total:Int = 0;
    def sum(x:Int): Unit={
        if(x>0){
        if(isEven(x)){
          total = total + x
        }
        sum(x - 1)
        }
        else{
          print("Sum of the even no => "+total)
        } 
      }
    sum(5)
}
