package zzp2.proxy;

/**
 * Created by zzy on 2017/5/25.
 */
public class Subject implements DoSomething {

    @Override
    public void dealTask() {
        System.out.println("I want to do something big!");
    }
}
