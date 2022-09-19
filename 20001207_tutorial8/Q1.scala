//add(+) should add two given points
// move should move a point by a given distance dx and dy
// distance should return the distance between two given points
// invert should switch the x and y coordinates.

// encapulates methods
trait Operators{
    def +(p:Point):Point
    def -(p:Point):Point
}

//create case class called point extends with traits
case class Point(x: Int, y: Int) extends Operators {

     // overrride the methods in the trait
    override def +(p: Point):Point = Point(x + p.x, y + p.y)
    override def -(p: Point):Point = Point(x - p.x, y - p.y)

    //method to move point in given distance
    def move(dx: Int,dy: Int):Point = Point(x+dx, y+dy)

     //method to calculate distance between two points using pythagores theorem
    def distance(p: Point): Double = scala.math.sqrt(scala.math.pow((this.x-p.x).abs,2)+scala.math.pow((this.y-p.y).abs,2))

    //method to switch x,y cordinates
    def invert = Point(this.y,this.x)
    
}

object Question1 extends App{

    //create objects
    val a = Point(3,4)
    val b = a.copy(x=5,y=6)
    
    println("Creating two points")
    println("a = "+a)
    println("b = "+b)
    
    print("\nAddition of two points : ")
    println(a+b)
    
    print("\nMove point a by 1 : ")
    println(a.move(1,1))
    
    print("\nDistant of two points : ")
    println(a.distance(b))
    
    print("\nInvert of point a : ")
    println(a.invert)
}