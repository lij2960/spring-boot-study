package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@SpringBootApplication
//@EnableScheduling
@EnableAsync
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(DemoApplication.class);
        System.setProperty("spring.devtools.restart.enabled", "false");
        sa.setAddCommandLineProperties(false);
        sa.run(args);
    }

}
