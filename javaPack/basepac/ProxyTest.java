package javaPack.basepac;

/**
 * Created by Administrator on 2019/3/8.
 */
public class ProxyTest implements ClientTest {
    private RealTest realTest;
    public ProxyTest(RealTest realTest) {

        this.realTest = realTest;
    }

    @Override
    public void request() {
        System.out.println("pre");
        realTest.request();
        System.out.println("end");
    }
}
