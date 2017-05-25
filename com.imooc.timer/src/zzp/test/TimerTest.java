package zzp.test;

import zzp.module.MyTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * Created by zzy on 2017/5/23.
 */
public class TimerTest {
    public static void main(String args[]) throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        System.out.println("The Curr time is "+sf.format(calendar.getTime()));
        Timer timer = new Timer();
        MyTask myTask1 = new MyTask("task1");

        timer.schedule(myTask1,3000l,3000l);

        //Thread.sleep(5000);

        //第一次执行任务的时间
        System.out.println("The first plan time is "+sf.format( myTask1.scheduledExecutionTime()));

    }
}
