package com.example.startercustomer;

import com.example.startercustomer.properties.TimeLoggerProperties;
import com.example.startercustomer.service.TimeLoggerService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TimeLoggerProperties.class)
@ConditionalOnClass(TimeLoggerService.class)
//@ConditionalOnProperty(prefix = "time.logger", name = "enable", havingValue = "true")
public class TimeLoggerAutoConfig {

    private final TimeLoggerProperties timeLoggerProperties;

    public TimeLoggerAutoConfig(TimeLoggerProperties timeLoggerProperties) {
        this.timeLoggerProperties = timeLoggerProperties;
    }

    @Bean
    @ConditionalOnMissingBean(TimeLoggerService.class)
    @ConditionalOnProperty(prefix = "time.logger", name = "enable", havingValue = "true")
    public TimeLoggerService timeLoggerService(){
        return new TimeLoggerService(timeLoggerProperties);
    }
}
