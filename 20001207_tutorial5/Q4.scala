//Determine even and odd numbers
object Question_4 extends App{
    
    //function to determine number is even
    def isEven(n:Int):Boolean = n match{
        case 0 => true
        case _ => isOdd(n-1)
    }
    //function to determine number is odd
    def isOdd(n:Int):Boolean = !(isEven(n))
        
    println(isEven(5))
    println(isOdd(9))
}