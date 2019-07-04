package study.kotlin2

import java.util.Arrays.asList

fun main() {
    val list = listOf("Hello", "Kotlin")
    val sb = StringBuffer();
    for (str in list) {
        sb.append(str)
    }
    println(sb)

    val list1 = listOf("Hello", "Kotlin", "Hi")
    for ((index, value) in list1.withIndex()) {
        println("$index -> $value")
    }

    label@ for (i in 1..10) {
        for (j in 1..10) {
            print("($i, $j) ")
            if (i == 5 && j == 5)
                break@label
        }
        println()
    }
    println()
    val a = arrayOf("Hello", "Kotlin", "I", "am", "JAVA")
    some(*a)

    val array1 = arrayOf(10, 20, 30)

    val list2 = asList(1, 2, *array1, 120, 200)
    list2.forEach{ println(it) }
}

fun some(vararg a: String) {
    val i = a.iterator();
    while (i.hasNext()) {
        println(i.next())
    }
}
