package zzp2.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zzy on 2017/5/25.
 */
public class DoSomethingHandler implements InvocationHandler {

    private Object delegate;

    public DoSomethingHandler(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long start = System.currentTimeMillis();

       method.invoke(delegate,args);

       long end = System.currentTimeMillis();

       System.out.println(start-end);

        return null;
    }
}
