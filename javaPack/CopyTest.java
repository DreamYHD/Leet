package javaPack;

import java.util.Objects;

/**
 * Created by Administrator on 2018/4/12.
 */
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
