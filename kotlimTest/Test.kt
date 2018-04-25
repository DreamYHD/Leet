package kotlimTest

/**
 * Created by Administrator on 2017/9/25.
 */
val FINAL_NUM = 4
var a_num = 6
fun test(a :Int, b :Int){
    println("$a+$b=${a+b}")
}
fun main(args: Array<String>) {
    kotlimTest.a_num = 11
    println("hello")
    println(kotlimTest.FINAL_NUM)
    println(kotlimTest.a_num)
    kotlimTest.test(FINAL_NUM, FINAL_NUM)
}