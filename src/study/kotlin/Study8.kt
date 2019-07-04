package study.kotlin

fun main() {
    val a = 5
    val b = 7
    val max = if (a > b) a else b
    println(max)
    when (max){
        in 1..10 -> println("1부터 10 안에 포함된다")
        !in 10..20 -> println("10부터 20안에 포함되지 않는다")
        else -> print("해당되는게 없다")
    }

    val array = arrayOf(1,2,3,4,5)
    for(i in array){
        println("$i : ${array[i-1]}")
    }
    println()
    for((index, value) in array.withIndex()){
        println("$index : $value")
    }
}