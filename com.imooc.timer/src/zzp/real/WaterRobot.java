package zzp.real;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zzy on 2017/6/20.
 */
public class WaterRobot extends TimerTask {

    private Timer timer;
    private Integer bucketCapacity = 0 ;
    final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public WaterRobot(Timer timer){
        this.timer = timer;
    }

    @Override
    public void run() {
        if (bucketCapacity<5){
            Calendar calendar = Calendar.getInstance();
            System.out.println("The exec Time is: "+sf.format(calendar.getTime())+" ,and The Curr bucketCapacity is: "+bucketCapacity);
            bucketCapacity++;
        }else {

            System.out.println(timer.purge());
            cancel();
            System.out.println(timer.purge());
            try {
                Thread.sleep(3000l);
                Calendar calendar = Calendar.getInstance();
                timer.cancel();
                System.out.println("The cancle Time is: "+sf.format(calendar.getTime())+" ,");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
