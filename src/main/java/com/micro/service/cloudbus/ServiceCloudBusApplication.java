package com.micro.service.cloudbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RemoteApplicationEventScan
public class ServiceCloudBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCloudBusApplication.class, args);
    }

}
