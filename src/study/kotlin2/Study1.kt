package study.kotlin2

fun main() {
    val a = 5
    if (a < 10) println("$a < 10")
    if (a > 0 && a <= 10) {
        println("0 < $a <= 10")
    } else if (a > 10 && a <= 20) {
        println("10 < $a <= 20")
    } else {
        println("$a > 20")
    }

    val b = if(a>5) "hello" else "hello"
    println(b)

    val c = if(a>5){
        println("asdf")
        3+4
    }else{
        println("asdff")
        4+3
    }

    val a2 = 1
    when (a2){
        1 -> println("1")
        2 -> println("2")
        else -> {
            println("not")
        }
    }

    val list = listOf("hello", "hi", "hihi")
    val array = arrayOf("hello", "heeello", "hell ro")
    val data = "hello"
    when(data){
        in list -> println("$data in list")
        in array -> println("$data in array")
    }
    testWhen(3)

    when{
        a>5 -> println("asd")
    }
}

fun testWhen(data: Any){
    when(data){
        1 -> println("1")
        "hello" -> println("hi~")
        is String -> println("is String")
    }
}