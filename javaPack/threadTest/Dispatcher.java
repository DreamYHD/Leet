package javaPack.threadTest;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/4/15.
 */
public class Dispatcher {
    private final Set<Taxi>taxis;
    private final Set<Taxi>availableTaxis;

    public Dispatcher(Set<Taxi> taxis, Set<Taxi> availableTaxis) {
        this.taxis = taxis;
        this.availableTaxis = availableTaxis;
    }
    public synchronized void notifyAvailable(Taxi taxi){
        availableTaxis.add(taxi);
    }
    public  Image getImage(){
        Set<Taxi>copy;
        synchronized (this){
            //用一些无关操作去进行同步
            copy = new HashSet<Taxi>(taxis);
        }
        Image image = null;
        for (Taxi t : copy){
            //调用外部的方法
            System.out.println(t.getLocation());
        }
        return image;
    }
}
