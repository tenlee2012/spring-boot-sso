package com.test.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xujingfeng on 2017/8/7.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.test")
public class ClientCredentialsApp {

    public static void main(String[] args) {
        SpringApplication.run(ClientCredentialsApp.class, args);
    }
}
