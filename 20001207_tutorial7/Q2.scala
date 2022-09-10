//Substract two rational numbers
object Question2 extends App{

    // Rational class with addition method,simplify method and - operator
    class Rational(num:Int, deno:Int) {
        require(deno > 0, "denominator must be greater than 0")
        def numerator:Int = num
        def denominator:Int = deno

        // if the rational number can further simplify then simplify
        def simplify = this.numerator match{
            case x if(x>=0) => new Rational(this.numerator.abs/gcd(this.numerator.abs,this.denominator.abs),this.denominator.abs/gcd(this.numerator.abs,this.denominator.abs))
            case x if(x<0) => new Rational(this.numerator.abs/gcd(this.numerator.abs,this.denominator.abs),this.denominator.abs/gcd(this.numerator.abs,this.denominator.abs)).neg
        }

        // new rational number with numerator and denominator as below
        // new numerator = first.numerator x second.denominator + first.denominator x second.numerator
        // new denominator = first.denominator x second.denominator
        // affter adding simplify the result using  above simplify method
        def add(r:Rational) = (new Rational(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)).simplify

        def neg = new Rational(-this.numerator, this.denominator)

        override def toString(): String = numerator + "/" + denominator

        // minus operator on a object
        def -(r:Rational) = this.add(r.neg)
    }

    // gcd method to simplify rational numbers further
    def gcd(a: Int,b: Int): Int = {
       if(b ==0) a else gcd(b, a%b)
    }

    //create objects
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
  
    val a = x-y-z
    
    println(a)
}