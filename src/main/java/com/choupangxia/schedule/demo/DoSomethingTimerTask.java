package com.choupangxia.schedule.demo;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author sec
 * @version 1.0
 * @date 2021/8/2
 **/
public class DoSomethingTimerTask extends TimerTask {

    private final String taskName;

    public DoSomethingTimerTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(new Date() + " : 任务「" + taskName + "」被执行。");
    }
}
