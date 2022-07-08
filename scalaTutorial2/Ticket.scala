//Q4-b

class Calculate(price:Int){
  val fixedCost = 500;
  def noOfAttendees(price:Int):Int = 120 + 4 * (15-price); //4->20/5
  def totalCost(price:Int):Int = fixedCost + 3 * noOfAttendees(price);
  def income(price:Int):Int = noOfAttendees(price) * price;
  def profit(price:Int):Int = income(price) - totalCost(price);
  println(profit(price));
}
object Ticket {
  def main(args: Array[String]){

    val p = new Calculate(15);
  }

}
