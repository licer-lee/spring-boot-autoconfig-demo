package com.example.startercustomer;

import com.example.startercustomer.properties.TimeLoggerProperties;
import com.example.startercustomer.service.TimeLoggerService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(TimeLoggerProperties.class)
@EnableConfigurationProperties(TimeLoggerProperties.class)
public class TimeLoggerAutoConfig {

    final TimeLoggerProperties timeLoggerProperties;

    public TimeLoggerAutoConfig(TimeLoggerProperties timeLoggerProperties) {
        this.timeLoggerProperties = timeLoggerProperties;
    }

    @Bean
    @ConditionalOnMissingBean(TimeLoggerService.class)
    public TimeLoggerService timeLoggerService(){
        return new TimeLoggerService(timeLoggerProperties);
    }
}
