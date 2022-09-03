import scala.io.StdIn.readInt;

object q6 extends App{
    def fib(n : Int) : Int = n match{
        case n if n == 0 => 0;
        case n if n == 1 => 1;
        case _ => fib(n - 1) + fib(n- 2);
    }
    def fibSeq(x:Int):Unit= {
        if (x > 0) fibSeq(x - 1);
        println(fib(x));
    }

    print("Input a value to get fibonacci sequence :");
    var value = readInt();
    fibSeq(value);
}