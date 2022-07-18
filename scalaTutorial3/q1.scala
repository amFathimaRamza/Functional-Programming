//19001304
object Ans{
 def main(args: Array[String]): Unit = {
  //q1
  val area = diskArea(5);
  println("Disk area is "+ area);
  //q2
  val temperature = convertTemperature(35);
  println("Convertered temperature in F is "+temperature);
  //q3
  val volume = sphereVolume(5);
  println("Sphere volume is "+volume);
  //q4
  val cost = finalCost(60);
  println("Wholesale cost for books are "+cost);
  //q5
  val time = totalTime(2,3,2);
  println("Total running time is "+time);

 }

 // q1
def diskArea(r:Int):Double = math.Pi * r * r;
//q2
def convertTemperature(t:Int):Double = (t*1.8000)+32;
//q3
def sphereVolume(r:Int):Double = (4/3)*diskArea(r)*r;
//q4
def totalPrice(n:Int):Double = n * 24.95;
def discount(n:Int):Double = totalPrice(n) *0.4;
def shippingCost(n:Int):Double = if(n<=50) n*3 else 50*3 + (n-50)*0.75;
def finalCost(n:Int):Double = totalPrice(n) - discount(n) + shippingCost(n);

//q5
def easyPace(d:Int):Int = d * 8;
def tempo(d:Int):Int = d * 7;
def totalTime(d1:Int,d2:Int,d3:Int ):Int = easyPace(d1) + tempo(d2) + easyPace(d3);
}

