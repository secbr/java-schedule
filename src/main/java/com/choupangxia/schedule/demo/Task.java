package com.choupangxia.schedule.demo;

/**
 * @author sec
 * @version 1.0
 * @date 2021/8/2
 **/
public class Task {

    public static void main(String[] args) {
        // run in a second
        final long timeInterval = 1000;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Hello !!");
                    try {
                        Thread.sleep(timeInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
