package kotlimTest

import javax.swing.ImageIcon

/**
 * Created by Administrator on 2017/10/9.
 */

class KotlinListTest {




}
fun <T>MutableList<T>.swap(index1 : Int , index2 : Int){
    var  temp : T
    temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}
fun main(args: Array<String>) {

    //Lisy
    var list = listOf(1, 2, 3, 4)
    list.filter {
        i ->
        i > 3
    }
    .forEach {
        println(it)
    }
    //MutableList
    val listMutable = mutableListOf<String>()
    listMutable
    listMutable.add("hello")
    listMutable.add("android")
    listMutable.add("lab")
    listMutable.forEach { println(it) }
    listMutable.swap(1,2)
    listMutable.forEach { println(it) }


    var  listM = listMutable.toList()
    listM.forEach{ println("it = ${it}")}

    //map
    val mapMutable = mutableMapOf<Int,String>()
    mapMutable.put(1,"hello")
    mapMutable.put(2,"world")
    mapMutable.forEach { t, u -> println("t = ${t} u = ${u}")  }

    //arrayList
    val  arrayList = ArrayList<String>()
    arrayList.add("hello")
    arrayList.add("world")
    arrayList.add("everyone")
    for ( i in 0 until 3){
        println("i = ${i} = ${arrayList[i]}")
    }
    arrayList.remove("hello")
    arrayList.isEmpty()
    //any如果集合中至少有一个元素与指定条件相符，则返回true;否则,返回false.在any的函数体内，指定判断元素的条件。
    var isTrue1 = arrayList.any { it == "hello" }
    println(isTrue1)
    //all如果集合中所有元素与指定条件相符，则返回true;否则,返回false.在all的函数体内，指定判断元素的条件。
    var isTrue2 =  arrayList.all { it is String }
    println(isTrue2)
    //count返回集合与指定条件相符的元素个数。在count的函数体内，指定判断元素的条件。若不指定条件，返回集合中所有元素的个数
    var count = arrayList.count { it ==  "hello"}
    println(count)
    //fold 将对集合从第一个到最后一个元素的操作结果进行累加，并加上初始值。
    arrayList.forEachIndexed { index, s -> println("index = ${index}")}





}

