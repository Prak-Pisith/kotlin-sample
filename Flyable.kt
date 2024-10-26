////////////////////
// Interface

interface Flyable {
    val maxAltitude: Double
    fun fly()
}

class Bird : Flyable {

    override val maxAltitude: Double = 1000.0

    override fun fly() { 
        println("Bird is flying with max altitude of $maxAltitude")
    }
    
}

