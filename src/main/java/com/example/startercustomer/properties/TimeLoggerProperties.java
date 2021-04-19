package com.example.startercustomer.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "time.logger")
public class TimeLoggerProperties {

    private Boolean enable = true;
    private String dateFormatter;
}
