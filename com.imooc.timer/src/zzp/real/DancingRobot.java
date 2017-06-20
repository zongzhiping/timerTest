package zzp.real;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * Created by zzy on 2017/6/20.
 */
public class DancingRobot extends TimerTask {
    final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("The exec Time is: "+sf.format(calendar.getTime())+" ,and Dancing is happy!");
    }
}
