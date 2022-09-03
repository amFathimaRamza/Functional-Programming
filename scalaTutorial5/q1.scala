//Q1 and Q2
object prime extends App{
   def primeSeq(n:Int) : Unit={
        if(n>1){
            primeSeq(n-1);
            if (primeRecursive(n)) println(n);
        }
    }
  
  def primeRecursive(p:Int,i:Int=2):Boolean = i match {
    case x if (x==p) => true
    case x if GCD(p,x) >1 => false //prime no. GCD ==1
    case x => primeRecursive(p,i+1)
  }
  def GCD(x:Int,y:Int):Int = y match {
    case z if (z==0) => x
    case z if (z>x) => GCD(z,x)
    case _ => GCD(y,x%y)
  }
  println("Is 5 is prime number or not? => "+primeRecursive(5))
  println("Is 8 is prime number or not? => "+primeRecursive(8))
  println("Prime sequence => ")
  primeSeq(10)
}