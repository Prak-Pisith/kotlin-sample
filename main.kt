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

}