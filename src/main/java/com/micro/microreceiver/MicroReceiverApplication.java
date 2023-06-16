package com.micro.microreceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@ComponentScan(basePackages = {
        "com.micro.microreceiver.controller",
        "com.micro.microreceiver.component",
        "com.micro.microreceiver.config"})
@SpringBootApplication
public class MicroReceiverApplication {

    public static void main(String[] args) throws IOException, TimeoutException {
        SpringApplication.run(MicroReceiverApplication.class, args);
    }

}
