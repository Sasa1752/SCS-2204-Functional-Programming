//Question 2
//check number negative/zero or odd/even
object Question_2 extends App{

    //take input number
    printf("Enter the number:")
    var input = scala.io.StdIn.readInt();

    //function for check number
    def check_number(number:Int):Unit = number match{
        case x if x<=0 => println("Number is Negative/Zero.")   //if number is negative or zero
        case x if x%2==0 => println("Number is Even.")          //if number is even
        case x =>println("Number is Odd.")                      //if number is odd
    }

    //call function for given input
    check_number(input)

}

