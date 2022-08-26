//Calculate addition of even numbers less than n
object Question_5 extends App{
    
    //function to determine number is even
    def isEven(n:Int):Boolean = n match{
        case 0 => true
        case _ => isOdd(n-1)
    }
    //function to determine number is odd
    def isOdd(n:Int):Boolean = !(isEven(n))

    //function to calculate addition of even numbers less than n
    def SumEven(n:Int):Int= n match{
        case 0=>0
        case x if (isEven(x)==true) => x + SumEven(x-1)
        case x => SumEven(x-1)
    }
        
    print(SumEven(5))
}