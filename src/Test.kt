fun main() {
    val a = 1
    println("Hello World")
    my(3,4)
    printKotlin()
    println(a)
    var x = 5
    x += 2
    println(x)
    val b = "asdf"
    println(b)

    val c = "$b, wow it's $a"
    println(c)
}
fun my(a:Int, b:Int) = a+b
fun printKotlin(){
    println("hello kotlin")
}