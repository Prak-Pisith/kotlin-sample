//////////////////////
// Abstraction

abstract class Shape {
    abstract fun draw()
    abstract fun area(): Double
}

class Circle(var radius: Double) : Shape() {
    override fun draw() {
        println("Drawing Circle")
    }

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(var length: Double, var breadth: Double) : Shape() {
    override fun draw() {
        println("Drawing Rectangle")
    }

    override fun area(): Double {
        return length * breadth
    }
}