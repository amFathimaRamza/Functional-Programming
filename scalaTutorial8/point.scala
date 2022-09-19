import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

case class Point(x:Int, y:Int){

  //to add 2 points
  def +(p:Point):Point = Point(p.x + this.x, p.y + this.y)
    
  //to move a point by given distance
  def move(d1:Int ,d2:Int):Point = Point(this.x + d1, this.y + d2)

  //distance between 2 points 

  def distance(p:Point):Double = scala.math.sqrt((scala.math.pow((p.x - this.x),2) + scala.math.pow((p.y - this.y),2) ))

  //to switch x,y coordinates
  def invert():Point = Point(this.y, this.x)
}

object q1 extends App{

  val a = Point(0,0)
  val b = Point(0,10)

  val add = a+b //def +
  val mov = a.move(2,2)
  val dist = a.distance(b)
  val switch = a.invert()

  println("Addition of points a and b: " + add)
  println("Moved a: " + mov)
  println("Distance between a and b: " + dist)
  println("Inverted a: " + switch)

}
