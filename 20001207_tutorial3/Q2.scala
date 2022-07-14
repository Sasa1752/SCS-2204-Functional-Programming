//Question 2

object Question_2 extends App{

    //function to convert celsius to fahrenheit
    def celsius_to_fahrenheit(temp:Int):Unit={
        //convert celsius to fahrenheit
        var F_temp = temp*1.8000 + 32.00
        println("Temperature "+ temp +" Celsius: "+F_temp+" Fahrenheit")
    }

    //call function
    celsius_to_fahrenheit(35)

}