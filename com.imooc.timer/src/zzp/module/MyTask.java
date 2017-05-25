package zzp.module;

import java.util.TimerTask;

/**
 * Created by zzy on 2017/5/23.
 */
public class MyTask extends TimerTask {

    private int count=0;
    public String name;

    public MyTask(){}

    public MyTask(String name){
        this.name = name;
    }

    @Override
    public void run() {
//        if(count<3){
//            Calendar calendar = Calendar.getInstance();
//            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
//            String dataStr = sd.format(calendar.getTime());
//            System.out.println("The Curr Thread is "+name);
//            System.out.println("The time is"+dataStr);
//            count++;
//        }else{
//            cancel();
//            System.out.println("the task is cancled!");
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
