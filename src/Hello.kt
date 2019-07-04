fun main() {
    println("Hello 11")
    val a = "Bad 11"
    println("It is ${a.replace("Bad","Good")}")
    println(maxOf(4,6))
    println(getStringLength(31213))
    println(getStringLength("asdasd"))
}
fun maxOf(a:Int, b:Int) = if(a>b) a else b
fun getStringLength(obj:Any): Int?{
    if(obj is String)
        return obj.length
    return null
}