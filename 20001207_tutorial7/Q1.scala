//to take negation of rational number
object Question1 extends App{

      // Rational class take two parameters as numerator and denominator
    class Rational(num:Int, deno:Int) {
        require(deno > 0, "denominator must be greater than 0") // prompt user if denominator is negative or zero
        
        // methods to get the denominator and numerator
        def numerator:Int = num
        def denominator:Int = deno
        
        // negation method
        def neg = new Rational(-this.numerator, this.denominator)  // new rational number with negative numerator
        override def toString(): String = numerator + "/" + denominator   //  override the toString method to print the number
    }
    
    //create object called x
    val x = new Rational(2,5)
    println(x.neg)
}