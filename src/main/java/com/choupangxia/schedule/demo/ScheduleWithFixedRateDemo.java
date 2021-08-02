package com.choupangxia.schedule.demo;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author sec
 * @version 1.0
 * @date 2021/8/2
 **/
public class ScheduleWithFixedRateDemo implements Runnable{

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(
                new ScheduleWithFixedRateDemo(),
                0,
                1000,
                TimeUnit.MILLISECONDS);
    }

    @Override
    public void run() {
        System.out.println(new Date() + " : 任务「ScheduleAtFixedRateDemo」被执行。");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
