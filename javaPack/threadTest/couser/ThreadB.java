package javaPack.threadTest.couser;

/**
 * Created by Administrator on 2019/3/12.
 */
public class ThreadB extends Thread{

    private Course course;

    ThreadB(Course course) {
        this.course = course;
    }
    @Override
    public void run() {
        while (true){
            course.popService();
        }
    }
}
