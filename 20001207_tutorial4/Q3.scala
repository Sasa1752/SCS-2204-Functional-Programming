//Question 3
//format names uppercase and lowercase
object Question_3 extends App{

    //function to convert lowercase to uppercase
    def toUpper(str:String):String={
        str.toUpperCase()
    }

     //function to convert uppercase to lowercase
    def toLower(str:String):String={
        str.toLowerCase()
    }

    //function to format string
   def formatNames(name: String, index: Array[Int], func: (String) => String): String = {
        
        //check index array is empty or not ,if empty then return whole string after given conversion as final string
        if(index.isEmpty){
            func(name)
        }
        //else Index array is not empty
        else{
            var temp = ""         //declare variable temp and assign empty string ,to store final string(name) after all conversions

            //search given indecies are in the name string
            for( i <- 0 to name.length()-1){
                //if i value is in the index array then add to temp variable after did the conversion
                if(index.contains(i)){
                    temp= temp + func(name.charAt(i).toString())
                }
                //else i value is not in the index array then add to temp variable without changing
                else{
                    temp= temp + name.charAt(i).toString()
                } 
            }

            temp       //return the final string after did every changes
        }
    }

    //print outputs using formatNames function
    println("Output:")
    println(formatNames("Benny",Array(),toUpper(_)))
    println(formatNames("Niroshan",Array(0,1),toUpper(_)))
    println(formatNames("Saman",Array(),toLower(_)))
    println(formatNames("Kumara",Array(5),toUpper(_)))


}