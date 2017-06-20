package zzp.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zzy on 2017/6/20.
 */
public class DifferenceTest {
    public static void main(String args[]) {
        Timer timer = new Timer();
        Calendar calendar = Calendar.getInstance();
        final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("The Curr Time is: " + sf.format(calendar.getTime()));

        calendar.add(Calendar.SECOND, -6);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    Thread.sleep(6000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The curr Time is: "+sf.format(System.currentTimeMillis())+"         The exec Time is: "+sf.format(scheduledExecutionTime()));
            }
        },3000l,2000l);
    }
}
