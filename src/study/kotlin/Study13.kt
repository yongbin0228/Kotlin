package study.kotlin

fun getLength(obj: Any) = if (obj is String) obj.length else 0

fun sum(no: Int): Int{
    var sum = 0;
    for(i in 1..no){
        sum += i
    }
    return sum
}

fun cases(obj: Any): String{
    when(obj){
        1 -> return "One"
        "Hello" -> return "Greeting"
        is Long -> return "Long"
        !is String -> return "Not a string"
        else -> return "unknown"
    }
}
fun parseInt(str: String): Int?{
    return str.toIntOrNull()
}

fun main() {
    println(getLength(3))
    println(getLength("1032"))
    println(sum(100))
    println(cases(3))
    println(parseInt("213"))
    println(parseInt("asd"))
    val array = arrayOf("asd", 1, true, 31231)
    array[3] = "ㅁㄴㅇㄹ"
    println("array size is ${array.size}")
    var array1 = Array(3){0}
    println(array1[0])
    println(array1[1])
    println(array1[2])
    var array2 = arrayOfNulls<Any>(3)
    println(array2[0])
    val array3:MutableList<String> = mutableListOf("hello", "world")
    val array4:ArrayList<String> = ArrayList()
    array4.add("asd")
    val array5 = mapOf(Pair("one", "hello"), "two" to "kkang")
    println(array5["one"])

}
