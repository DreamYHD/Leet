package javaPack.threadTest;

import java.awt.*;

/**
 * Created by Administrator on 2018/4/15.
 */
public class Taxi {
    private Point location,destination;
    private final Dispatcher dispatcher;

    public Taxi(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    public synchronized Point getLocation(){
        return location;
    }
    public  void  setLocation(){
        boolean is = false;
        synchronized (this){
            this.location = location;
            is = location.equals(destination);
        }
        if (is){
            //调用外部的方法
            dispatcher.notifyAvailable(this);
        }

    }
}
