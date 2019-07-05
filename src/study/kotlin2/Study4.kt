package study.kotlin2

//override

class AA:Tool(){
    override fun print() {
        println("Hi I'm AA")
    }
}

class BB:Tool(){
    override fun print(){
        println("Hi I'm BB")
    }
}

open class Tool{
    open fun print(){
        println("Hi I'm Tool")
    }
}

fun main() {
    val t = Tool()
    t.print()
    val a = AA()
    a.print()
    val b = BB()
    b.print()
}