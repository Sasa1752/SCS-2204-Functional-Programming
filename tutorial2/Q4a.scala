//Question 4
object Question4 extends App{
    //calculate total salary according to normal hours and OT hours
    def total_salary(NH:Int,OTH:Int):Int={
            (NH*250+ OTH*85)
     }
     //calculate tax amount according to total salary
     def tax (salary:Int):Int={
        (salary*.12).toInt
    }
    //calculate take home salary 
    def take_home_salary(NH:Int,OTH:Int):Int={
        total_salary(NH,OTH)-tax(total_salary(NH,OTH))
        
        
    }
    printf("Take Home Salary: %d",take_home_salary(40,30))
    

}