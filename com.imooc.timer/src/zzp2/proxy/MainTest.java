package zzp2.proxy;

/**
 * Created by zzy on 2017/5/25.
 */
public class MainTest {
    public static void main(String args[]){
        DoSomething ds = DynProxyFactory.getInstance();
        ds.dealTask();
    }
}
