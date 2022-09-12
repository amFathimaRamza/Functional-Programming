class Rational(x:Int, y:Int) {
    require(y > 0, "Denominator must be greater than 0")
    def numer = x
    def denom = y


    def add(that:Rational) = new Rational(this.numer*that.denom + this.denom*that.numer, this.denom*that.denom)
    def -(r:Rational) = this.add(r.neg)

    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer.toString + "/" + denom.toString
}
object Q1 extends App {
    val x = new Rational(1,4)
    val y = new Rational(4,5)
    val z = new Rational(1,6)

    println(x.neg)

    val sum = x.add(y)
    println(sum)

    val sub = x-y-z
    println(sub)
}



// class Rational(x:Int, y:Int){
//   require(y > 0, "Denominator must be >= 0");
//   private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
//   def numer = x/gcd(x,y);
//   def denom = y/gcd(x,y);
    // private def gcd(a: Int, b: Int): Int =
// if (b == 0) a else gcd(b, a % b)
// private val g = gcd(x, y)
// def numer = x / g
// def denom = y / g
 

//   def add(that:Rational) = new Rational(this.numer * that.denom + that.numer* this.denom, this.denom * that.denom);

//   def neg = new Rational(-this.numer,this.denom);

//   override def toString(): String = numer.toString + "/" + denom.toString
// }
// object q1 extends App{
  
//     val rationalNumber1 = new Rational(3,4);
//     val rationalNumber2 = new Rational(1,4);

//     println("negative of 1st rational no. => ");
//     println(rationalNumber1.neg);

//     val sum = rationalNumber1.add(rationalNumber2);
//     println("Addition of to rational numbers=> ");
//     println(sum);

// }
