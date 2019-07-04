package study.kotlin

fun main() {
    loop@ for (i in 1..10) {
        println("--- i: $i ---")
        for (j in 1..10) {
            println("j : $j")
            if (i + j > 12) {
                break@loop
            }
        }
    }
    println(foo())

}

//fun foo() {
//    val ints = listOf(0, 1, 2, 3)
//
//    ints.forEach label@{
//        if(it==1) return@label
//        print(it)
//    }
//    print("End")
//}
//label 을 안쓰면 함수가 끝나서 0만 출력
//fun foo() {
//    val ints = listOf(0, 1, 2, 3)
//
//    ints.forEach {
//        if(it==1) return@forEach
//        print(it)
//    }
//    print("End")
//}
// ?? 이름과 같아서 @forEach 를 사용하면 람다만 종료가능
fun foo():List<String> {
    val ints = listOf(0, 1, 2, 3)
    return ints.map {
        if(it == 0){
            return@map "zero"
        }
        "number $it"
    }
    }