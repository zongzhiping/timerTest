package zzp.module;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * Created by zzy on 2017/5/23.
 */
public class MyTask extends TimerTask {

    private String name;
    private int count = 0;

    public MyTask() {
    }

    public MyTask(String name) {
        this.name = name;
    }

    public void run() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd    HH:mm:ss");
        String d = simpleDateFormat.format(calendar.getTime());
        System.out.println("My name is: " + name + ", The Curr Time is: " + d);
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
