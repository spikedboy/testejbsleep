package net.spikedboy.testsleepsb.ejb;

import javax.ejb.Local;
import javax.ejb.Singleton;
import java.util.Date;

@Singleton
@Local(SingletonSleep.class)
public class SingletonSleepBean implements SingletonSleep{
    @Override
    public String sleep() {
        Date ini = new Date();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date end = new Date();
        long elapsed = end.getTime() - ini.getTime();
        return "Slept from " + ini.toGMTString() + " to " + end.toGMTString();
    }
}
