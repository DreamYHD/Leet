package kotlimTest

/**
 * Created by Administrator on 2017/10/11.
 */
object KotlinObjectTest{
    var Instance = this
}

fun main(args: Array<String>) {
    var  m = KotlinObjectTest.Instance
    println("m = ${m}")
    var  e = KotlinObjectTest.Instance
    println("e = ${e}")
}