package zzp.test;

import zzp.module.MyTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * Created by zzy on 2017/5/23.
 */
public class TimerTest {
   public static void main(String args[]){
       Timer timer = new Timer();
       MyTask myTask1 = new MyTask("task1");
       MyTask myTask2 = new MyTask("task2");


       Calendar calendar = Calendar.getInstance();
       SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       System.out.println("The curr time is: "+sf.format(calendar.getTime()));

       timer.schedule(myTask1,3000,2000);
       timer.schedule(myTask2,2000,2000);

       try {
           Thread.sleep(5000l);
           myTask1.cancel();
           System.out.println(timer.purge());
       } catch (InterruptedException e) {
           e.printStackTrace();
       }


       System.out.println("The Most recent exe time is: "+sf.format(myTask1.scheduledExecutionTime()));

   }
}
