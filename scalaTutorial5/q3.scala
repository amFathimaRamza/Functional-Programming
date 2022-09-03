//Q3
import scala.io.StdIn.readInt;

object printSum extends App {
    var total:Int = 0;
    def sum(x:Int): Unit={
        total = total + x; 
        if(x>0) sum(x - 1);
        else print(total); 
    }

    print("Input a value to get the sum: ");
    var value = readInt();
    sum(value);
}