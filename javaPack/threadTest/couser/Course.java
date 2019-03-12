package javaPack.threadTest.couser;

/**
 * Created by Administrator on 2019/3/12.
 */
public class Course {
    private MyStack m;

    public Course(MyStack m) {
        this.m = m;
    }
    public void popService(){
        m.pop();
    }
}
