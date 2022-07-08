
//Question 4(b)
object Question_4a extends App{

    //calculate no of attendees
    def attendees(price:Int):Int={
        (120+((15-price)/5)*20)
    }
    //calculate the income related to the price and attendence
    def income(price:Int):Int={
        (price*attendees(price))
    }
    //calculate the cost related to the price and attendence
    def cost(price:Int):Int={
        (500+attendees(price)*3)
    }
    //calculate the profit related to the price and attendence
    def profit(price:Int):Int={
        (income(price)-cost(price))
    }

    printf("Profits:\n price:15 = %d \n price:10 = %d\n price:20 = %d",profit(15),profit(10),profit(20))
   

}