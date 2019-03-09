package javaPack.basepac;

import javaPack.pc.Client;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2019/3/8.
 */
public class RealTest  implements ClientTest{
    @Override
    public void request() {
        System.out.println("real dothing");
    }

    public static void main(String[] args) {
/*        RealTest realTest = new RealTest();
        ProxyTest proxyTest = new ProxyTest(realTest);
        proxyTest.request();*/
        RealTest realTest = new RealTest();
        ProxyHandler proxyHandler = new ProxyHandler(realTest);
        ClientTest clientTest = (ClientTest) Proxy.newProxyInstance(RealTest.class.getClassLoader()
        ,RealTest.class.getInterfaces(),proxyHandler);
        clientTest.request();

    }
}
