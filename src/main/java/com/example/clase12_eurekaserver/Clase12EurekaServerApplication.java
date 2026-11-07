package com.example.clase12_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Clase12EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Clase12EurekaServerApplication.class, args);
    }

}
