//Check number is prime or not
object Question_1 extends App{

    //function to find greatest common divisor
    def GCD(a:Int,b:Int):Int = b match{
        case 0 => a
        case x if x>a => GCD(x,a)
        case _ => GCD(b,a%b)
    }

    //function to check number is prime or not
    def prime(number:Int,n:Int=2): Boolean = n match {
        case x if(x==number)=>true
        case x if GCD(number,x)>1 =>false
        case x=>prime(number,x+1)
    }

    println(prime(5))
    println(prime(8))

    
}