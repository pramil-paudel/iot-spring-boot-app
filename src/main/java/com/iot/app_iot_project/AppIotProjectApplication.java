package com.iot.app_iot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AppIotProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppIotProjectApplication.class, args);
    }

}
