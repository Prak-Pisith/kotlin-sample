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

}

// Data Classes
data class Persona(val name: String, val age: Int)

// Coroutines for Asynchronous Programming
suspend fun fetchUserData() {
    coroutineScope {
        val user = async { fetchUser() }
        val profile = async { fetchProfile() }
        processData(user.await(), profile.await())
    }
}