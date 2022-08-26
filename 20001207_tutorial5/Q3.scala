//Returns the additon of numbers from 1 to n
object Question_3 extends App{
    
    //function to calculate addition
    def sum(n:Int):Int = n match {
        case x if(x>1)=> x+sum(x-1)
        case x => x 
    }

    println(sum(5))
}