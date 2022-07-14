//Question 4

object Question_4 extends App{
    val cover_price = 24.95     //cover page price

    //fuction to calculate shipping cost
    def cal_shipping_cost(no_of_copy:Int):Double={
        //check no of copies less than 50 or not and calculate shipping cost
        //  Shipping cost of first 50 copies = Rs3.00
        if(no_of_copy<=50){
             3.00
        }
        else{
             3.00+0.75*(no_of_copy-50)
        }
    }

    //calculate discount
    def cal_discount(no_of_copy:Int):Double={
        no_of_copy*cover_price*0.40      
    }

    //function to calculate wholesale cost
    def cal_wholesale_cost(no_of_copy:Int):Unit={
        //calculate wholesale cost
        var wholesale_cost = (no_of_copy*cover_price)-cal_discount(no_of_copy)+cal_shipping_cost(no_of_copy)
        println("Total wholesale cost of "+no_of_copy+" copies: "+wholesale_cost)
    }
    
    //call the function
    cal_wholesale_cost(60)
}