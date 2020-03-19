var f: String = "pulkit"

//Late Initialization

val g: String = "Pulkit"

//It works on vararg
/*
[vararg]: It tells that you can n numbers of argument inside any function
 */

val numbers = arrayOf(1, 2, 3, 4, 5)
val name = arrayOf("1", "2", "3", "4", 5) //We haven't given any type to array
val nameString = arrayOf<String>("1", "2", "3", "4", "5", "6")

val num = Array(6, { i -> i * 1 })

val numArray = intArrayOf(1)

val nullArray = arrayOfNulls<String>(10)

// 0 1 2 3 4 5

//Lists or Collections
var listOfNames = listOf<String>("Hello", "World", "Pulkit")
var mutableListOfNames = mutableListOf<String>("Hello", "World", "Pulkit")
var mutableArrayListOfNames = arrayListOf<String>("Hello", "World", "Pulkit")
val mapOfNames = mapOf("name" to "Pulkit", 1 to 20, "Nationality" to "Indian")
val hasMapOfNames = hashMapOf("name" to "Pulkit", 1 to 20, "Nationality" to "Indian")

fun main() {
    val size: Int = f?.length ?: 0
    val a: String = "Hello World"
    val b: Int = 10
    val c: Boolean = false
    val d: Float = 10.0F
    val e: Double = 10.9
    println("This is " + f.capitalize() + "Aggarwal with name length as ${f.length}")
    println(num[4])
    println(nameString.get(4))
    mutableListOfNames.add("Aggarwal")

    println(mapOfNames["age"])
    hasMapOfNames["Work"] = "Coding Blocks"
    hasMapOfNames.forEach { any, any2 ->
        println("" + any + any2)
    }

    mutableArrayListOfNames.forEach {
        println(it)
    }

    numArray.forEach {
        println("Traditional for Loop")
        println(it)
    }
    for (name in numArray) {
        print(name)
    }
    for (x in 0..10) {
        //10 is inclusive
        println(x)
    }

    for (x in 0 until 10) {
        //10 is exclusive
        println(x)
    }

    for (x in 0 until 10 step 2) {
        //10 is exclusive
        println(x)
    }

    for (x in 10 downTo 0 step 2) {
        //10 is exclusive
        println(x)
    }

    val any: Any = ""
//    val bAny: String = any as String
    if (any is String) {
        any.length
    }
    val x = when (any) {
        "Aggarwal" -> "Pulkit $any"
        "Pulkit" -> "$any Aggarwal"
        "Name" -> "$any is Pulkit Aggarwal"
        else -> "Not a valid Name"
    }
    println(x)


}