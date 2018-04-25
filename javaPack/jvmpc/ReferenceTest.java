package javaPack.jvmpc;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2018/4/21.
 */
public class ReferenceTest {
    public static void main(String[] args) {
        String s = new String("hello");
        String sN;

        SoftReference softReference = new SoftReference(s);
        if (softReference.get() != null) {
            sN = (String) softReference.get();
        }else {
            s = new String("hello");
            softReference = new SoftReference(s);
        }
        WeakReference weakReference = new WeakReference(s);

    }
}
