package study.kotlin

fun main() {
    val items = listOf("apple", "banana", "kiwi")
    for(item in items)
        println(item)

    when{
        "orange" in items -> println("have orange")
        "apple" in items -> println("have apple")
    }
    
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map{it.toUpperCase()}
        .forEach { println(it) }

}
//Collections with When
//lambda in Collection
