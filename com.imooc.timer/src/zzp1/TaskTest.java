package zzp1;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zzy on 2017/5/25.
 */
public class TaskTest {
    private Timer timer = new Timer();
    public long start;

    public TaskTest(){
        start = System.currentTimeMillis();
    }

    public void taskOne(){
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000l);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },1000l);
    }

    public void taskTwo(){
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println(System.currentTimeMillis()-start);
                System.out.println("taskTwo is Running!");
            }
        },1000l);
    }


    public static void main(String args[]) throws Exception{
        TaskTest tt = new TaskTest();
        tt.taskOne();
        tt.taskTwo();
    }

}
