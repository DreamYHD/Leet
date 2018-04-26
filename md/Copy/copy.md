### 概念介绍
对象拷贝就是将一个对象的属性拷贝到另一个具有相同类类型的对象中去。java中有三种常见对象拷贝类型：浅拷贝，深拷贝，延迟拷贝

### 浅拷贝
#### 概念
浅拷贝是按位拷贝，他会创建一个新对象，这个对象和原始对象有着一样的属性值。如果属性是基本类型，拷贝的就是基本类型的值，如果是内存地址(引用类型)，拷贝的就是内存地址，因此如果其中一个对象改变了这个地址，会影响另外一个对象
#### 如何实现浅拷贝
![](http://onf44qqgp.bkt.clouddn.com/18-4-12/92927077.jpg)
refObj是对象的引用属性，field是对象的基本类型属性。
```java
public class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Student implements Cloneable {
    private String name;

    private Subject subject;

    public Student(String name, String sub) {
        this.name = name;
        this.subject = new Subject(sub);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    //重写父类的方法，这里默认调用父类的拷贝方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class CopyTest {
    public static void main(String[] args) {

        Student student = new Student("yang","haodong");
        try {
            Student studentCopy = (Student) student.clone();
            System.out.println("原对象和拷贝对象是否一致"+( student == studentCopy ) );
            System.out.println("原对象和拷贝对象的name属性是否一样"+(Objects.equals(student.getName(), studentCopy.getName())));
            System.out.println("原对象和拷贝对象的地址属性是否一样"+(student.getSubject() == studentCopy.getSubject()));
            student.setName("li");
            student.getSubject().setName("hao");
            System.out.println("能否更改基本数据类型属性"+studentCopy.getName());
            System.out.println("能否更改引用类型属性"+studentCopy.getSubject().getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
原对象和拷贝对象是否一致false
原对象和拷贝对象的name属性是否一样true
原对象和拷贝对象的地址属性是否一样true
能否更改基本数据类型属性yang
能否更改引用类型属性hao

Process finished with exit code 0

```
从输出结果我们可以看出，对原始对象的基本属性做出改变不会影响到拷贝对象，对原始对象的引属性做出改变之后影响到了拷贝对象。

### 深拷贝
#### 深拷贝会拷贝所有的属性，并且拷贝数形指向的动态分配的内存。当对象和它引用的对象一起拷贝的时候发生深拷贝，相比较于浅拷贝，速度慢，花销大
#### 如何实现深拷贝
我们只需要修改类重写的clone方法即可
```java
public class Student implements Cloneable {
    private String name;

    private Subject subject;

    public Student(String name, String sub) {
        this.name = name;
        this.subject = new Subject(sub);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(name,subject.getName());
    }
}
输出结果
原对象和拷贝对象是否一致false
原对象和拷贝对象的name属性是否一样true
原对象和拷贝对象的地址属性是否一样false
能否更改基本数据类型属性yang
能否更改引用类型属性haodong

Process finished with exit code 0
```
![](http://onf44qqgp.bkt.clouddn.com/18-4-12/73933936.jpg)
我们可以理解为新建立一个对象
### 延迟拷贝
延迟拷贝是浅拷贝和深拷贝的一个组合，实际上用的很少。当最开始拷贝一个对象时，会使用速度较快的拷贝，还会使用一个计数器去记录有多少个对象共享这个数据。当程序想要修改原始数据时候，他还会决定数据是否被共享，并且根据需要进行深拷贝。延迟拷贝从外面看就像是深拷贝，但是只要有可能他就会利用浅拷贝的速度。当原始对象中的引用不经常改变的时候可以使用延迟拷贝。由于存在计数器，效率下降很多。