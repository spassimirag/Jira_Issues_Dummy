package com.example.quickstart;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Logger;

@Component
public class ScheduledTasks {

    private String latestMessage;
    public Logger log;

    @Scheduled(fixedRate = 7000)
    public void printScheduledMessage() {
        latestMessage = "Hey, it's been 20 minutes, make sure you blink!" + LocalDateTime.now();
        System.out.println(latestMessage);
    }

    public String getLatestMessage() {
        return latestMessage;
    }


}