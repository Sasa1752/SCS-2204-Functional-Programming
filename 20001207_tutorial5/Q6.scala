//print first n fibonacci numbers
object Question_6 extends App{

    //fuction to find fibonacci sequence
    def fibonacci(n:Int):Int= n match{
        case 1 =>0
        case 2 =>1
        case _ => fibonacci(n-1)+fibonacci(n-2)
    }

    //function to print fibonacci sequence
    def printfibonacci(n:Int):Unit={
       if(n>0){
            printfibonacci(n-1)
             print(fibonacci(n) + " ")
       }
        
    }

    printfibonacci(10)
     
}