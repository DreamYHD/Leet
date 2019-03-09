package javaPack.basepac;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/3/9.
 */
public class ProxyHandler implements InvocationHandler {
    private ClientTest clientTest;

    public ProxyHandler(ClientTest clientTest) {
        this.clientTest = clientTest;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("pre");
        Object result =  method.invoke(clientTest,args);
        System.out.println("after");
        return result;
    }
}
