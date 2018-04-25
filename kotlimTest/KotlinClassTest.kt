package kotlimTest

/**
 * Created by Administrator on 2017/10/9.
 */

class KotlinClassTest(name: String, age: Int) {
    //如果主构造函数没有注解或者可见性修饰 可以省略constructor
    var name: String = name
        get() = field
        set(value) {
            field = value
        }
    var height: Double? = null
        get() = field
        set(value) {
            field = value
        }
    var age: Int = age
        get() = field
        set(value) {
            field = value
        }

    //主构造函数
    init {
        println("helloworld")
    }

    constructor(name: String, age: Int, height: Double) : this(name, age) {
        println("helloworld")
    }

    override fun toString(): String = "name is ${name} height is ${height} age is ${age}"

}

fun main(args: Array<String>) {
    var kotlinClass = kotlimTest.KotlinClassTest("yhd", 12)
    println("kotlinclass name = ${kotlinClass.name} age = ${kotlinClass.age}")
    kotlinClass.toString()
    var kotlinClass2 = kotlimTest.KotlinClassTest("yhd", 123, 23.32)
    println("kotlinClass = name is ${kotlinClass2.name} age = ${kotlinClass2.age} height = ${kotlinClass2.height}")
    kotlinClass2.toString()
    var array = ArrayList<String>()
    array.add("1")
    array.add("2")
    array.add("3")
    array.forEach {
        when (it) {
            "1" -> println("yes")
            "2" -> println("yes")
            "3" -> println("yes")
            else -> println("null")

        }
    }

}
