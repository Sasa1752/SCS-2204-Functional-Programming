//Question 5

object Question_5 extends App{

    //function to calculate total time
    def total_time(easypace_duration:Int,Tempo_duration:Int):Unit={
        //calculate total time
        var Total_duration = easypace_duration*8 + Tempo_duration*7
        println("Total running time: "+Total_duration+" minutes")


    }
    
    //call function
    println("Enter easy pase time:")
    var easypace=scala.io.StdIn.readInt()
    println("Enter Tempo time:")
    var Tempo= scala.io.StdIn.readInt()
    
    total_time(easypace,Tempo)
}