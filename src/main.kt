fun main() {
    var userOption: Int = 0
    var userShape: String =""
    var userArea: Double = 0.0

    do {
        println("1: Triangle")
        println("2: Rectangle")
        println("3: Circle")
        println("4: Trapezoid")
        println("5: Exit")
        print("Please enter shape number: ")
        userOption = readLine()!!.toInt()
        if (userOption < 1 || userOption > 5)
            println("Please enter a number between 1 and 5")
    } while (userOption < 1 || userOption > 5)

    if (userOption >= 1 && userOption < 5) {
        when (userOption) {
            1 -> {
                userArea = triangleArea()
                userShape = "triangle"
            }
            2 -> {
                userArea = rectangleArea()
                userShape = "rectangle"
            }
            3 -> {
                userArea = circleArea()
                userShape = "circle"
            }
            4 -> {
                userArea = trapezoidArea()
                userShape = "trapezoid"
            }

        }
        println("You have chosen the following shape: ${userShape.toUpperCase()}")
        println("Your $userShape has as area of $userArea square units")
    }
    else
    println("You have chosen to EXIT")
}
fun triangleArea(): Double{
    var base = 0.0
    var height = 0.0
    println("What is the BASE of your triangle")
    base = readLine()!!.toDouble()
    println("What is the HEIGHT of your triangle")
    height = readLine()!!.toDouble()

    return (base*height)/2
}
fun rectangleArea(): Double{
    var base = 0.0
    var height = 0.0
    println("What is the BASE of your rectangle")
    base = readLine()!!.toDouble()
    println("What is the HEIGHT of your rectangle")
    height = readLine()!!.toDouble()

    return (base*height)
}
fun circleArea(): Double{
    var radius = 0.0
    println("What is the RADIUS of your circle")
    radius = readLine()!!.toDouble()

    return (3.14)*radius*radius
}
fun trapezoidArea(): Double {
    var base1 = 0.0
    var base2 = 0.0
    var height = 0.0
    println("What is Height of your trapezoid")
    height = readLine()!!.toDouble()
    println("What is FIRST BASE of your trapezoid")
    base1 = readLine()!!.toDouble()
    println("What is SECOND BASE of your trapezoid")
    base2 = readLine()!!.toDouble()

    return (base1+base2)/2.0
}


