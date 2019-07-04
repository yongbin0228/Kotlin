package study.kotlin

fun main() {
    println(describe(1))
    println(describe("Hello"))
    println(describe(12312L))
    println(describe("asd"))
    println(describe('a'))
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }
//When Expression