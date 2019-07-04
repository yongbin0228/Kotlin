package study.kotlin

fun main() {
    val x = "11"
    println(x[0])
    println(x.length)

    for(c in x){
        println(c)
    }
    val s = "Hello, 11!\n"
    println(s)
    val ss = """"이것은 코틀린의 
        |rawString"입
        |니
        |
        |다""".trimMargin()
    println(ss)
}