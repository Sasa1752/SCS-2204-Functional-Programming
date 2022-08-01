//Question 1
//Calculate interest of given amount
object Question1 extends App{

    //function for calculate interest
     def interest(amt:Double):Unit= amt match{
        case x if x<=20000 =>println("Interest:"   + x*0.02)      //if amount less than or equal 20000 interest 2%
        case x if x<=200000 =>println("Interest:"  + x*0.04)      //if amount less than or equal 200000 interest 4%
        case x if x<=2000000 =>println("Interest:" + x*0.035)     //if amount less than or equal 2000000 interest 3.5%
        case x if x>=2000000 =>println("Interest:" + x*0.065)     //if amount grater than or equal 20000000 interest 6.5%
     }

     //take amount as input
     printf("Enter the amount:")
     var amount=scala.io.StdIn.readDouble()

     //call function for thtese amounts
     interest(amount)

}

