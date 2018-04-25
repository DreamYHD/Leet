package kotlimTest

/**
 * Created by Administrator on 2017/10/11.
 */
open class BaseClass(p : Int ){

    open fun say(){

    }

    //标记为 override 的成员本⾝是开放的，也就是说，它可以在⼦类中覆盖。如果你想禁⽌再次覆盖，使⽤ final 关键zi
    open fun  eat(){

    }
}

fun main(args: Array<String>) {
    val  book = object : BookInter {
        override fun say() {
            println("hello book1")
        }
    }
    val book2 = object :BookInter{
        override fun say() {
            print("hello book2")
        }
    }
    book.say()
    book2.say()
}