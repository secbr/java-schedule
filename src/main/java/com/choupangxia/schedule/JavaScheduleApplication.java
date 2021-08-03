package com.choupangxia.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class JavaScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaScheduleApplication.class, args);
    }

}
