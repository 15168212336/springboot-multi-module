package com.zg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootMultiApplication {
    public static void main(String[] args) { SpringApplication.run(SpringBootMultiApplication.class, args); }
}
