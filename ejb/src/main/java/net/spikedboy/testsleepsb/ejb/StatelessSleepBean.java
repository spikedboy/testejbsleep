package net.spikedboy.testsleepsb.ejb;

import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.Date;

@Stateless
@Local(StatelessSleep.class)
public class StatelessSleepBean implements StatelessSleep {
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
