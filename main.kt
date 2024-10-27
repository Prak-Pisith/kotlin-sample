fun main(args: Array<String>) {
    println("Hello, World!")

    // Null Safety
    var nonNullString: String = "This is a non-null string"
    var nullableString: String? = null

    // Safe Call Operator
    println(nonNullString.length)
    println(nullableString?.length)

    // Elvis Operator
    var length = nullableString?.length ?: 0
    println(length)

    // Extension Functions
    fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)
    fun String.addExclamation(): String = this + "!"

    var normalString = "Hello, World"
    println(normalString.addExclamation())
    println(normalString.removeFirstLastChar())


    // Data Classes
    val person = Persona("John", 25)
    println(person)
    val person2 = person.copy(name = "Jane")
    println(person2)

    // When Expression
    println(describe(1))
    println(describe(5))
    println(describe("Hello"))
    println(describe(1000L))


    // Range Expressions
    for (i in 1..10) { println(i) }        // Inclusive
    for (i in 1 until 10) { println(i) }   // Exclusive
    for (i in 10 downTo 1) { println(i) }  // Descending


    // Function Type and Lambda Expressions
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println(sum(5, 10))
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    numbers.filter { it % 2 == 0 }.forEach { println(it) }

}

// Data Classes
data class Persona(val name: String, val age: Int)

// Coroutines for Asynchronous Programming
// suspend fun fetchUserData() {
//     coroutineScope {
//         val user = async { fetchUser() }
//         val profile = async { fetchProfile() }
//         processData(user.await(), profile.await())
//     }
// }

// Properties
class Rectangles {

    var width: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    var height: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    val isSquare: Boolean
        get() = width == height
}

// Object Declaration (singleton)
object Singleton {
    fun doSomething() {
        println("Do something")
    }
}
object DatabaseConfig {
    val url = "jdbc:mysql://localhost:3306/mydb"
    val driver = "com.mysql.jdbc.Driver"
    val username = "root"
    val password = "password"
    fun connect() {
        println("Connecting to database...")
    }
}

// Companion Objects
class MyFactory {
    companion object {
        fun create(): MyFactory = MyFactory()
    }
}
// Usage
val myFactory = MyFactory.create()

// When Expression
fun describe(obj: Any): String {
    return when (obj) {
        1 -> "One"
        2 -> "Two"
        in 3..10 -> "Between 3 and 10"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }
}

// Sealed Classes
sealed class Result {
    data class Success(val message: String) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
}

// Delegation
interface Base {
    fun doSomething()
}   

class BaseImpl : Base {
    override fun doSomething() {
        println("Do something")
    }
}

class Derived(base: Base) : Base by base
