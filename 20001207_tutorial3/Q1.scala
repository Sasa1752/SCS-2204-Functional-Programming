//Question 1

object Question_1 extends App{

    //function to calculate area of disk
    def area_of_disk(radius:Int):Unit={
        //calculate area of disk
        var area = radius*radius*math.Pi
        println("Area of a disk with radius "+radius+" : "+area)
    }

    //call function
    area_of_disk(5)

}