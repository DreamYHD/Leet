package kotlimTest

/**
 * Created by Administrator on 2017/10/23.
 */
class Book<T,S>(var name: T,var age: S){
    override fun toString(): String  =
            "name is ${name} age is ${age}"
}

fun main(args: Array<String>) {

    var  book = Book<String,Int>("yhd",10)
    book.toString()



}