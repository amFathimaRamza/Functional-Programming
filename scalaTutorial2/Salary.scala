//Q4-a
class CalculateSalary(wageHours:Int,otHours:Int){
  val normalRate = 250;
  val otRate = 85;

  def wage(wageHours:Int):Int = wageHours*normalRate;
  def ot(otHours:Int):Int = otHours*otRate;
  def income(wageHours:Int,otHours:Int):Int = wage(wageHours)+ot(otHours);
  def tax(wageHours:Int,otHours:Int):Double = income(wageHours,otHours)*0.12;
  def takeHomeSalary(wageHours:Int, otHours:Int):Double = income(wageHours,otHours) - tax(wageHours,otHours);
  
  println(takeHomeSalary(wageHours,otHours));
}

object Salary extends App {

  val h = new CalculateSalary(40,30);
}
