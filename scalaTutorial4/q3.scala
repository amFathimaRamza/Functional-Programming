object Q3 extends App{

  println(formatNames("Benny")()(toUpper))
  println(formatNames("Niroshan")(0,1)(toUpper))
  println(formatNames("Saman")()(toLower))
  println(formatNames("Kumara")(5)(toUpper))

  def toUpper(x:String):String = x.toUpperCase()

  def toLower(y:String):String = y.toLowerCase()

  def formatNames(name:String)(numberIndex: Int*)(convertType: String => String):String = { //here we have multiple input parameter groups => numberIndex is a list 
    //check the list numberIndex empty or not
    if(numberIndex.isEmpty){
      return convertType(name) //higher order function.This will check the above to functions as their signatures matched
    }
    //string to catch the format string as name string is immutable
    var formattedString =""
    var i = 0
    // go through the list of Index numbers
    while(i < name.length()){
      //contains() => to check the whether an element is present in the list or not 
      if(numberIndex.contains(i)) formattedString += convertType(name.charAt(i).toString)//charAt(i)=> returns the ith index character
      else formattedString += name.charAt(i).toString
      i += 1 //used assignment operators 
    }
    formattedString
    
  }
}
