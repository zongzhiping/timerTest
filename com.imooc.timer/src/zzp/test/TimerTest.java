package zzp.test;

import zzp.module.MyTask;

import java.util.Calendar;
import java.util.Timer;

/**
 * Created by zzy on 2017/5/23.
 */
public class TimerTest {
    public static void main(String args[]){
        Timer timer = new Timer();
        MyTask myTask = new MyTask();
        myTask.setName("task1");

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,3);
        //距离当前时间3秒后的时间执行
        timer.schedule(myTask,calendar.getTime());
    }
}
