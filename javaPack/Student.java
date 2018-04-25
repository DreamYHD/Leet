package javaPack;

/**
 * Created by Administrator on 2018/4/12.
 */
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
