////////////////////////////////////
// Class & Object

class Person(
    val name: String,
    var age: Int
)

val person = Person("John", 25)
person.toString() // Person(name=John, age=25)