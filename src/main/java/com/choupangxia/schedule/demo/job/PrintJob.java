package com.choupangxia.schedule.demo.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @author sec
 * @version 1.0
 * @date 2021/8/3
 **/
public class PrintJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(new Date() + " : 任务「PrintJob」被执行。");
    }
}
