package study.kotlin2

class User(test: String) {

    constructor(test: String, age: Int) : this(test) {
        println("test2 : $test, age: $age")
    }

    init {
        println(test)
    }

    var name: String? = null
        get() = field
        set(value) {
            field = value
        }

    val age = 20
        get() = field

}

fun main() {
    val user = User("testt")
    val user2 = User("testt", 1234)

    user.name = "test"
    user2.name = "asdf"
    println("name : ${user.name}")
    println("age : ${user.age}")
    println("name : ${user2.name}")
    println("age : ${user2.age}")
}
