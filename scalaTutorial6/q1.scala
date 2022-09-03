import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine;

object ceaserCipher extends App{

  val alphabet = "abcdefghijklmnopqrstuvwxyz"

  val E = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toLower)+key)%a.size) //a=>alphabet
  //a.indexOf(c.toLower)+key => convert the text passed to lowercase and get the index of that character by using indexOf function and add the key value to it.
  //get the mod of that value by alphabet size =>returns the new position of the character
  //a(pos) => returns the new character

  val D = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toLower)-key+a.size)%a.size)
  
  val cipher = (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a)) //algo => signature function. _=> used to add any number of char
  
  var end: Boolean = false;

  while(!end)
  {
        print("\n-----------------MENU-----------------\n")
        print("Enter 'E' to encrypt.\n")
        print("Enter 'D' to decrypt.\n")
        print("Enter 'exit' to exit.\n")
        print("--------------------------------------\n")
        print("Choose an option: ")

        var selection: String = readLine()

        if(selection == "E"){
          print("Enter the text: => ")
          val text:String = readLine()

          print("Enter the key: => ")
          var key: Int = readInt()

          print("\n Encrypted text is: => ")
          print(cipher(E,text,key,alphabet)+"\n")

        }else if(selection == "D"){
           print("Enter the text: => ")
          val text:String = readLine()

          print("Enter the key: => ")
          var key: Int = readInt()

          print("\n Encrypted text is: => "+cipher(D,text,key,alphabet)+"\n")
          // print(")

        }else if(selection == "exit"){
          end = true
        }else{
          print("\n You have selected a wrong option...!\n")
        }
  }

} 