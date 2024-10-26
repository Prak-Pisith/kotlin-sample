////////////////////////////

// Inheritance in Kotlin

// All Classes are final by default, so we need to use open keyword to make it inheritable
open class Animal (var name: String = "Animal", var color: String = "Black") {
    open fun makeSound() {
        println("Animal is making a sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Dog is barking, woof woof")
    }
}