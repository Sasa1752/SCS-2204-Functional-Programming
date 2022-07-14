//Question 3

object  Question_3 extends App{

    //funtion to calculate volume of a sphere
    def volume_of_sphere(radius:Int):Unit={
        //calculation of volume of a sphere
        var volume = (4.0/3.0)*math.Pi*radius*radius*radius
        println("Volume of sphere with radius "+radius+" : "+volume)
    }

    //call function
    volume_of_sphere(5)
}