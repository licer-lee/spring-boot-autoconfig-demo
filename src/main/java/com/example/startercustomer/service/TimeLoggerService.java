package com.example.startercustomer.service;

import com.example.startercustomer.properties.TimeLoggerProperties;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeLoggerService {

    private TimeLoggerProperties timeLoggerProperties;

    public TimeLoggerService(TimeLoggerProperties timeLoggerPropertiest) {
        this.timeLoggerProperties = timeLoggerPropertiest;
    }

    public void logTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timeLoggerProperties.getDateFormatter());
        System.out.println("time logger, now = " + simpleDateFormat.format(new Date()));
    }
}
