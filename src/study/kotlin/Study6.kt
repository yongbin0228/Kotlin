package study.kotlin

fun main() {
    val array: Array<String> = arrayOf("C", "JAVA", "11")
    println(array.get(0))  // 3line == 4line
    println(array[0])
    println(array.size)

    val b = Array(5) { i -> i.toString() }
    for (d in b)
        print("$d ")
    println()
    val c = arrayOf(0, 1, 2, 3, 4)
    for (d in b)
        print("$d ")
    println()
    val x: IntArray = intArrayOf(1,2,3)
    x[0] = 7
    println(x[0])
    println(x.size)
}
//array