package zzp.real;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * Created by zzy on 2017/6/20.
 */
public class Execute {
    public static  void main(String args[]){
        Timer timer = new Timer();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println("Curr Time is: "+sf.format(calendar.getTime()));

        WaterRobot waterRobot = new WaterRobot(timer);
        DancingRobot dancingRobot = new DancingRobot() ;

        timer.schedule(waterRobot,calendar.getTime(),1000l);
        timer.scheduleAtFixedRate(dancingRobot,calendar.getTime(),2000l);

    }
}
