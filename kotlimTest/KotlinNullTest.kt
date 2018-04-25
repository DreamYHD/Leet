package kotlimTest

/**
 * Created by Administrator on 2017/10/11.
 */
class KotlinNullTest{

}

fun main(args: Array<String>) {
    var a : String = "hello"
    //a = null  error
    var b : String ?= "world"
    b = null
    println(a.length)
    //println(b.length) error
    //1
    if (null != b){
        println(b.length)
    }
    //2
    println(b?.length)//如果为空的话返回null，其余的返回长度
    //3
    println(b!!.length)//肯定不为null 会出现空指针-+
    var  list = mutableListOf<String>("null")
    for ( i in list){
        i?.let {


        }
    }



}