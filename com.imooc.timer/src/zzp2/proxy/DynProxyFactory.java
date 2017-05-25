package zzp2.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by zzy on 2017/5/25.
 */
public class DynProxyFactory {

    public static DoSomething getInstance(){
       DoSomething ds = new Subject();
        InvocationHandler handler = new DoSomethingHandler(ds);
        DoSomething proxy = null;
        proxy = (DoSomething) Proxy.newProxyInstance(
                ds.getClass().getClassLoader(),
                ds.getClass().getInterfaces(),
                handler);
        return proxy;
    }
}
