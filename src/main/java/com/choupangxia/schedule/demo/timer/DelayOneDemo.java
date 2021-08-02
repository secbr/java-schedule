package com.choupangxia.schedule.demo.timer;

import com.choupangxia.schedule.demo.DoSomethingTimerTask;

import java.util.Timer;

/**
 * @author sec
 * @version 1.0
 * @date 2021/8/2
 **/
public class DelayOneDemo {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new DoSomethingTimerTask("DelayOneDemo"),1000L);
    }
}
