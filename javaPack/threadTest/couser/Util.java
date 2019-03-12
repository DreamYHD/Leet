package javaPack.threadTest.couser;

/**
 * Created by Administrator on 2019/3/12.
 */
public class Util {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Course course1 = new Course(myStack);
        Course course2 = new Course(myStack);
        Course course3 = new Course(myStack);
        Product product = new Product(myStack);
        ThreadA threadA = new ThreadA(product);
        ThreadB threadB1 = new ThreadB(course1);
        ThreadB threadB2 = new ThreadB(course2);
        ThreadB threadB3 = new ThreadB(course3);
        threadA.start();
        threadB1.start();
        threadB2.start();
        threadB3.start();
        //join使当前任务先执行完成，然后时当前线程无限期阻塞，等待线程x销毁后再继续执行线程后面的代码
    }
}
