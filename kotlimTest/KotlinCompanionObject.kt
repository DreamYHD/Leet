package kotlimTest

/**
 * Created by Administrator on 2017/10/11.
 */

class KotlinCompanionObject{
    companion object{
        val a : String = "hello"
        val b : String = "world"

    }
    inner class son{
        fun str() = a

    }
}

fun main(args: Array<String>) {
    println(KotlinCompanionObject.a)
    println(KotlinCompanionObject.b)
    println()
}