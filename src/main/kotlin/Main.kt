import kotlin.math.pow
import kotlin.math.sqrt

interface Figure3d{
    fun GetVolume(): Double
    fun GetArea(): Double
}

class Cube(var edgeLength: Double):Figure3d{
    override fun GetVolume(): Double {
        return edgeLength.pow(3)
    }

    override fun GetArea(): Double {
        return 6 * (edgeLength.pow(2))
    }
}

class Cylinder(var radius: Double, var height: Double):Figure3d{
    override fun GetArea(): Double {
        return 2 * (Math.PI * radius.pow(2)) + 2 * Math.PI * radius * height
    }

    override fun GetVolume(): Double {
        return Math.PI * radius.pow(2) * height
    }
}

class RectangularParallelepiped(var length:Double, var height: Double, var width:Double,):Figure3d{
    override fun GetArea(): Double {
        return 2 * (length+height) + 2*(length+width) + 2*(height*width)
    }

    override fun GetVolume(): Double {
        return length * height * width
    }
}
class Plane(var A:Double,var B:Double,var C:Double) {


    fun Angle(Object: Plane): Double {
        return (A * (Object.A) + B * (Object.B) + C * (Object.C)) / (sqrt(A.pow(2) + B.pow(2) + C.pow(2)) * sqrt(
            Object.A.pow(2) + Object.B.pow(2) + Object.C.pow(2)
        ))
    }
}


fun main() {
var cu = Cube(3.0)
    var cy = Cylinder(5.0, 2.0)
    var r = RectangularParallelepiped(2.0, 1.0, 3.0)
    println(cu.GetArea())
    println(cu.GetVolume())
    println(cy.GetArea())
    println(cy.GetVolume())
    println(r.GetVolume())
    println(r.GetArea() )



    fun SumOfVolumes(x:Double = cu.GetVolume(),y:Double= cy.GetVolume(),z:Double = r.GetVolume()): Double {
        return x + y + z
    }
    println(SumOfVolumes())


    var plane1 = Plane(1.0,3.0,5.0)
    var plane2 = Plane(2.0,3.0,5.0)
    println(plane1.Angle(plane2))

}