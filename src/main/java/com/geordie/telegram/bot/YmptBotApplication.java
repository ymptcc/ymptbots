package com.geordie.telegram.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class YmptBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmptBotApplication.class, args);
    }
}
