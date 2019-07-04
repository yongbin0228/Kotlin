package study.kotlin2

fun main() {
    val list = listOf("Hello","Kotlin")
    val sb = StringBuffer();
    for(str in list){
        sb.append(str)
    }
    println(sb)

    val list1 = listOf("Hello", "Kotlin", "Hi")
    for((index, value) in list1.withIndex()){
        println("$index -> $value")
    }

}