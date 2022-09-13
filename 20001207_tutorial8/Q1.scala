//add(+) should add two given points
// move should move a point by a given distance dx and dy
// distance should return the distance between two given points
// invert should switch the x and y coordinates.

//create case class called point
case class Point(var x: Int, var y: Int) {

    //method to add two points
    def add(a:Point) = new Point(this.x + a.x, this.y + a.y)

    //method to move point in given distance
    def move(x:Int, y:Int):Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }

    //method to calculate distance between two points
    def distance(p:Point) : Double = {
        var xDist:Int = this.x - p.x
        var yDist:Int = this.y - p.y
        var dist: Int = xDist*xDist + yDist*yDist
        scala.math.sqrt(dist)
    }

    //method to switch x,y cordinates
    def invert() :Unit = {
        var temp = this.x
        this.x = this.y
        this.y = temp
    }

}

object Question1 extends App {

    //create objects
    var a = Point(1,2)
    var b = Point(4,10)

    println("Addition of two points:")
    println(a.add(b))

    println("\nMove point in given distance:")
    a.move(2, 4)
    println(a)      //now a=(3,6)
    
     println("\nDistance between two points:")
    var c = a.distance(b)
    println(c)

    println("\nSwitch x,y cordinates:")
    a.invert()
    println(a)
}