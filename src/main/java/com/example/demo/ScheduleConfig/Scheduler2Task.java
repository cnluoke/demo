package com.example.demo.ScheduleConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler2Task {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private Logger logger = LoggerFactory.getLogger(SchedulerTask.class);

    @Scheduled(fixedRate=5000)
    public  void reportCurrentTime(){
        logger.info(dateFormat.format(new Date())+"*********每5秒执行一次-1");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(dateFormat.format(new Date())+"*********每5秒执行一次-2");
    }
}
